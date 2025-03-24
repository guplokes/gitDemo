package com.rdp.api.pojo.usermanagement;

import java.util.List;
import com.rdp.api.pojo.Filter;
import com.fasterxml.jackson.annotation.JsonProperty;



//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//"Skip",
//"Take",
//"Filter",
//"OrderBy"
//})

public class Users {

@JsonProperty("Skip")
private Integer skip;
@JsonProperty("Take")
private Integer take;
@JsonProperty("Filter")
private List<Filter> filter;
@JsonProperty("OrderBy")
private String orderBy;

/**
* No args constructor for use in serialization
*
*/
public Users() {
}

/**
*
* @param filter
* @param take
* @param orderBy
* @param skip
*/
public Users(Integer skip, Integer take, List<Filter> filter, String orderBy) {
super();
this.skip = skip;
this.take = take;
this.filter = filter;
this.orderBy = orderBy;
}

@JsonProperty("Skip")
public Integer getSkip() {
return skip;
}

@JsonProperty("Skip")
public Users setSkip(Integer skip) {
this.skip = skip;
return this;
}

@JsonProperty("Take")
public Integer getTake() {
return take;
}

@JsonProperty("Take")
public Users setTake(Integer take) {
this.take = take;
return this;
}

@JsonProperty("Filter")
public List<Filter> getFilter() {
return filter;
}

@JsonProperty("Filter")
public Users setFilter(List<Filter> filter) {
this.filter = filter;
return this;
}

@JsonProperty("OrderBy")
public String getOrderBy() {
return orderBy;
}

@JsonProperty("OrderBy")
public Users setOrderBy(String orderBy) {
this.orderBy = orderBy;
return this;
}

}