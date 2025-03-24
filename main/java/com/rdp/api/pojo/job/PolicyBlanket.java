package com.rdp.api.pojo.job;



//import javax.annotation.Generated;
//import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"BlanketDeductible",
"DeductibleBasis",
"DeductibleCode",
"DeductibleType",
"Limit",
"LimitBasis",
"LimitCode",
"LimitType",
"MaximumDeductible",
"MinimumDeductible",
"OptionName",
"PerilName",
"ActionId",
"Id"
})
//@Generated("jsonschema2pojo")
public class PolicyBlanket {

@JsonProperty("BlanketDeductible")
private String blanketDeductible;
@JsonProperty("DeductibleBasis")
private String deductibleBasis;
@JsonProperty("DeductibleCode")
private String deductibleCode;
@JsonProperty("DeductibleType")
private String deductibleType;
@JsonProperty("Limit")
private String limit;
@JsonProperty("LimitBasis")
private String limitBasis;
@JsonProperty("LimitCode")
private String limitCode;
@JsonProperty("LimitType")
private String limitType;
@JsonProperty("MaximumDeductible")
private String maximumDeductible;
@JsonProperty("MinimumDeductible")
private String minimumDeductible;
@JsonProperty("OptionName")
private String optionName;
@JsonProperty("PerilName")
private String perilName;
@JsonProperty("ActionId")
private Integer actionId;
@JsonProperty("Id")
private Integer id;

@JsonProperty("BlanketDeductible")
public String getBlanketDeductible() {
return blanketDeductible;
}

@JsonProperty("BlanketDeductible")
public PolicyBlanket setBlanketDeductible(String blanketDeductible) {
this.blanketDeductible = blanketDeductible;
return this;
}

@JsonProperty("DeductibleBasis")
public String getDeductibleBasis() {
return deductibleBasis;
}

@JsonProperty("DeductibleBasis")
public PolicyBlanket setDeductibleBasis(String deductibleBasis) {
this.deductibleBasis = deductibleBasis;
return this;
}

@JsonProperty("DeductibleCode")
public String getDeductibleCode() {
return deductibleCode;
}

@JsonProperty("DeductibleCode")
public PolicyBlanket setDeductibleCode(String deductibleCode) {
this.deductibleCode = deductibleCode;
return this;
}

@JsonProperty("DeductibleType")
public String getDeductibleType() {
return deductibleType;
}

@JsonProperty("DeductibleType")
public PolicyBlanket setDeductibleType(String deductibleType) {
this.deductibleType = deductibleType;
return this;
}

@JsonProperty("Limit")
public String getLimit() {
return limit;
}

@JsonProperty("Limit")
public PolicyBlanket setLimit(String limit) {
this.limit = limit;
return this;
}

@JsonProperty("LimitBasis")
public String getLimitBasis() {
return limitBasis;
}

@JsonProperty("LimitBasis")
public PolicyBlanket setLimitBasis(String limitBasis) {
this.limitBasis = limitBasis;
return this;
}

@JsonProperty("LimitCode")
public String getLimitCode() {
return limitCode;
}

@JsonProperty("LimitCode")
public PolicyBlanket setLimitCode(String limitCode) {
this.limitCode = limitCode;
return this;
}

@JsonProperty("LimitType")
public String getLimitType() {
return limitType;
}

@JsonProperty("LimitType")
public PolicyBlanket setLimitType(String limitType) {
this.limitType = limitType;
return this;
}

@JsonProperty("MaximumDeductible")
public String getMaximumDeductible() {
return maximumDeductible;
}

@JsonProperty("MaximumDeductible")
public PolicyBlanket setMaximumDeductible(String maximumDeductible) {
this.maximumDeductible = maximumDeductible;
return this;
}

@JsonProperty("MinimumDeductible")
public String getMinimumDeductible() {
return minimumDeductible;
}

@JsonProperty("MinimumDeductible")
public PolicyBlanket setMinimumDeductible(String minimumDeductible) {
this.minimumDeductible = minimumDeductible;
return this;
}

@JsonProperty("OptionName")
public String getOptionName() {
return optionName;
}

@JsonProperty("OptionName")
public PolicyBlanket setOptionName(String optionName) {
this.optionName = optionName;
return this;
}

@JsonProperty("PerilName")
public String getPerilName() {
return perilName;
}

@JsonProperty("PerilName")
public PolicyBlanket setPerilName(String perilName) {
this.perilName = perilName;
return this;
}

@JsonProperty("ActionId")
public Integer getActionId() {
return actionId;
}

@JsonProperty("ActionId")
public PolicyBlanket setActionId(Integer actionId) {
this.actionId = actionId;
return this;
}

@JsonProperty("Id")
public Integer getId() {
return id;
}

@JsonProperty("Id")
public PolicyBlanket setId(Integer id) {
this.id = id;
return this;
}

}