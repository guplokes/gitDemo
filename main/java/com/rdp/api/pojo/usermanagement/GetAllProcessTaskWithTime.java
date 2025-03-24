package com.rdp.api.pojo.usermanagement;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rdp.api.pojo.Filter;


public class GetAllProcessTaskWithTime {

@JsonProperty("AppDate")
private String appDate;
@JsonProperty("UserName")
private String userName;
@JsonProperty("Skip")
private Integer skip;
@JsonProperty("Take")
private Integer take;
@JsonProperty("Filter")
private List<Filter> filter;

@JsonProperty("AppDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("AppDate")
public GetAllProcessTaskWithTime setAppDate(String appDate) {
this.appDate = appDate;
return this;
}

@JsonProperty("UserName")
public String getUserName() {
return userName;
}

@JsonProperty("UserName")
public GetAllProcessTaskWithTime setUserName(String userName) {
this.userName = userName;
return this;
}

@JsonProperty("Skip")
public Integer getSkip() {
return skip;
}

@JsonProperty("Skip")
public GetAllProcessTaskWithTime setSkip(Integer skip) {
this.skip = skip;
return this;
}

@JsonProperty("Take")
public Integer getTake() {
return take;
}

@JsonProperty("Take")
public GetAllProcessTaskWithTime setTake(Integer take) {
this.take = take;
return this;
}

@JsonProperty("Filter")
public List<Filter> getFilter() {
return filter;
}

@JsonProperty("Filter")
public GetAllProcessTaskWithTime setFilter(List<Filter> filter) {
this.filter = filter;
return this;
}

}