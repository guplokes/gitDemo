package com.rdp.api.pojo.job;

//import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"RowID",
"OptionName",
"Id",
"PerilId",
"Peril",
"LocGrpName",
"IsAction",
"LimitCode",
"LimitBasis",
"LimitType",
"Sublimit",
"SublimitPart",
"SublimitAttachment",
"Deductible",
"DeductibleCode",
"DeductibleType",
"DeductibleBasis",
"MinDeductible",
"MaxDeductible",
"ConditionName"
})
//@Generated("jsonschema2pojo")
public class FinPolicyPerilLevelCoding {

@JsonProperty("RowID")
private Integer rowID;
@JsonProperty("OptionName")
private String optionName;
@JsonProperty("Id")
private Integer id;
@JsonProperty("PerilId")
private Integer perilId;
@JsonProperty("Peril")
private String peril;
@JsonProperty("LocGrpName")
private String locGrpName;
@JsonProperty("IsAction")
private Integer isAction;
@JsonProperty("LimitCode")
private String limitCode;
@JsonProperty("LimitBasis")
private String limitBasis;
@JsonProperty("LimitType")
private String limitType;
@JsonProperty("Sublimit")
private String sublimit;
@JsonProperty("SublimitPart")
private String sublimitPart;
@JsonProperty("SublimitAttachment")
private String sublimitAttachment;
@JsonProperty("Deductible")
private String deductible;
@JsonProperty("DeductibleCode")
private String deductibleCode;
@JsonProperty("DeductibleType")
private String deductibleType;
@JsonProperty("DeductibleBasis")
private String deductibleBasis;
@JsonProperty("MinDeductible")
private String minDeductible;
@JsonProperty("MaxDeductible")
private String maxDeductible;
@JsonProperty("ConditionName")
private String conditionName;

@JsonProperty("RowID")
public Integer getRowID() {
return rowID;
}

@JsonProperty("RowID")
public FinPolicyPerilLevelCoding setRowID(Integer rowID) {
this.rowID = rowID;
return this;
}

@JsonProperty("OptionName")
public String getOptionName() {
return optionName;
}

@JsonProperty("OptionName")
public FinPolicyPerilLevelCoding setOptionName(String optionName) {
this.optionName = optionName;
return this;
}

@JsonProperty("Id")
public Integer getId() {
return id;
}

@JsonProperty("Id")
public FinPolicyPerilLevelCoding setId(Integer id) {
this.id = id;
return this;
}

@JsonProperty("PerilId")
public Integer getPerilId() {
return perilId;
}

@JsonProperty("PerilId")
public FinPolicyPerilLevelCoding setPerilId(Integer perilId) {
this.perilId = perilId;
return this;
}

@JsonProperty("Peril")
public String getPeril() {
return peril;
}

@JsonProperty("Peril")
public FinPolicyPerilLevelCoding setPeril(String peril) {
this.peril = peril;
return this;
}

@JsonProperty("LocGrpName")
public String getLocGrpName() {
return locGrpName;
}

@JsonProperty("LocGrpName")
public FinPolicyPerilLevelCoding setLocGrpName(String locGrpName) {
this.locGrpName = locGrpName;
return this;
}

@JsonProperty("IsAction")
public Integer getIsAction() {
return isAction;
}

@JsonProperty("IsAction")
public FinPolicyPerilLevelCoding setIsAction(Integer isAction) {
this.isAction = isAction;
return this;
}

@JsonProperty("LimitCode")
public String getLimitCode() {
return limitCode;
}

@JsonProperty("LimitCode")
public FinPolicyPerilLevelCoding setLimitCode(String limitCode) {
this.limitCode = limitCode;
return this;
}

@JsonProperty("LimitBasis")
public String getLimitBasis() {
return limitBasis;
}

@JsonProperty("LimitBasis")
public FinPolicyPerilLevelCoding setLimitBasis(String limitBasis) {
this.limitBasis = limitBasis;
return this;
}

@JsonProperty("LimitType")
public String getLimitType() {
return limitType;
}

@JsonProperty("LimitType")
public FinPolicyPerilLevelCoding setLimitType(String limitType) {
this.limitType = limitType;
return this;
}

@JsonProperty("Sublimit")
public String getSublimit() {
return sublimit;
}

@JsonProperty("Sublimit")
public FinPolicyPerilLevelCoding setSublimit(String sublimit) {
this.sublimit = sublimit;
return this;
}

@JsonProperty("SublimitPart")
public String getSublimitPart() {
return sublimitPart;
}

@JsonProperty("SublimitPart")
public FinPolicyPerilLevelCoding setSublimitPart(String sublimitPart) {
this.sublimitPart = sublimitPart;
return this;
}

@JsonProperty("SublimitAttachment")
public String getSublimitAttachment() {
return sublimitAttachment;
}

@JsonProperty("SublimitAttachment")
public FinPolicyPerilLevelCoding setSublimitAttachment(String sublimitAttachment) {
this.sublimitAttachment = sublimitAttachment;
return this;
}

@JsonProperty("Deductible")
public String getDeductible() {
return deductible;
}

@JsonProperty("Deductible")
public FinPolicyPerilLevelCoding setDeductible(String deductible) {
this.deductible = deductible;
return this;
}

@JsonProperty("DeductibleCode")
public String getDeductibleCode() {
return deductibleCode;
}

@JsonProperty("DeductibleCode")
public FinPolicyPerilLevelCoding setDeductibleCode(String deductibleCode) {
this.deductibleCode = deductibleCode;
return this;
}

@JsonProperty("DeductibleType")
public String getDeductibleType() {
return deductibleType;
}

@JsonProperty("DeductibleType")
public FinPolicyPerilLevelCoding setDeductibleType(String deductibleType) {
this.deductibleType = deductibleType;
return this;
}

@JsonProperty("DeductibleBasis")
public String getDeductibleBasis() {
return deductibleBasis;
}

@JsonProperty("DeductibleBasis")
public FinPolicyPerilLevelCoding setDeductibleBasis(String deductibleBasis) {
this.deductibleBasis = deductibleBasis;
return this;
}

@JsonProperty("MinDeductible")
public String getMinDeductible() {
return minDeductible;
}

@JsonProperty("MinDeductible")
public FinPolicyPerilLevelCoding setMinDeductible(String minDeductible) {
this.minDeductible = minDeductible;
return this;
}

@JsonProperty("MaxDeductible")
public String getMaxDeductible() {
return maxDeductible;
}

@JsonProperty("MaxDeductible")
public FinPolicyPerilLevelCoding setMaxDeductible(String maxDeductible) {
this.maxDeductible = maxDeductible;
return this;
}

@JsonProperty("ConditionName")
public String getConditionName() {
return conditionName;
}

@JsonProperty("ConditionName")
public FinPolicyPerilLevelCoding setConditionName(String conditionName) {
this.conditionName = conditionName;
return this;
}

}
