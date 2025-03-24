package com.rdp.api.pojo.taskDetail;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Id",
"ProcessId",
"AccountName",
"LocCount",
"DataQuality",
"OptionsCount",
"LimDedCount",
"PerilRegions",
"Complexity",
"TATNotMetReason",
"Financials",
"COPE",
"AccuracyScore",
"CreatedBy",
"CreatedDate",
"ModifiedBy",
"ModifiedDate",
"ApplicationDate"
})
//@Generated("jsonschema2pojo")
public class ComplexityMetricsNew {

@JsonProperty("Id")
private Integer id;
@JsonProperty("ProcessId")
private Integer processId;
@JsonProperty("AccountName")
private String accountName;
@JsonProperty("LocCount")
private Integer locCount;
@JsonProperty("DataQuality")
private String dataQuality;
@JsonProperty("OptionsCount")
private Integer optionsCount;
@JsonProperty("LimDedCount")
private String limDedCount;
@JsonProperty("PerilRegions")
private Integer perilRegions;
@JsonProperty("Complexity")
private String complexity;
@JsonProperty("TATNotMetReason")
private Object tATNotMetReason;
@JsonProperty("Financials")
private Object financials;
@JsonProperty("COPE")
private Object cope;
@JsonProperty("AccuracyScore")
private Object accuracyScore;
@JsonProperty("CreatedBy")
private String createdBy;
@JsonProperty("CreatedDate")
private String createdDate;
@JsonProperty("ModifiedBy")
private Object modifiedBy;
@JsonProperty("ModifiedDate")
private Object modifiedDate;
@JsonProperty("ApplicationDate")
private String applicationDate;

@JsonProperty("Id")
public Integer getId() {
return id;
}

@JsonProperty("Id")
public ComplexityMetricsNew setId(Integer id) {
this.id = id;
return this;
}

@JsonProperty("ProcessId")
public Integer getProcessId() {
return processId;
}

@JsonProperty("ProcessId")
public ComplexityMetricsNew setProcessId(Integer processId) {
this.processId = processId;
return this;
}

@JsonProperty("AccountName")
public String getAccountName() {
return accountName;
}

@JsonProperty("AccountName")
public ComplexityMetricsNew setAccountName(String accountName) {
this.accountName = accountName;
return this;
}

@JsonProperty("LocCount")
public Integer getLocCount() {
return locCount;
}

@JsonProperty("LocCount")
public ComplexityMetricsNew setLocCount(Integer locCount) {
this.locCount = locCount;
return this;
}

@JsonProperty("DataQuality")
public String getDataQuality() {
return dataQuality;
}

@JsonProperty("DataQuality")
public ComplexityMetricsNew setDataQuality(String dataQuality) {
this.dataQuality = dataQuality;
return this;
}

@JsonProperty("OptionsCount")
public Integer getOptionsCount() {
return optionsCount;
}

@JsonProperty("OptionsCount")
public ComplexityMetricsNew setOptionsCount(Integer optionsCount) {
this.optionsCount = optionsCount;
return this;
}

@JsonProperty("LimDedCount")
public String getLimDedCount() {
return limDedCount;
}

@JsonProperty("LimDedCount")
public ComplexityMetricsNew setLimDedCount(String limDedCount) {
this.limDedCount = limDedCount;
return this;
}

@JsonProperty("PerilRegions")
public Integer getPerilRegions() {
return perilRegions;
}

@JsonProperty("PerilRegions")
public ComplexityMetricsNew setPerilRegions(Integer perilRegions) {
this.perilRegions = perilRegions;
return this;
}

@JsonProperty("Complexity")
public String getComplexity() {
return complexity;
}

@JsonProperty("Complexity")
public ComplexityMetricsNew setComplexity(String complexity) {
this.complexity = complexity;
return this;
}

@JsonProperty("TATNotMetReason")
public Object getTATNotMetReason() {
return tATNotMetReason;
}

@JsonProperty("TATNotMetReason")
public ComplexityMetricsNew setTATNotMetReason(Object tATNotMetReason) {
this.tATNotMetReason = tATNotMetReason;
return this;
}

@JsonProperty("Financials")
public Object getFinancials() {
return financials;
}

@JsonProperty("Financials")
public ComplexityMetricsNew setFinancials(Object financials) {
this.financials = financials;
return this;
}

@JsonProperty("COPE")
public Object getCope() {
return cope;
}

@JsonProperty("COPE")
public ComplexityMetricsNew setCope(Object cope) {
this.cope = cope;
return this;
}

@JsonProperty("AccuracyScore")
public Object getAccuracyScore() {
return accuracyScore;
}

@JsonProperty("AccuracyScore")
public ComplexityMetricsNew setAccuracyScore(Object accuracyScore) {
this.accuracyScore = accuracyScore;
return this;
}

@JsonProperty("CreatedBy")
public String getCreatedBy() {
return createdBy;
}

@JsonProperty("CreatedBy")
public ComplexityMetricsNew setCreatedBy(String createdBy) {
this.createdBy = createdBy;
return this;
}

@JsonProperty("CreatedDate")
public String getCreatedDate() {
return createdDate;
}

@JsonProperty("CreatedDate")
public ComplexityMetricsNew setCreatedDate(String createdDate) {
this.createdDate = createdDate;
return this;
}

@JsonProperty("ModifiedBy")
public Object getModifiedBy() {
return modifiedBy;
}

@JsonProperty("ModifiedBy")
public ComplexityMetricsNew setModifiedBy(Object modifiedBy) {
this.modifiedBy = modifiedBy;
return this;
}

@JsonProperty("ModifiedDate")
public Object getModifiedDate() {
return modifiedDate;
}

@JsonProperty("ModifiedDate")
public ComplexityMetricsNew setModifiedDate(Object modifiedDate) {
this.modifiedDate = modifiedDate;
return this;
}

@JsonProperty("ApplicationDate")
public String getApplicationDate() {
return applicationDate;
}

@JsonProperty("ApplicationDate")
public ComplexityMetricsNew setApplicationDate(String applicationDate) {
this.applicationDate = applicationDate;
return this;
}

}