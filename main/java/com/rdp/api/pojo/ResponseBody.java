package com.rdp.api.pojo;

//import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"ObjectId",
"Message",
"MessageCode",
"StatusId",
"Status",
"IsError",
"FilePath",
"TotalRecords"
})
//@Generated("jsonschema2pojo")
public class ResponseBody {

@JsonProperty("ObjectId")
private Integer objectId;
@JsonProperty("Message")
private String message;
@JsonProperty("MessageCode")
private String messageCode;
@JsonProperty("StatusId")
private Integer statusId;
@JsonProperty("Status")
private Object status;
@JsonProperty("IsError")
private Boolean isError;
@JsonProperty("FilePath")
private Object filePath;
@JsonProperty("TotalRecords")
private Integer totalRecords;

@JsonProperty("ObjectId")
public Integer getObjectId() {
return objectId;
}

@JsonProperty("ObjectId")
public void setObjectId(Integer objectId) {
this.objectId = objectId;
}

@JsonProperty("Message")
public String getMessage() {
return message;
}

@JsonProperty("Message")
public void setMessage(String message) {
this.message = message;
}

@JsonProperty("MessageCode")
public String getMessageCode() {
return messageCode;
}

@JsonProperty("MessageCode")
public void setMessageCode(String messageCode) {
this.messageCode = messageCode;
}

@JsonProperty("StatusId")
public Integer getStatusId() {
return statusId;
}

@JsonProperty("StatusId")
public void setStatusId(Integer statusId) {
this.statusId = statusId;
}

@JsonProperty("Status")
public Object getStatus() {
return status;
}

@JsonProperty("Status")
public void setStatus(Object status) {
this.status = status;
}

@JsonProperty("IsError")
public Boolean getIsError() {
return isError;
}

@JsonProperty("IsError")
public void setIsError(Boolean isError) {
this.isError = isError;
}

@JsonProperty("FilePath")
public Object getFilePath() {
return filePath;
}

@JsonProperty("FilePath")
public void setFilePath(Object filePath) {
this.filePath = filePath;
}

@JsonProperty("TotalRecords")
public Integer getTotalRecords() {
return totalRecords;
}

@JsonProperty("TotalRecords")
public void setTotalRecords(Integer totalRecords) {
this.totalRecords = totalRecords;
}

}