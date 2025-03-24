
package com.rdp.api.pojo.queryManagement;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"MailSubject",
"MailBody",
"HasAttachment",
"MailFrom",
"MailType",
"MailStatus",
"ClassificationType",
"UserName",
"MailToList",
"MailCCList",
"ApplicationUser"
})

public class QueryDetails {

@JsonProperty("MailSubject")
private String mailSubject;
@JsonProperty("MailBody")
private String mailBody;
@JsonProperty("HasAttachment")
private Boolean hasAttachment;
@JsonProperty("MailFrom")
private String mailFrom;
@JsonProperty("MailType")
private String mailType;
@JsonProperty("MailStatus")
private String mailStatus;
@JsonProperty("ClassificationType")
private String classificationType;
@JsonProperty("UserName")
private String userName;
@JsonProperty("MailToList")
private List<String> mailToList;
@JsonProperty("MailCCList")
private List<String> mailCCList;
@JsonProperty("ApplicationUser")
private String applicationUser;

@JsonProperty("MailSubject")
public String getMailSubject() {
return mailSubject;
}

@JsonProperty("MailSubject")
public QueryDetails setMailSubject(String mailSubject) {
this.mailSubject = mailSubject;
return this;
}

@JsonProperty("MailBody")
public String getMailBody() {
return mailBody;
}

@JsonProperty("MailBody")
public QueryDetails setMailBody(String mailBody) {
this.mailBody = mailBody;
return this;
}

@JsonProperty("HasAttachment")
public Boolean getHasAttachment() {
return hasAttachment;
}

@JsonProperty("HasAttachment")
public QueryDetails setHasAttachment(Boolean hasAttachment) {
this.hasAttachment = hasAttachment;
return this;
}

@JsonProperty("MailFrom")
public String getMailFrom() {
return mailFrom;
}

@JsonProperty("MailFrom")
public QueryDetails setMailFrom(String mailFrom) {
this.mailFrom = mailFrom;
return this;
}

@JsonProperty("MailType")
public String getMailType() {
return mailType;
}

@JsonProperty("MailType")
public QueryDetails setMailType(String mailType) {
this.mailType = mailType;
return this;
}

@JsonProperty("MailStatus")
public String getMailStatus() {
return mailStatus;
}

@JsonProperty("MailStatus")
public QueryDetails setMailStatus(String mailStatus) {
this.mailStatus = mailStatus;
return this;
}

@JsonProperty("ClassificationType")
public String getClassificationType() {
return classificationType;
}

@JsonProperty("ClassificationType")
public QueryDetails setClassificationType(String classificationType) {
this.classificationType = classificationType;
return this;
}

@JsonProperty("UserName")
public String getUserName() {
return userName;
}

@JsonProperty("UserName")
public QueryDetails setUserName(String userName) {
this.userName = userName;
return this;
}

@JsonProperty("MailToList")
public List<String> getMailToList() {
return mailToList;
}

@JsonProperty("MailToList")
public QueryDetails setMailToList(List<String> mailToList) {
this.mailToList = mailToList;
return this;
}

@JsonProperty("MailCCList")
public List<String> getMailCCList() {
return mailCCList;
}

@JsonProperty("MailCCList")
public QueryDetails setMailCCList(List<String> mailCCList) {
this.mailCCList = mailCCList;
return this;
}

@JsonProperty("ApplicationUser")
public String getApplicationUser() {
return applicationUser;
}

@JsonProperty("ApplicationUser")
public QueryDetails setApplicationUser(String applicationUser) {
this.applicationUser = applicationUser;
return this;
}

}