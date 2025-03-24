package com.rdp.api.pojo.usermanagement;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.rdp.api.pojo.Filter;

//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//"UserName",
//"Skip",
//"Take",
//"Filter"
//})

public class TeamDetails {

@JsonProperty("UserName")
private String userName;
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
public TeamDetails setUserName(String userName) {
this.userName = userName;
return this;
}

@JsonProperty("Skip")
public Integer getSkip() {
return skip;
}

@JsonProperty("Skip")
public TeamDetails setSkip(Integer skip) {
this.skip = skip;
return this;
}

@JsonProperty("Take")
public Integer getTake() {
return take;
}

@JsonProperty("Take")
public TeamDetails setTake(Integer take) {
this.take = take;
return this;
}

@JsonProperty("Filter")
public List<Filter> getFilter() {
return filter;
}

@JsonProperty("Filter")
public TeamDetails setFilter(List<Filter> filter) {
this.filter = filter;
return this;
}

}