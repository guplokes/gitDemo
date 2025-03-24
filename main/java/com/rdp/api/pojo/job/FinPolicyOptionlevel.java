package com.rdp.api.pojo.job;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"IsLayerDeleted",
"Id",
"OptionName",
"PerilId",
"PerilName",
"CurrencyId",
"Currency",
"IsPrimary",
"LayerName",
"TIV",
"Order",
"Limit",
"OccAggregateLimit",
"Retention",
"Comments",
"NoOfDaysForDSUBI",
"PerOccuranceLocation",
"RetentionExcessOf",
"IsAction",
"LimitBasis",
"BlanketDeductible",
"IsVisible"
})
//@Generated("jsonschema2pojo")
public class FinPolicyOptionlevel {

@JsonProperty("IsLayerDeleted")
private Boolean isLayerDeleted;
@JsonProperty("Id")
private Integer id;
@JsonProperty("OptionName")
private String optionName;
@JsonProperty("PerilId")
private Integer perilId;
@JsonProperty("PerilName")
private String perilName;
@JsonProperty("CurrencyId")
private Integer currencyId;
@JsonProperty("Currency")
private String currency;
@JsonProperty("IsPrimary")
private Boolean isPrimary;
@JsonProperty("LayerName")
private String layerName;
@JsonProperty("TIV")
private Integer tiv;
@JsonProperty("Order")
private Integer order;
@JsonProperty("Limit")
private String limit;
@JsonProperty("OccAggregateLimit")
private String occAggregateLimit;
@JsonProperty("Retention")
private Integer retention;
@JsonProperty("Comments")
private String comments;
@JsonProperty("NoOfDaysForDSUBI")
private Integer noOfDaysForDSUBI;
@JsonProperty("PerOccuranceLocation")
private Integer perOccuranceLocation;
@JsonProperty("RetentionExcessOf")
private String retentionExcessOf;
@JsonProperty("IsAction")
private Integer isAction;
@JsonProperty("LimitBasis")
private String limitBasis;
@JsonProperty("BlanketDeductible")
private String blanketDeductible;
@JsonProperty("IsVisible")
private Boolean isVisible;

@JsonProperty("IsLayerDeleted")
public Boolean getIsLayerDeleted() {
return isLayerDeleted;
}

@JsonProperty("IsLayerDeleted")
public void setIsLayerDeleted(Boolean isLayerDeleted) {
this.isLayerDeleted = isLayerDeleted;
}

@JsonProperty("Id")
public Integer getId() {
return id;
}

@JsonProperty("Id")
public void setId(Integer id) {
this.id = id;
}

@JsonProperty("OptionName")
public String getOptionName() {
return optionName;
}

@JsonProperty("OptionName")
public void setOptionName(String optionName) {
this.optionName = optionName;
}

@JsonProperty("PerilId")
public Integer getPerilId() {
return perilId;
}

@JsonProperty("PerilId")
public void setPerilId(Integer perilId) {
this.perilId = perilId;
}

@JsonProperty("PerilName")
public String getPerilName() {
return perilName;
}

@JsonProperty("PerilName")
public void setPerilName(String perilName) {
this.perilName = perilName;
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

@JsonProperty("IsPrimary")
public Boolean getIsPrimary() {
return isPrimary;
}

@JsonProperty("IsPrimary")
public void setIsPrimary(Boolean isPrimary) {
this.isPrimary = isPrimary;
}

@JsonProperty("LayerName")
public String getLayerName() {
return layerName;
}

@JsonProperty("LayerName")
public void setLayerName(String layerName) {
this.layerName = layerName;
}

@JsonProperty("TIV")
public Integer getTiv() {
return tiv;
}

@JsonProperty("TIV")
public void setTiv(Integer tiv) {
this.tiv = tiv;
}

@JsonProperty("Order")
public Integer getOrder() {
return order;
}

@JsonProperty("Order")
public void setOrder(Integer order) {
this.order = order;
}

@JsonProperty("Limit")
public String getLimit() {
return limit;
}

@JsonProperty("Limit")
public void setLimit(String limit) {
this.limit = limit;
}

@JsonProperty("OccAggregateLimit")
public String getOccAggregateLimit() {
return occAggregateLimit;
}

@JsonProperty("OccAggregateLimit")
public void setOccAggregateLimit(String occAggregateLimit) {
this.occAggregateLimit = occAggregateLimit;
}

@JsonProperty("Retention")
public Integer getRetention() {
return retention;
}

@JsonProperty("Retention")
public void setRetention(Integer retention) {
this.retention = retention;
}

@JsonProperty("Comments")
public String getComments() {
return comments;
}

@JsonProperty("Comments")
public void setComments(String comments) {
this.comments = comments;
}

@JsonProperty("NoOfDaysForDSUBI")
public Integer getNoOfDaysForDSUBI() {
return noOfDaysForDSUBI;
}

@JsonProperty("NoOfDaysForDSUBI")
public void setNoOfDaysForDSUBI(Integer noOfDaysForDSUBI) {
this.noOfDaysForDSUBI = noOfDaysForDSUBI;
}

@JsonProperty("PerOccuranceLocation")
public Integer getPerOccuranceLocation() {
return perOccuranceLocation;
}

@JsonProperty("PerOccuranceLocation")
public void setPerOccuranceLocation(Integer perOccuranceLocation) {
this.perOccuranceLocation = perOccuranceLocation;
}

@JsonProperty("RetentionExcessOf")
public String getRetentionExcessOf() {
return retentionExcessOf;
}

@JsonProperty("RetentionExcessOf")
public void setRetentionExcessOf(String retentionExcessOf) {
this.retentionExcessOf = retentionExcessOf;
}

@JsonProperty("IsAction")
public Integer getIsAction() {
return isAction;
}

@JsonProperty("IsAction")
public void setIsAction(Integer isAction) {
this.isAction = isAction;
}

@JsonProperty("LimitBasis")
public String getLimitBasis() {
return limitBasis;
}

@JsonProperty("LimitBasis")
public void setLimitBasis(String limitBasis) {
this.limitBasis = limitBasis;
}

@JsonProperty("BlanketDeductible")
public String getBlanketDeductible() {
return blanketDeductible;
}

@JsonProperty("BlanketDeductible")
public void setBlanketDeductible(String blanketDeductible) {
this.blanketDeductible = blanketDeductible;
}

@JsonProperty("IsVisible")
public Boolean getIsVisible() {
return isVisible;
}

@JsonProperty("IsVisible")
public void setIsVisible(Boolean isVisible) {
this.isVisible = isVisible;
}

}



