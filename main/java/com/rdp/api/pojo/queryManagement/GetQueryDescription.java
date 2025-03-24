package com.rdp.api.pojo.queryManagement;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Config",
"ProcessId",
"LoginName"
})

public class GetQueryDescription {

@JsonProperty("Config")
private Config config;
@JsonProperty("ProcessId")
private Integer processId;
@JsonProperty("LoginName")
private String loginName;

@JsonProperty("Config")
public Config getConfig() {
return config;
}

@JsonProperty("Config")
public GetQueryDescription setConfig(Config config) {
this.config = config;
return this;
}

@JsonProperty("ProcessId")
public Integer getProcessId() {
return processId;
}

@JsonProperty("ProcessId")
public GetQueryDescription setProcessId(Integer processId) {
this.processId = processId;
return this;
}

@JsonProperty("LoginName")
public String getLoginName() {
return loginName;
}

@JsonProperty("LoginName")
public GetQueryDescription setLoginName(String loginName) {
this.loginName = loginName;
return this;
}

}