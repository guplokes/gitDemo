package com.rdp.api.pojo.job;

import com.fasterxml.jackson.annotation.JsonProperty;


public class JobDefaultValue {

@JsonProperty("Perils")
private String perils;
@JsonProperty("NoOfLocation")
private String noOfLocation;
@JsonProperty("TIV")
private Integer tiv;
@JsonProperty("Priority")
private String priority;
@JsonProperty("RequestTypeId")
private Integer requestTypeId;
@JsonProperty("CurrencyCode")
private String currencyCode;
@JsonProperty("BusinessTypeId")
private Integer businessTypeId;
@JsonProperty("BusinessTypeReason")
private String businessTypeReason;
@JsonProperty("LobId")
private Integer lobId;
@JsonProperty("BusinessTypeOther")
private String businessTypeOther;
@JsonProperty("SOVFilePath")
private String sOVFilePath;
@JsonProperty("Platform")
private String platform;
@JsonProperty("UserId")
private Integer userId;
@JsonProperty("AppDate")
private String appDate;

@JsonProperty("Perils")
public String getPerils() {
return perils;
}

@JsonProperty("Perils")
public JobDefaultValue setPerils(String perils) {
this.perils = perils;
return this;
}

@JsonProperty("NoOfLocation")
public String getNoOfLocation() {
return noOfLocation;

}

@JsonProperty("NoOfLocation")
public JobDefaultValue setNoOfLocation(String noOfLocation) {
this.noOfLocation = noOfLocation;
return this;
}

@JsonProperty("TIV")
public Integer getTiv() {
return tiv;
}

@JsonProperty("TIV")
public JobDefaultValue setTiv(Integer tiv) {
this.tiv = tiv;
return this;
}

@JsonProperty("Priority")
public String getPriority() {
return priority;
}

@JsonProperty("Priority")
public JobDefaultValue setPriority(String priority) {
this.priority = priority;
return this;
}

@JsonProperty("RequestTypeId")
public Integer getRequestTypeId() {
return requestTypeId;
}

@JsonProperty("RequestTypeId")
public JobDefaultValue setRequestTypeId(Integer requestTypeId) {
this.requestTypeId = requestTypeId;
return this;
}

@JsonProperty("CurrencyCode")
public String getCurrencyCode() {
return currencyCode;
}

@JsonProperty("CurrencyCode")
public JobDefaultValue setCurrencyCode(String currencyCode) {
this.currencyCode = currencyCode;
return this;
}

@JsonProperty("BusinessTypeId")
public Integer getBusinessTypeId() {
return businessTypeId;
}

@JsonProperty("BusinessTypeId")
public void setBusinessTypeId(Integer businessTypeId) {
this.businessTypeId = businessTypeId;
}

@JsonProperty("BusinessTypeReason")
public String getBusinessTypeReason() {
return businessTypeReason;
}

@JsonProperty("BusinessTypeReason")
public void setBusinessTypeReason(String businessTypeReason) {
this.businessTypeReason = businessTypeReason;
}

@JsonProperty("LobId")
public Integer getLobId() {
return lobId;
}

@JsonProperty("LobId")
public void setLobId(Integer lobId) {
this.lobId = lobId;
}

@JsonProperty("BusinessTypeOther")
public String getBusinessTypeOther() {
return businessTypeOther;
}

@JsonProperty("BusinessTypeOther")
public void setBusinessTypeOther(String businessTypeOther) {
this.businessTypeOther = businessTypeOther;
}

@JsonProperty("SOVFilePath")
public String getSOVFilePath() {
return sOVFilePath;
}

@JsonProperty("SOVFilePath")
public void setSOVFilePath(String sOVFilePath) {
this.sOVFilePath = sOVFilePath;
}

@JsonProperty("Platform")
public String getPlatform() {
return platform;
}

@JsonProperty("Platform")
public void setPlatform(String platform) {
this.platform = platform;
}

@JsonProperty("UserId")
public Integer getUserId() {
return userId;
}

@JsonProperty("UserId")
public void setUserId(Integer userId) {
this.userId = userId;
}

@JsonProperty("AppDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("AppDate")
public JobDefaultValue setAppDate(String appDate) {
this.appDate = appDate;
return this;
}

}