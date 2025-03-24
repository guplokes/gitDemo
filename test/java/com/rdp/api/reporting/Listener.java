package com.rdp.api.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import java.util.Arrays;
import java.util.HashMap;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	  	public static ExtentReports extentReports;
//	    public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
		String className = "";
		ExtentTest  parent  ;
		ExtentTest  child ;
		String testDescription ;
		String testMethodName;
		String parentNode;
		String groupName;
	  public static ExtentTest extentTest ;

	    public void onStart(ITestContext context) {
	        String fileName = ExtentReportManager.getReportNameWithTimeStamp();
	        String fullReportPath = System.getProperty("user.dir") + "\\reports\\" + fileName;
	        if(extentReports == null)
	        	extentReports = ExtentReportManager.createInstance(fullReportPath, "Test API Automation Report", "Test ExecutionReport");
	        
	    }

	    public void onFinish(ITestContext context) {
	        if (extentReports != null)
	            extentReports.flush();
	    }

	    public void onTestStart(ITestResult result) {

		testDescription = result.getMethod().getDescription(); // to get description of method

		System.out.println(testDescription);
		testMethodName = result.getName();
		groupName = result.getMethod().getGroups()[0];

		// getting running class Name which is present in testng.xml and splitting it
		String Str = result.getMethod().getRealClass().getName();
		String[] arrOfStr = Str.split("\\.");
		parentNode = arrOfStr[arrOfStr.length - 1];

		if (!parentNode.equals(className)) {
			className = parentNode;
			parent = extentReports.createTest(parentNode);

			if (testDescription != null) {

				extentTest = parent.createNode(testDescription);
				extentTest.info("'" + testMethodName + "'" + " test case started");
			} else {
				extentTest = parent.createNode(testMethodName);
				extentTest.info("'" + testMethodName + "'" + " test case started");
			}
		} else {
			if (testDescription != null) {
				extentTest = parent.createNode(testDescription);
				extentTest.info(result.getName() + " test case started");
			} else
				extentTest = parent.createNode(testMethodName);

		}
	}

	    public void onTestFailure(ITestResult result) {
	    	extentTest.assignCategory(groupName);
	        ExtentReportManager.logFailureDetails(result.getThrowable().getMessage());
	        String stackTrace = Arrays.toString(result.getThrowable().getStackTrace());
	        stackTrace = stackTrace.replaceAll(",", "<br>");
	        String formmatedTrace = "<details>\n" +
	                "    <summary>Click Here To See Exception Logs</summary>\n" +
	                "    " + stackTrace + "\n" +
	                "</details>\n";
	        ExtentReportManager.logExceptionDetails(formmatedTrace);
	    }

		public void onTestSuccess(ITestResult result) {
			extentTest.assignCategory(groupName);
			// TODO Auto-generated method stub
			
		}

		public void onTestSkipped(ITestResult result) {
			extentTest.assignCategory(groupName);
			// TODO Auto-generated method stub

			ExtentReportManager.logSkipDetails(result.getThrowable().getMessage());
			String stackTrace = Arrays.toString(result.getThrowable().getStackTrace());
			  stackTrace = stackTrace.replaceAll(",", "<br>");
	        String formmatedTrace = "<details>\n" +
	                "    <summary>Click Here To See Exception Logs</summary>\n" +
	                "    " + stackTrace + "\n" +
	                "</details>\n";
	        ExtentReportManager.logSkipDetails(formmatedTrace);;
		}

		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			// TODO Auto-generated method stub
			
		}

}
