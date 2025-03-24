package com.rdp.api.pojo.job;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SaveMovedAccountInfo {

@JsonProperty("ProcessId")
private Integer processId;
@JsonProperty("AccountName")
private String accountName;
@JsonProperty("TeamId")
private Integer teamId;
@JsonProperty("AppDate")
private String appDate;

@JsonProperty("ProcessId")
public Integer getProcessId() {
return processId;
}

@JsonProperty("ProcessId")
public SaveMovedAccountInfo setProcessId(Integer processId) {
this.processId = processId;
return this;
}

@JsonProperty("AccountName")
public String getAccountName() {
return accountName;
}

@JsonProperty("AccountName")
public SaveMovedAccountInfo setAccountName(String accountName) {
this.accountName = accountName;
return this;
}

@JsonProperty("TeamId")
public Integer getTeamId() {
return teamId;
}

@JsonProperty("TeamId")
public SaveMovedAccountInfo setTeamId(Integer teamId) {
this.teamId = teamId;
return this;
}

@JsonProperty("AppDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("AppDate")
public SaveMovedAccountInfo setAppDate(String appDate) {
this.appDate = appDate;
return this;
}


}