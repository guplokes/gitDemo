package com.rdp.api.testdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rdp.api.pojo.Filter;
import com.rdp.api.pojo.usermanagement.AccountRegionSave;
import com.rdp.api.pojo.usermanagement.AddTeam;
import com.rdp.api.pojo.usermanagement.CreateUser;
import com.rdp.api.pojo.usermanagement.GetAllProcessTaskWithTime;
import com.rdp.api.pojo.usermanagement.TeamDetails;
import com.rdp.api.pojo.usermanagement.UpdateTeamDetails;
import com.rdp.api.pojo.usermanagement.UpdateUserSettings;
import com.rdp.api.pojo.usermanagement.Users;
import com.rdp.api.utils.PropertyUtils;
import com.rdp.api.utils.TestUtils;

public class UserManagementTestDataBuild {
//	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "CreateJob");
	String userName = PropertyUtils.getInstance().getValue("User");
	String userId = PropertyUtils.getInstance().getValue("UserId");

	public AddTeam getAddTeamPayload() {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("UserManagementTestData", "AddTeam");
		AddTeam addTeamPayload = new AddTeam();
		addTeamPayload.setCapacity(Integer.parseInt(testData.get(0).get("Capacity")))
					  .setAdditionalCapacity(Integer.parseInt(testData.get(0).get("AdditionalCapacity")))
					  .setTeamName(testData.get(0).get("TeamName"))
					  .setTeamLead(Integer.parseInt(testData.get(0).get("TeamLead")))
					  .setDescription(testData.get(0).get("Description"))
					  .setMembers(testData.get(0).get("Members"))
					  .setTeamId(Integer.parseInt(testData.get(0).get("TeamId")))
					  .setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime());
		

		return addTeamPayload;
		
	}
	
	public TeamDetails getTeamDetailsPayloadWithoutFilter()  {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("UserManagementTestData", "TeamDetails");
		TeamDetails teamDetailsPayload = new TeamDetails();
		teamDetailsPayload.setSkip(Integer.parseInt(testData.get(0).get("Skip")))
						  .setTake(Integer.parseInt(testData.get(0).get("Take")))
						  .setUserName(userName);

		return teamDetailsPayload;
	}
	
	public TeamDetails getTeamDetailsPayloadWithFilter(String valueKey)  {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("UserManagementTestData", "TeamDetails");
		TeamDetails teamDetailsPayload = new TeamDetails();
		Filter filter = new Filter();
		List<Filter> filterList = new ArrayList<Filter>();
		filter.setColumnName(testData.get(0).get("ColumnName"))
			  .setOperator(testData.get(0).get("Operator"))
			  .setValue(testData.get(0).get(valueKey))
			  .setLogicalOperator(testData.get(0).get("LogicalOperator"));
		
		filterList.add(filter);
		
		teamDetailsPayload.setSkip(Integer.parseInt(testData.get(0).get("Skip")))
						  .setTake(Integer.parseInt(testData.get(0).get("Take")))
						  .setUserName(userName)
						  .setFilter(filterList);

		return teamDetailsPayload;
	}

	public UpdateTeamDetails getUpdateTeamDetailsPayload(int teamId) {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("UserManagementTestData", "AddTeam");

		UpdateTeamDetails updateTeamPayload = new UpdateTeamDetails();
		updateTeamPayload.setCapacity(Integer.parseInt(testData.get(0).get("UpdatedCapacity")))
					  .setAdditionalCapacity(Integer.parseInt(testData.get(0).get("UpdatedAdditionalCapacity")))
					  .setTeamName(testData.get(0).get("UpdatedTeamName"))
					  .setTeamLead(Integer.parseInt(testData.get(0).get("TeamLead")))
					  .setDescription(testData.get(0).get("UpdatedDescription"))
					  .setMembers(testData.get(0).get("Members"))
					  .setTeamId(teamId)
					  .setIsActive(Boolean.parseBoolean(testData.get(0).get("IsActive")))
					  .setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime());
		
		return updateTeamPayload;
	}
	
	public AccountRegionSave getAccountRegionSavePayload(int teamId) {
		
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("UserManagementTestData", "AccountRegion");
		AccountRegionSave accountRegionSavePayload = new AccountRegionSave();
//		accountRegionSavePayload.setTeamAssociateId(teamAssociateId)
//								.setTeamId(teamId)
//								.setAppType(testData.get(0).get("AppType"))
//								.setRegionPerilName(testData.get(0).get("RegionPerilName"))
//								.setCreatedDate(createdDate)
//								.setCreatedBy(userName)
//								.setApplicationUser(userName)
//								.setApplicationDate(TestUtils.getInstance().getUtcFormatCurrentDateTime());
		
		accountRegionSavePayload.setRequestTypeId(Integer.parseInt(testData.get(0).get("RequestTypeId")))
								.setRequestType(testData.get(0).get("RequestType"))
								.setTeamId(teamId)
								.setApplicationUser(userName)
								.setApplicationDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
								.setAppType(testData.get(0).get("AppType"))
								.setRegionPerilName(testData.get(0).get("RegionPerilName"));
								
		
		return accountRegionSavePayload; 
								
	}

	public Users getUsersPayloadWithoutFilter()  {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("UserManagementTestData", "Users");
		Users userPayload = new Users();
		userPayload.setSkip(Integer.parseInt(testData.get(0).get("Skip")))
						  .setTake(Integer.parseInt(testData.get(0).get("Take")))
						  .setOrderBy(testData.get(0).get("OrderBy"));

		return userPayload;
	}
	
	public Users getUsersPayloadWithFilter(String valueKey)  {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("UserManagementTestData", "Users");
		Users userPayload = new Users();
		Filter filter = new Filter();
		List<Filter> filterList = new ArrayList<Filter>();
		filter.setColumnName(testData.get(0).get("ColumnName"))
			  .setOperator(testData.get(0).get("Operator"))
			  .setValue(testData.get(0).get(valueKey))
			  .setLogicalOperator(testData.get(0).get("LogicalOperator"));
		
		filterList.add(filter);
		
		userPayload.setSkip(Integer.parseInt(testData.get(0).get("Skip")))
						  .setTake(Integer.parseInt(testData.get(0).get("Take")))
						  .setOrderBy(testData.get(0).get("OrderBy"))
						  .setFilter(filterList);

		return userPayload;
	}
	
	public GetAllProcessTaskWithTime GetAllProcessTaskWithTimePayloadWithoutFilter() {
		GetAllProcessTaskWithTime  getAllProcessTaskWithTimePayload = new GetAllProcessTaskWithTime();
		
		getAllProcessTaskWithTimePayload.setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
										.setSkip(0)
										.setTake(10)
										.setUserName(userName);
		
		return getAllProcessTaskWithTimePayload;
	}
	
	public GetAllProcessTaskWithTime GetAllProcessTaskWithTimePayloadWithFilter() {
		GetAllProcessTaskWithTime  getAllProcessTaskWithTimePayload = new GetAllProcessTaskWithTime();
		
		Filter filter = new Filter();
		filter.setColumnName("Task")
			  .setOperator("contains")
			  .setValue("Data Prparation")
			  .setLogicalOperator("");
		List<Filter> filters = new ArrayList<Filter>();
		filters.add(filter);
		
		getAllProcessTaskWithTimePayload.setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
										.setSkip(0)
										.setTake(10)
										.setUserName(userName)
										.setFilter(filters);
		
		return getAllProcessTaskWithTimePayload;
	}
	
	public CreateUser getCreatePayload() {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("UserManagementTestData", "Create");
		CreateUser createPaylaod = new CreateUser();
		createPaylaod.setContactNo(testData.get(0).get("ContactNo"))
					 .setUserId(Integer.parseInt(testData.get(0).get("UserId")))
					 .setRoleId(testData.get(0).get("RoleId"))
					 .setTimeZone(testData.get(0).get("TimeZone"))
					 .setLoginName(testData.get(0).get("LoginName"))
					 .setLastName(testData.get(0).get("LastName"))
					 .setFirstName(testData.get(0).get("FirstName"))
					 .setIsActive(Boolean.parseBoolean(testData.get(0).get("IsActive")))
					 .setEmail(testData.get(0).get("Email"))
					 .setUnderwriterId(testData.get(0).get("UnderwriterId"))
					 .setAliasName(testData.get(0).get("AliasName"))
					 .setRole(testData.get(0).get("Role"))
					 .setIsLMSEnabled(Boolean.parseBoolean(testData.get(0).get("IsLMSEnabled")))
					 .setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime());
		return createPaylaod;
					 
	}
	
	public UpdateUserSettings getUpdateUserSettingsPayload() {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("UserManagementTestData", "Create");
		UpdateUserSettings updateUserSettingsPaylaod = new UpdateUserSettings();
		updateUserSettingsPaylaod.setContactNo(testData.get(0).get("ContactNo"))
					 .setId(0)
					 .setUserId(Integer.parseInt(testData.get(0).get("UserId")))
					 .setRoleId(testData.get(0).get("RoleId"))
					 .setTimeZone(testData.get(0).get("TimeZone"))
					 .setLoginName(testData.get(0).get("LoginName"))
					 .setLastName(testData.get(0).get("LastName"))
					 .setFirstName(testData.get(0).get("FirstName"))
					 .setIsActive(Boolean.parseBoolean(testData.get(0).get("IsActive")))
					 .setEmail(testData.get(0).get("Email"))
					 .setUnderwriterId(testData.get(0).get("UnderwriterId"))
					 .setAliasName(testData.get(0).get("AliasName"))
					 .setRole(testData.get(0).get("Role"))
					 .setIsLMSEnabled(Boolean.parseBoolean(testData.get(0).get("IsLMSEnabled")))
					 .setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
					 .setIsBlock(Boolean.parseBoolean(testData.get(0).get("IsLMSEnabled")))
					 .setDateTimeFormat(testData.get(0).get("DateTimeFormat"))
					 .setWaitingPeriod(Integer.parseInt(testData.get(0).get("WaitingPeriod")));
		return updateUserSettingsPaylaod;
					 
	}
}
