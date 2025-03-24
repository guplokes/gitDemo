package com.rdp.api.testdata;

import java.util.List;
import java.util.Map;

import com.rdp.api.pojo.taskDetail.*;
import com.rdp.api.utils.PropertyUtils;
import com.rdp.api.utils.TestUtils;

public class TaskDetailTestDataBuild {
	
	String user = PropertyUtils.getInstance().getValue("User");
	String userName = PropertyUtils.getInstance().getValue("userName");

	public OtherActivityNew getOtherActivityNewPayload(String taskCategory) {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "OtherActivity-New");
		OtherActivityNew otherActivityNewPayload = new OtherActivityNew();
		otherActivityNewPayload.setActivityDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
							   .setTaskCategory(testData.get(0).get("TaskCategory"))
							   .setTimeInMins(Integer.parseInt(testData.get(0).get("TimeInMins")))
							   .setTaskDetails(TestUtils.getInstance().encodedToBase64(testData.get(0).get("TaskDetails")))
							   .setApplicationDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
							   .setApplicationUser(user)
							   .setJobId(Integer.parseInt(testData.get(0).get("JobId")));
		
		return otherActivityNewPayload;		
	}
	
	public ComplexityMetricsNew getComplexityMetricsNewPayload(int processId, int id, String createdDate, String modifiedDate) {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "ComplexityMetrics-New");
		ComplexityMetricsNew complexityMetricsPayload = new ComplexityMetricsNew();		
		complexityMetricsPayload.setId(id)
								.setProcessId(processId)
								.setAccountName(testData.get(0).get("AccountName"))
								.setLocCount(Integer.parseInt(testData.get(0).get("LocCount")))
								.setDataQuality(testData.get(0).get("DataQuality"))
								.setOptionsCount(Integer.parseInt(testData.get(0).get("OptionsCount")))
								.setLimDedCount(testData.get(0).get("LimDedCount"))
								.setPerilRegions(Integer.parseInt(testData.get(0).get("PerilRegions")))
								.setComplexity(testData.get(0).get("Complexity"))
								.setCreatedBy(userName)
								.setCreatedDate(createdDate)
								.setModifiedDate(modifiedDate)
								.setApplicationDate(TestUtils.getInstance().getUtcFormatCurrentDateTime());
		
		return complexityMetricsPayload;
								
								
								
		
	}
}
