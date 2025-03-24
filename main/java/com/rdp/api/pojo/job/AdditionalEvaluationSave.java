package com.rdp.api.pojo.job;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"AdditionalEvaluationId",
"ProcessId",
"EvaluationStatus",
"ProcessLeadStatus",
"EngineerReviewStatus",
"EngineeringLead",
"StormSurgeStatus",
"FinalReview",
"Comments",
"AdditionalEvalDueDate",
"Priority",
"Platform",
"ApplicationUser",
"ApplicationDate"
})

public class AdditionalEvaluationSave {

@JsonProperty("AdditionalEvaluationId")
private Integer additionalEvaluationId;
@JsonProperty("ProcessId")
private Integer processId;
@JsonProperty("EvaluationStatus")
private String evaluationStatus;
@JsonProperty("ProcessLeadStatus")
private String processLeadStatus;
@JsonProperty("EngineerReviewStatus")
private String engineerReviewStatus;
@JsonProperty("EngineeringLead")
private String engineeringLead;
@JsonProperty("StormSurgeStatus")
private String stormSurgeStatus;
@JsonProperty("FinalReview")
private String finalReview;
@JsonProperty("Comments")
private String comments;
@JsonProperty("AdditionalEvalDueDate")
private String additionalEvalDueDate;
@JsonProperty("Priority")
private String priority;
@JsonProperty("Platform")
private String platform;
@JsonProperty("ApplicationUser")
private String applicationUser;
@JsonProperty("ApplicationDate")
private String applicationDate;

@JsonProperty("AdditionalEvaluationId")
public Integer getAdditionalEvaluationId() {
return additionalEvaluationId;
}

@JsonProperty("AdditionalEvaluationId")
public AdditionalEvaluationSave setAdditionalEvaluationId(Integer additionalEvaluationId) {
this.additionalEvaluationId = additionalEvaluationId;
return this;
}

@JsonProperty("ProcessId")
public Integer getProcessId() {
return processId;
}

@JsonProperty("ProcessId")
public AdditionalEvaluationSave setProcessId(Integer processId) {
this.processId = processId;
return this;
}

@JsonProperty("EvaluationStatus")
public String getEvaluationStatus() {
return evaluationStatus;
}

@JsonProperty("EvaluationStatus")
public AdditionalEvaluationSave setEvaluationStatus(String evaluationStatus) {
this.evaluationStatus = evaluationStatus;
return this;
}

@JsonProperty("ProcessLeadStatus")
public String getProcessLeadStatus() {
return processLeadStatus;
}

@JsonProperty("ProcessLeadStatus")
public AdditionalEvaluationSave setProcessLeadStatus(String processLeadStatus) {
this.processLeadStatus = processLeadStatus;
return this;
}

@JsonProperty("EngineerReviewStatus")
public String getEngineerReviewStatus() {
return engineerReviewStatus;
}

@JsonProperty("EngineerReviewStatus")
public AdditionalEvaluationSave setEngineerReviewStatus(String engineerReviewStatus) {
this.engineerReviewStatus = engineerReviewStatus;
return this;
}

@JsonProperty("EngineeringLead")
public String getEngineeringLead() {
return engineeringLead;
}

@JsonProperty("EngineeringLead")
public AdditionalEvaluationSave setEngineeringLead(String engineeringLead) {
this.engineeringLead = engineeringLead;
return this;
}

@JsonProperty("StormSurgeStatus")
public String getStormSurgeStatus() {
return stormSurgeStatus;
}

@JsonProperty("StormSurgeStatus")
public AdditionalEvaluationSave setStormSurgeStatus(String stormSurgeStatus) {
this.stormSurgeStatus = stormSurgeStatus;
return this;
}

@JsonProperty("FinalReview")
public String getFinalReview() {
return finalReview;
}

@JsonProperty("FinalReview")
public AdditionalEvaluationSave setFinalReview(String finalReview) {
this.finalReview = finalReview;
return this;
}

@JsonProperty("Comments")
public String getComments() {
return comments;
}

@JsonProperty("Comments")
public AdditionalEvaluationSave setComments(String comments) {
this.comments = comments;
return this;
}

@JsonProperty("AdditionalEvalDueDate")
public String getAdditionalEvalDueDate() {
return additionalEvalDueDate;
}

@JsonProperty("AdditionalEvalDueDate")
public AdditionalEvaluationSave setAdditionalEvalDueDate(String additionalEvalDueDate) {
this.additionalEvalDueDate = additionalEvalDueDate;
return this;
}

@JsonProperty("Priority")
public String getPriority() {
return priority;
}

@JsonProperty("Priority")
public AdditionalEvaluationSave setPriority(String priority) {
this.priority = priority;
return this;
}

@JsonProperty("Platform")
public String getPlatform() {
return platform;
}

@JsonProperty("Platform")
public AdditionalEvaluationSave setPlatform(String platform) {
this.platform = platform;
return this;
}

@JsonProperty("ApplicationUser")
public String getApplicationUser() {
return applicationUser;
}

@JsonProperty("ApplicationUser")
public AdditionalEvaluationSave setApplicationUser(String applicationUser) {
this.applicationUser = applicationUser;
return this;
}

@JsonProperty("ApplicationDate")
public String getApplicationDate() {
return applicationDate;
}

@JsonProperty("ApplicationDate")
public AdditionalEvaluationSave setApplicationDate(String applicationDate) {
this.applicationDate = applicationDate;
return this;
}

}