package com.rdp.api.pojo.job;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"ProcessId",
"userName",
"TaskCode"
})


public class JobProcessAssignment {

@JsonProperty("ProcessId")
private Integer processId;
@JsonProperty("userName")
private String userName;
@JsonProperty("TaskCode")
private String taskCode;

@JsonProperty("ProcessId")
public Integer getProcessId() {
return processId;
}

@JsonProperty("ProcessId")
public JobProcessAssignment setProcessId(Integer processId) {
this.processId = processId;
return this;
}

@JsonProperty("userName")
public String getUserName() {
return userName;

}

@JsonProperty("userName")
public JobProcessAssignment setUserName(String userName) {
this.userName = userName;
return this;
}

@JsonProperty("TaskCode")
public String getTaskCode() {
return taskCode;
}

@JsonProperty("TaskCode")
public JobProcessAssignment setTaskCode(String taskCode) {
this.taskCode = taskCode;
return this;
}

}