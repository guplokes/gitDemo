package com.rdp.api.testcases;

import static com.rdp.api.utils.SpecBuilder.getRequestSpec;
import static com.rdp.api.utils.SpecBuilder.getResponseSpec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.rdp.api.pojo.Filter;
import com.rdp.api.pojo.ResponseBody;
import com.rdp.api.pojo.job.AdditionalEvaluationSave;
import com.rdp.api.pojo.job.GetAllProcess;
import com.rdp.api.testdata.JobTestDataBuild;
import com.rdp.api.utils.APIResource;
import com.rdp.api.utils.Endpoints;
import com.rdp.api.utils.PropertyUtils;
import com.rdp.api.utils.TestUtils;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test(groups = { "CMR" })
public class AdditionalEvaluationTest {
	int processId;
	JobTestDataBuild jobPayloadData = new JobTestDataBuild();
	
	@BeforeClass
	public void getProcessId() {
		GetAllProcess getAllProcessPayload = new GetAllProcess();
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "AddEvaluation");
    	
    	List<Filter> filterList = new ArrayList<Filter>();
    	Filter filter1 = new Filter();
    	filter1.setColumnName(testData.get(0).get("ColumnName1"))
    		  .setOperator(testData.get(0).get("Operator"))
    		  .setValue(testData.get(0).get("Value1"))
    		  .setLogicalOperator("and");
    	
    	Filter filter2 = new Filter();
    	filter2.setColumnName(testData.get(0).get("ColumnName2"))
    		  .setOperator(testData.get(0).get("Operator"))
    		  .setValue(testData.get(0).get("Value2"))
    		  .setLogicalOperator("");

    	filterList.add(filter1);
      	filterList.add(filter2);
    	
    	getAllProcessPayload.setFilterColumn("")
    						.setSkip(0)
    						.setTake(5)
    						.setUserName(PropertyUtils.getInstance().getValue("User"))
    						.setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
    						.setFilter(filterList);
    	
    	Endpoints endpoint = Endpoints.valueOf("GetAllProcess");    	
		Response response = given().spec(getRequestSpec()).body(getAllProcessPayload).when().post(endpoint.getEndpoint()).then()
				.spec(getResponseSpec()).extract().response();
    	
//    	Response response = APIResource.post("GetAllProcess", getAllProcessPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		JsonPath js = new JsonPath(response.asString());
		processId = js.getInt("EntityData[0].ID");
    	
	}

	@Test(priority = 1, description = "Verify Additional Evaluation Get Api")
	public void verifyAdditionalEvaluationGetApi() {
		Response response = APIResource.getWithQueryparameter("AdditionalEvaluationGet", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(priority = 1, description = "Verify Additional Evaluation Get Master Api when type is Evaluation")
	public void verifyAddEvaluationGetMasterApiWithTypeEvaluation() {
		Response response = APIResource.getWithQueryparameter("AdditionalEvaluationGetMaster", "type", "Evaluation");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("AdditionalEvaluationGetMaster");
		assertThat(response.getStatusCode(), equalTo(200));
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 1, description = "Verify Additional Evaluation Get Master Api when type is ProcessLead")
	public void verifyAddEvaluationGetMasterApiWithTypeProcessLead() {
		Response response = APIResource.getWithQueryparameter("AdditionalEvaluationGetMaster", "type", "ProcessLead");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("AdditionalEvaluationGetMaster");
		assertThat(response.getStatusCode(), equalTo(200));
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 1, description = "Verify Additional Evaluation Get Master Api when type is EngReview")
	public void verifyAddEvaluationGetMasterApiWithTypeEngReview() {
		Response response = APIResource.getWithQueryparameter("AdditionalEvaluationGetMaster", "type", "EngReview");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("AdditionalEvaluationGetMaster");
		assertThat(response.getStatusCode(), equalTo(200));
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 1, description = "Verify Additional Evaluation Get Master Api when type is EngLead")
	public void verifyAddEvaluationGetMasterApiWithTypeEngLead() {
		Response response = APIResource.getWithQueryparameter("AdditionalEvaluationGetMaster", "type", "EngLead");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("AdditionalEvaluationGetMaster");
		assertThat(response.getStatusCode(), equalTo(200));
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 1, description = "Verify Additional Evaluation Get Master Api when type is StormSurge")
	public void verifyAddEvaluationGetMasterApiWithTypeStormSurge() {
		Response response = APIResource.getWithQueryparameter("AdditionalEvaluationGetMaster", "type", "StormSurge");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("AdditionalEvaluationGetMaster");
		assertThat(response.getStatusCode(), equalTo(200));
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 1, description = "Verify Additional Evaluation Get Master Api when type is FinalReview")
	public void verifyAddEvaluationGetMasterApiWithTypeFinalReview() {
		Response response = APIResource.getWithQueryparameter("AdditionalEvaluationGetMaster", "type", "FinalReview");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("AdditionalEvaluationGetMaster");
		assertThat(response.getStatusCode(), equalTo(200));
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}

	@Test(priority = 1, description = "Verify Additional Evaluation Save Api ")
	public void verifyAdditionalEvaluationSaveApi() {
		
		Response response = APIResource.getWithQueryparameter("AdditionalEvaluationGet", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
		JsonPath js = new JsonPath(response.asString());
		
		int addEvaluationId = js.getInt("AdditionalEvaluationId[0]");
		AdditionalEvaluationSave addEvaluationSavePayload = jobPayloadData.getAdditionaEvaluationSavePayload(processId, addEvaluationId);
		Response saveResponse = APIResource.post("AdditionalEvaluationSave", addEvaluationSavePayload);
		assertThat(saveResponse.getStatusCode(), equalTo(200));
		ResponseBody responseBody = saveResponse.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalTo("OK"));
		
	}
	
}
