
package com.rdp.api.pojo.usermanagement;

import com.fasterxml.jackson.annotation.JsonProperty;



public class CreateUser {

@JsonProperty("ContactNo")
private String contactNo;
@JsonProperty("UserId")
private Integer userId;
@JsonProperty("TimeZone")
private String timeZone;
@JsonProperty("RoleId")
private String roleId;
@JsonProperty("LoginName")
private String loginName;
@JsonProperty("LastName")
private String lastName;
@JsonProperty("IsActive")
private Boolean isActive;
@JsonProperty("FirstName")
private String firstName;
@JsonProperty("Email")
private String email;
@JsonProperty("UnderwriterId")
private String underwriterId;
@JsonProperty("BranchId")
private Object branchId;
@JsonProperty("AliasName")
private String aliasName;
@JsonProperty("BranchCode")
private Object branchCode;
@JsonProperty("Role")
private String role;
@JsonProperty("IsLMSEnabled")
private Boolean isLMSEnabled;
@JsonProperty("AppDate")
private String appDate;

@JsonProperty("ContactNo")
public String getContactNo() {
return contactNo;
}

@JsonProperty("ContactNo")
public CreateUser setContactNo(String contactNo) {
this.contactNo = contactNo;
return this;
}

@JsonProperty("UserId")
public Integer getUserId() {
return userId;
}

@JsonProperty("UserId")
public CreateUser setUserId(Integer userId) {
this.userId = userId;
return this;
}

@JsonProperty("TimeZone")
public String getTimeZone() {
return timeZone;
}

@JsonProperty("TimeZone")
public CreateUser setTimeZone(String timeZone) {
this.timeZone = timeZone;
return this;
}

@JsonProperty("RoleId")
public String getRoleId() {
return roleId;
}

@JsonProperty("RoleId")
public CreateUser setRoleId(String roleId) {
this.roleId = roleId;
return this;
}

@JsonProperty("LoginName")
public String getLoginName() {
return loginName;
}

@JsonProperty("LoginName")
public CreateUser setLoginName(String loginName) {
this.loginName = loginName;
return this;
}

@JsonProperty("LastName")
public String getLastName() {
return lastName;
}

@JsonProperty("LastName")
public CreateUser setLastName(String lastName) {
this.lastName = lastName;
return this;
}

@JsonProperty("IsActive")
public Boolean getIsActive() {
return isActive;
}

@JsonProperty("IsActive")
public CreateUser setIsActive(Boolean isActive) {
this.isActive = isActive;
return this;
}

@JsonProperty("FirstName")
public String getFirstName() {
return firstName;
}

@JsonProperty("FirstName")
public CreateUser setFirstName(String firstName) {
this.firstName = firstName;
return this;
}

@JsonProperty("Email")
public String getEmail() {
return email;
}

@JsonProperty("Email")
public CreateUser setEmail(String email) {
this.email = email;
return this;
}

@JsonProperty("UnderwriterId")
public String getUnderwriterId() {
return underwriterId;
}

@JsonProperty("UnderwriterId")
public CreateUser setUnderwriterId(String underwriterId) {
this.underwriterId = underwriterId;
return this;
}

@JsonProperty("BranchId")
public Object getBranchId() {
return branchId;
}

@JsonProperty("BranchId")
public CreateUser setBranchId(Object branchId) {
this.branchId = branchId;
return this;
}

@JsonProperty("AliasName")
public String getAliasName() {
return aliasName;
}

@JsonProperty("AliasName")
public CreateUser setAliasName(String aliasName) {
this.aliasName = aliasName;
return this;
}

@JsonProperty("BranchCode")
public Object getBranchCode() {
return branchCode;
}

@JsonProperty("BranchCode")
public CreateUser setBranchCode(Object branchCode) {
this.branchCode = branchCode;
return this;
}

@JsonProperty("Role")
public String getRole() {
return role;
}

@JsonProperty("Role")
public CreateUser setRole(String role) {
this.role = role;
return this;
}

@JsonProperty("IsLMSEnabled")
public Boolean getIsLMSEnabled() {
return isLMSEnabled;
}

@JsonProperty("IsLMSEnabled")
public CreateUser setIsLMSEnabled(Boolean isLMSEnabled) {
this.isLMSEnabled = isLMSEnabled;
return this;
}

@JsonProperty("AppDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("AppDate")
public CreateUser setAppDate(String appDate) {
this.appDate = appDate;
return this;
}

}
