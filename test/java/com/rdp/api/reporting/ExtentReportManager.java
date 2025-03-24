package com.rdp.api.reporting;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class ExtentReportManager {

    public static ExtentReports extentReports;

    public static ExtentReports createInstance(String fileName, String reportName, String documentTitle) {
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(fileName);
        extentSparkReporter.config().setReportName(reportName);
        extentSparkReporter.config().setDocumentTitle(documentTitle);
        extentSparkReporter.config().setTheme(Theme.STANDARD);
        extentSparkReporter.config().setEncoding("utf-8");
        extentSparkReporter.config().setTimelineEnabled(false);
        
        extentSparkReporter.viewConfigurer().viewOrder().as(new ViewName[]{ViewName.DASHBOARD, ViewName.TEST, ViewName.CATEGORY}).apply();
//        extentSparkReporter.config().setJs("document.getElementsByClassName('col-md-4')[0].style.display='none'");
//        extentSparkReporter.config().setJs("document.getElementsByClassName('col-md-4')[1].style.display='none'");
//        extentSparkReporter.config().setJs("document.getElementsByClassName('col-md-4')[2].style.display='none'");
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);
        return extentReports;
    }

    public static String getReportNameWithTimeStamp() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedTime = dateTimeFormatter.format(localDateTime);
        String reportName = "TestReport" + formattedTime + ".html";
        return reportName;
    }

    public static void logPassDetails(String log) {
        Listener.extentTest.pass(MarkupHelper.createLabel(log, ExtentColor.GREEN));
    }
    public static void logFailureDetails(String log) {
        Listener.extentTest.fail(MarkupHelper.createLabel(log, ExtentColor.RED));
    }
    public static void logSkipDetails(String log) {
        Listener.extentTest.skip(MarkupHelper.createLabel(log, ExtentColor.ORANGE));
    }
    public static void logExceptionDetails(String log) {
        Listener.extentTest.fail(log);
        
    }
    public static void logInfoDetails(String log) {
//        Listener.extentTest.pass(MarkupHelper.createLabel(log, ExtentColor.GREY));
        Listener.extentTest.info(MarkupHelper.createLabel(log, ExtentColor.GREY));
        
    }
    public static void logInfoDetailsInOrange(String log) {
        Listener.extentTest.info(MarkupHelper.createLabel(log, ExtentColor.ORANGE));
    }
    public static void logWarningDetails(String log) {
        Listener.extentTest.warning(MarkupHelper.createLabel(log, ExtentColor.YELLOW));
    }
    public static void logJson(String json) {
//		if (json.length() > 20) {
//			String[][] data = new String[1][1];
//			data[0][0] = json;
//			Listener.extentTest.get().info(MarkupHelper.createTable(data));
////			Listener.extentTest.get().info(MarkupHelper.createLabel(json, ExtentColor.GREY));
//		}
//		else
			Listener.extentTest.info(MarkupHelper.createCodeBlock(json, CodeLanguage.JSON));
    }
    public static void logJson(Object obj) {
    	
		ObjectMapper objectMapper = new ObjectMapper();
		String json = "";
		try {
			json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
        Listener.extentTest.info(MarkupHelper.createCodeBlock(json, CodeLanguage.JSON));
    }
    
    public static void logJsonAsString(String json) {
    	Listener.extentTest.info(MarkupHelper.createCodeBlock(json, CodeLanguage.JSON));
    }
//    public static void logHeaders(List<Header> headersList) {
//
//        String[][] arrayHeaders = headersList.stream().map(header -> new String[] {header.getName(), header.getValue()})
//                        .toArray(String[][] :: new);
//        Listener.extentTest.get().info(MarkupHelper.createTable(arrayHeaders));
//    }
}
