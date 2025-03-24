package com.rdp.api.testcases;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.rdp.api.pojo.ResponseBody;
import com.rdp.api.pojo.usermanagement.AccountRegionSave;
import com.rdp.api.pojo.usermanagement.AddTeam;
import com.rdp.api.pojo.usermanagement.TeamDetails;
import com.rdp.api.pojo.usermanagement.UpdateTeamDetails;
import com.rdp.api.testdata.UserManagementTestDataBuild;
import com.rdp.api.utils.APIResource;
import com.rdp.api.utils.TestUtils;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

@Test(groups = { "UserManagement" })
public class UserManagementTeamTest {
	int teamId;
	int teamAssociateId;
	UserManagementTestDataBuild data = new UserManagementTestDataBuild();
	private String teamCreatedDate;

	@Test(description = "Verify if team is successfully added using AddTeam api",
			priority = 1)
	public void verifyAddTeamApi() {
		AddTeam addTeamPayload = data.getAddTeamPayload();
		Response response = APIResource.post("AddTeam", addTeamPayload);
		assertThat(response.getStatusCode(), equalTo(200));

		teamId = Integer.parseInt(response.asString());

		// calling getTeamById to validate
		Response getResponse = APIResource.getWithQueryparameter("GetTeamById", "teamId", teamId);
		assertThat(getResponse.getStatusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetTeamById");
		getResponse.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
		JsonPath js = new JsonPath(getResponse.asString());
		assertThat(js.getInt("TeamId[0]"), equalTo(teamId));

	}

	@Test(description = "Verify if user is able to get team details based on team id using GetTeamById API", 
			priority = 1)
	public void verifyGetTeamById() {
//		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("UserManagementTestData", "AddTeam");
//		String teamid = testData.get(0).get("TeamId");
		Response response = APIResource.getWithQueryparameter("GetTeamById", "teamId", teamId);
		assertThat(response.getStatusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetTeamById");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));

	}

	@Test(description = "Verify user is able to get all team details using team details Api when filter is null",
			priority = 1)
	public void verifyTeamDetailsApiWithoutFilter() {
		TeamDetails teamDetailsPyload = data.getTeamDetailsPayloadWithoutFilter();
		Response response = APIResource.post("TeamDetails", teamDetailsPyload);
		assertThat(response.getStatusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("TeamDetails");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}

	@Test(description = "Verify team details api by applying filter using team details Api", 
			priority = 1)
	public void verifyTeamDetailsApiWithFilterAndValidValue() {
		TeamDetails teamDetailsPyload = data.getTeamDetailsPayloadWithFilter("Valid Value");
		Response response = APIResource.post("TeamDetails", teamDetailsPyload);
		assertThat(response.getStatusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("TeamDetails");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}

	@Test(description = "Verify team details api by applying filter and invalid value using team details Api",
			priority = 1)
	public void verifyTeamDetailsApiWithFilterAndInvalidValue() {
		TeamDetails teamDetailsPyload = data.getTeamDetailsPayloadWithFilter("Invalid Value");
		Response response = APIResource.post("TeamDetails", teamDetailsPyload);
		assertThat(response.getStatusCode(), equalTo(200));
//		File responseSchema = TestUtils.getInstance().getApiResponseSchema("TeamDetails");
//		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
		JsonPath js = new JsonPath(response.asString());

		assertThat(js.getInt("TotalRowCount"), equalTo(0));
	}

	@Test(description = "Verify GetTeamByTeamLead Api",	priority = 1)
	public void verifyGetTeamByTeamLeadApi() {
		Response response = APIResource.getWithQueryparameter("GetTeamByTeamLead", "teamId", teamId);
		assertThat(response.getStatusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetTeamByTeamLead");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}

	@Test(description = "Verify user is able to update team details using UpdateTeamDetailsApi", priority = 1 )
	public void verifyUpdateTeamDeatilsApi() {
		
		UpdateTeamDetails updateTeamPayload = data.getUpdateTeamDetailsPayload(teamId);
		Response response = APIResource.post("UpdateTeamDetails", updateTeamPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
		assertThat(responseBody.getObjectId(), equalTo(teamId));
	}

	@Test(description = "Verify user is able to get list of all buisness actions for a team using TeamBusinessActionList API", 
			priority = 1)
	public void verifyTeamBusinessActionListApi() {
		Response response = APIResource.getWithQueryparameter("TeamBusinessActionList", "TeamId", teamId);
		assertThat(response.getStatusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("BusinessActionList");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}

	@Test(description = "Verify user is able to assign business action to existing team using AssignBActionToTeam API", priority = 1)
	public void verifyAssignBActionToTeamApi() {
		
		File BActionPayloadFile = TestUtils.getInstance().getApiRequestPayloadFile("AssignBActionToTeam");
		Response response = APIResource.postWithQueryparameterAndPayload("AssignBActionToTeam", "teamId", teamId, BActionPayloadFile);
		assertThat(response.getStatusCode(), equalTo(200));
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
	}
	
	@Test(description = " Verify user is able to get the Team Account Region Perils using AccountRegionGet API", priority = 3)
	public void verifyAccountRegionGetApi() {
		Response response = APIResource.getWithQueryparameter("AccountRegionGet", "TeamId", teamId);
		assertThat(response.getStatusCode(), equalTo(200));
		
//	    JsonPath js = new JsonPath(response.asString());
//	    
//	    teamAssociateId = js.getInt("TeamAssociateId[0]");
//	    teamCreatedDate = js.getString("CreatedDate[0]");
	}
	
	@Test(description = "Verify user is able to save the Team Account Region Perils using AccountRegionSave API",

			priority = 2)
	public void verifyAccountRegionSaveApi() {
		AccountRegionSave accountRegionSavePayload  = data.getAccountRegionSavePayload(teamId);
		Response response = APIResource.post("AccountRegionSave", accountRegionSavePayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
	}
	

	
	@Test(description = "Verify user is able to delete team using DeleteTeam API",
			priority = 3 )
	public void verifyDeleteTeamApi() {
		Response response = APIResource.postWithPathParameter("deleteTeam", "teamId", teamId);
		assertThat(response.getStatusCode(), equalTo(200));
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
	}
	
	@Test(description = "Verify BusinessActionList Api",
			priority = 1 )
	public void verifyBusinessActionListApi() {
		Response response = APIResource.get("BusinessActionList");
		assertThat(response.getStatusCode(), equalTo(204));
	}
}
