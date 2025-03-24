package com.rdp.api.pojo.job;

import java.util.List;
//import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "Body", "CcList", "ProcessId", "Subject", "ToList", "UnderwriterName", "UserName", "AccountName",
		"UserFullName", "Complexity", "TATNotMetReason", "AppDate", "AppUserEmail", "UserId" })

public class CancelJob {

	@JsonProperty("Body")
	private String body;
	@JsonProperty("CcList")
	private List<String> ccList;
	@JsonProperty("ProcessId")
	private Integer processId;
	@JsonProperty("Subject")
	private String subject;
	@JsonProperty("ToList")
	private List<String> toList;
	@JsonProperty("UnderwriterName")
	private String underwriterName;
	@JsonProperty("UserName")
	private String userName;
	@JsonProperty("AccountName")
	private String accountName;
	@JsonProperty("UserFullName")
	private String userFullName;
	@JsonProperty("Complexity")
	private String complexity;
	@JsonProperty("TATNotMetReason")
	private String tATNotMetReason;
	@JsonProperty("AppDate")
	private String appDate;
	@JsonProperty("AppUserEmail")
	private String appUserEmail;
	@JsonProperty("UserId")
	private Integer userId;

	@JsonProperty("Body")
	public String getBody() {
		return body;
	}

	@JsonProperty("Body")
	public CancelJob setBody(String body) {
		this.body = body;
		return this;
	}

	@JsonProperty("CcList")
	public List<String> getCcList() {
		return ccList;
	}

	@JsonProperty("CcList")
	public CancelJob setCcList(List<String> ccList) {
		this.ccList = ccList;
		return this;
	}

	@JsonProperty("ProcessId")
	public Integer getProcessId() {
		return processId;
	}

	@JsonProperty("ProcessId")
	public CancelJob setProcessId(Integer processId) {
		this.processId = processId;
		return this;
	}

	@JsonProperty("Subject")
	public String getSubject() {
		return subject;
	}

	@JsonProperty("Subject")
	public CancelJob setSubject(String subject) {
		this.subject = subject;
		return this;
	}

	@JsonProperty("ToList")
	public List<String> getToList() {
		return toList;
	}

	@JsonProperty("ToList")
	public CancelJob setToList(List<String> toList) {
		this.toList = toList;
		return this;
	}

	@JsonProperty("UnderwriterName")
	public String getUnderwriterName() {
		return underwriterName;
	}

	@JsonProperty("UnderwriterName")
	public CancelJob setUnderwriterName(String underwriterName) {
		this.underwriterName = underwriterName;
		return this;
	}

	@JsonProperty("UserName")
	public String getUserName() {
		return userName;
	}

	@JsonProperty("UserName")
	public CancelJob setUserName(String userName) {
		this.userName = userName;
		return this;
	}

	@JsonProperty("AccountName")
	public String getAccountName() {
		return accountName;
	}

	@JsonProperty("AccountName")
	public CancelJob setAccountName(String accountName) {
		this.accountName = accountName;
		return this;
	}

	@JsonProperty("UserFullName")
	public String getUserFullName() {
		return userFullName;
	}

	@JsonProperty("UserFullName")
	public CancelJob setUserFullName(String userFullName) {
		this.userFullName = userFullName;
		return this;
	}

	@JsonProperty("Complexity")
	public String getComplexity() {
		return complexity;
	}

	@JsonProperty("Complexity")
	public CancelJob setComplexity(String complexity) {
		this.complexity = complexity;
		return this;
	}

	@JsonProperty("TATNotMetReason")
	public String getTATNotMetReason() {
		return tATNotMetReason;
	}

	@JsonProperty("TATNotMetReason")
	public CancelJob setTATNotMetReason(String tATNotMetReason) {
		this.tATNotMetReason = tATNotMetReason;
		return this;
	}

	@JsonProperty("AppDate")
	public String getAppDate() {
		return appDate;
	}

	@JsonProperty("AppDate")
	public CancelJob setAppDate(String appDate) {
		this.appDate = appDate;
		return this;
	}

	@JsonProperty("AppUserEmail")
	public String getAppUserEmail() {
		return appUserEmail;
	}

	@JsonProperty("AppUserEmail")
	public CancelJob setAppUserEmail(String appUserEmail) {
		this.appUserEmail = appUserEmail;
		return this;
	}

	@JsonProperty("UserId")
	public Integer getUserId() {
		return userId;
	}

	@JsonProperty("UserId")
	public CancelJob setUserId(Integer userId) {
		this.userId = userId;
		return this;
	}

}