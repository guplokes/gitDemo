package com.rdp.api.testcases;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.hasKey;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.rdp.api.pojo.ResponseBody;
import com.rdp.api.pojo.job.GetAllProcess;
import com.rdp.api.pojo.job.ProcessOnHold;
import com.rdp.api.pojo.job.SaveMovedAccountInfo;
import com.rdp.api.pojo.job.UpdateComments;
import com.rdp.api.pojo.job.UpdateJobAndProcess;
import com.rdp.api.pojo.job.UpdateProposedDate;
import com.rdp.api.testdata.JobTestDataBuild;
import com.rdp.api.utils.APIResource;
import com.rdp.api.utils.PropertyUtils;
import com.rdp.api.utils.TestUtils;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

@Test(groups = { "CMR" })
public class JobDisplayTest {

	JobTestDataBuild data = new JobTestDataBuild();
	int processId;
	String accountName;
private int activeProcessId;
	
	@Test(priority = 1, description = "Verify GetAllProcess Api without filter")
	public void verifyGetAllProcessWithoutFilter() {
		
		GetAllProcess getAllProcessPayload  = data.getAllProcessPayloadWithoutFilter();
		Response response = APIResource.post("GetAllProcess", getAllProcessPayload);
		
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(priority = 1, description = "Verify GetAllProcess Api with filter and valid values")
	public void verifyGetAllProcessApiWithFilterAndValidValues() {
		
		GetAllProcess getAllProcessPayload  = data.getAllProcessPayloadWithFilter("ValidValue");
		Response response = APIResource.post("GetAllProcess", getAllProcessPayload);
		
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath js = new JsonPath(response.asString());
//		int size = js.getInt("Entity.size()");
//		processId = js.getInt("Entity["+(size-1) + "].ID");
//		accountName = js.getString("Entity["+(size-1) + "].AccountName");

		processId = js.getInt("Entity[0].ID");
		accountName = js.getString("Entity[0].AccountName");

	}
	
	@Test(priority = 1, description = "Verify GetAllProcess Api with filter and invalid values")
	public void verifyGetAllProcessApiWithFilterAndInvalidValues() {
		
		GetAllProcess getAllProcessPayload  = data.getAllProcessPayloadWithFilter("InvalidValue");
		Response response = APIResource.post("GetAllProcess", getAllProcessPayload);
		
		assertThat(response.getStatusCode(), equalTo(200));
		JsonPath js = new JsonPath(response.asString());
		assertThat(js.getInt("TotalRowCount"), equalTo(0));
	}

	@Test(priority = 2, description = "Verify GetAccountDetails Api")
	public void verifyGetAccountDetailsAPi() {
		
		Response response = APIResource.getWithQueryparameter("GetAccountDetails", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
		
//		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetAccountDetails");
//		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
		
	}
	
	@Test(priority = 2, description = "Verify GetProcessStatus Api")
	public void verifyGetProcessStatusApi() {
		
		Response response = APIResource.getWithQueryparameter("GetProcessStatus", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath  js = new JsonPath(response.asString());
		List<Map<String, Object>> listOfMaps = js.get("$");
		Map<String, Object> referenceLookupMap = listOfMaps.get(0);
		assertThat(referenceLookupMap, hasKey("ProcessStatus"));
		assertThat(referenceLookupMap, hasKey("TaskCode"));
		assertThat(referenceLookupMap, hasKey("CurrentTaskCode"));
		
	}
	
	@Test(priority = 2, description = "Verify GetProcessingStatus Api")
	public void verifyGetProcessingStatusApi() {
		
		Response response = APIResource.getWithQueryparameter("GetProcessingStatus", "ProcessId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetProcessingStatus");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 2, description = "Verify GetAllLeadData Api")
	public void verifyGetAllLeadDataApi() {
		
		Response response = APIResource.get("GetAllLeadData");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetAllLeadData");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 2, description = "Verify GetUnitLeads Api")
	public void verifyGetUnitLeadsApi() {
		
		Response response = APIResource.get("GetUnitLeads");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetUnitLeads");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	//processId hardcoded
	@Test(priority = 2, description = "Verify GetProcessDocuments Api")
	public void verifyGetProcessDocumentsApi() {
		
		
		Response response = APIResource.getWithQueryparameter("GetProcessDocuments", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetProcessDocuments");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 2, description = "Verify GetLocGrpRules Api")
	public void verifyGetLocGrpRulesApi() {
		
		Response response = APIResource.get("GetLocGrpRules");
		assertThat(response.getStatusCode(), equalTo(200));
		
	}
	
	@Test(priority = 2, description = "Verify GetJobPredominentOccupancyMaster Api")
	public void verifyGetJobPredominentOccupancyMaster() {
		
		Response response = APIResource.getWithQueryparameter("GetJobPredominentOccupancyMaster", "LobId", 0);
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetJobPredominentOccupancyMaster");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
		
	}
	
	@Test(priority = 2, description = "Verify CheckProcessInQuery Api")
	public void verifyCheckProcessInQueryApi() {
		
		String userName = PropertyUtils.getInstance().getValue("User");		
		Response response = APIResource.getWithPathparameter("CheckProcessInQuery", "processId", processId, "loginName", userName);
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(priority = 2, description = "Verify GetCurrentTAT Api")
	public void verifyGetCurrentTATApi() {
		
		String appDate = TestUtils.getInstance().getUtcFormatCurrentDateTime();
		Response response = APIResource.getWithPathparameter("GetCurrentTAT", "ProcessId", processId, "AppDate", appDate);
		assertThat(response.getStatusCode(), equalTo(200));
		
	}
	
	@Test(priority = 2, description = "Verify CheckProcessRunningStatus Api")
	public void verifyCheckProcessRunningStatusApi() {
		
		String userName = PropertyUtils.getInstance().getValue("User");	
		Response response = APIResource.getWithPathparameter("CheckProcessRunningStatus", "ProcessId", processId, "UserName", userName);
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(priority = 2, description = "Verify GetRunningAccount Api")
	public void verifyGetRunningAccountApi() {
		
		String userName = PropertyUtils.getInstance().getValue("User");	
		Response response = APIResource.getWithPathparameter("GetRunningAccount", "userName", userName);
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(priority = 2, description = "Verify UpdateProposedDate Api")
	public void verifyUpdateProposedDateApi() {
		
		UpdateProposedDate updateProposedDate =	data.getUpdateProposedDatePayload(processId);
		Response response = APIResource.post("UpdateProposedDate", updateProposedDate);
		assertThat(response.getStatusCode(), equalTo(200));
		
	}
	
	@Test(priority = 2, description = "Verify SaveMovedAccountInfo Api")
	public void verifySaveMovedAccountInfoApi() {
		SaveMovedAccountInfo saveMovedAccountInfoPayload = data.getSaveMovedAccountInfoPayload(processId, accountName);
		Response response = APIResource.post("SaveMovedAccountInfo", saveMovedAccountInfoPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
	}
	
	
	@Test(priority = 2, description = "Verify GetJobDefaultValue Api")
	public void verifyGetJobDefaultValueApi() {
				
		Response response = APIResource.get("GetJobDefaultValue");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetJobDefaultValue");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}

	@Test(priority = 2, description = "Verify Update/Comments Api using valid values")
	public void verifyUpdateCommentsApiWithValidValues() {
		
		UpdateComments updateCommentsPayload = data.getUpdateCommentsPayload(processId);			
		Response response = APIResource.post("UpdateComments", updateCommentsPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
	}
	
	@Test(priority = 2,description = "Verify Update/Comments Api using invalid values")
	public void verifyUpdateCommentsApiWithInvalidValues() {
		
		UpdateComments updateCommentsPayload = data.getUpdateCommentsPayload(0);			
		Response response = APIResource.post("UpdateComments", updateCommentsPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("InternalServerError"));
	}
	
	@Test(priority = 2,description = "Verify GetBIPOI Api")
	public void verifyGetBIPOIApi() {
		Response response = APIResource.getWithQueryparameter("GetBIPOI", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
		
	}
	
	@Test(priority = 2,description = "Verify GetInspectionExpiryDate Api")
	public void verifyGetInspectionExpiryDateApi() {
		Response response = APIResource.getWithQueryparameter("GetInspectionExpiryDate", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(priority = 2,description = "Verify GetSOVFileName Api")
	public void verifyGetSOVFileNameApi() {		
		Response response = APIResource.getWithQueryparameter("GetSOVFileName", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(priority = 2,description = "Verify GetMoveBuilderRiskLocData Api")
	public void verifyGetMoveBuilderRiskLocDataApi() {		
		Response response = APIResource.getWithQueryparameter("GetMoveBuilderRiskLocData", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(priority = 2,description = "Verify GetMRFOptions Api")
	public void verifyGetMRFOptionsApi() {	
		String payload = "{\r\n" + 
				"    \"processId\" : " + processId + "\r\n" + 
				"}";
		Response response = APIResource.post("GetMRFOptions", payload);
		assertThat(response.getStatusCode(), equalTo(200));
		JsonPath js = new JsonPath(response.asString());
		assertThat(js.getInt("ProcessId[0]"), equalTo(processId));
	}
	
	@Test(priority = 2,description = "Verify GetJobMaxVersion Api")
	public void verifyGetJobMaxVersionApi() {	
		Response response = APIResource.getWithQueryparameter("GetJobMaxVersion", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
//		
//		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetJob");
//		assertThat(response.getStatusCode(), equalTo(200));
//		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 2,description = "Verify GetReferenceAccountByProcessId Api")
	public void verifyGetReferenceAccountByProcessIdApi() {	
		Response response = APIResource.postWithPathParameter("GetReferenceAccountByProcessId", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(priority = 2,description = "Verify UserIdByProcess Api")
	public void verifyUserIdByProcessApi() {
		String payload = "{\r\n" + 
				"  \"processId\": " + processId + ",\r\n" + 
				"  \"runBy\": \"ByCMR\"\r\n" + 
				"}";
		
		Response response = APIResource.post("UserIdByProcess", payload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("UserIdByProcess");
		assertThat(response.getStatusCode(), equalTo(200));
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
			
	}
	
	@Test(priority = 2,description = "Verify CheckParentID Api")
	public void verifyCheckParentIDApi() {
		
//		String payload = "[\r\n" + 
//				" + processId + \r\n" + 
//				"]";
		
		String payload= "[\r\n" + 
		"" + processId + "\r\n" + 
		"]";
		Response response = APIResource.post("CheckParentID", payload);
		assertThat(response.getStatusCode(), equalTo(200));
	}

	@Test(priority = 2,description = "Verify GetAccountNameList Api")
	public void verifyGetAccountNameListApi() {		
		Response response = APIResource.postWithPathParameter("GetAccountNameList", "accountName", "API Test Account");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetAccountNameList");
		assertThat(response.getStatusCode(), equalTo(200));
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 2, description = "Verify Update/AccountGoalsComments Api using valid values")
	public void verifyUpdateAccountGoalsCommentsWithValidValues() {
		
		UpdateComments accountGoalCommentsPayload = data.getUpdateCommentsPayload(processId);			
		Response response = APIResource.post("UpdateAccountGoalsComments", accountGoalCommentsPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
	}
	
	@Test(priority = 2, description = "Verify DownloadProcessFile Api")
	public void verifyDownloadProcessFileApi() {
		GetAllProcess downloadProcessFilePayload  = data.getAllProcessPayloadWithFilter("ValidValue");
		Response response = APIResource.post("DownloadProcessFile", downloadProcessFilePayload);
		assertThat(response.getStatusCode(), equalTo(200));		
	}
	
	@Test(priority = 2,description = "Verify Update/AccountGoalsComments Api using invalid values")
	public void verifyUpdateAccountGoalsCommentsInvalidValues() {
		
		UpdateComments accountGoalCommentsPayload = data.getUpdateCommentsPayload(0);			
		Response response = APIResource.post("UpdateAccountGoalsComments", accountGoalCommentsPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("InternalServerError"));
	}
	
	@Test(priority = 6, description = "Verify ProcessOnHold Api")
	public void verifyProcessOnHoldApi() {

		String userName = PropertyUtils.getInstance().getValue("User");	
		Response getResponse = APIResource.getWithPathparameter("GetRunningAccount", "userName", userName);
		assertThat(getResponse.getStatusCode(), equalTo(200));
		JsonPath js = new JsonPath(getResponse.asString());
		activeProcessId = js.getInt("ProcessId[0]"); // id for task status cleansing in progress
		
		ProcessOnHold processOnHoldPayload = data.getProcessOnHoldPayload(activeProcessId);
		Response response = APIResource.post("ProcessOnHold", processOnHoldPayload);
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(priority = 6, description = "Verify UpdateJobAndProcess Api")
	public void verifyUpdateJobAndProcessApi() {
		UpdateJobAndProcess updateJobAndProcessPayload = data.getUpdateJobAndProcessPayload(activeProcessId);
		Response response = APIResource.post("UpdateJobAndProcess", updateJobAndProcessPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
		assertThat(responseBody.getObjectId(), equalTo(activeProcessId));
		
	}
	
//	@Test(priority = 2, description = "Verify GetSavedMRFImportRepoMapping Api")
	public void verifyGetSavedMRFImportRepoMappingApi(){
		Response response = APIResource.get("GetSavedMRFImportRepoMapping");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetSavedMRFImportRepoMapping");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	

}
