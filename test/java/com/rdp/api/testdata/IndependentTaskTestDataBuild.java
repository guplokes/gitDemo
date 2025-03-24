package com.rdp.api.testdata;

import java.util.List;
import java.util.Map;

import com.rdp.api.pojo.IndependentTask;
import com.rdp.api.utils.PropertyUtils;
import com.rdp.api.utils.TestUtils;

public class IndependentTaskTestDataBuild {

	String user = PropertyUtils.getInstance().getValue("User");
	String userId = PropertyUtils.getInstance().getValue("UserId");
	String userName = PropertyUtils.getInstance().getValue("UserName"); //full name of User
	
	public IndependentTask getSaveRiskPayload(int processId) {
		IndependentTask saveRiskPayload = new IndependentTask();
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "IndependentTask");
		
		saveRiskPayload.setAccountName(testData.get(0).get("AccountName"))
					   .setId(Integer.parseInt(testData.get(0).get("Id")))
					   .setProcessId(processId)
					   .setTaskCode(testData.get(0).get("TaskCode1"))
					   .setTaskType(testData.get(0).get("TaskType1"))
					   .setTask(testData.get(0).get("Task1"))
					   .setStartTime(testData.get(0).get("StartTime"))
					   .setEndTime(testData.get(0).get("EndTime"))
					   .setStage(testData.get(0).get("Stage"))
					   .setApplicationUser(user)
					   .setApplicationDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
					   .setTimeSpent(Integer.parseInt(testData.get(0).get("TimeSpent")))
					   .setComment(TestUtils.getInstance().encodedToBase64(testData.get(0).get("Comment1")))
					   .setNetDuration(Integer.parseInt(testData.get(0).get("NetDuration")));	
		
		return saveRiskPayload;					   
		
	}
	
	public IndependentTask getSaveExtractionFromPDFPayload(int processId) {
		IndependentTask saveExtractionFromPDFPayload = new IndependentTask();
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "IndependentTask");
		
		saveExtractionFromPDFPayload.setAccountName(testData.get(0).get("AccountName"))
					   .setId(Integer.parseInt(testData.get(0).get("Id")))
					   .setProcessId(processId)
					   .setTaskCode(testData.get(0).get("TaskCode2"))
					   .setTaskType(testData.get(0).get("TaskType1"))
					   .setTask(testData.get(0).get("Task2"))
					   .setStartTime(testData.get(0).get("StartTime"))
					   .setEndTime(testData.get(0).get("EndTime"))
					   .setStage(testData.get(0).get("Stage"))
					   .setApplicationUser(user)
					   .setApplicationDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
					   .setTimeSpent(Integer.parseInt(testData.get(0).get("TimeSpent")))
					   .setComment(TestUtils.getInstance().encodedToBase64(testData.get(0).get("Comment2")))
					   .setNetDuration(Integer.parseInt(testData.get(0).get("NetDuration")));	
		
		return saveExtractionFromPDFPayload;	
	}
	
	public IndependentTask getSaveQueryResolutionPayload(int processId) {
		IndependentTask saveQueryResolutionPayload = new IndependentTask();
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "IndependentTask");
		
		saveQueryResolutionPayload.setAccountName(testData.get(0).get("AccountName"))
					   .setId(Integer.parseInt(testData.get(0).get("Id")))
					   .setProcessId(processId)
					   .setTaskCode(testData.get(0).get("TaskCode3"))
					   .setTaskType(testData.get(0).get("TaskType2"))
					   .setTask(testData.get(0).get("Task3"))
					   .setStartTime(testData.get(0).get("StartTime"))
					   .setEndTime(testData.get(0).get("EndTime"))
					   .setStage(testData.get(0).get("Stage"))
					   .setApplicationUser(user)
					   .setApplicationDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
					   .setTimeSpent(Integer.parseInt(testData.get(0).get("TimeSpent")))
					   .setComment(TestUtils.getInstance().encodedToBase64(testData.get(0).get("Comment3")))
					   .setNetDuration(Integer.parseInt(testData.get(0).get("NetDuration")));	
		
		return saveQueryResolutionPayload;	
	}
	
	
	public IndependentTask getSaveGeospatialPayload(int processId) {
		IndependentTask saveGeospatialPayload = new IndependentTask();
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "IndependentTask");
		
		saveGeospatialPayload.setAccountName(testData.get(0).get("AccountName"))
					   .setId(Integer.parseInt(testData.get(0).get("Id")))
					   .setProcessId(processId)
					   .setTaskCode(testData.get(0).get("TaskCode4"))
					   .setTaskType(testData.get(0).get("TaskType1"))
					   .setTask(testData.get(0).get("Task4"))
					   .setStartTime(testData.get(0).get("StartTime"))
					   .setEndTime(testData.get(0).get("EndTime"))
					   .setStage(testData.get(0).get("Stage"))
					   .setApplicationUser(user)
					   .setApplicationDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
					   .setTimeSpent(Integer.parseInt(testData.get(0).get("TimeSpent")))
					   .setComment(testData.get(0).get("Comment4"))
					   .setNetDuration(Integer.parseInt(testData.get(0).get("NetDuration")));	
		
		return saveGeospatialPayload;	
	}
	
	public IndependentTask getSaveToolDevelopmentorEnhancementPayload(int processId) {
		IndependentTask saveToolDevelopmentorEnhancementPayload = new IndependentTask();
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "IndependentTask");
		
		saveToolDevelopmentorEnhancementPayload.setAccountName(testData.get(0).get("AccountName"))
					   .setId(Integer.parseInt(testData.get(0).get("Id")))
					   .setProcessId(processId)
					   .setTaskCode(testData.get(0).get("TaskCode5"))
					   .setTaskType(testData.get(0).get("TaskType1"))
					   .setTask(testData.get(0).get("Task5"))
					   .setStartTime(testData.get(0).get("StartTime"))
					   .setEndTime(testData.get(0).get("EndTime"))
					   .setStage(testData.get(0).get("Stage"))
					   .setApplicationUser(user)
					   .setApplicationDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
					   .setTimeSpent(Integer.parseInt(testData.get(0).get("TimeSpent")))
					   .setComment(testData.get(0).get("Comment5"))
					   .setNetDuration(Integer.parseInt(testData.get(0).get("NetDuration")));	
		
		return saveToolDevelopmentorEnhancementPayload;	
	}
	
	public IndependentTask getSaveProcessDocumentationPayload(int processId) {
		IndependentTask saveProcessDocumentationPayload = new IndependentTask();
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "IndependentTask");
		
		saveProcessDocumentationPayload.setAccountName(testData.get(0).get("AccountName"))
					   .setId(Integer.parseInt(testData.get(0).get("Id")))
					   .setProcessId(processId)
					   .setTaskCode(testData.get(0).get("TaskCode6"))
					   .setTaskType(testData.get(0).get("TaskType1"))
					   .setTask(testData.get(0).get("Task6"))
					   .setStartTime(testData.get(0).get("StartTime"))
					   .setEndTime(testData.get(0).get("EndTime"))
					   .setStage(testData.get(0).get("Stage"))
					   .setApplicationUser(user)
					   .setApplicationDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
					   .setTimeSpent(Integer.parseInt(testData.get(0).get("TimeSpent")))
					   .setComment(TestUtils.getInstance().encodedToBase64(testData.get(0).get("Comment6")))
					   .setNetDuration(Integer.parseInt(testData.get(0).get("NetDuration")));	
		
		return saveProcessDocumentationPayload;	
	}
}
