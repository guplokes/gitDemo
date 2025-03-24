package com.rdp.api.pojo.job;


import com.fasterxml.jackson.annotation.JsonProperty;

public class AccountDetail {

@JsonProperty("AccountName")
private String accountName;
@JsonProperty("ProcessingStatus")
private String processingStatus;
@JsonProperty("ExpirationDate")
private String expirationDate;
@JsonProperty("DueDate")
private String dueDate;
@JsonProperty("RequestType")
private String requestType;
@JsonProperty("Lob")
private String lob;
@JsonProperty("PreviousStatus")
private Object previousStatus;
@JsonProperty("CleansingAssociate")
private String cleansingAssociate;
@JsonProperty("CleansingQA")
private String cleansingQA;
@JsonProperty("ModellingAssociate")
private String modellingAssociate;
@JsonProperty("ModellingQA")
private String modellingQA;
@JsonProperty("ReportingAssociate")
private String reportingAssociate;
@JsonProperty("ReportingQA")
private String reportingQA;

@JsonProperty("AccountName")
public String getAccountName() {
return accountName;
}

@JsonProperty("AccountName")
public void setAccountName(String accountName) {
this.accountName = accountName;
}

@JsonProperty("ProcessingStatus")
public String getProcessingStatus() {
return processingStatus;
}

@JsonProperty("ProcessingStatus")
public void setProcessingStatus(String processingStatus) {
this.processingStatus = processingStatus;
}

@JsonProperty("ExpirationDate")
public String getExpirationDate() {
return expirationDate;
}

@JsonProperty("ExpirationDate")
public void setExpirationDate(String expirationDate) {
this.expirationDate = expirationDate;
}

@JsonProperty("DueDate")
public String getDueDate() {
return dueDate;
}

@JsonProperty("DueDate")
public void setDueDate(String dueDate) {
this.dueDate = dueDate;
}

@JsonProperty("RequestType")
public String getRequestType() {
return requestType;
}

@JsonProperty("RequestType")
public void setRequestType(String requestType) {
this.requestType = requestType;
}

@JsonProperty("Lob")
public String getLob() {
return lob;
}

@JsonProperty("Lob")
public void setLob(String lob) {
this.lob = lob;
}

@JsonProperty("PreviousStatus")
public Object getPreviousStatus() {
return previousStatus;
}

@JsonProperty("PreviousStatus")
public void setPreviousStatus(Object previousStatus) {
this.previousStatus = previousStatus;
}

@JsonProperty("CleansingAssociate")
public String getCleansingAssociate() {
return cleansingAssociate;
}

@JsonProperty("CleansingAssociate")
public void setCleansingAssociate(String cleansingAssociate) {
this.cleansingAssociate = cleansingAssociate;
}

@JsonProperty("CleansingQA")
public String getCleansingQA() {
return cleansingQA;
}

@JsonProperty("CleansingQA")
public void setCleansingQA(String cleansingQA) {
this.cleansingQA = cleansingQA;
}

@JsonProperty("ModellingAssociate")
public String getModellingAssociate() {
return modellingAssociate;
}

@JsonProperty("ModellingAssociate")
public void setModellingAssociate(String modellingAssociate) {
this.modellingAssociate = modellingAssociate;
}

@JsonProperty("ModellingQA")
public String getModellingQA() {
return modellingQA;
}

@JsonProperty("ModellingQA")
public void setModellingQA(String modellingQA) {
this.modellingQA = modellingQA;
}

@JsonProperty("ReportingAssociate")
public String getReportingAssociate() {
return reportingAssociate;
}

@JsonProperty("ReportingAssociate")
public void setReportingAssociate(String reportingAssociate) {
this.reportingAssociate = reportingAssociate;
}

@JsonProperty("ReportingQA")
public String getReportingQA() {
return reportingQA;
}

@JsonProperty("ReportingQA")
public void setReportingQA(String reportingQA) {
this.reportingQA = reportingQA;
}

}
