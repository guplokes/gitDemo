package com.rdp.api.testdata;

import java.util.List;
import java.util.Map;

import com.rdp.api.reporting.ExtentReportManager;
import com.rdp.api.utils.TestUtils;

public class TaskTestData {

	public void getParamPAylaod(int index) {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "Parameterization");
		ExtentReportManager.logInfoDetails(testData.get(index).get("c1"));
		ExtentReportManager.logInfoDetails(testData.get(index).get("c2"));
		ExtentReportManager.logInfoDetails(testData.get(index).get("c3"));
		ExtentReportManager.logInfoDetails(testData.get(index).get("c4"));
	}
}
