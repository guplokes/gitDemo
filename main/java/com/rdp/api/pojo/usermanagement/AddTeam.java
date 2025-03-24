package com.rdp.api.pojo.usermanagement;

import com.fasterxml.jackson.annotation.JsonProperty;


//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonPropertyOrder({
//"Capacity",
//"AdditionalCapacity",
//"TeamName",
//"TeamLead",
//"Description",
//"Members",
//"TeamId",
//"AppDate"
//})

public class AddTeam {

@JsonProperty("Capacity")
private Integer capacity;
@JsonProperty("AdditionalCapacity")
private Integer additionalCapacity;
@JsonProperty("TeamName")
private String teamName;
@JsonProperty("TeamLead")
private Integer teamLead;
@JsonProperty("Description")
private String description;
@JsonProperty("Members")
private String members;
@JsonProperty("TeamId")
private Integer teamId;
@JsonProperty("AppDate")
private String appDate;

@JsonProperty("Capacity")
public Integer getCapacity() {
return capacity;
}

@JsonProperty("Capacity")
public AddTeam setCapacity(Integer capacity) {
this.capacity = capacity;
return this;
}

@JsonProperty("AdditionalCapacity")
public Integer getAdditionalCapacity() {
return additionalCapacity;
}

@JsonProperty("AdditionalCapacity")
public AddTeam setAdditionalCapacity(Integer additionalCapacity) {
this.additionalCapacity = additionalCapacity;
return this;
}

@JsonProperty("TeamName")
public String getTeamName() {
return teamName;
}

@JsonProperty("TeamName")
public AddTeam setTeamName(String teamName) {
this.teamName = teamName;
return this;
}

@JsonProperty("TeamLead")
public Integer getTeamLead() {
return teamLead;
}

@JsonProperty("TeamLead")
public AddTeam setTeamLead(Integer teamLead) {
this.teamLead = teamLead;
return this;
}

@JsonProperty("Description")
public String getDescription() {
return description;
}

@JsonProperty("Description")
public AddTeam setDescription(String description) {
this.description = description;
return this;
}

@JsonProperty("Members")
public String getMembers() {
return members;
}

@JsonProperty("Members")
public AddTeam setMembers(String members) {
this.members = members;
return this;
}

@JsonProperty("TeamId")
public Integer getTeamId() {
return teamId;
}

@JsonProperty("TeamId")
public AddTeam setTeamId(Integer teamId) {
this.teamId = teamId;
return this;
}

@JsonProperty("AppDate")
public String getAppDate() {
return appDate;
}

@JsonProperty("AppDate")
public AddTeam setAppDate(String appDate) {
this.appDate = appDate;
return this;
}

}