
package com.rdp.api.pojo.job;

//import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Perils",
"NoOfLocation",
"TIV",
"Priority",
"RequestTypeId",
"CurrencyCode",
"BusinessTypeId",
"BusinessTypeReason",
"LobId",
"BusinessTypeOther",
"SOVFilePath",
"Platform",
"UserId",
"AppDate"
})
//@Generated("jsonschema2pojo")
public class SaveJobDefaultValue {

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
private Object businessTypeReason;
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
public SaveJobDefaultValue setPerils(String perils) {
this.perils = perils;
return this;
}

@JsonProperty("NoOfLocation")
public String getNoOfLocation() {
return noOfLocation;
}

@JsonProperty("NoOfLocation")
public SaveJobDefaultValue setNoOfLocation(String noOfLocation) {
this.noOfLocation = noOfLocation;
return this;
}

@JsonProperty("TIV")
public Integer getTiv() {
return tiv;
}

@JsonProperty("TIV")
public SaveJobDefaultValue setTiv(Integer tiv) {
this.tiv = tiv;
return this;
}

@JsonProperty("Priority")
public String getPriority() {
return priority;
}

@JsonProperty("Priority")
public SaveJobDefaultValue setPriority(String priority) {
this.priority = priority;
return this;
}

@JsonProperty("RequestTypeId")
public Integer getRequestTypeId() {
return requestTypeId;
}

@JsonProperty("RequestTypeId")
public SaveJobDefaultValue setRequestTypeId(Integer requestTypeId) {
this.requestTypeId = requestTypeId;
return this;
}

@JsonProperty("CurrencyCode")
public String getCurrencyCode() {
return currencyCode;
}

@JsonProperty("CurrencyCode")
public SaveJobDefaultValue setCurrencyCode(String currencyCode) {
this.currencyCode = currencyCode;
return this;
}

@JsonProperty("BusinessTypeId")
public Integer getBusinessTypeId() {
return businessTypeId;
}

@JsonProperty("BusinessTypeId")
public SaveJobDefaultValue setBusinessTypeId(Integer businessTypeId) {
this.businessTypeId = businessTypeId;
return this;
}

@JsonProperty("BusinessTypeReason")
public Object getBusinessTypeReason() {
return businessTypeReason;
}

@JsonProperty("BusinessTypeReason")
public SaveJobDefaultValue setBusinessTypeReason(Object businessTypeReason) {
this.businessTypeReason = businessTypeReason;
return this;
}

@JsonProperty("LobId")
public Integer getLobId() {
return lobId;
}

@JsonProperty("LobId")
public SaveJobDefaultValue setLobId(Integer lobId) {
this.lobId = lobId;
return this;
}

@JsonProperty("BusinessTypeOther")
public String getBusinessTypeOther() {
return businessTypeOther;
}

@JsonProperty("BusinessTypeOther")
public SaveJobDefaultValue setBusinessTypeOther(String businessTypeOther) {
this.businessTypeOther = businessTypeOther;
return this;
}

@JsonProperty("SOVFilePath")
public String getSOVFilePath() {
return sOVFilePath;
}

@JsonProperty("SOVFilePath")
public SaveJobDefaultValue setSOVFilePath(String sOVFilePath) {
this.sOVFilePath = sOVFilePath;
return this;
}

@JsonProperty("Platform")
public String getPlatform() {
return platform;
}

@JsonProperty("Platform")
public SaveJobDefaultValue setPlatform(String platform) {
this.platform = platform;
return this;
}

@JsonProperty("UserId")
public Integer getUserId() {
return userId;
}

@JsonProperty("UserId")
public SaveJobDefaultValue setUserId(Integer userId) {
this.userId = userId;
return this;
}

@JsonProperty("AppDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("AppDate")
public SaveJobDefaultValue setAppDate(String appDate) {
this.appDate = appDate;
return this;
}

}