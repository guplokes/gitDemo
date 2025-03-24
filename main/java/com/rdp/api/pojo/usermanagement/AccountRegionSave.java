package com.rdp.api.pojo.usermanagement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//"TeamAssociateId",
//"TeamId",
//"AppType",
//"RegionPerilName",
//"CreatedDate",
//"CreatedBy",
//"ModifiedDate",
//"ModifiedBy",
//"RequestTypeId",
//"RequestType",
//"ApplicationUser",
//"ApplicationDate"
//})

public class AccountRegionSave {

@JsonProperty("TeamAssociateId")
private Integer teamAssociateId;
@JsonProperty("TeamId")
private Integer teamId;
@JsonProperty("AppType")
private String appType;
@JsonProperty("RegionPerilName")
private String regionPerilName;
@JsonProperty("CreatedDate")
private String createdDate;
@JsonProperty("CreatedBy")
private String createdBy;
@JsonProperty("ModifiedDate")
private Object modifiedDate;
@JsonProperty("ModifiedBy")
private Object modifiedBy;
@JsonProperty("RequestTypeId")
private Object requestTypeId;
@JsonProperty("RequestType")
private Object requestType;
@JsonProperty("ApplicationUser")
private String applicationUser;
@JsonProperty("ApplicationDate")
private String applicationDate;

/**
* No args constructor for use in serialization
*
*/
public AccountRegionSave() {
}

/**
*
* @param regionPerilName
* @param applicationUser
* @param createdDate
* @param teamAssociateId
* @param requestType
* @param createdBy
* @param requestTypeId
* @param appType
* @param teamId
* @param modifiedDate
* @param modifiedBy
* @param applicationDate
*/


@JsonProperty("TeamAssociateId")
public Integer getTeamAssociateId() {
return teamAssociateId;
}

@JsonProperty("TeamAssociateId")
public AccountRegionSave setTeamAssociateId(Integer teamAssociateId) {
this.teamAssociateId = teamAssociateId;
return this;
}

@JsonProperty("TeamId")
public Integer getTeamId() {
return teamId;
}

@JsonProperty("TeamId")
public AccountRegionSave setTeamId(Integer teamId) {
this.teamId = teamId;
return this;
}

@JsonProperty("AppType")
public String getAppType() {
return appType;
}

@JsonProperty("AppType")
public AccountRegionSave setAppType(String appType) {
this.appType = appType;
return this;
}

@JsonProperty("RegionPerilName")
public String getRegionPerilName() {
return regionPerilName;
}

@JsonProperty("RegionPerilName")
public AccountRegionSave setRegionPerilName(String regionPerilName) {
this.regionPerilName = regionPerilName;
return this;
}

@JsonProperty("CreatedDate")
public String getCreatedDate() {
return createdDate;

}

@JsonProperty("CreatedDate")
public AccountRegionSave setCreatedDate(String createdDate) {
this.createdDate = createdDate;
return this;
}

@JsonProperty("CreatedBy")
public String getCreatedBy() {
return createdBy;
}

@JsonProperty("CreatedBy")
public AccountRegionSave setCreatedBy(String createdBy) {
this.createdBy = createdBy;
return this;
}

@JsonProperty("ModifiedDate")
public Object getModifiedDate() {
return modifiedDate;
}

@JsonProperty("ModifiedDate")
public AccountRegionSave setModifiedDate(Object modifiedDate) {
this.modifiedDate = modifiedDate;
return this;
}

@JsonProperty("ModifiedBy")
public Object getModifiedBy() {
return modifiedBy;
}

@JsonProperty("ModifiedBy")
public AccountRegionSave setModifiedBy(Object modifiedBy) {
this.modifiedBy = modifiedBy;
return this;
}

@JsonProperty("RequestTypeId")
public Object getRequestTypeId() {
return requestTypeId;
}

@JsonProperty("RequestTypeId")
public AccountRegionSave setRequestTypeId(Object requestTypeId) {
this.requestTypeId = requestTypeId;
return this;
}

@JsonProperty("RequestType")
public Object getRequestType() {
return requestType;
}

@JsonProperty("RequestType")
public AccountRegionSave setRequestType(Object requestType) {
this.requestType = requestType;
return this;
}

@JsonProperty("ApplicationUser")
public String getApplicationUser() {
return applicationUser;
}

@JsonProperty("ApplicationUser")
public AccountRegionSave setApplicationUser(String applicationUser) {
this.applicationUser = applicationUser;
return this;
}

@JsonProperty("ApplicationDate")
public String getApplicationDate() {
return applicationDate;
}

@JsonProperty("ApplicationDate")
public AccountRegionSave setApplicationDate(String applicationDate) {
this.applicationDate = applicationDate;
return this;
}

}