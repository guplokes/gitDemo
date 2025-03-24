package com.rdp.api.pojo.job;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

//@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"DocName",
"DocPath",
"DocType",
"DocTypeId"
})
//@Generated("jsonschema2pojo")
public class DocumentType {

@JsonProperty("DocName")
private String docName;
@JsonProperty("DocPath")
private String docPath;
@JsonProperty("DocType")
private String docType;
@JsonProperty("DocTypeId")
private Integer docTypeId;

@JsonProperty("DocName")
public String getDocName() {
return docName;
}

@JsonProperty("DocName")
public DocumentType setDocName(String docName) {
this.docName = docName;
return this;
}

@JsonProperty("DocPath")
public String getDocPath() {
return docPath;
}

@JsonProperty("DocPath")
public DocumentType setDocPath(String docPath) {
this.docPath = docPath;
return this;
}

@JsonProperty("DocType")
public String getDocType() {
return docType;
}

@JsonProperty("DocType")
public DocumentType setDocType(String docType) {
this.docType = docType;
return this;
}

@JsonProperty("DocTypeId")
public Integer getDocTypeId() {
return docTypeId;

}

@JsonProperty("DocTypeId")
public DocumentType setDocTypeId(Integer docTypeId) {
this.docTypeId = docTypeId;
return this;
}

}