package com.rdp.api.pojo.job;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.rdp.api.pojo.Filter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"UserName",
"AppDate",
"FilterColumn",
"Skip",
"Take",
"Filter"
})

public class GetAllProcess {

@JsonProperty("UserName")
private String userName;
@JsonProperty("AppDate")
private String appDate;
@JsonProperty("FilterColumn")
private String filterColumn;
@JsonProperty("Skip")
private Integer skip;
@JsonProperty("Take")
private Integer take;
@JsonProperty("Filter")
private List<Filter> filter;

@JsonProperty("UserName")
public String getUserName() {
return userName;
}

@JsonProperty("UserName")
public GetAllProcess setUserName(String userName) {
this.userName = userName;
return this;
}

@JsonProperty("AppDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("AppDate")
public GetAllProcess setAppDate(String appDate) {
this.appDate = appDate;
return this;
}

@JsonProperty("FilterColumn")
public String getFilterColumn() {
return filterColumn;
}

@JsonProperty("FilterColumn")
public GetAllProcess setFilterColumn(String filterColumn) {
this.filterColumn = filterColumn;
return this;
}

@JsonProperty("Skip")
public Integer getSkip() {
return skip;
}

@JsonProperty("Skip")
public GetAllProcess setSkip(Integer skip) {
this.skip = skip;
return this;
}

@JsonProperty("Take")
public Integer getTake() {
return take;
}

@JsonProperty("Take")
public GetAllProcess setTake(Integer take) {
this.take = take;
return this;
}

@JsonProperty("Filter")
public List<Filter> getFilter() {
return filter;
}

@JsonProperty("Filter")
public GetAllProcess setFilter(List<Filter> filter) {
this.filter = filter;
return this;
}

}