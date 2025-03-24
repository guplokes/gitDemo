package com.rdp.api.testcases;

import java.io.File;

import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rdp.api.pojo.*;
import com.rdp.api.pojo.job.CancelJob;
import com.rdp.api.pojo.job.CreateJob;
import com.rdp.api.pojo.job.GetAllProcess;
import com.rdp.api.testdata.JobTestDataBuild;
import com.rdp.api.utils.APIResource;
import com.rdp.api.utils.PropertyUtils;
import com.rdp.api.utils.TestUtils;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

@Test(groups = { "CMR" })
public class JobTest {
	String processId;

	JobTestDataBuild jobPayloadData = new JobTestDataBuild();
	


	@Test(priority = 1, description = "Verify the CreateJob Api", enabled=true)
	public void verifyCreateJobApi() {
		//jobPayloadData.createJob()
		Response response = APIResource.post("CreateJob", jobPayloadData.createJob());
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(response.getStatusCode(), equalTo(200));
		processId = Integer.toString(responseBody.getObjectId());

		assertThat(responseBody.getMessageCode(), equalTo("OK"));
		
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "CreateJob");
		
		//Validating the createJob with getJob Api
		Response getJobResponse = APIResource.getWithQueryparameter("GetJob", "processId", processId);
		assertThat(getJobResponse.getStatusCode(), equalTo(200));
		JsonPath js = new JsonPath(getJobResponse.asString());

		assertThat(js.getString("AccountName"), equalTo(testData.get(0).get("AccountName")));
		
	}
	
	
	@DataProvider(name = "CreateJob Negative Scenarios")
	public Object[][] getCreateJobNegScenariosData() {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "CreateJob");
		int size = 7;
		int index = 8;
		Object data[][] =  new Object[size][1];
		for(int i = 0; i < size; i++)
			data[i][0] = index++;
		
		return data;
	}
	
	@Test(priority = 1, description = "Verify the CreateJob API with negative scenarios",
			dataProvider = "CreateJob Negative Scenarios")
	public void verifyCreateJobApiWithInvalidData(int index) {
		CreateJob createJobPayload = jobPayloadData.getCreateJobPayloadWithDifferentValues(index);
		Response response = APIResource.post("CreateJob", createJobPayload);
		if(response.getStatusCode() == 200) {
			ResponseBody responseBody = response.as(ResponseBody.class);
			assertThat(response.getStatusCode(), equalTo(200));
			assertThat(responseBody.getMessageCode(), equalTo("InternalServerError"));
		}
		
		else
			assertThat(response.getStatusCode(), equalTo(400));
			
	}
	
	@Test(priority = 1,description = "Verify the GetJob Api", enabled=true)
	public void verifyGetJobApi() {
		Response response = APIResource.getWithQueryparameter("GetJob", "processId", 5340);
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetJob");
		assertThat(response.getStatusCode(), equalTo(200));
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}

	@Test(priority = 1,description = "Verify GetImportColumnRepo Api")
	public void verifyGetImportColumnRepo() {
		Response response = APIResource.get("GetImportColumnRepo");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetImportColumnRepo");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 1,description = "Verify GetImportRepoDataByColumnName Api")
	public void verifyGetImportRepoDataByColumnName() {
		Response response = APIResource.get("GetImportRepoDataByColumnName");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetImportRepoDataByColumnName");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 1, description = "Verify GetReferenceLookup API when ReferenceTpe is Platform")
	public void verifyGetReferenceLookupApiWithReferenceType1() {
		String referenceType = "Platform";
		Response response = APIResource.getWithQueryparameter("GetReferenceLookup", "ReferenceType", referenceType);
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath  js = new JsonPath(response.asString());
		List<Map<String, Object>> listOfMaps = js.get("$");
		Map<String, Object> referenceLookupMap = listOfMaps.get(0);
		assertThat(referenceLookupMap, hasKey("Id"));
		assertThat(referenceLookupMap, hasKey("Value"));
		assertThat(referenceLookupMap, hasKey("Selectedvalue"));
		assertThat(referenceLookupMap, hasKey("Category"));
	}
	
	@Test(priority = 1, description = "Verify GetReferenceLookup API when ReferenceTpe is BIPOI,HazardEQ,HazardWS,SOVBI")
	public void verifyGetReferenceLookupApiWithReferenceType2() {
		String referenceType = "BIPOI,HazardEQ,HazardWS,SOVBI";
		Response response = APIResource.getWithQueryparameter("GetReferenceLookup", "ReferenceType", referenceType);
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath  js = new JsonPath(response.asString());
		List<Map<String, Object>> listOfMaps = js.get("$");
		Map<String, Object> referenceLookupMap = listOfMaps.get(0);
		assertThat(referenceLookupMap, hasKey("Id"));
		assertThat(referenceLookupMap, hasKey("Value"));
		assertThat(referenceLookupMap, hasKey("Selectedvalue"));
		assertThat(referenceLookupMap, hasKey("Category"));
	}
	
	@Test(priority = 1, description = "Verify GetReferenceLookup API when ReferenceTpe is DropDown,Aggregates,Values,LimitAppAusAcct,LimitBasis,LimitCode,LimitType,DeductibleCode,DeductibleType,DeductibleBasis")
	public void verifyGetReferenceLookupApiWithReferenceType3() {
		String referenceType = "DropDown,Aggregates,Values,LimitAppAusAcct,LimitBasis,LimitCode,LimitType,DeductibleCode,DeductibleType,DeductibleBasis";
		Response response = APIResource.getWithQueryparameter("GetReferenceLookup", "ReferenceType", referenceType);
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath  js = new JsonPath(response.asString());
		List<Map<String, Object>> listOfMaps = js.get("$");
		Map<String, Object> referenceLookupMap = listOfMaps.get(0);
		assertThat(referenceLookupMap, hasKey("Id"));
		assertThat(referenceLookupMap, hasKey("Value"));
		assertThat(referenceLookupMap, hasKey("Selectedvalue"));
		assertThat(referenceLookupMap, hasKey("Category"));
	}
	
	@Test(priority = 1, description = "Verify GetReferenceLookup API when ReferenceTpe is LimitBasis,LimitCode,LimitType,DeductibleCode,DeductibleType,DeductibleBasis")
	public void verifyGetReferenceLookupApiWithReferenceType4() {
		String referenceType = "LimitBasis,LimitCode,LimitType,DeductibleCode,DeductibleType,DeductibleBasis";
		Response response = APIResource.getWithQueryparameter("GetReferenceLookup", "ReferenceType", referenceType);
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath  js = new JsonPath(response.asString());
		List<Map<String, Object>> listOfMaps = js.get("$");
		Map<String, Object> referenceLookupMap = listOfMaps.get(0);
		assertThat(referenceLookupMap, hasKey("Id"));
		assertThat(referenceLookupMap, hasKey("Value"));
		assertThat(referenceLookupMap, hasKey("Selectedvalue"));
		assertThat(referenceLookupMap, hasKey("Category"));
	}
	
	
	@Test(priority = 1, description = "Verify GetUserJobTemplate Api")
	public void verifyGetUserJobTemplateApi() {
		String userId = PropertyUtils.getInstance().getValue("UserId");
		String encodedUserId = TestUtils.getInstance().encodedToBase64(userId);
		
		Response response = APIResource.getWithPathparameter("GetUserJobTemplate", "userId", encodedUserId);
		assertThat(response.getStatusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetUserJobTemplate");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 1,description = "Verify SetDefaultJobTemplate Api")
	public void verifySetDefaultJobTemplateApi() {
		
		File setDefaultJobTemplatePayloadFile = TestUtils.getInstance().getApiRequestPayloadFile("SetDefaultJobTemplate");
		Response response = APIResource.postWithFilePayload("SetDefaultJobTemplate", setDefaultJobTemplatePayloadFile);
		assertThat(response.getStatusCode(), equalTo(200));
		
		ResponseBody responseBody = response.as(ResponseBody.class);
//		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
		assertThat(responseBody.getObjectId(), equalTo(1));
	}
	

//	@Test(priority = 1, description = "Verify the CreateJob API with valid scenarios for different lob's",
//	dataProvider = "CreateJob Valid Scenarios")
//public void verifyCreateJobApiWithValidData(int index) {
//CreateJob createJobPayload = jobPayloadData.getCreateJobPayloadWithDifferentValues(index);
//Response response = APIResource.post("CreateJob", createJobPayload);
//
//}
//
	
//	public void verifyCancelJobApi() {
//		Response response = APIResource.post("CreateJob", jobPayloadData.createJob());
//		ResponseBody responseBody = response.as(ResponseBody.class);
//		assertThat(response.getStatusCode(), equalTo(200));
//		int newProcessId = responseBody.getObjectId();
//		
//		CancelJob cancelJobPayload = jobPayloadData.getCancelJobPayload(newProcessId);
//		response = APIResource.post("CancelJob", cancelJobPayload);
//		assertThat(response.getStatusCode(), equalTo(200));
//		
//		
//	}
}
