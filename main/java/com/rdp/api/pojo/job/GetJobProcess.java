package com.rdp.api.pojo.job;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.rdp.api.pojo.Filter;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"processingStatus",
"Filter",
"Skip",
"Take",
"UserName"
})

public class GetJobProcess {

@JsonProperty("processingStatus")
private String processingStatus;
@JsonProperty("Filter")
private List<Filter> filter;
@JsonProperty("Skip")
private Integer skip;
@JsonProperty("Take")
private Integer take;
@JsonProperty("UserName")
private String userName;

@JsonProperty("processingStatus")
public String getProcessingStatus() {
return processingStatus;
}

@JsonProperty("processingStatus")
public GetJobProcess setProcessingStatus(String processingStatus) {
this.processingStatus = processingStatus;
return this;
}

@JsonProperty("Filter")
public List<Filter> getFilter() {
return filter;
}

@JsonProperty("Filter")
public GetJobProcess setFilter(List<Filter> filter) {
this.filter = filter;
return this;
}

@JsonProperty("Skip")
public Integer getSkip() {
return skip;
}

@JsonProperty("Skip")
public GetJobProcess setSkip(Integer skip) {
this.skip = skip;
return this;
}

@JsonProperty("Take")
public Integer getTake() {
return take;
}

@JsonProperty("Take")
public GetJobProcess setTake(Integer take) {
this.take = take;
return this;
}

@JsonProperty("UserName")
public String getUserName() {
return userName;
}

@JsonProperty("UserName")
public GetJobProcess setUserName(String userName) {
this.userName = userName;
return this;
}

}