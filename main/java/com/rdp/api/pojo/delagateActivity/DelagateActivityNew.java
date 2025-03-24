package com.rdp.api.pojo.delagateActivity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"AccountName",
"ParentTask",
"Task",
"AnalystName",
"ProcessId",
"ApplicationUser",
"ApplicationDate"
})

public class DelagateActivityNew {

@JsonProperty("AccountName")
private String accountName;
@JsonProperty("ParentTask")
private String parentTask;
@JsonProperty("Task")
private String task;
@JsonProperty("AnalystName")
private String analystName;
@JsonProperty("ProcessId")
private Integer processId;
@JsonProperty("ApplicationUser")
private String applicationUser;
@JsonProperty("ApplicationDate")
private String applicationDate;

@JsonProperty("AccountName")
public String getAccountName() {
return accountName;
}

@JsonProperty("AccountName")
public DelagateActivityNew setAccountName(String accountName) {
this.accountName = accountName;
return this;
}

@JsonProperty("ParentTask")
public String getParentTask() {
return parentTask;
}

@JsonProperty("ParentTask")
public DelagateActivityNew setParentTask(String parentTask) {
this.parentTask = parentTask;
return this;
}

@JsonProperty("Task")
public String getTask() {
return task;
}

@JsonProperty("Task")
public DelagateActivityNew setTask(String task) {
this.task = task;
return this;
}

@JsonProperty("AnalystName")
public String getAnalystName() {
return analystName;
}

@JsonProperty("AnalystName")
public DelagateActivityNew setAnalystName(String analystName) {
this.analystName = analystName;
return this;
}

@JsonProperty("ProcessId")
public Integer getProcessId() {
return processId;
}

@JsonProperty("ProcessId")
public DelagateActivityNew setProcessId(Integer processId) {
this.processId = processId;
return this;
}

@JsonProperty("ApplicationUser")
public String getApplicationUser() {
return applicationUser;
}

@JsonProperty("ApplicationUser")
public DelagateActivityNew setApplicationUser(String applicationUser) {
this.applicationUser = applicationUser;
return this;
}

@JsonProperty("ApplicationDate")
public String getApplicationDate() {
return applicationDate;
}

@JsonProperty("ApplicationDate")
public DelagateActivityNew setApplicationDate(String applicationDate) {
this.applicationDate = applicationDate;
return this;
}

}