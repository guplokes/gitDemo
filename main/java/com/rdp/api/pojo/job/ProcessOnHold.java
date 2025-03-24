package com.rdp.api.pojo.job;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;




public class ProcessOnHold {

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
public ProcessOnHold setProcessId(Integer processId) {
this.processId = processId;
return this;
}

@JsonProperty("TaskCode")
public String getTaskCode() {
return taskCode;
}

@JsonProperty("TaskCode")
public ProcessOnHold setTaskCode(String taskCode) {
this.taskCode = taskCode;
return this;
}

@JsonProperty("Task")
public String getTask() {
return task;
}

@JsonProperty("Task")
public ProcessOnHold setTask(String task) {
this.task = task;
return this;
}

@JsonProperty("TaskType")
public String getTaskType() {
return taskType;
}

@JsonProperty("TaskType")
public ProcessOnHold setTaskType(String taskType) {
this.taskType = taskType;
return this;
}

@JsonProperty("ApplicationUser")
public String getApplicationUser() {
return applicationUser;
}

@JsonProperty("ApplicationUser")
public ProcessOnHold setApplicationUser(String applicationUser) {
this.applicationUser = applicationUser;
return this;
}

@JsonProperty("ApplicationDate")
public String getApplicationDate() {
return applicationDate;
}

@JsonProperty("ApplicationDate")
public ProcessOnHold setApplicationDate(String applicationDate) {
this.applicationDate = applicationDate;
return this;
}

}