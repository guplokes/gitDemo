package com.rdp.api.pojo.job;


import com.fasterxml.jackson.annotation.JsonProperty;


public class JobOtherDetail {

@JsonProperty("AccUserDef1")
private Object accUserDef1;
@JsonProperty("AccUserDef2")
private Object accUserDef2;
@JsonProperty("AccUserDef3")
private Object accUserDef3;
@JsonProperty("AccUserDef4")
private Object accUserDef4;
@JsonProperty("AccUserDef5")
private Object accUserDef5;
@JsonProperty("ProcessId")
private Integer processId;

@JsonProperty("AccUserDef1")
public Object getAccUserDef1() {
return accUserDef1;
}

@JsonProperty("AccUserDef1")
public void setAccUserDef1(Object accUserDef1) {
this.accUserDef1 = accUserDef1;
}

@JsonProperty("AccUserDef2")
public Object getAccUserDef2() {
return accUserDef2;
}

@JsonProperty("AccUserDef2")
public void setAccUserDef2(Object accUserDef2) {
this.accUserDef2 = accUserDef2;
}

@JsonProperty("AccUserDef3")
public Object getAccUserDef3() {
return accUserDef3;
}

@JsonProperty("AccUserDef3")
public void setAccUserDef3(Object accUserDef3) {
this.accUserDef3 = accUserDef3;
}

@JsonProperty("AccUserDef4")
public Object getAccUserDef4() {
return accUserDef4;
}

@JsonProperty("AccUserDef4")
public void setAccUserDef4(Object accUserDef4) {
this.accUserDef4 = accUserDef4;
}

@JsonProperty("AccUserDef5")
public Object getAccUserDef5() {
return accUserDef5;
}

@JsonProperty("AccUserDef5")
public void setAccUserDef5(Object accUserDef5) {
this.accUserDef5 = accUserDef5;
}

@JsonProperty("ProcessId")
public Integer getProcessId() {
return processId;
}

@JsonProperty("ProcessId")
public void setProcessId(Integer processId) {
this.processId = processId;
}

}