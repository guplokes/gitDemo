package com.rdp.api.pojo.usermanagement;

import com.fasterxml.jackson.annotation.JsonProperty;


//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//"Capacity",
//"AdditionalCapacity",
//"TeamId",
//"TeamName",
//"Description",
//"Members",
//"TeamLead",
//"IsActive",
//"AppDate"
//})

public class UpdateTeamDetails {

@JsonProperty("Capacity")
private Integer capacity;
@JsonProperty("AdditionalCapacity")
private Integer additionalCapacity;
@JsonProperty("TeamId")
private Integer teamId;
@JsonProperty("TeamName")
private String teamName;
@JsonProperty("Description")
private String description;
@JsonProperty("Members")
private String members;
@JsonProperty("TeamLead")
private Integer teamLead;
@JsonProperty("IsActive")
private Boolean isActive;
@JsonProperty("AppDate")
private String appDate;

@JsonProperty("Capacity")
public Integer getCapacity() {
return capacity;
}

@JsonProperty("Capacity")
public UpdateTeamDetails setCapacity(Integer capacity) {
this.capacity = capacity;
return this;
}

@JsonProperty("AdditionalCapacity")
public Integer getAdditionalCapacity() {
return additionalCapacity;
}

@JsonProperty("AdditionalCapacity")
public UpdateTeamDetails setAdditionalCapacity(Integer additionalCapacity) {
this.additionalCapacity = additionalCapacity;
return this;
}

@JsonProperty("TeamId")
public Integer getTeamId() {
return teamId;
}

@JsonProperty("TeamId")
public UpdateTeamDetails setTeamId(Integer teamId) {
this.teamId = teamId;
return this;
}

@JsonProperty("TeamName")
public String getTeamName() {
return teamName;
}

@JsonProperty("TeamName")
public UpdateTeamDetails setTeamName(String teamName) {
this.teamName = teamName;
return this;
}

@JsonProperty("Description")
public String getDescription() {
return description;
}

@JsonProperty("Description")
public UpdateTeamDetails setDescription(String description) {
this.description = description;
return this;
}

@JsonProperty("Members")
public String getMembers() {
return members;
}

@JsonProperty("Members")
public UpdateTeamDetails setMembers(String members) {
this.members = members;
return this;
}

@JsonProperty("TeamLead")
public Integer getTeamLead() {
return teamLead;
}

@JsonProperty("TeamLead")
public UpdateTeamDetails setTeamLead(Integer teamLead) {
this.teamLead = teamLead;
return this;
}

@JsonProperty("IsActive")
public Boolean getIsActive() {
return isActive;
}

@JsonProperty("IsActive")
public UpdateTeamDetails setIsActive(Boolean isActive) {
this.isActive = isActive;
return this;
}

@JsonProperty("AppDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("AppDate")
public UpdateTeamDetails setAppDate(String appDate) {
this.appDate = appDate;
return this;
}

}
