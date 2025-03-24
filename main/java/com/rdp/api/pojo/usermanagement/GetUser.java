package com.rdp.api.pojo.usermanagement;


import com.fasterxml.jackson.annotation.JsonProperty;




public class GetUser {

@JsonProperty("UserId")
private Integer userId;
@JsonProperty("ID")
private Integer id;
@JsonProperty("LoginName")
private String loginName;
@JsonProperty("FirstName")
private String firstName;
@JsonProperty("LastName")
private String lastName;
@JsonProperty("FullName")
private Object fullName;
@JsonProperty("ContactNo")
private String contactNo;
@JsonProperty("Email")
private String email;
@JsonProperty("IsActive")
private Boolean isActive;
@JsonProperty("IsBlock")
private Boolean isBlock;
@JsonProperty("RoleId")
private Object roleId;
@JsonProperty("RoleName")
private Object roleName;
@JsonProperty("UnderwriterId")
private Object underwriterId;
@JsonProperty("BranchId")
private Object branchId;
@JsonProperty("Role")
private Object role;
@JsonProperty("Manager")
private Object manager;
@JsonProperty("TimeZone")
private String timeZone;
@JsonProperty("AppDate")
private String appDate;
@JsonProperty("DateTimeFormat")
private Object dateTimeFormat;
@JsonProperty("WaitingPeriod")
private Integer waitingPeriod;
@JsonProperty("AliasName")
private Object aliasName;
@JsonProperty("BranchCode")
private Object branchCode;
@JsonProperty("IsLMSEnabled")
private Boolean isLMSEnabled;

@JsonProperty("UserId")
public Integer getUserId() {
return userId;
}

@JsonProperty("UserId")
public void setUserId(Integer userId) {
this.userId = userId;
}

@JsonProperty("ID")
public Integer getId() {
return id;
}

@JsonProperty("ID")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("LoginName")
public String getLoginName() {
return loginName;
}

@JsonProperty("LoginName")
public void setLoginName(String loginName) {
this.loginName = loginName;
}

@JsonProperty("FirstName")
public String getFirstName() {
return firstName;
}

@JsonProperty("FirstName")
public void setFirstName(String firstName) {
this.firstName = firstName;
}

@JsonProperty("LastName")
public String getLastName() {
return lastName;
}

@JsonProperty("LastName")
public void setLastName(String lastName) {
this.lastName = lastName;
}

@JsonProperty("FullName")
public Object getFullName() {
return fullName;
}

@JsonProperty("FullName")
public void setFullName(Object fullName) {
this.fullName = fullName;
}

@JsonProperty("ContactNo")
public String getContactNo() {
return contactNo;
}

@JsonProperty("ContactNo")
public void setContactNo(String contactNo) {
this.contactNo = contactNo;
}

@JsonProperty("Email")
public String getEmail() {
return email;
}

@JsonProperty("Email")
public void setEmail(String email) {
this.email = email;
}

@JsonProperty("IsActive")
public Boolean getIsActive() {
return isActive;
}

@JsonProperty("IsActive")
public void setIsActive(Boolean isActive) {
this.isActive = isActive;
}

@JsonProperty("IsBlock")
public Boolean getIsBlock() {
return isBlock;
}

@JsonProperty("IsBlock")
public void setIsBlock(Boolean isBlock) {
this.isBlock = isBlock;
}

@JsonProperty("RoleId")
public Object getRoleId() {
return roleId;
}

@JsonProperty("RoleId")
public void setRoleId(Object roleId) {
this.roleId = roleId;
}

@JsonProperty("RoleName")
public Object getRoleName() {
return roleName;
}

@JsonProperty("RoleName")
public void setRoleName(Object roleName) {
this.roleName = roleName;
}

@JsonProperty("UnderwriterId")
public Object getUnderwriterId() {
return underwriterId;
}

@JsonProperty("UnderwriterId")
public void setUnderwriterId(Object underwriterId) {
this.underwriterId = underwriterId;
}

@JsonProperty("BranchId")
public Object getBranchId() {
return branchId;
}

@JsonProperty("BranchId")
public void setBranchId(Object branchId) {
this.branchId = branchId;
}

@JsonProperty("Role")
public Object getRole() {
return role;
}

@JsonProperty("Role")
public void setRole(Object role) {
this.role = role;
}

@JsonProperty("Manager")
public Object getManager() {
return manager;
}

@JsonProperty("Manager")
public void setManager(Object manager) {
this.manager = manager;
}

@JsonProperty("TimeZone")
public String getTimeZone() {
return timeZone;
}

@JsonProperty("TimeZone")
public void setTimeZone(String timeZone) {
this.timeZone = timeZone;
}

@JsonProperty("AppDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("AppDate")
public void setAppDate(String appDate) {
this.appDate = appDate;
}

@JsonProperty("DateTimeFormat")
public Object getDateTimeFormat() {
return dateTimeFormat;
}

@JsonProperty("DateTimeFormat")
public void setDateTimeFormat(Object dateTimeFormat) {
this.dateTimeFormat = dateTimeFormat;
}

@JsonProperty("WaitingPeriod")
public Integer getWaitingPeriod() {
return waitingPeriod;
}

@JsonProperty("WaitingPeriod")
public void setWaitingPeriod(Integer waitingPeriod) {
this.waitingPeriod = waitingPeriod;
}

@JsonProperty("AliasName")
public Object getAliasName() {
return aliasName;
}

@JsonProperty("AliasName")
public void setAliasName(Object aliasName) {
this.aliasName = aliasName;
}

@JsonProperty("BranchCode")
public Object getBranchCode() {
return branchCode;
}

@JsonProperty("BranchCode")
public void setBranchCode(Object branchCode) {
this.branchCode = branchCode;
}

@JsonProperty("IsLMSEnabled")
public Boolean getIsLMSEnabled() {
return isLMSEnabled;
}

@JsonProperty("IsLMSEnabled")
public void setIsLMSEnabled(Boolean isLMSEnabled) {
this.isLMSEnabled = isLMSEnabled;
}

}