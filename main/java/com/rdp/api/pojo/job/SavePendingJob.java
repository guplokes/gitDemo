package com.rdp.api.pojo.job;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//"pendingJobID",
//"userID",
//"jsonData",
//"createdOn",
//"createdTime"
//})

public class SavePendingJob {

@JsonProperty("pendingJobID")
private Integer pendingJobID;
@JsonProperty("userID")
private Integer userID;
@JsonProperty("jsonData")
private String jsonData;
@JsonProperty("createdOn")
private String createdOn;
@JsonProperty("createdTime")
private String createdTime;

@JsonProperty("pendingJobID")
public Integer getPendingJobID() {
return pendingJobID;
}

@JsonProperty("pendingJobID")
public SavePendingJob setPendingJobID(Integer pendingJobID) {
this.pendingJobID = pendingJobID;
return this;
}

@JsonProperty("userID")
public Integer getUserID() {
return userID;
}

@JsonProperty("userID")
public SavePendingJob setUserID(Integer userID) {
this.userID = userID;
return this;
}

@JsonProperty("jsonData")
public String getJsonData() {
return jsonData;
}

@JsonProperty("jsonData")
public SavePendingJob setJsonData(String jsonData) {
this.jsonData = jsonData;
return this;
}

@JsonProperty("createdOn")
public String getCreatedOn() {
return createdOn;
}

@JsonProperty("createdOn")
public SavePendingJob setCreatedOn(String createdOn) {
this.createdOn = createdOn;
return this;
}

@JsonProperty("createdTime")
public String getCreatedTime() {
return createdTime;
}

@JsonProperty("createdTime")
public SavePendingJob setCreatedTime(String createdTime) {
this.createdTime = createdTime;
return this;
}

}