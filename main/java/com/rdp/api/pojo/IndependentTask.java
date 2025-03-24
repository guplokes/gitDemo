package com.rdp.api.pojo;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"AccountName",
"Id",
"ProcessId",
"TaskCode",
"TaskType",
"Task",
"StartTime",
"EndTime",
"Stage",
"ApplicationUser",
"ApplicationDate",
"TimeSpent",
"Comment",
"NetDuration"
})

public class IndependentTask {

@JsonProperty("AccountName")
private String accountName;
@JsonProperty("Id")
private Integer id;
@JsonProperty("ProcessId")
private Integer processId;
@JsonProperty("TaskCode")
private String taskCode;
@JsonProperty("TaskType")
private String taskType;
@JsonProperty("Task")
private String task;
@JsonProperty("StartTime")
private String startTime;
@JsonProperty("EndTime")
private String endTime;
@JsonProperty("Stage")
private String stage;
@JsonProperty("ApplicationUser")
private String applicationUser;
@JsonProperty("ApplicationDate")
private String applicationDate;
@JsonProperty("TimeSpent")
private Integer timeSpent;
@JsonProperty("Comment")
private String comment;
@JsonProperty("NetDuration")
private Integer netDuration;

@JsonProperty("AccountName")
public String getAccountName() {
return accountName;
}

@JsonProperty("AccountName")
public IndependentTask setAccountName(String accountName) {
this.accountName = accountName;
return this;
}

@JsonProperty("Id")
public Integer getId() {
return id;
}

@JsonProperty("Id")
public IndependentTask setId(Integer id) {
this.id = id;
return this;
}

@JsonProperty("ProcessId")
public Integer getProcessId() {
return processId;
}

@JsonProperty("ProcessId")
public IndependentTask setProcessId(Integer processId) {
this.processId = processId;
return this;
}

@JsonProperty("TaskCode")
public String getTaskCode() {
return taskCode;
}

@JsonProperty("TaskCode")
public IndependentTask setTaskCode(String taskCode) {
this.taskCode = taskCode;
return this;
}

@JsonProperty("TaskType")
public String getTaskType() {
return taskType;
}

@JsonProperty("TaskType")
public IndependentTask setTaskType(String taskType) {
this.taskType = taskType;
return this;
}

@JsonProperty("Task")
public String getTask() {
return task;
}

@JsonProperty("Task")
public IndependentTask setTask(String task) {
this.task = task;
return this;
}

@JsonProperty("StartTime")
public String getStartTime() {
return startTime;
}

@JsonProperty("StartTime")
public IndependentTask setStartTime(String startTime) {
this.startTime = startTime;
return this;
}

@JsonProperty("EndTime")
public String getEndTime() {
return endTime;
}

@JsonProperty("EndTime")
public IndependentTask setEndTime(String endTime) {
this.endTime = endTime;
return this;
}

@JsonProperty("Stage")
public String getStage() {
return stage;
}

@JsonProperty("Stage")
public IndependentTask setStage(String stage) {
this.stage = stage;
return this;
}

@JsonProperty("ApplicationUser")
public String getApplicationUser() {
return applicationUser;
}

@JsonProperty("ApplicationUser")
public IndependentTask setApplicationUser(String applicationUser) {
this.applicationUser = applicationUser;
return this;
}

@JsonProperty("ApplicationDate")
public String getApplicationDate() {
return applicationDate;
}

@JsonProperty("ApplicationDate")
public IndependentTask setApplicationDate(String applicationDate) {
this.applicationDate = applicationDate;
return this;
}

@JsonProperty("TimeSpent")
public Integer getTimeSpent() {
return timeSpent;
}

@JsonProperty("TimeSpent")
public IndependentTask setTimeSpent(Integer timeSpent) {
this.timeSpent = timeSpent;
return this;
}

@JsonProperty("Comment")
public String getComment() {
return comment;
}

@JsonProperty("Comment")
public IndependentTask setComment(String comment) {
this.comment = comment;
return this;
}

@JsonProperty("NetDuration")
public Integer getNetDuration() {
return netDuration;
}

@JsonProperty("NetDuration")
public IndependentTask setNetDuration(Integer netDuration) {
this.netDuration = netDuration;
return this;
}

}