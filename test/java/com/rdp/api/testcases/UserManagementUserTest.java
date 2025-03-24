package com.rdp.api.testcases;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.equalToIgnoringCase;


import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.rdp.api.pojo.ResponseBody;
import com.rdp.api.pojo.usermanagement.CreateUser;
import com.rdp.api.pojo.usermanagement.GetAllProcessTaskWithTime;
import com.rdp.api.pojo.usermanagement.GetUser;
import com.rdp.api.pojo.usermanagement.UpdateUserSettings;
import com.rdp.api.pojo.usermanagement.Users;
import com.rdp.api.testdata.UserManagementTestDataBuild;
import com.rdp.api.utils.APIResource;
import com.rdp.api.utils.PropertyUtils;
import com.rdp.api.utils.TestUtils;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

@Test(groups = { "UserManagement" })
public class UserManagementUserTest {
	int userId;

	UserManagementTestDataBuild data = new UserManagementTestDataBuild();
	
	@Test(description = "Verify users is able to get all the users in the system using users API when filter is null",
			priority = 1)
	public void verifyUsersApiWithoutFilter() {
		Users userPayload = data.getUsersPayloadWithoutFilter();
		Response response = APIResource.post("users", userPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("users");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
		
		JsonPath js = new JsonPath(response.asString());
		int size = js.getInt("Entity.size()");
		userId = js.getInt("Entity["+(size-1) + "].UserId");
	}
	
	@Test(description = "Verify users is able to get users by applying filter and valid value using users API",
			priority = 1)
	public void verifyUsersApiWithFilterAndValidValue() {
		Users userPayload = data.getUsersPayloadWithFilter("Valid Value");
		Response response = APIResource.post("users", userPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("users");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(description = "Verify users is able to get no users by applying filter and invalid value using users API",
			priority = 1)
	public void verifyUsersApiWithFilterAndInvalidValue() {
		Users userPayload = data.getUsersPayloadWithFilter("Invalid Value");
		Response response = APIResource.post("users", userPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("users");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
		
		JsonPath js = new JsonPath(response.asString());
		int totalRecord = js.getInt("TotalRecord");
		assertThat(totalRecord, equalTo(0));		
	}
	
	@Test(description = "Verify user is able to get all the timezones using timzone API", priority = 1)
	public void verifyTimezoneApi() {		
		Response response = APIResource.get("timezone");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("timezone");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(description = "Verify user is able to get all the roles using roles API", priority = 1)
	public void verifyRolesApi() {
		Response response = APIResource.get("roles");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("roles");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(description = "Verify user is able to get list of all business actions for a role using RoleBuisnessActionList API",
			priority = 1)
	public void verifyRoleBusinessAcitonListApi() {
		
		Response response = APIResource.getWithPathparameter("RoleBusinessActionList", "RoleId", 1);
		assertThat(response.getStatusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("BusinessActionList");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(description = "Verify user is able to get all the underwriters using ubderwriters API", priority = 1)
	public void verifyUnderwritersApi() {
		
		Response response = APIResource.get("underwriters");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("underwriters");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(description = "Verify user is able to get the user details based on userid using GetUserById API", priority = 2)
	public void verifyGetUserByIdApi() {
		
		Response response = APIResource.getWithPathparameter("GetUserById", "UserId", userId);
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetUserById");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
		
	}
	@Test(description = "Verify user is able to deactivate the user using ChangeActiveUserStatus Api",
			priority = 2)
	public void verifyChangeActiveUserStatusApiToDeactivateUser() {
		Response response = APIResource.postWithQueryParameter("ChangeActiveUserStatus", "UserId", userId, "Isactive", false);
		assertThat(response.getStatusCode(), equalTo(200));
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
		int objectId = responseBody.getObjectId();
		Assert.assertTrue(objectId > 0);
		
		//validating isactive status of user using GetUserById Api
		Response getResponse = APIResource.getWithPathparameter("GetUserById", "UserId", userId);
		assertThat(getResponse.getStatusCode(), equalTo(200));
		GetUser userDetails = getResponse.as(GetUser.class);
		assertThat(userDetails.getIsActive(), equalTo(false));
		
	}
	
	@Test(description = "Verify user is able to activate the user using ChangeActiveUserStatus Api",
			priority = 3)
	public void verifyChangeActiveUserStatusApiToActivateUser() {
		
		Response response = APIResource.postWithQueryParameter("ChangeActiveUserStatus", "UserId", userId, "Isactive", true);
		assertThat(response.getStatusCode(), equalTo(200));
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
		int objectId = responseBody.getObjectId();
		Assert.assertTrue(objectId > 0);
		
		//validating isactive status of user using GetUserById Api
		Response getResponse = APIResource.getWithPathparameter("GetUserById", "UserId", userId);
		assertThat(getResponse.getStatusCode(), equalTo(200));
		GetUser userDetails = getResponse.as(GetUser.class);
		assertThat(userDetails.getIsActive(), equalTo(true));
	}
	
	@Test(description = "Verify user is able to block the user using ChangeBlockUserStatus Api",
			priority = 4)
	public void verifyChangeBlockUserStatusApiToBlockUser() {
		
		Response response = APIResource.postWithQueryParameter("ChangeBlockUserStatus", "UserId", userId, "IsBlock", true);
		assertThat(response.getStatusCode(), equalTo(200));
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
		int objectId = responseBody.getObjectId();
		Assert.assertTrue(objectId > 0);
		
		//validating isblock status of user using GetUserById Api
//		response = APIResource.getWithPathparameter("GetUserById", "UserId", userId);
//		assertThat(response.getStatusCode(), equalTo(200));
//		GetUser userDetails = response.as(GetUser.class);
//		assertThat(userDetails.getIsBlock(), equalTo(true));
	}
	
	@Test(description = "Verify user is able to unblock the user using ChangeBlockUserStatus Api",
			priority = 5)
	public void verifyChangeBlockUserStatusApiToUnblockUser() {
		
		Response response = APIResource.postWithQueryParameter("ChangeBlockUserStatus", "UserId", userId, "IsBlock", false);
		assertThat(response.getStatusCode(), equalTo(200));
		
		
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
		int objectId = responseBody.getObjectId();
		Assert.assertTrue(objectId > 0);
		
		//validating isblock status of user using GetUserById Api
		Response getResponse = APIResource.getWithPathparameter("GetUserById", "UserId", userId);
		assertThat(getResponse.getStatusCode(), equalTo(200));
		GetUser userDetails = getResponse.as(GetUser.class);
		assertThat(userDetails.getIsBlock(), equalTo(false));
		
	}

	@Test(description = "Verify user is able to get other activity time using GetOtherActivityTime Api", priority = 2)
	public void verifyGetOtherActivityTimeApi() {
		Response response = APIResource.getWithPathparameter("GetOtherActivityTime", "UserName", PropertyUtils.getInstance().getValue("User"));
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(description = "Verify user is able to get process recorded time using GetProcessRecordedTime Api", priority = 2)
	public void verifyGetProcessRecordedTimeApi() {
		Response response = APIResource.getWithPathparameter("GetProcessRecordedTime", "UserName", PropertyUtils.getInstance().getValue("User"));
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(description = "Verify user is able to get list of all buisness actions for a user using UserBusinessActionList API",
			priority = 2)
	public void verifyUserBusinessActionListApi() {
		
		Response response = APIResource.getWithPathparameter("UserBusinessActionList", "UserId", userId);
		assertThat(response.getStatusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("BusinessActionList");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(description = "Verify user is able to assign business action to existing user using AssignBActionToUser API",
			priority = 2)
	public void verifyAssignBActionToUserApi() {
		
		File BActionPayloadFile = TestUtils.getInstance().getApiRequestPayloadFile("AssignBActionToUser");
		Response response = APIResource.postWithQueryparameterAndPayload("AssignBActionToUser", "userId", userId, BActionPayloadFile);
		assertThat(response.getStatusCode(), equalTo(200));
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
	}
	
	@Test(description = "Verify delete API when userId is valid", priority = 6)
	public void verifyDeleteApiWithValidUserid() {
		Response response = APIResource.postWithPathParameter("delete", "UserId", userId);
		assertThat(response.getStatusCode(), equalTo(200));
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
		int objectId = responseBody.getObjectId();
		Assert.assertTrue(objectId > 0);
	}
	
	@Test(description = "Verify delete API when userId is invalid", priority = 6)
	public void verifyDeleteApiWithInvalidUserid() {
		Response response = APIResource.postWithPathParameter("delete", "UserId", -3);
		assertThat(response.getStatusCode(), equalTo(200));
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("InternalServerError"));

		assertThat(responseBody.getObjectId(), equalTo(0));

	}
	
	@Test(description = "Verify user is able to active the user using active Api", priority = 7)
	public void verifyActiveApi() {
		String payload = "[\r\n" + 
	    		""    + userId + "\r\n" + 
	    		"]";
		Response response = APIResource.post("active", payload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		//validating isactive status of user using GetUserById Api
			Response getResponse = APIResource.getWithPathparameter("GetUserById", "UserId", userId);
				assertThat(getResponse.getStatusCode(), equalTo(200));
				GetUser userDetails = getResponse.as(GetUser.class);
				assertThat(userDetails.getIsActive(), equalTo(true));
		
	}

	@Test(description = "Verify GetAllProcessTaskWithTime Api without filter", priority = 1)
	public void verifyGetAllProcessTaskWithTimeApiWithoutFilter() {
		GetAllProcessTaskWithTime getAllProcessTaskWithTimePayload = data.GetAllProcessTaskWithTimePayloadWithoutFilter();
		Response response = APIResource.post("GetAllProcessTaskWithTime", getAllProcessTaskWithTimePayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath js = new JsonPath(response.asString());
		int totalRowCount = js.getInt("TotalRowCount");
		System.out.println(totalRowCount);
	}
	
	@Test(description = "Verify GetAllProcessTaskWithTime Api with filter", priority = 1)
	public void verifyGetAllProcessTaskWithTimeApiWithFilter() {
		GetAllProcessTaskWithTime getAllProcessTaskWithTimePayload = data.GetAllProcessTaskWithTimePayloadWithFilter();
		Response response = APIResource.post("GetAllProcessTaskWithTime", getAllProcessTaskWithTimePayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath js = new JsonPath(response.asString());
		int totalRowCount = js.getInt("TotalRowCount");
//		System.out.println(totalRowCount);
	}
	
	@Test(description = "Verify user is able to update user details using Create Api", priority = 1)
	public void verifyCreateApi() {
		CreateUser createPaylaod = data.getCreatePayload();
		Response response = APIResource.post("Create", createPaylaod);
		assertThat(response.getStatusCode(), equalTo(200));
		JsonPath js = new JsonPath(response.asString());
		String message = js.getString("Msg");
		assertThat(message, equalTo("User updated successfully."));
	}
	
	@Test(description = "Verify UpdateUserSettings Api", priority = 1)
	public void verifyUpdateUserSettingsApi() {
		UpdateUserSettings updateUserSettingsPaylaod = data.getUpdateUserSettingsPayload();
		Response response = APIResource.post("UpdateUserSettings", updateUserSettingsPaylaod);
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(description = "Verify user is able to assign business action to role using AssignBActionToRole Api",
			priority = 1)
	public void verifyAssignBActionToRoleApi() {
		
		File BActionPayloadFile = TestUtils.getInstance().getApiRequestPayloadFile("AssignBActionToUser");
		Response response = APIResource.postWithQueryparameterAndPayload("AssignBActionToRole", "roleId", 1, BActionPayloadFile);
		assertThat(response.getStatusCode(), equalTo(200));
		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessageCode(), equalToIgnoringCase("OK"));
	}
	
}
