package com.rdp.api.testdata;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rdp.api.pojo.queryManagement.*;
import com.rdp.api.utils.PropertyUtils;
import com.rdp.api.utils.TestUtils;

public class QueryManagementTestData {

	String user = PropertyUtils.getInstance().getValue("User");
	String userName = PropertyUtils.getInstance().getValue("UserName");


	public GetQueryDescription getQueryDescriptionPayload() {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "QueryManagement");
		GetQueryDescription getQueryDescriptionPayload = new GetQueryDescription();
		Config config = new Config();
		String userMail = user;
		config.setUserName(userMail)
			  .setSkip(Integer.parseInt(testData.get(0).get("Skip")))
			  .setTake(Integer.parseInt(testData.get(0).get("Take")))
			  .setOrderBy(testData.get(0).get("OrderBy"))
			  .setFilter(null);
		getQueryDescriptionPayload.setConfig(config)
								  .setLoginName(userMail);
		return getQueryDescriptionPayload;
	}
	
	public GetQueryDescription getQueryDescriptionPayload(int processId) {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "QueryManagement");
		GetQueryDescription getQueryDescriptionPayload = new GetQueryDescription();
		Config config = new Config();
		String userMail = user ;
		config.setUserName(userMail)
			  .setSkip(Integer.parseInt(testData.get(0).get("Skip")))
			  .setTake(Integer.parseInt(testData.get(0).get("Take")))
			  .setOrderBy(testData.get(0).get("OrderBy"))
			  .setFilter(null);
		getQueryDescriptionPayload.setConfig(config)
								  .setProcessId(processId)
								  .setLoginName(userMail);
		return getQueryDescriptionPayload;
	}
	
	public RaiseQuery getRaiseQueryPayload(int processId, String accountNo, int index) {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "RaiseQuery");
		String userMail = user + "@xceedance.com";
		List<String> mailToList = new ArrayList<String>();
		List<String> mailCCList = new ArrayList<String>();
		RaiseQuery raiseQueryPayload = new RaiseQuery();
		QueryDetails queryDetails = new QueryDetails();
		Query query = new Query();
		
		mailToList.add(testData.get(index).get("MailTo"));
		mailCCList.add(testData.get(index).get("MailCC"));
		queryDetails.setMailSubject(testData.get(index).get("MailSubject"))
					.setMailBody(TestUtils.getInstance().encodedToBase64(testData.get(index).get("MailBody")))
					.setHasAttachment(Boolean.parseBoolean(testData.get(index).get("HasAttachement")))
					.setMailFrom(userMail)
					.setMailType(testData.get(index).get("MailType"))
					.setMailStatus(testData.get(index).get("MailStatus"))
					.setClassificationType(testData.get(index).get("ClassificationType"))
					.setUserName(userName)
					.setMailToList(mailToList)
					.setMailCCList(mailCCList)
					.setApplicationUser(userMail);
		
		query.setClassificationId(Integer.parseInt(testData.get(index).get("ClassificationId")))
			 .setClassification(testData.get(index).get("ClassificationType"))
			 .setProcessId(processId)
			 .setIsClosed(Boolean.parseBoolean(testData.get(index).get("IsClosed")))
			 .setAccountNo(accountNo);
		
		 raiseQueryPayload.setQueryDetails(queryDetails)
		 				  .setQuery(query)
		 				  .setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime());
		 
		 return  raiseQueryPayload;
	}
	
	public CloseQuery getCloseQueryPayload(int queryId) {
		String loginName = user + "@xceedance.com";
		CloseQuery closeQueryPayload = new CloseQuery();
		
		closeQueryPayload.setQueryId(queryId)
						 .setLoginName(loginName)
						 .setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime());
		
		return closeQueryPayload;
		
		
		
	}
}
