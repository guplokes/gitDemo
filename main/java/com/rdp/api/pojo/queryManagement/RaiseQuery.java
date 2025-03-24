package com.rdp.api.pojo.queryManagement;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"QueryDetails",
"Query",
"AppDate"
})

public class RaiseQuery {

@JsonProperty("QueryDetails")
private QueryDetails queryDetails;
@JsonProperty("Query")
private Query query;
@JsonProperty("AppDate")
private String appDate;

@JsonProperty("QueryDetails")
public QueryDetails getQueryDetails() {
return queryDetails;
}

@JsonProperty("QueryDetails")
public RaiseQuery setQueryDetails(QueryDetails queryDetails) {
this.queryDetails = queryDetails;
return this;
}

@JsonProperty("Query")
public Query getQuery() {
return query;
}

@JsonProperty("Query")
public RaiseQuery setQuery(Query query) {
this.query = query;
return this;
}

@JsonProperty("AppDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("AppDate")
public RaiseQuery setAppDate(String appDate) {
this.appDate = appDate;
return this;
}

}