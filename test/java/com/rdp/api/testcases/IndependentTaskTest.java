package com.rdp.api.testcases;

import static com.rdp.api.utils.SpecBuilder.getRequestSpec;
import static com.rdp.api.utils.SpecBuilder.getResponseSpec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.rdp.api.pojo.Filter;
import com.rdp.api.pojo.IndependentTask;
import com.rdp.api.pojo.ResponseBody;
import com.rdp.api.pojo.job.GetAllProcess;
import com.rdp.api.testdata.IndependentTaskTestDataBuild;
import com.rdp.api.utils.APIResource;
import com.rdp.api.utils.Endpoints;
import com.rdp.api.utils.PropertyUtils;
import com.rdp.api.utils.TestUtils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

@Test(groups = { "CMR" })
public class IndependentTaskTest {

	IndependentTaskTestDataBuild  testData = new IndependentTaskTestDataBuild();
	int processId = 5440;
	
	@BeforeClass
	public void getProcessId() {
		GetAllProcess getAllProcessPayload = new GetAllProcess();
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "GetAllProcess");
    	String user = PropertyUtils.getInstance().getValue("User");
    	
    	List<Filter> filterList = new ArrayList<Filter>();
    	Filter filter1 = new Filter();
    	filter1.setColumnName("AccountName")
    		  .setOperator(testData.get(0).get("Operator"))
    		  .setValue("API Test Account")
    		  .setLogicalOperator(testData.get(0).get("LogicalOperator1"));

       	
    	Filter filter2 = new Filter();
    	filter2.setColumnName(testData.get(0).get("ColumnName2"))
    		  .setOperator(testData.get(0).get("Operator"))
    		  .setValue(testData.get(0).get("ValidValue"))
    		  .setLogicalOperator(testData.get(0).get("LogicalOperator2"));

    	filterList.add(filter1);
      	filterList.add(filter2);
    	
    	getAllProcessPayload.setFilterColumn(testData.get(0).get("FilterColumn"))
    						.setSkip(Integer.parseInt(testData.get(0).get("Skip")))
    						.setTake(Integer.parseInt(testData.get(0).get("Take")))
    						.setUserName(user)
    						.setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
    						.setFilter(filterList);
    	
    	Endpoints endpoint = Endpoints.valueOf("GetAllProcess");    	
		Response response = given().spec(getRequestSpec()).body(getAllProcessPayload).when().post(endpoint.getEndpoint()).then()
				.spec(getResponseSpec()).extract().response();
    	

		assertThat(response.getStatusCode(), equalTo(200));
		JsonPath js = new JsonPath(response.asString());
		processId = js.getInt("EntityData[0].ID");
	}
	
	@Test(priority = 1, description = "Verify SaveRisk Api for IndependentTask Risk Inspection")
	public void verifySaveRiskApi() {
		IndependentTask saveRiskPayload = testData.getSaveRiskPayload(processId);
		Response response = APIResource.post("SaveRisk", saveRiskPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalTo("OK"));
		
	}
	
	@Test(priority = 1, description = "Verify SaveExtractionFromPDF Api")
	public void verifySaveExtractionFromPDFApi() {
		IndependentTask saveExtractionFromPDFPayload = testData.getSaveExtractionFromPDFPayload(processId);
		Response response = APIResource.post("SaveExtractionFromPDF", saveExtractionFromPDFPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalTo("OK"));
	}
	
	@Test(priority = 1, description = "Verify SaveQueryResolution Api")
	public void verifySaveQueryResolutionApi() {
		IndependentTask SaveQueryResolutionPayload = testData.getSaveQueryResolutionPayload(processId);
		Response response = APIResource.post("SaveQueryResolution", SaveQueryResolutionPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalTo("OK"));
	}
	
	@Test(priority = 1, description = "Verify SaveGeospatial Api")
	public void verifySaveGeospatialApi() {
		IndependentTask saveGeospatialPayload = testData.getSaveGeospatialPayload(processId);
		Response response = APIResource.post("SaveGeospatial", saveGeospatialPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalTo("OK"));
	}
	
	
	@Test(priority = 1, description = "Verify SaveProcessDocumentation Api")
	public void verifySaveProcessDocumentationApi() {
		IndependentTask saveProcessDocumentationPayload = testData.getSaveProcessDocumentationPayload(processId);
		Response response = APIResource.post("SaveProcessDocumentation", saveProcessDocumentationPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalTo("OK"));
	}
	
	
	@Test(priority = 1, description = "Verify SaveToolDevelopmentorEnhancement Api")
	public void verifySaveToolDevelopmentorEnhancementApi() {
		IndependentTask saveToolDevelopmentorEnhancementPayload = testData.getSaveToolDevelopmentorEnhancementPayload(processId);
		Response response = APIResource.post("SaveToolDevEnhancement", saveToolDevelopmentorEnhancementPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalTo("OK"));
	}
}
