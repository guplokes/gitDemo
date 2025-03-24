package com.rdp.api.utils;

public enum Endpoints {
	
	//UserMangement
	AddTeam("/Services/api/Common/UserManagement/AddTeam"),
	TeamDetails("/Services/api/Common/UserManagement/TeamDetails"),
	GetTeamById("/Services/api/Common/UserManagement/GetTeamById"),
	GetTeamByTeamLead("/Services/api/Common/UserManagement/GetTeamByTeamLead"),
	deleteTeam("/Services/api/Common/UserManagement/deleteTeam/{teamId}"),
	AccountRegionGet("/Services/api/Common/UserManagement/Team/Associate/AccountRegion/Get"),
	AccountRegionSave("/Services/api/Common/UserManagement/Team/Associate/AccountRegion/Save"),
	TeamBusinessActionList("/Services/api/Common/UserManagement/TeamBusinessActionList"),
	BusinessActionList("/Services/api/Common/UserManagement/BusinessActionList"),
	UpdateTeamDetails("/Services/api/Common/UserManagement/UpdateTeamDeatils"),
	RoleBusinessActionList("/Services/api/Common/UserManagement/RoleBusinessActionList/{RoleId}"),
	users("/Services/api/Common/UserManagement/users"),
	timezone("/Services/api/Common/UserManagement/timezone"),
	roles("Services/api/Common/UserManagement/roles"),
	GetUserById("/Services/api/Common/UserManagement/GetUserById/{UserId}"),
	ChangeActiveUserStatus("/Services/api/Common/UserManagement/users/ChangeActiveUserStatus"),
	ChangeBlockUserStatus("/Services/api/Common/UserManagement/users/ChangeBlockUserStatus"),
	underwriters("/Services/api/Common/UserManagement/users/underwriters"),
	GetOtherActivityTime("/Services/api/Common/UserManagement/GetOtherActivityTime/{UserName}"),
	GetProcessRecordedTime("/Services/api/Common/UserManagement/GetProcessRecordedTime/{UserName}"),
	UserBusinessActionList("/Services/api/Common/UserManagement/UserBusinessActionList/{UserId}"),
	AssignBActionToTeam("/Services/api/Common/UserManagement/AssignBActionToTeam"),
	AssignBActionToUser("/Services/api/Common/UserManagement/AssignBActionToUser"),
	delete("Services/api/Common/UserManagement/users/delete/{UserId}"),
	active("/Services/api/Common/UserManagement/users/active"),
	GetAllProcessTaskWithTime("/Services/api/Common/UserManagement/GetAllProcessTaskWithTime"),
	Create("/Services/api/Common/UserManagement/users/create"),
	UpdateUserSettings("/Services/api/Common/UserManagement/UpdateUserSettings"),
	AssignBActionToRole("/Services/api/Common/UserManagement/AssignBActionToRole"),

	//Job
	GetAllProcess("/Services/api/Workflow/Job/GetAllProcess"),
	CreateJob("/Services/api/Workflow/Job/CreateJob"),
	DeleteJob("/Services/api/Workflow/Job/DeleteJob"),
	GetJob("/Services/api/Workflow/Job/GetJob"),
	GetAllPendingJob("/Services/api/Workflow/Job/GetAllPendingJob/{UserId}"),
	GetPendingJob("/Services/api/Workflow/Job/GetPendingJob"),
	SavePendingJob("/services/api/Workflow/Job/SavePendingJob"),
	UpdatePendingJob("/Services/api/Workflow/Job/UpdatePendingJob"),
	DeletePendingJob("/Services/api/Workflow/Job/DeletePendingJob"),
	GetImportColumnRepo("/Services/api/Workflow/Job/GetImportColumnRepo"),
	GetImportRepoDataByColumnName("/Services/api/Workflow/Job/GetImportRepoDataByColumnName"),
	GetJobProcess("/Services/api/Workflow/Job/GetJobProcess"),
	AssignProcessToUser("/Services/api/Workflow/Job/AssignProcessToUser"),
	GetAuditorUser("/Services/api/Workflow/Job/GetAuditorUser"),
	GetAnalystUser("/Services/api/Workflow/Job/GetAnalystUser"),
	GetAnalystUserByTeam("/Services/api/Workflow/Job/GetAnalystUserByTeam/{userId}"),
	GetAuditorUserByTeam("/Services/api/Workflow/Job/GetAuditorUserByTeam/{userId}"),
	GetAccountDetails("/Services/api/Workflow/Job/GetAccountDetails"),
	GetProcessStatus("/Services/api/Workflow/Job/GetProcessStatus"),
	GetProcessingStatus("/Services/api/Workflow/Job/GetProcessingStatus"),
	GetAllLeadData("/Services/api/Workflow/Job/GetAllLeadData"),
	GetUnitLeads("/Services/api/Workflow/Job/GetUnitLeads"),
	GetProcessDocuments("/Services/api/Workflow/Job/GetProcessDocuments"),
	GetLocGrpRules("/Services/api/Workflow/Job/GetLocGrpRules"),
	GetJobPredominentOccupancyMaster("/Services/api/Workflow/Job/GetJobPredominentOccupancyMaster"),
	CheckProcessInQuery("/Services/api/Workflow/Job/CheckProcessInQuery/{processId}/{loginName}"),
	GetJobDefaultValue("/Services/api/Workflow/Job/GetJobDefaultValue"),
	SaveJobDefaultValue("/Services/api/Workflow/Job/SaveJobDefaultValue"),
	GetCurrentTAT("/Services/api/Workflow/Job/GetCurrentTAT/{ProcessId}/{AppDate}"),
	CheckProcessRunningStatus("/Services/api/Workflow/Job/CheckProcessRunningStatus/{ProcessId}/{UserName}"),
	GetRunningAccount("/Services/api/Workflow/Job/GetRunningAccount/{userName}"),
	UpdateProposedDate("/Services/api/Workflow/Job/UpdateProposedDate"),
	SaveMovedAccountInfo("/Services/api/Workflow/Job/saveMovedAccountInfo"),
	UpdateComments("/Services/api/Workflow/Job/Update/Comments"),
	ProcessOnHold("/Services/api/Workflow/Job/ProcessOnHold"),
	UpdateJobAndProcess("/Services/api/Workflow/Job/UpdateJobAndProcess"),
	GetUserJobTemplate("/services/api/Workflow/Job/GetUserJobTemplate/{userId}"),
	SetDefaultJobTemplate("/Services/api/Workflow/Job/SetDefaultJobTemplate"),
	GetSavedMRFImportRepoMapping("/services/api/Workflow/Job/GetSavedMRFImportRepoMapping"),
	DownloadTemplate("/Services/api/Workflow/Job/DownloadTemplate"),
	CheckCapacityforPrimaryAccounts("/Services/api/Workflow/Job/CheckCapacityforPrimaryAccounts"),
	AdditionalEvaluationGet("/services/api/Workflow/Job/Additional/Evaluation/Get"),
	AdditionalEvaluationGetMaster("/Services/api/Workflow/Job/Additional/Evaluation/Get/Master"),
	AdditionalEvaluationSave("/Services/api/Workflow/Job/Additional/Evaluation/Save"),
	GetBIPOI("/services/api/Workflow/Job/GetBIPOI"),
	GetInspectionExpiryDate("/services/api/Workflow/Job/GetInspectionExpiryDate"),
	GetSOVFileName("/services/api/Workflow/Job/GetSOVFileName"),
	GetMoveBuilderRiskLocData("/services/api/Workflow/Job/GetMoveBuilderRiskLocData"),
	GetAccountNameList("/Services/api/Workflow/Job/GetAccountNameList/{accountName}"),
	GetMRFOptions("/services/api/Workflow/Job/GetMRFOptions"),
	GetJobMaxVersion("/services/api/Workflow/Job/GetJobMaxVersion"),
	GetReferenceAccountByProcessId("/Services/api/Workflow/Job/GetReferenceAccountByProcessId/{processId}"),
	UserIdByProcess("/Services/api/Workflow/Job/UserIdByProcess"),
	UpdateAccountGoalsComments("/Services/api/Workflow/Job/Update/AccountGoalsComments"),
	DownloadProcessFile("/Services/api/Workflow/Job/DownloadProcessFile"),
	GetAvailableDates("/services/api/Workflow/Job/GetAvailableDates"),	
	CheckParentID("/services/api/Workflow/Job/CheckParentID"),
	GetReferenceLookup("/Services/api/Workflow/Job/GetReferenceLookup"),
	
	//DelagateActivity
	AnalystName("/Services/api/Workflow/DelagateActivity/AnalystName"),
	List("/Services/api/Workflow/DelagateActivity/List"),
	GetActivity("/services/api/Workflow/DelagateActivity/GetActivity"),
	ParentTasks("/Services/api/Workflow/DelagateActivity/ParentTasks"),
	New("/Services/api/Workflow/DelagateActivity/New"),
	SubTaskAction("/Services/api/Workflow/DelagateActivity/SubTaskAction"),
	
	//IndependentTask
	SaveRisk("/Services/api/Workflow/IndependentTask/SaveRisk"),
	SaveExtractionFromPDF("/Services/api/Workflow/IndependentTask/SaveExtractionFromPDF"),
	SaveQueryResolution("/Services/api/Workflow/IndependentTask/SaveQueryResolution"),
	SaveGeospatial("/Services/api/Workflow/IndependentTask/SaveGeospatial"),
	SaveProcessDocumentation("/Services/api/Workflow/IndependentTask/SaveProcessDocumentation"),
	SaveToolDevEnhancement("/Services/api/Workflow/IndependentTask/SaveToolDevEnhancement"),
	
	//TaskDetail
	GetOtherActivityType("/services/api/Workflow/TaskDetail/GetOtherActivityType/Get"),
	OtherActivityNew("/Services/api/Workflow/TaskDetail/OtherActivity/New"),
	TaskDetailView("/services/api/Workflow/TaskDetail/View"),
	ComplexityMetricsNew("/Services/api/Workflow/TaskDetail/ComplexityMetrics/New"),
	OtherActivityGet("/services/api/Workflow/TaskDetail/OtherActivity/Get"),
	
	//QueryManagement
	GetQueryClassificationType("/services/api/Workflow/QueryManagement/GetQueryClassificationType"),
	GetQueryDetailTrails("/services/api/Workflow/QueryManagement/GetQueryDetailTrails"),
	GetQueryDescription("/Services/api/Workflow/QueryManagement/GetQueryDescription"),
	GetQueryDetails("/services/api/Workflow/QueryManagement/GetQueryDetails"),
	RaiseQuery("/services/api/Workflow/QueryManagement/RaiseQuery"),
	CloseQuery("/services/api/Workflow/QueryManagement/CloseQuery"),
	
	//Task
	CleansingGet("/services/api/Workflow/Task/Cleansing/Get"),
	ModellingGet("/services/api/Workflow/Task/Modelling/Get"),
	ReportingGet("/services/api/Workflow/Task/Reporting/Get"),
	
	
	//RuleConfiguration
	GetRuleTypes("/services/api/RuleConfiguration/GetRuleTypes"),
	GetRuleExecutionTypes("/Services/api/RuleConfiguration/GetRuleExecutionTypes"),
	GetRuleContexts("/services/api/RuleConfiguration/GetRuleContexts");
	
	
	private String endpoint;
	
	private Endpoints(String endpoint){
		this.endpoint = endpoint;
	}
	

	public String getEndpoint() {
		return endpoint;
	}
}
