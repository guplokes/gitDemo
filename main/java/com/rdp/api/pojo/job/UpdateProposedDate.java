package com.rdp.api.pojo.job;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//"ProcessId",
//"ProposedDate",
//"NoOfLocation",
//"UnderwriterName",
//"TIV",
//"UnderwriterId"
//})

public class UpdateProposedDate {

@JsonProperty("ProcessId")
private Integer processId;
@JsonProperty("ProposedDate")
private String proposedDate;
@JsonProperty("NoOfLocation")
private String noOfLocation;
@JsonProperty("UnderwriterName")
private String underwriterName;
@JsonProperty("TIV")
private Long tiv;
@JsonProperty("UnderwriterId")
private Integer underwriterId;

@JsonProperty("ProcessId")
public Integer getProcessId() {
return processId;
}

@JsonProperty("ProcessId")
public UpdateProposedDate setProcessId(Integer processId) {
this.processId = processId;
return this;
}

@JsonProperty("ProposedDate")
public String getProposedDate() {
return proposedDate;
}

@JsonProperty("ProposedDate")
public UpdateProposedDate setProposedDate(String proposedDate) {
this.proposedDate = proposedDate;
return this;
}

@JsonProperty("NoOfLocation")
public String getNoOfLocation() {
return noOfLocation;
}

@JsonProperty("NoOfLocation")
public UpdateProposedDate setNoOfLocation(String noOfLocation) {
this.noOfLocation = noOfLocation;
return this;
}

@JsonProperty("UnderwriterName")
public String getUnderwriterName() {
return underwriterName;
}

@JsonProperty("UnderwriterName")
public UpdateProposedDate setUnderwriterName(String underwriterName) {
this.underwriterName = underwriterName;
return this;
}

@JsonProperty("TIV")
public Long getTiv() {
return tiv;
}

@JsonProperty("TIV")
public UpdateProposedDate setTiv(Long tiv) {
this.tiv = tiv;
return this;
}

@JsonProperty("UnderwriterId")
public Integer getUnderwriterId() {
return underwriterId;
}

@JsonProperty("UnderwriterId")
public UpdateProposedDate setUnderwriterId(Integer underwriterId) {
this.underwriterId = underwriterId;
return this;
}

}