package com.rdp.api.pojo.job;


import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateJobAndProcess {

@JsonProperty("TaskStatus")
private String taskStatus;
@JsonProperty("TaskCode")
private String taskCode;
@JsonProperty("ProcessId")
private Integer processId;
@JsonProperty("userId")
private Integer userId;
@JsonProperty("AppDate")
private String appDate;

@JsonProperty("TaskStatus")
public String getTaskStatus() {
return taskStatus;
}

@JsonProperty("TaskStatus")
public UpdateJobAndProcess setTaskStatus(String taskStatus) {
this.taskStatus = taskStatus;
return this;
}

@JsonProperty("TaskCode")
public String getTaskCode() {
return taskCode;
}

@JsonProperty("TaskCode")
public UpdateJobAndProcess setTaskCode(String taskCode) {
this.taskCode = taskCode;
return this;
}

@JsonProperty("ProcessId")
public Integer getProcessId() {
return processId;
}

@JsonProperty("ProcessId")
public UpdateJobAndProcess setProcessId(Integer processId) {
this.processId = processId;
return this;
}

@JsonProperty("userId")
public Integer getUserId() {
return userId;
}

@JsonProperty("userId")
public UpdateJobAndProcess setUserId(Integer userId) {
this.userId = userId;
return this;
}

@JsonProperty("AppDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("AppDate")
public UpdateJobAndProcess setAppDate(String appDate) {
this.appDate = appDate;
return this;
}

}