package com.rdp.api.pojo.queryManagement;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"ClassificationId",
"Classification",
"ProcessId",
"IsClosed",
"AccountNo"
})

public class Query {

@JsonProperty("ClassificationId")
private Integer classificationId;
@JsonProperty("Classification")
private String classification;
@JsonProperty("ProcessId")
private Integer processId;
@JsonProperty("IsClosed")
private Boolean isClosed;
@JsonProperty("AccountNo")
private String accountNo;

@JsonProperty("ClassificationId")
public Integer getClassificationId() {
return classificationId;
}

@JsonProperty("ClassificationId")
public Query setClassificationId(Integer classificationId) {
this.classificationId = classificationId;
return this;
}

@JsonProperty("Classification")
public String getClassification() {
return classification;
}

@JsonProperty("Classification")
public Query setClassification(String classification) {
this.classification = classification;
return this;
}

@JsonProperty("ProcessId")
public Integer getProcessId() {
return processId;
}

@JsonProperty("ProcessId")
public Query setProcessId(Integer processId) {
this.processId = processId;
return this;
}

@JsonProperty("IsClosed")
public Boolean getIsClosed() {
return isClosed;
}

@JsonProperty("IsClosed")
public Query setIsClosed(Boolean isClosed) {
this.isClosed = isClosed;
return this;
}

@JsonProperty("AccountNo")
public String getAccountNo() {
return accountNo;
}

@JsonProperty("AccountNo")
public Query setAccountNo(String accountNo) {
this.accountNo = accountNo;
return this;
}

}