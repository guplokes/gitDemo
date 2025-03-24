package com.rdp.api.testcases;

import static com.rdp.api.utils.SpecBuilder.getRequestSpec;
import static com.rdp.api.utils.SpecBuilder.getResponseSpec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;

import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.rdp.api.pojo.ResponseBody;
import com.rdp.api.pojo.delagateActivity.DelagateActivityNew;
import com.rdp.api.pojo.delagateActivity.SubTaskAction;

import com.rdp.api.testdata.DelagateActivityTestDataBuild;
import com.rdp.api.utils.APIResource;
import com.rdp.api.utils.Endpoints;
import com.rdp.api.utils.PropertyUtils;


import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

@Test(groups = { "CMR" })
public class DelagateActitvityTest {

	
	int processId;
	DelagateActivityTestDataBuild testData = new DelagateActivityTestDataBuild();
	String accountName;
	
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
	
	@Test(priority = 1, description = "Verify AnalystName Api")
	public void verifyAnalystNameApi() {
		Response response = APIResource.get("AnalystName");
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath  js = new JsonPath(response.asString());
		List<Map<String, Object>> listOfMaps = js.get("$");
		Map<String, Object> analystMap = listOfMaps.get(0);
		assertThat(analystMap, hasKey("LoginName"));
		assertThat(analystMap, hasKey("AnalystName"));
	
	}
	
	@Test(priority = 1, description = "Verify ParentTask Api")
	public void verifyParentTasksApi() {
		Response response = APIResource.getWithQueryparameter("ParentTasks", "ProcessId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath  js = new JsonPath(response.asString());
		List<Map<String, Object>> listOfMaps = js.get("$");
		Map<String, Object> parentTasksMap = listOfMaps.get(0);
		assertThat(parentTasksMap, hasKey("TaskCode"));
		assertThat(parentTasksMap, hasKey("TaskName"));
	}
	
	@Test(priority = 1, description = "Verify GetActivity Api")
	public void verifyGetActivityApi() {
		Response response = APIResource.getWithQueryparameter("GetActivity", "Id", 73);
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(priority = 1, description = "Verify List Api without filter")
	public void verifyListApiWithoutFilter() {
		com.rdp.api.pojo.delagateActivity.List listPayload = testData.getListPayloadWithoutFilter();
		Response response = APIResource.post("List", listPayload);
		assertThat(response.getStatusCode(), equalTo(200));		
	}
	
	@Test(priority = 1, description = "Verify List Api with Filter and Valid values")
	public void verifyListApiFilterAndValidValues() {
		com.rdp.api.pojo.delagateActivity.List listPayload = testData.getListPayloadWithFilter("ValidValue");
		Response response = APIResource.post("List", listPayload);
		assertThat(response.getStatusCode(), equalTo(200));		
	}
	
	@Test(priority = 1, description = "Verify List Api with Filter and Invalid values")
	public void verifyListApiFilterAndInvalidValues() {
		com.rdp.api.pojo.delagateActivity.List listPayload = testData.getListPayloadWithFilter("InvalidValue");
		Response response = APIResource.post("List", listPayload);
		assertThat(response.getStatusCode(), equalTo(200));	
		JsonPath js = new JsonPath(response.asString());
		assertThat(js.getInt("TotalRowCount"), equalTo(0));
	}
	
	@Test(priority = 1, description = "Verify DelagateActivity/New Api")
	public void verifyNewApi() {
		DelagateActivityNew newPayload = testData.getNewPayload(processId, accountName);
		Response response = APIResource.post("New", newPayload);
		assertThat(response.getStatusCode(), equalTo(200));	
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalTo("OK"));
	}
	
	@Test(priority = 1, description = "Verify DelagateActivity/New Api with invalid ParentTask value")
	public void verifyNewApiWithInvalidParentTask() {
		DelagateActivityNew newPayload = testData.getNewPayloadWithInvalidParentTask(processId, accountName);
		Response response = APIResource.post("New", newPayload);
		assertThat(response.getStatusCode(), equalTo(400));
	}
	
	@Test(priority = 1, description = "Verify DelagateActivity/New Api with invalid AnalystValue value")
	public void verifyNewApiWithInvalidAnalystName() {
		DelagateActivityNew newPayload = testData.getNewPayloadWithInvalidAnalystName(processId, accountName);
		Response response = APIResource.post("New", newPayload);
		assertThat(response.getStatusCode(), equalTo(400));
	}
	
	@Test(priority = 1, description = "Verify SubtAskAction Api with actions start and stop")
	public void verifySubTaskActionApi() {
		
		com.rdp.api.pojo.delagateActivity.List listPayload = testData.getListPayloadWithFilter("ValidValue");
		Response response = APIResource.post("List", listPayload);
		assertThat(response.getStatusCode(), equalTo(200));	
		JsonPath js = new JsonPath(response.asString());
		int size = js.getList("Entity").size();
		int delagateActivityId = 0 ;
		System.out.println(size);
		for(int i = 0; i < size; i++ ) {
			System.out.println(js.getString("Entity[" + i + "].StartTime"));
			System.out.println(js.getString("Entity[" + i + "].Task"));
			if(js.getString("Entity[" + i + "].StartTime") == null) {
				delagateActivityId = js.getInt("Entity[" + i + "].ID");
				break;
			}
		}
		
		SubTaskAction subTaskActionPayload = testData.getSubTaskActionPayload(processId);
		Response subTaskResponse1 = APIResource.postWithQueryParameter("SubTaskAction", "delegateActivityId", delagateActivityId, "action", "start", subTaskActionPayload);
		assertThat(subTaskResponse1.getStatusCode(), equalTo(200));
		ResponseBody responseBody = subTaskResponse1.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalTo("OK"));
		
		Response subTaskRespnse2 = APIResource.postWithQueryParameter("SubTaskAction", "delegateActivityId", delagateActivityId, "action", "stop", subTaskActionPayload);
		assertThat(subTaskRespnse2.getStatusCode(), equalTo(200));
		responseBody = subTaskRespnse2.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalTo("OK"));
	}
}
