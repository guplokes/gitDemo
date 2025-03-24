
package com.rdp.api.pojo.job;
import com.fasterxml.jackson.annotation.JsonProperty;



public class UpdateComments {

@JsonProperty("ProcessId")
private Integer processId;
@JsonProperty("AppUser")
private String appUser;
@JsonProperty("AppDate")
private String appDate;
@JsonProperty("Comments")
private String comments;

@JsonProperty("ProcessId")
public Integer getProcessId() {
return processId;
}

@JsonProperty("ProcessId")
public UpdateComments setProcessId(Integer processId) {
this.processId = processId;
return this;
}

@JsonProperty("AppUser")
public String getAppUser() {
return appUser;
}

@JsonProperty("AppUser")
public UpdateComments setAppUser(String appUser) {
this.appUser = appUser;
return this;
}

@JsonProperty("AppDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("AppDate")
public UpdateComments setAppDate(String appDate) {
this.appDate = appDate;
return this;
}

@JsonProperty("Comments")
public String getComments() {
return comments;
}

@JsonProperty("Comments")
public UpdateComments setComments(String comments) {
this.comments = comments;
return this;
}

}