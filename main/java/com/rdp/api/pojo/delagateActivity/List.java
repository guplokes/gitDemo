package com.rdp.api.pojo.delagateActivity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.rdp.api.pojo.Filter;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"UserName",
"Skip",
"Take",
"Filter"
})

public class List {

@JsonProperty("UserName")
private String userName;
@JsonProperty("Skip")
private Integer skip;
@JsonProperty("Take")
private Integer take;
@JsonProperty("Filter")
private java.util.List<Filter> filter;

@JsonProperty("UserName")
public String getUserName() {
return userName;
}

@JsonProperty("UserName")
public List setUserName(String userName) {
this.userName = userName;
return this;
}

@JsonProperty("Skip")
public Integer getSkip() {
return skip;
}

@JsonProperty("Skip")
public List setSkip(Integer skip) {
this.skip = skip;
return this;
}

@JsonProperty("Take")
public Integer getTake() {
return take;
}

@JsonProperty("Take")
public List setTake(Integer take) {
this.take = take;
return this;
}

@JsonProperty("Filter")
public java.util.List<Filter> getFilter() {
return filter;
}

@JsonProperty("Filter")
public List setFilter(java.util.List<Filter> filter) {
this.filter = filter;
return this;
}

}