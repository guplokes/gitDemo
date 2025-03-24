package com.rdp.api.pojo.job;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


//@Generated("jsonschema2pojo")
public class CreateJob {

@JsonProperty("Version")
private Integer version;
@JsonProperty("Priority")
private String priority;
@JsonProperty("UserId")
private String userId;
@JsonProperty("BusinessType")
private String businessType;
@JsonProperty("BusinessTypeId")
private Integer businessTypeId;
@JsonProperty("LobId")
private Integer lobId;
@JsonProperty("Lob")
private String lob;
@JsonProperty("CurrencyId")
private Integer currencyId;
@JsonProperty("Currency")
private String currency;
@JsonProperty("Platform")
private String platform;
@JsonProperty("AccountName")
private String accountName;
@JsonProperty("AccountNo")
private String accountNo;
@JsonProperty("NoOfLocation")
private String noOfLocation;
@JsonProperty("ReinsuredName")
private String reinsuredName;
@JsonProperty("TIV")
private Integer tiv;
@JsonProperty("EffectiveDate")
private String effectiveDate;
@JsonProperty("ExpirationDate")
private String expirationDate;
@JsonProperty("AddRenewalDate")
private String addRenewalDate;
@JsonProperty("ProjectTerm")
private Double projectTerm;
@JsonProperty("UnderwriterId")
private Integer underwriterId;
@JsonProperty("UnderwriterName")
private String underwriterName;
@JsonProperty("BranchId")
private Integer branchId;
@JsonProperty("BranchName")
private String branchName;
@JsonProperty("DueDate")
private String dueDate;
@JsonProperty("RequestTypeId")
private Integer requestTypeId;
@JsonProperty("RequestType")
private String requestType;
@JsonProperty("AddRegionPeril")
private String addRegionPeril;
@JsonProperty("AddQuatationDueDate")
private Object addQuatationDueDate;
@JsonProperty("AddTargetLines")
private String addTargetLines;
@JsonProperty("AddAdditionalFilePath")
private String addAdditionalFilePath;
@JsonProperty("AddAdditinalOtherInfo")
private String addAdditinalOtherInfo;
@JsonProperty("AdditionalEvaluation")
private List<Object> additionalEvaluation;
@JsonProperty("IsNoTouch")
private String isNoTouch;
@JsonProperty("SOVFilePath")
private String sOVFilePath;
@JsonProperty("HighHazardEQ")
private String highHazardEQ;
@JsonProperty("HighHazardEQComment")
private String highHazardEQComment;
@JsonProperty("HighHazardWS")
private String highHazardWS;
@JsonProperty("HighHazardWSComment")
private String highHazardWSComment;
@JsonProperty("BIPOI")
private String bipoi;
@JsonProperty("SOVBIValuesBasedOn")
private String sOVBIValuesBasedOn;
@JsonProperty("PredominantOcc")
private String predominantOcc;
@JsonProperty("LocationGroupByProcess")
@JsonInclude(JsonInclude.Include.NON_NULL)
private List<LocationGroupByProcess> locationGroupByProcess;
@JsonProperty("Perils")
private String perils;
@JsonProperty("PerilNames")
private String perilNames;
@JsonProperty("AccountType")
private String accountType;
@JsonProperty("AddIsStockThroughput")
private String addIsStockThroughput;
@JsonProperty("DocumentTypes")
private List<DocumentType> documentTypes;
@JsonProperty("FinPolicyPerilLevelCoding")
private List<FinPolicyPerilLevelCoding> finPolicyPerilLevelCoding;
@JsonProperty("FinPolicyOptionlevels")
private List<FinPolicyOptionlevel> finPolicyOptionlevels;
@JsonProperty("PolicyBlanket")
private List<PolicyBlanket> policyBlanket;
@JsonProperty("IsSurveyReport")
private String isSurveyReport;
@JsonProperty("SelfInsuredRetention")
private Integer selfInsuredRetention;
@JsonProperty("AppUserId")
private Integer appUserId;
@JsonProperty("AppUserEmail")
private String appUserEmail;
@JsonProperty("AppDate")
private String appDate;

@JsonProperty("Version")
public Integer getVersion() {
return version;
}

@JsonProperty("Version")
public void setVersion(Integer version) {
this.version = version;
}

@JsonProperty("Priority")
public String getPriority() {
return priority;
}

@JsonProperty("Priority")
public void setPriority(String priority) {
this.priority = priority;
}

@JsonProperty("UserId")
public String getUserId() {
return userId;
}

@JsonProperty("UserId")
public void setUserId(String userId) {
this.userId = userId;
}

@JsonProperty("BusinessType")
public String getBusinessType() {
return businessType;
}

@JsonProperty("BusinessType")
public void setBusinessType(String businessType) {
this.businessType = businessType;
}

@JsonProperty("BusinessTypeId")
public Integer getBusinessTypeId() {
return businessTypeId;
}

@JsonProperty("BusinessTypeId")
public void setBusinessTypeId(Integer businessTypeId) {
this.businessTypeId = businessTypeId;
}

@JsonProperty("LobId")
public Integer getLobId() {
return lobId;
}

@JsonProperty("LobId")
public void setLobId(Integer lobId) {
this.lobId = lobId;
}

@JsonProperty("Lob")
public String getLob() {
return lob;
}

@JsonProperty("Lob")
public void setLob(String lob) {
this.lob = lob;
}

@JsonProperty("CurrencyId")
public Integer getCurrencyId() {
return currencyId;
}

@JsonProperty("CurrencyId")
public void setCurrencyId(Integer currencyId) {
this.currencyId = currencyId;
}

@JsonProperty("Currency")
public String getCurrency() {
return currency;
}

@JsonProperty("Currency")
public void setCurrency(String currency) {
this.currency = currency;
}

@JsonProperty("Platform")
public String getPlatform() {
return platform;
}

@JsonProperty("Platform")
public void setPlatform(String platform) {
this.platform = platform;
}

@JsonProperty("AccountName")
public String getAccountName() {
return accountName;
}

@JsonProperty("AccountName")
public void setAccountName(String accountName) {
this.accountName = accountName;
}

@JsonProperty("AccountNo")
public String getAccountNo() {
return accountNo;
}

@JsonProperty("AccountNo")
public void setAccountNo(String accountNo) {
this.accountNo = accountNo;
}

@JsonProperty("NoOfLocation")
public String getNoOfLocation() {
return noOfLocation;
}

@JsonProperty("NoOfLocation")
public void setNoOfLocation(String noOfLocation) {
this.noOfLocation = noOfLocation;
}

@JsonProperty("ReinsuredName")
public String getReinsuredName() {
return reinsuredName;
}

@JsonProperty("ReinsuredName")
public void setReinsuredName(String reinsuredName) {
this.reinsuredName = reinsuredName;
}

@JsonProperty("TIV")
public Integer getTiv() {
return tiv;
}

@JsonProperty("TIV")
public void setTiv(Integer tiv) {
this.tiv = tiv;
}

@JsonProperty("EffectiveDate")
public String getEffectiveDate() {
return effectiveDate;
}

@JsonProperty("EffectiveDate")
public void setEffectiveDate(String effectiveDate) {
this.effectiveDate = effectiveDate;
}

@JsonProperty("ExpirationDate")
public String getExpirationDate() {
return expirationDate;
}

@JsonProperty("ExpirationDate")
public void setExpirationDate(String expirationDate) {
this.expirationDate = expirationDate;
}

@JsonProperty("AddRenewalDate")
public String getAddRenewalDate() {
return addRenewalDate;
}

@JsonProperty("AddRenewalDate")
public void setAddRenewalDate(String addRenewalDate) {
this.addRenewalDate = addRenewalDate;
}

@JsonProperty("ProjectTerm")
public Double getProjectTerm() {
return projectTerm;
}

@JsonProperty("ProjectTerm")
public void setProjectTerm(Double projectTerm) {
this.projectTerm = projectTerm;
}

@JsonProperty("UnderwriterId")
public Integer getUnderwriterId() {
return underwriterId;
}

@JsonProperty("UnderwriterId")
public void setUnderwriterId(Integer underwriterId) {
this.underwriterId = underwriterId;
}

@JsonProperty("UnderwriterName")
public String getUnderwriterName() {
return underwriterName;
}

@JsonProperty("UnderwriterName")
public void setUnderwriterName(String underwriterName) {
this.underwriterName = underwriterName;
}

@JsonProperty("BranchId")
public Integer getBranchId() {
return branchId;
}

@JsonProperty("BranchId")
public void setBranchId(Integer branchId) {
this.branchId = branchId;
}

@JsonProperty("BranchName")
public String getBranchName() {
return branchName;
}

@JsonProperty("BranchName")
public void setBranchName(String branchName) {
this.branchName = branchName;
}

@JsonProperty("DueDate")
public String getDueDate() {
return dueDate;
}

@JsonProperty("DueDate")
public void setDueDate(String dueDate) {
this.dueDate = dueDate;
}

@JsonProperty("RequestTypeId")
public Integer getRequestTypeId() {
return requestTypeId;
}

@JsonProperty("RequestTypeId")
public void setRequestTypeId(Integer requestTypeId) {
this.requestTypeId = requestTypeId;
}

@JsonProperty("RequestType")
public String getRequestType() {
return requestType;
}

@JsonProperty("RequestType")
public void setRequestType(String requestType) {
this.requestType = requestType;
}

@JsonProperty("AddRegionPeril")
public String getAddRegionPeril() {
return addRegionPeril;
}

@JsonProperty("AddRegionPeril")
public void setAddRegionPeril(String addRegionPeril) {
this.addRegionPeril = addRegionPeril;
}

@JsonProperty("AddQuatationDueDate")
public Object getAddQuatationDueDate() {
return addQuatationDueDate;
}

@JsonProperty("AddQuatationDueDate")
public void setAddQuatationDueDate(Object addQuatationDueDate) {
this.addQuatationDueDate = addQuatationDueDate;
}

@JsonProperty("AddTargetLines")
public String getAddTargetLines() {
return addTargetLines;
}

@JsonProperty("AddTargetLines")
public void setAddTargetLines(String addTargetLines) {
this.addTargetLines = addTargetLines;
}

@JsonProperty("AddAdditionalFilePath")
public String getAddAdditionalFilePath() {
return addAdditionalFilePath;
}

@JsonProperty("AddAdditionalFilePath")
public void setAddAdditionalFilePath(String addAdditionalFilePath) {
this.addAdditionalFilePath = addAdditionalFilePath;
}

@JsonProperty("AddAdditinalOtherInfo")
public String getAddAdditinalOtherInfo() {
return addAdditinalOtherInfo;
}

@JsonProperty("AddAdditinalOtherInfo")
public void setAddAdditinalOtherInfo(String addAdditinalOtherInfo) {
this.addAdditinalOtherInfo = addAdditinalOtherInfo;
}

@JsonProperty("AdditionalEvaluation")
public List<Object> getAdditionalEvaluation() {
return additionalEvaluation;
}

@JsonProperty("AdditionalEvaluation")
public void setAdditionalEvaluation(List<Object> additionalEvaluation) {
this.additionalEvaluation = additionalEvaluation;
}

@JsonProperty("IsNoTouch")
public String getIsNoTouch() {
return isNoTouch;
}

@JsonProperty("IsNoTouch")
public void setIsNoTouch(String isNoTouch) {
this.isNoTouch = isNoTouch;
}

@JsonProperty("SOVFilePath")
public String getSOVFilePath() {
return sOVFilePath;
}

@JsonProperty("SOVFilePath")
public void setSOVFilePath(String sOVFilePath) {
this.sOVFilePath = sOVFilePath;
}

@JsonProperty("HighHazardEQ")
public String getHighHazardEQ() {
return highHazardEQ;
}

@JsonProperty("HighHazardEQ")
public void setHighHazardEQ(String highHazardEQ) {
this.highHazardEQ = highHazardEQ;
}

@JsonProperty("HighHazardEQComment")
public String getHighHazardEQComment() {
return highHazardEQComment;
}

@JsonProperty("HighHazardEQComment")
public void setHighHazardEQComment(String highHazardEQComment) {
this.highHazardEQComment = highHazardEQComment;
}

@JsonProperty("HighHazardWS")
public String getHighHazardWS() {
return highHazardWS;
}

@JsonProperty("HighHazardWS")
public void setHighHazardWS(String highHazardWS) {
this.highHazardWS = highHazardWS;
}

@JsonProperty("HighHazardWSComment")
public String getHighHazardWSComment() {
return highHazardWSComment;
}

@JsonProperty("HighHazardWSComment")
public void setHighHazardWSComment(String highHazardWSComment) {
this.highHazardWSComment = highHazardWSComment;
}

@JsonProperty("BIPOI")
public String getBipoi() {
return bipoi;
}

@JsonProperty("BIPOI")
public void setBipoi(String bipoi) {
this.bipoi = bipoi;
}

@JsonProperty("SOVBIValuesBasedOn")
public String getSOVBIValuesBasedOn() {
return sOVBIValuesBasedOn;
}

@JsonProperty("SOVBIValuesBasedOn")
public void setSOVBIValuesBasedOn(String sOVBIValuesBasedOn) {
this.sOVBIValuesBasedOn = sOVBIValuesBasedOn;
}

@JsonProperty("PredominantOcc")
public String getPredominantOcc() {
return predominantOcc;
}

@JsonProperty("PredominantOcc")
public void setPredominantOcc(String predominantOcc) {
this.predominantOcc = predominantOcc;
}

@JsonProperty("LocationGroupByProcess")
public List<LocationGroupByProcess> getLocationGroupByProcess() {
return locationGroupByProcess;
}


@JsonProperty("LocationGroupByProcess")
public void setLocationGroupByProcess(List<LocationGroupByProcess> locationGroupByProcess) {
this.locationGroupByProcess = locationGroupByProcess;
}

@JsonProperty("Perils")
public String getPerils() {
return perils;
}

@JsonProperty("Perils")
public void setPerils(String perils) {
this.perils = perils;
}

@JsonProperty("PerilNames")
public String getPerilNames() {
return perilNames;
}

@JsonProperty("PerilNames")
public void setPerilNames(String perilNames) {
this.perilNames = perilNames;
}

@JsonProperty("AccountType")
public String getAccountType() {
return accountType;
}

@JsonProperty("AccountType")
public void setAccountType(String accountType) {
this.accountType = accountType;
}

@JsonProperty("AddIsStockThroughput")
public String getAddIsStockThroughput() {
return addIsStockThroughput;
}

@JsonProperty("AddIsStockThroughput")
public void setAddIsStockThroughput(String addIsStockThroughput) {
this.addIsStockThroughput = addIsStockThroughput;
}

@JsonProperty("DocumentTypes")
public List<DocumentType> getDocumentTypes() {
return documentTypes;
}

@JsonProperty("DocumentTypes")
public void setDocumentTypes(List<DocumentType> documentTypes) {
this.documentTypes = documentTypes;
}

@JsonProperty("FinPolicyPerilLevelCoding")
public List<FinPolicyPerilLevelCoding> getFinPolicyPerilLevelCoding() {
return finPolicyPerilLevelCoding;
}

@JsonProperty("FinPolicyPerilLevelCoding")
public void setFinPolicyPerilLevelCoding(List<FinPolicyPerilLevelCoding> finPolicyPerilLevelCoding) {
this.finPolicyPerilLevelCoding = finPolicyPerilLevelCoding;
}

@JsonProperty("FinPolicyOptionlevels")
public List<FinPolicyOptionlevel> getFinPolicyOptionlevels() {
return finPolicyOptionlevels;
}

@JsonProperty("FinPolicyOptionlevels")
public void setFinPolicyOptionlevels(List<FinPolicyOptionlevel> finPolicyOptionlevels) {
this.finPolicyOptionlevels = finPolicyOptionlevels;
}

@JsonProperty("PolicyBlanket")
public List<PolicyBlanket> getPolicyBlanket() {
return policyBlanket;
}

@JsonProperty("PolicyBlanket")
public void setPolicyBlanket(List<PolicyBlanket> policyBlanket) {
this.policyBlanket = policyBlanket;
}

@JsonProperty("IsSurveyReport")
public String getIsSurveyReport() {
return isSurveyReport;
}

@JsonProperty("IsSurveyReport")
public void setIsSurveyReport(String isSurveyReport) {
this.isSurveyReport = isSurveyReport;
}

@JsonProperty("SelfInsuredRetention")
public Integer getSelfInsuredRetention() {
return selfInsuredRetention;
}

@JsonProperty("SelfInsuredRetention")
public void setSelfInsuredRetention(Integer selfInsuredRetention) {
this.selfInsuredRetention = selfInsuredRetention;
}

@JsonProperty("AppUserId")
public Integer getAppUserId() {
return appUserId;
}

@JsonProperty("AppUserId")
public void setAppUserId(Integer appUserId) {
this.appUserId = appUserId;
}

@JsonProperty("AppUserEmail")
public String getAppUserEmail() {
return appUserEmail;
}

@JsonProperty("AppUserEmail")
public void setAppUserEmail(String appUserEmail) {
this.appUserEmail = appUserEmail;
}

@JsonProperty("AppDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("AppDate")
public void setAppDate(String appDate) {
this.appDate = appDate;
}
}
