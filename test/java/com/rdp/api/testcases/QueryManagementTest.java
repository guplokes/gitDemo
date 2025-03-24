package com.rdp.api.testcases;

import static com.rdp.api.utils.SpecBuilder.getRequestSpec;
import static com.rdp.api.utils.SpecBuilder.getResponseSpec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.rdp.api.pojo.ResponseBody;
import com.rdp.api.pojo.queryManagement.CloseQuery;
import com.rdp.api.pojo.queryManagement.GetQueryDescription;
import com.rdp.api.pojo.queryManagement.RaiseQuery;
import com.rdp.api.reporting.ExtentReportManager;
import com.rdp.api.testdata.QueryManagementTestData;
import com.rdp.api.utils.APIResource;
import com.rdp.api.utils.Endpoints;
import com.rdp.api.utils.PropertyUtils;
import com.rdp.api.utils.TestUtils;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

@Test(groups = { "CMR" })
public class QueryManagementTest {

	QueryManagementTestData testData = new QueryManagementTestData();
	int processId;
	String accountName;
	List<Map<String,String>> excelData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "QueryManagement");
	
	@BeforeClass
	public void getProcessId() {
		
    	Endpoints endpoint = Endpoints.valueOf("GetRunningAccount");
    	String user = PropertyUtils.getInstance().getValue("User");
		Response response = given().spec(getRequestSpec()).pathParam("userName", user).when().get(endpoint.getEndpoint()).then()
				.spec(getResponseSpec()).extract().response();
    	
		assertThat(response.getStatusCode(), equalTo(200));
		JsonPath js = new JsonPath(response.asString());
		processId = js.getInt("ProcessId[0]");
		accountName = js.getString("AccountName[0]");    	
	}
	
	@Test(priority = 1, description = "Verify GetQueryClassificationType API ")
	public void verifyGetQueryClassificationTypeApi() {
		Response response = APIResource.get("GetQueryClassificationType");
		assertThat(response.getStatusCode(), equalTo(200));

		JsonPath  js = new JsonPath(response.asString());
		List<Map<String, Object>> listOfMaps = js.get("$");
		Map<String, Object> queryClassificationTypeMap = listOfMaps.get(0);
		assertThat(queryClassificationTypeMap, hasKey("ClassificationType"));
		assertThat(queryClassificationTypeMap, hasKey("ClassificationId"));
	}
	
	@Test(priority = 1, description = "Verify GetQueryDetailTrails API")
	public void verifyGetQueryDetailTrailsApi() {
		List<Map<String,String>> excelData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "QueryManagement");
		int queryId = Integer.parseInt(excelData.get(0).get("QueryId"));
		int queryDetailId = Integer.parseInt(excelData.get(0).get("QueryDetailId"));
		Response response = APIResource.getWithQueryparameter("GetQueryDetailTrails", "queryId", queryId, "queryDetailId", queryDetailId);
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetQueryDetailTrails");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
		
		
	}
	
	@Test(priority = 1, description = "Verify GetQueryDescription API")
	public void verifyGetQueryDescriptionApi() {
		GetQueryDescription getQueryDescriptionPayload = testData.getQueryDescriptionPayload();
		Response response = APIResource.post("GetQueryDescription", getQueryDescriptionPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath js = new JsonPath(response.asString());
//		int totalRecords = js.getInt("TotalRecord");
//		List<Map<String, Object>> listOfMaps = js.get("$");
//		Map<String, Object> getQueryDescriptionMap = listOfMaps.get(0);
//		assertThat(getQueryDescriptionMap, hasKey("TotalRecord"));
//		assertThat(getQueryDescriptionMap, hasKey("Entity"));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetQueryDescription");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 1, description = "Verify GetQueryDetails API")
	public void verifyGetQueryDetailsApi() {
		int queryId = Integer.parseInt(excelData.get(0).get("QueryId"));
		String user = PropertyUtils.getInstance().getValue("User");
		Response response = APIResource.postWithQueryParameter("GetQueryDetails", "queryId", queryId, "applicationUser", user);
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetQueryDetails");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 1, description = "Verify RaiseQuey API for Classification : Missing Document - Slip or Contract wording")
	public void verifyRaiseQueryApiWithMissingDocument() {
		RaiseQuery raiseQueryPayload = testData.getRaiseQueryPayload(processId, accountName, 0);
		Response response = APIResource.post("RaiseQuery", raiseQueryPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		ResponseBody responseBody = response.as(ResponseBody.class);
		 assertThat(responseBody.getMessageCode(), equalTo("OK"));
		 assertThat(responseBody.getObjectId(), equalTo(1));
	}
	
	@Test(priority = 1, description = "Verify RaiseQuey API for Classification : Mismatch - TIV")
	public void verifyRaiseQueryApiWithMismatch() {
		RaiseQuery raiseQueryPayload = testData.getRaiseQueryPayload(processId, accountName, 1);
		Response response = APIResource.post("RaiseQuery", raiseQueryPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		ResponseBody responseBody = response.as(ResponseBody.class);
		 assertThat(responseBody.getMessageCode(), equalTo("OK"));
		 assertThat(responseBody.getObjectId(), equalTo(1));
	}
	
	@Test(priority = 2, description = "Verify CloseQuery API")
	public void verifyCloseQueryAPI() {
		CloseQuery closeQueryPayload;
		GetQueryDescription getQueryDescriptionPayload = testData.getQueryDescriptionPayload(processId);
		Response response = APIResource.post("GetQueryDescription", getQueryDescriptionPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath js = new JsonPath(response.asString());
		int totalRecords = js.getInt("TotalRecord");
		if(totalRecords == 0)
			ExtentReportManager.logInfoDetails("There is no open Query for processId:" + processId);
		else {
			for(int i = 0; i < totalRecords; i++) {
				int queryId = js.getInt("Entity[" + i + "].queryId");
				closeQueryPayload = testData.getCloseQueryPayload(queryId);
				Response responseCloseQuery = APIResource.post("CloseQuery", getQueryDescriptionPayload);
				assertThat(responseCloseQuery.getStatusCode(), equalTo(200));
			}
		}
	}
}
