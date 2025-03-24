package com.rdp.api.testcases;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;

import org.testng.annotations.Test;

import com.rdp.api.pojo.ResponseBody;
import com.rdp.api.pojo.job.AssignProcessToUser;
import com.rdp.api.pojo.job.GetJobProcess;
import com.rdp.api.testdata.JobTestDataBuild;
import com.rdp.api.utils.APIResource;
import com.rdp.api.utils.PropertyUtils;
import com.rdp.api.utils.TestUtils;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;


public class AssignWorkTest {
	
	JobTestDataBuild data = new JobTestDataBuild();
	int userId = Integer.parseInt(PropertyUtils.getInstance().getValue("UserId"));
	int processId;

	@Test(priority = 1, description = "Verify GetJobProcess API when filter is null", groups = { "CMR" })
	public void verifyGetJobProcessApiWithoutFilter() {
		GetJobProcess getJobProcessPayload = new GetJobProcess();
		getJobProcessPayload =  data.getJobProcessPayloadWithoutFilter();
		Response response  = APIResource.post("GetJobProcess", getJobProcessPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetJobProcess");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test( priority = 1, description = "Verify GetJobProcess API by applying filter on columnName", groups = { "CMR" })
	public void verifyGetJobProcessApiWithFilter() {
		GetJobProcess getJobProcessPayload = new GetJobProcess();
		getJobProcessPayload =  data.getJobProcessPayloadWithFilter();
		Response response  = APIResource.post("GetJobProcess", getJobProcessPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetJobProcess");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
		
		JsonPath js = new JsonPath(response.asString());
		processId = js.getInt("Entity[0].ID");

	}
	
	@Test(priority =2, description = "Verify user is able to assign process to user using AssignProcessToUserApi", enabled=true, groups = { "CMR" })
	public void verifyAssignProcessToUserApi() {
		AssignProcessToUser assignProcessToUserPayload = data.getAssignProcessToUserPayload(processId);
		Response response  = APIResource.post("AssignProcessToUser", assignProcessToUserPayload);
//		Response response  = APIResource.post("AssignProcessToUser", null);
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(priority = 1, description = "Verify GetAuditorUser Api", groups = { "CMR" })
	public void verifyGetAuditorUserApi() {
		Response response  = APIResource.get("GetAuditorUser");
		assertThat(response.getStatusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("AuditorUser");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 1, description = "Verify GetAnalystUser Api", groups = { "CMR" })
	public void verifyGetAnalystUserApi() {
		Response response  = APIResource.get("GetAnalystUser");
		assertThat(response.getStatusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("AuditorUser");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 1, description = "Verify  GetAnalystUserByTeam Api", groups = { "CMR" } )
	public void verifyGetAnalystUserByTeamApi() {
		Response response  = APIResource.getWithPathparameter("GetAnalystUserByTeam", "userId", userId);
		assertThat(response.getStatusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("AuditorUser");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 1, description = "Verify GetAuditorUserByTeam Api", groups = { "CMR" } )
	public void verifyGetAuditorUserByTeamApi() {
		Response response  = APIResource.getWithPathparameter("GetAuditorUserByTeam", "userId", userId);
		assertThat(response.getStatusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("AuditorUser");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 2, description = "Verify DeleteJob Api", groups = { "CMR" } )
	public void verifyDeleteJobApi() {
		Response response  = APIResource.postWithQueryParameter("DeleteJob", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessage(), equalTo("OK"));
		
		//Vaildating using getJob Api
		Response getResponse  = APIResource.getWithQueryparameter("GetJob", "processId", processId);
		assertThat(getResponse.getStatusCode(), equalTo(200));
		JsonPath js = new JsonPath(getResponse.asString());
		assertThat(js.getString("AccountName"), is(nullValue()));
		assertThat(js.getString("AccountNo"), is(nullValue()));
		assertThat(js.getString("AccountType"), is(nullValue()));
	}

	
	
}
