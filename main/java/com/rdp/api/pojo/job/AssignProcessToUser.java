package com.rdp.api.pojo.job;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class AssignProcessToUser {

@JsonProperty("UserName")
private String userName;
@JsonProperty("AppDate")
private String appDate;
@JsonProperty("JobProcessAssignmentList")
private List<JobProcessAssignment> jobProcessAssignmentList;
@JsonProperty("JobOtherDetails")
private List<JobOtherDetail> jobOtherDetails;
@JsonProperty("Complexity")
private String complexity;

@JsonProperty("UserName")
public String getUserName() {
return userName;
}

@JsonProperty("UserName")
public AssignProcessToUser setUserName(String userName) {
this.userName = userName;
return this;
}

@JsonProperty("AppDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("AppDate")
public AssignProcessToUser setAppDate(String appDate) {
this.appDate = appDate;
return this;
}

@JsonProperty("JobProcessAssignmentList")
public List<JobProcessAssignment> getJobProcessAssignmentList() {
return jobProcessAssignmentList;
}

@JsonProperty("JobProcessAssignmentList")
public AssignProcessToUser setJobProcessAssignmentList(List<JobProcessAssignment> jobProcessAssignmentList) {
this.jobProcessAssignmentList = jobProcessAssignmentList;
return this;
}

@JsonProperty("JobOtherDetails")
public List<JobOtherDetail> getJobOtherDetails() {
return jobOtherDetails;
}

@JsonProperty("JobOtherDetails")
public AssignProcessToUser setJobOtherDetails(List<JobOtherDetail> jobOtherDetails) {
this.jobOtherDetails = jobOtherDetails;
return this;
}

@JsonProperty("Complexity")
public String getComplexity() {
return complexity;
}

@JsonProperty("Complexity")
public AssignProcessToUser setComplexity(String complexity) {
this.complexity = complexity;
return this;
}

}