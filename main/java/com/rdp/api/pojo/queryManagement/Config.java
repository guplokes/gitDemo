package com.rdp.api.pojo.queryManagement;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
"UserName",
"Skip",
"Take",
"Filter",
"OrderBy"
})

public class Config {

@JsonProperty("UserName")
private String userName;
@JsonProperty("Skip")
private Integer skip;
@JsonProperty("Take")
private Integer take;
@JsonProperty("Filter")
private Object filter;
@JsonProperty("OrderBy")
private String orderBy;

@JsonProperty("UserName")
public String getUserName() {
return userName;
}

@JsonProperty("UserName")
public Config setUserName(String userName) {
this.userName = userName;
return this;
}

@JsonProperty("Skip")
public Integer getSkip() {
return skip;
}

@JsonProperty("Skip")
public Config setSkip(Integer skip) {
this.skip = skip;
return this;
}

@JsonProperty("Take")
public Integer getTake() {
return take;
}

@JsonProperty("Take")
public Config setTake(Integer take) {
this.take = take;
return this;
}

@JsonProperty("Filter")
public Object getFilter() {
return filter;
}

@JsonProperty("Filter")
public Config setFilter(Object filter) {
this.filter = filter;
return this;
}

@JsonProperty("OrderBy")
public String getOrderBy() {
return orderBy;
}

@JsonProperty("OrderBy")
public Config setOrderBy(String orderBy) {
this.orderBy = orderBy;
return this;
}

}
