package com.rdp.api.pojo.taskDetail;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"ActivityDate",
"TaskCategory",
"TimeInMins",
"TaskDetails",
"ApplicationUser",
"ApplicationDate",
"JobId"
})

public class OtherActivityNew {

@JsonProperty("ActivityDate")
private String activityDate;
@JsonProperty("TaskCategory")
private String taskCategory;
@JsonProperty("TimeInMins")
private Integer timeInMins;
@JsonProperty("TaskDetails")
private String taskDetails;
@JsonProperty("ApplicationUser")
private String applicationUser;
@JsonProperty("ApplicationDate")
private String applicationDate;
@JsonProperty("JobId")
private Integer jobId;

@JsonProperty("ActivityDate")
public String getActivityDate() {
return activityDate;
}

@JsonProperty("ActivityDate")
public OtherActivityNew setActivityDate(String activityDate) {
this.activityDate = activityDate;
return this;
}

@JsonProperty("TaskCategory")
public String getTaskCategory() {
return taskCategory;
}

@JsonProperty("TaskCategory")
public OtherActivityNew setTaskCategory(String taskCategory) {
this.taskCategory = taskCategory;
return this;
}

@JsonProperty("TimeInMins")
public Integer getTimeInMins() {
return timeInMins;
}

@JsonProperty("TimeInMins")
public OtherActivityNew setTimeInMins(Integer timeInMins) {
this.timeInMins = timeInMins;
return this;
}

@JsonProperty("TaskDetails")
public String getTaskDetails() {
return taskDetails;
}

@JsonProperty("TaskDetails")
public OtherActivityNew setTaskDetails(String taskDetails) {
this.taskDetails = taskDetails;
return this;
}

@JsonProperty("ApplicationUser")
public String getApplicationUser() {
return applicationUser;
}

@JsonProperty("ApplicationUser")
public OtherActivityNew setApplicationUser(String applicationUser) {
this.applicationUser = applicationUser;
return this;
}

@JsonProperty("ApplicationDate")
public String getApplicationDate() {
return applicationDate;
}

@JsonProperty("ApplicationDate")
public OtherActivityNew setApplicationDate(String applicationDate) {
this.applicationDate = applicationDate;
return this;
}

@JsonProperty("JobId")
public Integer getJobId() {
return jobId;
}

@JsonProperty("JobId")
public OtherActivityNew setJobId(Integer jobId) {
this.jobId = jobId;
return this;
}



}