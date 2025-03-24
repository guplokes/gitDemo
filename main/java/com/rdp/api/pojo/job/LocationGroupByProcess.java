package com.rdp.api.pojo.job;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"LocGroupName",
"RuleExpression",
"IsMasterLocGroupId"
})

public class LocationGroupByProcess {

@JsonProperty("LocGroupName")
private String locGroupName;
@JsonProperty("RuleExpression")
private String ruleExpression;
@JsonProperty("IsMasterLocGroupId")
private Integer isMasterLocGroupId;

@JsonProperty("LocGroupName")
public String getLocGroupName() {
return locGroupName;
}

@JsonProperty("LocGroupName")
public LocationGroupByProcess setLocGroupName(String locGroupName) {
this.locGroupName = locGroupName;
return this;
}

@JsonProperty("RuleExpression")
public String getRuleExpression() {
return ruleExpression;
}

@JsonProperty("RuleExpression")
public LocationGroupByProcess setRuleExpression(String ruleExpression) {
this.ruleExpression = ruleExpression;
return this;
}

@JsonProperty("IsMasterLocGroupId")
public Integer getIsMasterLocGroupId() {
return isMasterLocGroupId;
}

@JsonProperty("IsMasterLocGroupId")
public LocationGroupByProcess setIsMasterLocGroupId(Integer isMasterLocGroupId) {
this.isMasterLocGroupId = isMasterLocGroupId;
return this;
}

}
