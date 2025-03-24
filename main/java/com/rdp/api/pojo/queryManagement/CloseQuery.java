package com.rdp.api.pojo.queryManagement;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"QueryId",
"LoginName",
"AppDate"
})

public class CloseQuery {

@JsonProperty("QueryId")
private Integer queryId;
@JsonProperty("LoginName")
private String loginName;
@JsonProperty("AppDate")
private String appDate;

@JsonProperty("QueryId")
public Integer getQueryId() {
return queryId;
}

@JsonProperty("QueryId")
public CloseQuery setQueryId(Integer queryId) {
this.queryId = queryId;
return this;
}

@JsonProperty("LoginName")
public String getLoginName() {
return loginName;
}

@JsonProperty("LoginName")
public CloseQuery setLoginName(String loginName) {
this.loginName = loginName;
return this;
}

@JsonProperty("AppDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("AppDate")
public CloseQuery setAppDate(String appDate) {
this.appDate = appDate;
return this;
}

}