package com.rdp.api.testdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rdp.api.pojo.Filter;
import com.rdp.api.pojo.delagateActivity.*;
import com.rdp.api.utils.PropertyUtils;
import com.rdp.api.utils.TestUtils;

public class DelagateActivityTestDataBuild {

	String user = PropertyUtils.getInstance().getValue("User");
	String userId = PropertyUtils.getInstance().getValue("UserId");
	String userName = PropertyUtils.getInstance().getValue("UserName"); //full name of User
	
	   public com.rdp.api.pojo.delagateActivity.List getListPayloadWithoutFilter() {
	    	com.rdp.api.pojo.delagateActivity.List listPayload = new com.rdp.api.pojo.delagateActivity.List();
	    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "DelagateActivity-List");
	    	listPayload.setSkip(Integer.parseInt(testData.get(0).get("Skip")))
	    			   .setTake(Integer.parseInt(testData.get(0).get("Take")))
	    			   .setUserName(user)
	    			   .setFilter(null);
	    	
	    	return listPayload; 	   	
	    }
	    
	    public  com.rdp.api.pojo.delagateActivity.List getListPayloadWithFilter(String value) {
	    	com.rdp.api.pojo.delagateActivity.List listPayload = new com.rdp.api.pojo.delagateActivity.List();
	    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "DelagateActivity-List");
	    	
	    	List<Filter> filterList = new ArrayList<Filter>();
	    	Filter filter1 = new Filter();
	    	filter1.setColumnName(testData.get(0).get("ColumnName1"))
	    		  .setOperator(testData.get(0).get("Operator"))
	    		  .setValue(testData.get(0).get(value))
	    		  .setLogicalOperator(testData.get(0).get("LogicalOperator1"));

	       	
	    	Filter filter2 = new Filter();
	    	filter2.setColumnName(testData.get(0).get("ColumnName2"))
	    		  .setOperator(testData.get(0).get("Operator"))
	    		  .setValue(user)
	    		  .setLogicalOperator(testData.get(0).get("LogicalOperator2"));

	    	filterList.add(filter1);
	      	filterList.add(filter2);
	    	
	      	listPayload.setSkip(Integer.parseInt(testData.get(0).get("Skip")))
	    				.setTake(Integer.parseInt(testData.get(0).get("Take")))
	    				.setUserName(user)
	    				.setFilter(filterList);
	    	
	    	return listPayload; 	   	
	    }
	    
	    public DelagateActivityNew getNewPayload(int processId, String accountName) {
	    	DelagateActivityNew newPayload = new DelagateActivityNew();
	    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "DelagateActivity-New");
	    	
	    	newPayload.setAccountName(accountName)
	    			  .setParentTask(testData.get(0).get("ParentTask"))
	    			  .setTask(testData.get(0).get("Task"))
	    			  .setAnalystName(user)
	    			  .setProcessId(processId)
	    			  .setApplicationUser(user)
	    			  .setApplicationDate(TestUtils.getInstance().getCurrentDate());
	    	
	    	return newPayload;
	    }
	    
	    public DelagateActivityNew getNewPayloadWithInvalidParentTask(int processId, String accountName) {
	    	DelagateActivityNew newPayload = new DelagateActivityNew();
	    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "DelagateActivity-New");
	    	
	    	newPayload.setAccountName(accountName)
	    			  .setParentTask(null)
	    			  .setTask(testData.get(0).get("Task"))
	    			  .setAnalystName(user)
	    			  .setProcessId(processId)
	    			  .setApplicationUser(user)
	    			  .setApplicationDate(TestUtils.getInstance().getCurrentDate());
	    	
	    	return newPayload;
	    }
	    
	    public DelagateActivityNew getNewPayloadWithInvalidAnalystName(int processId, String accountName) {
	    	DelagateActivityNew newPayload = new DelagateActivityNew();
	    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "DelagateActivity-New");
	    	
	    	newPayload.setAccountName(accountName)
	    			  .setParentTask(testData.get(0).get("ParentTask"))
	    			  .setTask(testData.get(0).get("Task"))
	    			  .setAnalystName(null)
	    			  .setProcessId(processId)
	    			  .setApplicationUser(user)
	    			  .setApplicationDate(TestUtils.getInstance().getUtcFormatCurrentDateTime());
	    	
	    	return newPayload;
	    }
	    
	    public SubTaskAction getSubTaskActionPayload(int processId) {
	    	SubTaskAction subTaskActionPayload = new SubTaskAction();
	    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "DelagateActivity-New");
	    	subTaskActionPayload.setProcessId(processId)
	    						.setTaskCode(testData.get(0).get("TaskCode"))
	    						.setTask(testData.get(0).get("Task"))
	    						.setTaskType(testData.get(0).get("TaskType"))
	    						.setApplicationUser(user)
	    						.setApplicationDate(TestUtils.getInstance().getUtcFormatCurrentDateTime());
	    	
	    	return subTaskActionPayload;
	    						
	    }

}
