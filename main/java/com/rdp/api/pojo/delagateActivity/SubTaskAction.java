package com.rdp.api.pojo.delagateActivity;



import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"ProcessId",
"TaskCode",
"Task",
"TaskType",
"ApplicationUser",
"ApplicationDate"
})

public class SubTaskAction {

@JsonProperty("ProcessId")
private Integer processId;
@JsonProperty("TaskCode")
private String taskCode;
@JsonProperty("Task")
private String task;
@JsonProperty("TaskType")
private String taskType;
@JsonProperty("ApplicationUser")
private String applicationUser;
@JsonProperty("ApplicationDate")
private String applicationDate;

@JsonProperty("ProcessId")
public Integer getProcessId() {
return processId;
}

@JsonProperty("ProcessId")
public SubTaskAction setProcessId(Integer processId) {
this.processId = processId;
return this;
}

@JsonProperty("TaskCode")
public String getTaskCode() {
return taskCode;
}

@JsonProperty("TaskCode")
public SubTaskAction setTaskCode(String taskCode) {
this.taskCode = taskCode;
return this;
}

@JsonProperty("Task")
public String getTask() {
return task;
}

@JsonProperty("Task")
public SubTaskAction setTask(String task) {
this.task = task;
return this;
}

@JsonProperty("TaskType")
public String getTaskType() {
return taskType;
}

@JsonProperty("TaskType")
public SubTaskAction setTaskType(String taskType) {
this.taskType = taskType;
return this;
}

@JsonProperty("ApplicationUser")
public String getApplicationUser() {
return applicationUser;
}

@JsonProperty("ApplicationUser")
public SubTaskAction setApplicationUser(String applicationUser) {
this.applicationUser = applicationUser;
return this;
}

@JsonProperty("ApplicationDate")
public String getApplicationDate() {
return applicationDate;
}

@JsonProperty("ApplicationDate")
public SubTaskAction setApplicationDate(String applicationDate) {
this.applicationDate = applicationDate;
return this;
}

}