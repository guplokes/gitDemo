package com.rdp.api.pojo.usermanagement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
@JsonPropertyOrder({
"userId",
"id",
"loginName",
"firstName",
"lastName",
"fullName",
"contactNo",
"email",
"isActive",
"isBlock",
"roleId",
"roleName",
"underwriterId",
"branchId",
"role",
"manager",
"timeZone",
"appDate",
"dateTimeFormat",
"waitingPeriod",
"aliasName",
"branchCode",
"isLMSEnabled"
})
public class UpdateUserSettings {

@JsonProperty("userId")
private Integer userId;
@JsonProperty("id")
private Integer id;
@JsonProperty("loginName")
private String loginName;
@JsonProperty("firstName")
private String firstName;
@JsonProperty("lastName")
private String lastName;
@JsonProperty("fullName")
private String fullName;
@JsonProperty("contactNo")
private String contactNo;
@JsonProperty("email")
private String email;
@JsonProperty("isActive")
private Boolean isActive;
@JsonProperty("isBlock")
private Boolean isBlock;
@JsonProperty("roleId")
private String roleId;
@JsonProperty("roleName")
private String roleName;
@JsonProperty("underwriterId")
private String underwriterId;
@JsonProperty("branchId")
private Object branchId;
@JsonProperty("role")
private String role;
@JsonProperty("manager")
private String manager;
@JsonProperty("timeZone")
private String timeZone;
@JsonProperty("appDate")
private String appDate;
@JsonProperty("dateTimeFormat")
private String dateTimeFormat;
@JsonProperty("waitingPeriod")
private Integer waitingPeriod;
@JsonProperty("aliasName")
private String aliasName;
@JsonProperty("branchCode")
private Object branchCode;
@JsonProperty("isLMSEnabled")
private Boolean isLMSEnabled;

@JsonProperty("userId")
public Integer getUserId() {
return userId;
}

@JsonProperty("userId")
public UpdateUserSettings setUserId(Integer userId) {
this.userId = userId;
return this;
}

@JsonProperty("id")
public Integer getId() {
return id;
}

@JsonProperty("id")
public UpdateUserSettings setId(Integer id) {
this.id = id;
return this;
}

@JsonProperty("loginName")
public String getLoginName() {
return loginName;
}

@JsonProperty("loginName")
public UpdateUserSettings setLoginName(String loginName) {
this.loginName = loginName;
return this;
}

@JsonProperty("firstName")
public String getFirstName() {
return firstName;
}

@JsonProperty("firstName")
public UpdateUserSettings setFirstName(String firstName) {
this.firstName = firstName;
return this;
}

@JsonProperty("lastName")
public String getLastName() {
return lastName;
}

@JsonProperty("lastName")
public UpdateUserSettings setLastName(String lastName) {
this.lastName = lastName;
return this;
}

@JsonProperty("fullName")
public String getFullName() {
return fullName;
}

@JsonProperty("fullName")
public UpdateUserSettings setFullName(String fullName) {
this.fullName = fullName;
return this;
}

@JsonProperty("contactNo")
public String getContactNo() {
return contactNo;
}

@JsonProperty("contactNo")
public UpdateUserSettings setContactNo(String contactNo) {
this.contactNo = contactNo;
return this;
}

@JsonProperty("email")
public String getEmail() {
return email;
}

@JsonProperty("email")
public UpdateUserSettings setEmail(String email) {
this.email = email;
return this;
}

@JsonProperty("isActive")
public Boolean getIsActive() {
return isActive;
}

@JsonProperty("isActive")
public UpdateUserSettings setIsActive(Boolean isActive) {
this.isActive = isActive;
return this;
}

@JsonProperty("isBlock")
public Boolean getIsBlock() {
return isBlock;
}

@JsonProperty("isBlock")
public UpdateUserSettings setIsBlock(Boolean isBlock) {
this.isBlock = isBlock;
return this;
}

@JsonProperty("roleId")
public String getRoleId() {
return roleId;
}

@JsonProperty("roleId")
public UpdateUserSettings setRoleId(String roleId) {
this.roleId = roleId;
return this;
}

@JsonProperty("roleName")
public String getRoleName() {
return roleName;
}

@JsonProperty("roleName")
public UpdateUserSettings setRoleName(String roleName) {
this.roleName = roleName;
return this;
}

@JsonProperty("underwriterId")
public String getUnderwriterId() {
return underwriterId;
}

@JsonProperty("underwriterId")
public UpdateUserSettings setUnderwriterId(String underwriterId) {
this.underwriterId = underwriterId;
return this;
}

@JsonProperty("branchId")
public Object getBranchId() {
return branchId;

}

@JsonProperty("branchId")
public UpdateUserSettings setBranchId(Object branchId) {
this.branchId = branchId;
return this;
}

@JsonProperty("role")
public String getRole() {
return role;
}

@JsonProperty("role")
public UpdateUserSettings setRole(String role) {
this.role = role;
return this;
}

@JsonProperty("manager")
public String getManager() {
return manager;
}

@JsonProperty("manager")
public UpdateUserSettings setManager(String manager) {
this.manager = manager;
return this;
}

@JsonProperty("timeZone")
public String getTimeZone() {
return timeZone;
}

@JsonProperty("timeZone")
public UpdateUserSettings setTimeZone(String timeZone) {
this.timeZone = timeZone;
return this;
}

@JsonProperty("appDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("appDate")
public UpdateUserSettings setAppDate(String appDate) {
this.appDate = appDate;
return this;
}

@JsonProperty("dateTimeFormat")
public String getDateTimeFormat() {
return dateTimeFormat;
}

@JsonProperty("dateTimeFormat")
public UpdateUserSettings setDateTimeFormat(String dateTimeFormat) {
this.dateTimeFormat = dateTimeFormat;
return this;
}

@JsonProperty("waitingPeriod")
public Integer getWaitingPeriod() {
return waitingPeriod;
}

@JsonProperty("waitingPeriod")
public UpdateUserSettings setWaitingPeriod(Integer waitingPeriod) {
this.waitingPeriod = waitingPeriod;
return this;
}

@JsonProperty("aliasName")
public String getAliasName() {
return aliasName;
}

@JsonProperty("aliasName")
public UpdateUserSettings setAliasName(String aliasName) {
this.aliasName = aliasName;
return this;
}

@JsonProperty("branchCode")
public Object getBranchCode() {
return branchCode;
}

@JsonProperty("branchCode")
public UpdateUserSettings setBranchCode(Object branchCode) {
this.branchCode = branchCode;
return this;
}

@JsonProperty("isLMSEnabled")
public Boolean getIsLMSEnabled() {
return isLMSEnabled;
}

@JsonProperty("isLMSEnabled")
public UpdateUserSettings setIsLMSEnabled(Boolean isLMSEnabled) {
this.isLMSEnabled = isLMSEnabled;
return this;
}

}