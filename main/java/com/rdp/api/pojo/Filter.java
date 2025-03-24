
package com.rdp.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"ColumnName",
"Operator",
"Value",
"LogicalOperator"
})
//@Generated("jsonschema2pojo")
public class Filter {

@JsonProperty("ColumnName")
private String columnName;
@JsonProperty("Operator")
private String operator;
@JsonProperty("Value")
private String value;
@JsonProperty("LogicalOperator")
private String logicalOperator;

@JsonProperty("ColumnName")
public String getColumnName() {
return columnName;
}

@JsonProperty("ColumnName")
public Filter setColumnName(String columnName) {
this.columnName = columnName;
return this;
}

@JsonProperty("Operator")
public String getOperator() {
return operator;
}

@JsonProperty("Operator")
public Filter setOperator(String operator) {
this.operator = operator;
return this;
}

@JsonProperty("Value")
public String getValue() {
return value;
}

@JsonProperty("Value")
public Filter setValue(String value) {
this.value = value;
return this;
}

@JsonProperty("LogicalOperator")
public String getLogicalOperator() {
return logicalOperator;
}

@JsonProperty("LogicalOperator")
public Filter setLogicalOperator(String logicalOperator) {
this.logicalOperator = logicalOperator;
return this;
}

}

