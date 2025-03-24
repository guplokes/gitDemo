package com.rdp.api.testdata;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.JsonStringEncoder;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rdp.api.pojo.Filter;
import com.rdp.api.pojo.job.AdditionalEvaluationSave;
import com.rdp.api.pojo.job.AssignProcessToUser;
import com.rdp.api.pojo.job.CancelJob;
import com.rdp.api.pojo.job.CreateJob;
import com.rdp.api.pojo.job.DocumentType;
import com.rdp.api.pojo.job.FinPolicyOptionlevel;
import com.rdp.api.pojo.job.FinPolicyPerilLevelCoding;
import com.rdp.api.pojo.job.GetAllProcess;
import com.rdp.api.pojo.job.GetJobProcess;
import com.rdp.api.pojo.job.JobOtherDetail;
import com.rdp.api.pojo.job.JobProcessAssignment;
import com.rdp.api.pojo.job.LocationGroupByProcess;
import com.rdp.api.pojo.job.PolicyBlanket;
import com.rdp.api.pojo.job.ProcessOnHold;
import com.rdp.api.pojo.job.SaveJobDefaultValue;
import com.rdp.api.pojo.job.SaveMovedAccountInfo;
import com.rdp.api.pojo.job.SavePendingJob;
import com.rdp.api.pojo.job.UpdateComments;
import com.rdp.api.pojo.job.UpdateJobAndProcess;
import com.rdp.api.pojo.job.UpdateProposedDate;
import com.rdp.api.reporting.ExtentReportManager;
import com.rdp.api.utils.*;

public class JobTestDataBuild {

	ObjectMapper objectMapper = new ObjectMapper();
	String user = PropertyUtils.getInstance().getValue("User");
	String userId = PropertyUtils.getInstance().getValue("UserId");
	String userName = PropertyUtils.getInstance().getValue("UserName"); //full name of User
	
	public CreateJob createJob() {
		
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "CreateJob");
		CreateJob createJob = new CreateJob();
		
		  createJob.setVersion(Integer.parseInt(testData.get(0).get("Version"))); 
		  createJob.setPriority(testData.get(0).get("Priority")); 
//		  createJob.setUserId(user); 
		  createJob.setUserId(testData.get(0).get("UserId")); 
		  createJob.setBusinessType(testData.get(0).get("BusinessType")); 
		  createJob.setBusinessTypeId(Integer.parseInt(testData.get(0).get("BusinessTypeId"))); 
		  createJob.setLobId(Integer.parseInt(testData.get(0).get("LobId"))); 
		  createJob.setLob(testData.get(0).get("Lob")); 
		  createJob.setCurrencyId(Integer.parseInt(testData.get(0).get("CurrencyId")));
		   createJob.setCurrency(testData.get(0).get("Currency"));
		  createJob.setPlatform(testData.get(0).get("Platform")); 
		  createJob.setAccountName(testData.get(0).get("AccountName")); 
		  createJob.setAccountNo(testData.get(0).get("AccountNo")); 
		  createJob.setNoOfLocation(testData.get(0).get("NoOfLocation")); 
		  createJob.setReinsuredName(testData.get(0).get("ReinsuredName")); 
		  createJob.setTiv(Integer.parseInt(testData.get(0).get("TIV"))); 	
		  createJob.setEffectiveDate(TestUtils.getInstance().getCurrentDate()); 
		  createJob.setExpirationDate(TestUtils.getInstance().getDateAfterAddingDays(365) + "T00:00:00.000Z");
		  createJob.setAddRenewalDate(TestUtils.getInstance().getCurrentDate()); 
		  createJob.setProjectTerm(Double.parseDouble(testData.get(0).get("ProjectTerm"))); 
		  createJob.setUnderwriterId(Integer.parseInt(testData.get(0).get("UnderwriterId"))); 
		  createJob.setUnderwriterName(testData.get(0).get("UnderwriterName")); 
		  createJob.setBranchId(Integer.parseInt(testData.get(0).get("BranchId")));
		  createJob.setBranchName(testData.get(0).get("BranchName")); 
		  createJob.setDueDate(TestUtils.getInstance().getDateAfterAddingDays(4)); 
		  createJob.setRequestTypeId(Integer.parseInt(testData.get(0).get("RequestTypeId")));
		  createJob.setRequestType(testData.get(0).get("RequestType")); 
		  createJob.setAddRegionPeril(testData.get(0).get("AddRegionPeril")); 
//		  createJob.setAddQuatationDueDate(null); 
		  createJob.setAddTargetLines(testData.get(0).get("AddTargetLines")); 
		  createJob.setAddAdditinalOtherInfo(testData.get(0).get("AddAdditinalOtherInfo")); 
		  createJob.setAddAdditionalFilePath(testData.get(0).get( "AddAdditionalFilePath")); 
		  
		  createJob.setAdditionalEvaluation(Collections.emptyList());
		  
		  createJob.setIsNoTouch(testData.get(0).get("IsNoTouch")); 
		  createJob.setSOVFilePath(testData.get(0).get("SOVFilePath"));
		  createJob.setHighHazardEQ(testData.get(0).get("HighHazardEQ")); 
		  createJob.setHighHazardEQComment(testData.get(0).get("HighHazardEQComment"));
		  createJob.setHighHazardWS(testData.get(0).get("HighHazardWS")); 
		  createJob.setHighHazardWSComment(testData.get(0).get("HighHazardWSComment"));
		   createJob.setBipoi(testData.get(0).get("BIPOI")); 
		  createJob.setSOVBIValuesBasedOn(testData.get(0).get("SOVBIValuesBasedOn"));
		  createJob.setPredominantOcc(testData.get(0).get("PredominantOcc")); 
		  
		  createJob.setLocationGroupByProcess(this.getLocationGroupByProcess(testData));
		  
		  createJob.setPerils(testData.get(0).get("Perils")); 
		  createJob.setPerilNames(testData.get(0).get("PerilNames")); 
		  createJob.setAccountType(testData.get(0).get("AccountType")); 
		  createJob.setAddIsStockThroughput(testData.get(0).get("AddIsStockThroughput"));
		  
//		  createJob.setDocumentTypes(this.getDocumentTypes(testData));
		  createJob.setDocumentTypes(Collections.EMPTY_LIST);
		  
		   createJob.setIsSurveyReport(testData.get(0).get("IsSurveyReport")); 
		  createJob.setSelfInsuredRetention(Integer.parseInt(testData.get(0).get("SelfInsuredRetention"))); 
		  createJob.setAppUserId(Integer.parseInt(testData.get(0).get("AppUserId")));
		  createJob.setAppUserEmail(testData.get(0).get("AppUserEmail")); 
		  
		  createJob.setFinPolicyPerilLevelCoding(this.getFinPolicyPerilLevelCoding());
		  createJob.setFinPolicyOptionlevels(this.getFinPolicyOptionlevel());
		  createJob.setPolicyBlanket(this.getPolicyBlanket());
		  createJob.setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime());
		  	     
	      return createJob;
	}
	
	
public CreateJob getCreateJobPayloadWithDifferentValues(int index) {
		
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "CreateJob");
		CreateJob createJob = new CreateJob();
		
		  createJob.setVersion(Integer.parseInt(testData.get(index).get("Version"))); 
		  createJob.setPriority(testData.get(index).get("Priority")); 
		  createJob.setUserId(user); 
//		  createJob.setUserId(testData.get(index).get("UserId")); 
		  createJob.setBusinessType(testData.get(index).get("BusinessType")); 
		  createJob.setBusinessTypeId(Integer.parseInt(testData.get(index).get("BusinessTypeId"))); 
		  createJob.setLobId(Integer.parseInt(testData.get(index).get("LobId"))); 
		  createJob.setLob(testData.get(index).get("Lob")); 
		  createJob.setCurrencyId(Integer.parseInt(testData.get(index).get("CurrencyId")));
		   createJob.setCurrency(testData.get(index).get("Currency"));
		  createJob.setPlatform(testData.get(index).get("Platform")); 
		  if(testData.get(index).get("AccountName").length() > 0)
			  createJob.setAccountName(testData.get(index).get("AccountName") + TestUtils.getInstance().getCurrentDate());
		  else
			  createJob.setAccountName(testData.get(index).get("AccountName"));
		  createJob.setAccountNo(testData.get(index).get("AccountNo") + TestUtils.getInstance().getCurrentDate()); 
		  createJob.setNoOfLocation(testData.get(index).get("NoOfLocation")); 
		  createJob.setReinsuredName(testData.get(index).get("ReinsuredName")); 
		  createJob.setTiv(Integer.parseInt(testData.get(index).get("TIV"))); 	
		  createJob.setEffectiveDate(TestUtils.getInstance().getCurrentDate()); 
		  createJob.setExpirationDate(TestUtils.getInstance().getDateAfterAddingDays(365) + "T00:00:00.000Z");
		  createJob.setAddRenewalDate(TestUtils.getInstance().getCurrentDate()); 
		  createJob.setProjectTerm(Double.parseDouble(testData.get(index).get("ProjectTerm"))); 
		  createJob.setUnderwriterId(Integer.parseInt(testData.get(index).get("UnderwriterId"))); 
		  createJob.setUnderwriterName(testData.get(index).get("UnderwriterName")); 
		  createJob.setBranchId(Integer.parseInt(testData.get(index).get("BranchId")));
		  createJob.setBranchName(testData.get(index).get("BranchName")); 
		  if(testData.get(index).get("DueDate").equals("Yes"))
			  createJob.setDueDate(TestUtils.getInstance().getCurrentDate());
		  else
			  createJob.setDueDate(TestUtils.getInstance().getDateAfterAddingDays(4)); 
		  createJob.setRequestTypeId(Integer.parseInt(testData.get(index).get("RequestTypeId")));
		  createJob.setRequestType(testData.get(index).get("RequestType")); 
		  createJob.setAddRegionPeril(testData.get(index).get("AddRegionPeril")); 
//		  createJob.setAddQuatationDueDate(null); 
		  createJob.setAddTargetLines(testData.get(index).get("AddTargetLines")); 
		  createJob.setAddAdditinalOtherInfo(testData.get(index).get("AddAdditinalOtherInfo")); 
		  createJob.setAddAdditionalFilePath(testData.get(index).get( "AddAdditionalFilePath")); 
		  
		  createJob.setAdditionalEvaluation(Collections.emptyList());
		  
		  createJob.setIsNoTouch(testData.get(index).get("IsNoTouch")); 
		  createJob.setSOVFilePath(testData.get(index).get("SOVFilePath"));
		  createJob.setHighHazardEQ(testData.get(index).get("HighHazardEQ")); 
		  createJob.setHighHazardEQComment(testData.get(index).get("HighHazardEQComment"));
		  createJob.setHighHazardWS(testData.get(index).get("HighHazardWS")); 
		  createJob.setHighHazardWSComment(testData.get(index).get("HighHazardWSComment"));
		   createJob.setBipoi(testData.get(index).get("BIPOI")); 
		  createJob.setSOVBIValuesBasedOn(testData.get(index).get("SOVBIValuesBasedOn"));
		  createJob.setPredominantOcc(testData.get(index).get("PredominantOcc")); 
		  
//		  createJob.setLocationGroupByProcess(this.getLocationGroupByProcess(testData));
//		  createJob.setLocationGroupByProcess(null);
//		  createJob.setLocationGroupByProcess(Collections.EMPTY_LIST);
		  
		  createJob.setPerils(testData.get(index).get("Perils")); 
		  createJob.setPerilNames(testData.get(index).get("PerilNames")); 
		  createJob.setAccountType(testData.get(index).get("AccountType")); 
		  createJob.setAddIsStockThroughput(testData.get(index).get("AddIsStockThroughput"));
		  
//		  createJob.setDocumentTypes(this.getDocumentTypes(testData));
		  createJob.setDocumentTypes(Collections.EMPTY_LIST);
		  
		   createJob.setIsSurveyReport(testData.get(index).get("IsSurveyReport")); 
		  createJob.setSelfInsuredRetention(Integer.parseInt(testData.get(index).get("SelfInsuredRetention"))); 
		  createJob.setAppUserId(Integer.parseInt(userId));
		  createJob.setAppUserEmail(user + "@xceedance.com"); 
		  
//		  createJob.setFinPolicyPerilLevelCoding(this.getFinPolicyPerilLevelCoding());
		  createJob.setFinPolicyPerilLevelCoding(Collections.EMPTY_LIST);
		  createJob.setFinPolicyOptionlevels(this.getFinPolicyOptionlevel());
		  createJob.setPolicyBlanket(this.getPolicyBlanket());
		  createJob.setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime());
		  	     
	      return createJob;
	}
	public List<DocumentType> getDocumentTypes(List<Map<String,String>> testData) {
		  DocumentType docType = new DocumentType();
		  docType.setDocName(testData.get(0).get("DocName"))
		  		 .setDocPath(testData.get(0).get("DocPath"))
		  		 .setDocType(testData.get(0).get("DocType"))
		  		 .setDocTypeId(Integer.parseInt(testData.get(0).get("DocTypeId")));
		  List<DocumentType> docTypeList = new ArrayList<DocumentType>();
		  docTypeList.add(docType);
		  
		  return docTypeList;
		  
	}

	public List<LocationGroupByProcess> getLocationGroupByProcess(List<Map<String,String>> testData) {
		
		LocationGroupByProcess locGroup1 = new LocationGroupByProcess();
		locGroup1.setLocGroupName(testData.get(0).get("LocGroupName1"))
				.setRuleExpression(testData.get(0).get("RuleExpression"))
				.setIsMasterLocGroupId(Integer.parseInt(testData.get(0).get("IsMasterLocGroupId")));
		
		LocationGroupByProcess locGroup2 = new LocationGroupByProcess();
		locGroup2.setLocGroupName(testData.get(0).get("LocGroupName2"))
				.setRuleExpression(testData.get(0).get("RuleExpression"))
				.setIsMasterLocGroupId(Integer.parseInt(testData.get(0).get("IsMasterLocGroupId")));
		
		List<LocationGroupByProcess> locGroupList = new ArrayList<LocationGroupByProcess>();
		locGroupList.add(locGroup1);
		locGroupList.add(locGroup2);
		
		return locGroupList;
		
	}

    public List<FinPolicyPerilLevelCoding> getFinPolicyPerilLevelCoding() {
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "FinPolicyPerilLevelCoding"); 
    	FinPolicyPerilLevelCoding finPolicyPerilLevel1  = new FinPolicyPerilLevelCoding();
    	finPolicyPerilLevel1.setRowID(Integer.parseInt(testData.get(0).get("RowId1")))
    						.setOptionName(testData.get(0).get("OptionName"))
    						.setId(Integer.parseInt(testData.get(0).get("Id")))
    						.setPerilId(Integer.parseInt(testData.get(0).get("PerilId1")))
    						.setPeril(testData.get(0).get("Peril1"))
    						.setLocGrpName(testData.get(0).get("LocGrpName1"))
    						.setIsAction(Integer.parseInt(testData.get(0).get("IsAction")))
    						.setLimitCode(testData.get(0).get("LimitCode1"))
    						.setLimitBasis(testData.get(0).get("LimitBasis"))
    						.setLimitType(testData.get(0).get("LimitType"))
    						.setSublimit(testData.get(0).get("Sublimit1"))
    						.setSublimitPart(testData.get(0).get("SublimitPart1"))
    						.setSublimitAttachment(testData.get(0).get("SublimitAttachment"))
    						.setDeductible(testData.get(0).get("Deductible"))
    						.setDeductibleCode(testData.get(0).get("DeductibleCode1"))
    						.setDeductibleType(testData.get(0).get("DeductibleType"))
    						.setDeductibleBasis(testData.get(0).get("DeductibleBasis"))
    						.setMinDeductible(testData.get(0).get("MinDeductible"))
    						.setMaxDeductible(testData.get(0).get("MaxDeductible"))
    						.setConditionName(testData.get(0).get("ConditionName1"));
    	
    	FinPolicyPerilLevelCoding finPolicyPerilLevel2  = new FinPolicyPerilLevelCoding();
    	finPolicyPerilLevel2.setRowID(Integer.parseInt(testData.get(0).get("RowId2")))
    						.setOptionName(testData.get(0).get("OptionName"))
    						.setId(Integer.parseInt(testData.get(0).get("Id")))
    						.setPerilId(Integer.parseInt(testData.get(0).get("PerilId2")))
    						.setPeril(testData.get(0).get("Peril2"))
    						.setLocGrpName(testData.get(0).get("LocGrpName2"))
    						.setIsAction(Integer.parseInt(testData.get(0).get("IsAction")))
    						.setLimitCode(testData.get(0).get("LimitCode2"))
    						.setLimitBasis(testData.get(0).get("LimitBasis"))
    						.setLimitType(testData.get(0).get("LimitType"))
    						.setSublimit(testData.get(0).get("Sublimit2"))
    						.setSublimitPart(testData.get(0).get("SublimitPart2"))
    						.setSublimitAttachment(testData.get(0).get("SublimitAttachment"))
    						.setDeductible(testData.get(0).get("Deductible"))
    						.setDeductibleCode(testData.get(0).get("DeductibleCode2"))
    						.setDeductibleType(testData.get(0).get("DeductibleType"))
    						.setDeductibleBasis(testData.get(0).get("DeductibleBasis"))
    						.setMinDeductible(testData.get(0).get("MinDeductible"))
    						.setMaxDeductible(testData.get(0).get("MaxDeductible"))
    						.setConditionName(testData.get(0).get("ConditionName2"));
    	
		List<FinPolicyPerilLevelCoding> finPolicyPerilLevelList = new ArrayList<FinPolicyPerilLevelCoding>();
		finPolicyPerilLevelList.add(finPolicyPerilLevel1);
		finPolicyPerilLevelList.add(finPolicyPerilLevel2);
		
		return finPolicyPerilLevelList;
    						
    }

    public List<PolicyBlanket> getPolicyBlanket() {
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "PolicyBlanket"); 
    	PolicyBlanket policyBlanket1 = new PolicyBlanket();
    	policyBlanket1.setBlanketDeductible(testData.get(0).get("BlanketDeductible"))
    				  .setDeductibleBasis(testData.get(0).get("DeductibleBasis"))
    				  .setDeductibleCode(testData.get(0).get("DeductibleCode"))
    				  .setDeductibleType(testData.get(0).get("DeductibleType"))
    				  .setLimit(testData.get(0).get("Limit1"))
    				  .setLimitBasis(testData.get(0).get("LimitBasis"))
    				  .setLimitCode(testData.get(0).get("LimitCode"))
    				  .setLimitType(testData.get(0).get("LimitType"))
    				  .setMaximumDeductible(testData.get(0).get("MaximumDeductible"))
    				  .setMinimumDeductible(testData.get(0).get("MinimumDeductible"))
    				  .setOptionName(testData.get(0).get("OptionName"))
    				  .setPerilName(testData.get(0).get("PerilName1"))
    				  .setActionId(Integer.parseInt(testData.get(0).get("ActionId")))
    				  .setId(Integer.parseInt(testData.get(0).get("Id")));
    	
    	PolicyBlanket policyBlanket2 = new PolicyBlanket();
    	policyBlanket2.setBlanketDeductible(testData.get(0).get("BlanketDeductible"))
    				  .setDeductibleBasis(testData.get(0).get("DeductibleBasis"))
    				  .setDeductibleCode(testData.get(0).get("DeductibleCode"))
    				  .setDeductibleType(testData.get(0).get("DeductibleType"))
    				  .setLimit(testData.get(0).get("Limit2"))
    				  .setLimitBasis(testData.get(0).get("LimitBasis"))
    				  .setLimitCode(testData.get(0).get("LimitCode"))
    				  .setLimitType(testData.get(0).get("LimitType"))
    				  .setMaximumDeductible(testData.get(0).get("MaximumDeductible"))
    				  .setMinimumDeductible(testData.get(0).get("MinimumDeductible"))
    				  .setOptionName(testData.get(0).get("OptionName"))
    				  .setPerilName(testData.get(0).get("PerilName2"))
    				  .setActionId(Integer.parseInt(testData.get(0).get("ActionId")))
    				  .setId(Integer.parseInt(testData.get(0).get("Id")));
    	
		List<PolicyBlanket> policyBlanketList = new ArrayList<PolicyBlanket>();
		policyBlanketList .add(policyBlanket1);
		policyBlanketList .add(policyBlanket2);
		
		return policyBlanketList ;
    }
    
    public List<FinPolicyOptionlevel> getFinPolicyOptionlevel() {
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "FinPolicyOptionlevel"); 
    	
    	FinPolicyOptionlevel finPolicyOptionlevel = new FinPolicyOptionlevel();
    	finPolicyOptionlevel.setIsLayerDeleted(Boolean.parseBoolean(testData.get(0).get("IsLayerDeleted")));
    	finPolicyOptionlevel.setId(Integer.parseInt(testData.get(0).get("Id")));
    	finPolicyOptionlevel.setOptionName(testData.get(0).get("OptionName"));
    	finPolicyOptionlevel.setPerilId(Integer.parseInt(testData.get(0).get("PerilId")));
    	finPolicyOptionlevel.setPerilName(testData.get(0).get("PerilName"));
    	finPolicyOptionlevel.setCurrencyId(Integer.parseInt(testData.get(0).get("CurrencyId")));
    	finPolicyOptionlevel.setCurrency(testData.get(0).get("Currency"));
    	
    	finPolicyOptionlevel.setIsPrimary(Boolean.parseBoolean(testData.get(0).get("IsPrimary")));
    	
    	finPolicyOptionlevel.setLayerName(testData.get(0).get("LayerName"));
    	finPolicyOptionlevel.setTiv(Integer.parseInt(testData.get(0).get("TIV")));
    	finPolicyOptionlevel.setOrder(Integer.parseInt(testData.get(0).get("Order")));
    	finPolicyOptionlevel.setLimit(testData.get(0).get("Limit"));
    	finPolicyOptionlevel.setOccAggregateLimit(testData.get(0).get("OccAggregateLimit"));
    	finPolicyOptionlevel.setRetention(Integer.parseInt(testData.get(0).get("Retention")));
    	finPolicyOptionlevel.setComments(testData.get(0).get("Comments"));
    	finPolicyOptionlevel.setNoOfDaysForDSUBI(Integer.parseInt(testData.get(0).get("NoOfDaysForDSUBI")));
    	finPolicyOptionlevel.setPerOccuranceLocation(Integer.parseInt(testData.get(0).get("PerOccuranceLocation")));
    	finPolicyOptionlevel.setRetentionExcessOf(testData.get(0).get("RetentionExcessOf"));
    	
    	finPolicyOptionlevel.setIsAction(Integer.parseInt(testData.get(0).get("IsAction")));
    	finPolicyOptionlevel.setLimitBasis(testData.get(0).get("LimitBasis"));
    	finPolicyOptionlevel.setBlanketDeductible(testData.get(0).get("BlanketDeductible"));
    	finPolicyOptionlevel.setIsVisible(Boolean.parseBoolean(testData.get(0).get("IsVisible")));
    	
		List<FinPolicyOptionlevel> finPolicyOptionlevelList = new ArrayList<FinPolicyOptionlevel>();
		finPolicyOptionlevelList.add(finPolicyOptionlevel);
		
		return finPolicyOptionlevelList;
    	
    	
    }
    
    public SavePendingJob SavePendingJobPayload() {
    	CreateJob payload = this.createJob();
		String json = "";
		try {
			json = objectMapper.writeValueAsString(payload);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JsonStringEncoder encoder = JsonStringEncoder.getInstance();
		String jsonData = new String(encoder.quoteAsString(json));

		
		SavePendingJob savePendingJob = new SavePendingJob();
		savePendingJob.setPendingJobID(0)
					  .setJsonData(jsonData)
					  .setUserID(Integer.parseInt(PropertyUtils.getInstance().getValue("UserId")))
					  .setCreatedOn(TestUtils.getInstance().getUtcFormatCurrentDateTime())
					  .setCreatedTime(TestUtils.getInstance().getUtcFormatCurrentDateTime());
		
	    return savePendingJob;		
		
    }
    
    public SavePendingJob GetPendingJobPayload(int pendingJobId) {
    	SavePendingJob savePendingJob = new SavePendingJob();
		savePendingJob.setPendingJobID(pendingJobId)
//					  .setJsonData(null)
					  .setUserID(Integer.parseInt(PropertyUtils.getInstance().getValue("UserId")))
					  .setCreatedOn(TestUtils.getInstance().getUtcFormatCurrentDateTime())
					  .setCreatedTime(TestUtils.getInstance().getUtcFormatCurrentDateTime());
		
	    return savePendingJob;	
    }

    public SavePendingJob updatePendingJob(int pendingJobId) {
    	CreateJob payload = this.createJob();
    	payload.setAccountName("UpdatePendingJobTest");
		
		String json = "";
		try {
			json = objectMapper.writeValueAsString(payload);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JsonStringEncoder encoder = JsonStringEncoder.getInstance();
		String jsonData = new String(encoder.quoteAsString(json));
		

		
		SavePendingJob savePendingJob = new SavePendingJob();
		savePendingJob.setPendingJobID(pendingJobId)
					  .setJsonData(jsonData)
					  .setUserID(Integer.parseInt(PropertyUtils.getInstance().getValue("UserId")))
					  .setCreatedOn(TestUtils.getInstance().getUtcFormatCurrentDateTime())
					  .setCreatedTime(TestUtils.getInstance().getUtcFormatCurrentDateTime());
		
	    return savePendingJob;		
    }

    public GetJobProcess getJobProcessPayloadWithoutFilter() {
    	GetJobProcess getJobProcessPayload = new GetJobProcess();
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "GetJobProcess");
    	getJobProcessPayload.setProcessingStatus(testData.get(0).get("processingStatus"))
    						.setSkip(Integer.parseInt(testData.get(0).get("Skip")))
    						.setTake(Integer.parseInt(testData.get(0).get("Take")))
    						.setUserName(PropertyUtils.getInstance().getValue("User"));
    	
    	return getJobProcessPayload; 	   	
    }
    
    public GetJobProcess getJobProcessPayloadWithFilter() {
    	GetJobProcess getJobProcessPayload = new GetJobProcess();
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "GetJobProcess");
    	Filter filter = new Filter();
    	filter.setColumnName(testData.get(0).get("ColumnName"))
    		  .setOperator(testData.get(0).get("Operator"))
    		  .setValue(testData.get(0).get("Value"))
    		  .setLogicalOperator(testData.get(0).get("LogicalOperator"));
    	List<Filter> filterList = new ArrayList<Filter>();
    	filterList.add(filter);
    	
    	
    	getJobProcessPayload.setProcessingStatus(testData.get(0).get("processingStatus"))
    						.setSkip(Integer.parseInt(testData.get(0).get("Skip")))
    						.setTake(Integer.parseInt(testData.get(0).get("Take")))
    						.setFilter(filterList)
    						.setUserName(PropertyUtils.getInstance().getValue("User"));
    	
    	return getJobProcessPayload; 	   	
    }

    public AssignProcessToUser getAssignProcessToUserPayload(int processId) {
    	AssignProcessToUser assignProcessToUser = new AssignProcessToUser();
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "AssignProcessToUser");
//    	String userName = PropertyUtils.getInstance().getValue("User");
    	JobProcessAssignment jobProcessAssignment;
    	List<JobProcessAssignment> jobProcessAssignmentList = new ArrayList<JobProcessAssignment>();
    	
    	for(int i = 1; i <= 6; i++ ) {
    		jobProcessAssignment = new JobProcessAssignment();
    		jobProcessAssignment.setProcessId(processId)
    							.setUserName(userName)
    							.setTaskCode(testData.get(0).get("TaskCode" + i));
    		
    		jobProcessAssignmentList.add(jobProcessAssignment);						
    		}
    	
    	JobOtherDetail jobOtherDetail = new JobOtherDetail();
    	List<JobOtherDetail> jobOtherDetailList = new ArrayList<JobOtherDetail>();
    	jobOtherDetail.setProcessId(processId);
    	jobOtherDetailList.add(jobOtherDetail);
    	
    	
    	
    	assignProcessToUser.setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
    						.setUserName(userName)
    						.setComplexity(testData.get(0).get("Complexity"))
    						.setJobOtherDetails(jobOtherDetailList)
    						.setJobProcessAssignmentList(jobProcessAssignmentList);
    						
    	return assignProcessToUser;					
    }

    public GetAllProcess getAllProcessPayloadWithoutFilter() {
    	GetAllProcess getAllProcessPayload = new GetAllProcess();
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "GetAllProcess");
    	getAllProcessPayload.setFilterColumn(testData.get(0).get("FilterColumn"))
    						.setSkip(Integer.parseInt(testData.get(0).get("Skip")))
    						.setTake(Integer.parseInt(testData.get(0).get("Take")))
    						.setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
    						.setUserName(user);
    	
    	return getAllProcessPayload; 	   	
    }
    
    public GetAllProcess getAllProcessPayloadWithFilter(String valueKey) {
    	GetAllProcess getAllProcessPayload = new GetAllProcess();
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "GetAllProcess");
    	
    	List<Filter> filterList = new ArrayList<Filter>();
    	Filter filter1 = new Filter();
    	filter1.setColumnName(testData.get(0).get("ColumnName1"))
    		  .setOperator(testData.get(0).get("Operator"))
    		  .setValue(user.split("\\.")[0])
    		  .setLogicalOperator(testData.get(0).get("LogicalOperator1"));

       	
    	Filter filter2 = new Filter();
    	filter2.setColumnName(testData.get(0).get("ColumnName2"))
    		  .setOperator(testData.get(0).get("Operator"))
    		  .setValue(testData.get(0).get(valueKey))
    		  .setLogicalOperator(testData.get(0).get("LogicalOperator2"));

    	filterList.add(filter1);
      	filterList.add(filter2);
    	
    	getAllProcessPayload.setFilterColumn(testData.get(0).get("FilterColumn"))
    						.setSkip(Integer.parseInt(testData.get(0).get("Skip")))
    						.setTake(Integer.parseInt(testData.get(0).get("Take")))
    						.setUserName(user)
    						.setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
    						.setFilter(filterList);
    	
    	return getAllProcessPayload; 	   	
    }

    public UpdateProposedDate getUpdateProposedDatePayload(int processId) {
    	
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "UpdateProposedDate");
    	UpdateProposedDate updateDatePayload = new UpdateProposedDate();
    	
    	updateDatePayload .setProcessId(processId)
    					  .setTiv(Long.parseLong(testData.get(0).get("TIV")))
    					  .setUnderwriterId(Integer.parseInt(testData.get(0).get("UnderwriterId")))
    					  .setUnderwriterName(testData.get(0).get("UnderwriterName"))
    					  .setNoOfLocation(testData.get(0).get("NoOfLocation"))
    					  .setProposedDate(TestUtils.getInstance().getDateAfterAddingDays(5));
    	
    	return updateDatePayload;
    }

    public SaveMovedAccountInfo getSaveMovedAccountInfoPayload(int processId, String accountName) {
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "UpdateProposedDate");
    	SaveMovedAccountInfo saveMovedAccountInfoPayload = new SaveMovedAccountInfo();
    	saveMovedAccountInfoPayload.setProcessId(processId)
    							   .setAccountName(accountName)
    							   .setTeamId(Integer.parseInt(testData.get(0).get("TeamId")))
    							   .setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime());
    	
    	return saveMovedAccountInfoPayload;
    }

    public UpdateComments getUpdateCommentsPayload(int processId) {
    	UpdateComments updateCommnetsPayload = new UpdateComments();
    	updateCommnetsPayload.setProcessId(processId)
    						.setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
    						.setAppUser(user)
    						.setComments(TestUtils.getInstance().encodedToBase64("Account for testing")); 
    	
    	return updateCommnetsPayload;
    }

    public ProcessOnHold getProcessOnHoldPayload(int processId) {
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "ProcessOnHold_Update");
    	ProcessOnHold processOnHoldPayload = new ProcessOnHold();
    	
    	processOnHoldPayload.setProcessId(processId)
    						.setTaskCode(testData.get(0).get("TaskCode"))
    						.setTask(testData.get(0).get("Task"))
    						.setTaskType(testData.get(0).get("TaskType"))
    						.setApplicationDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
    						.setApplicationUser(user);
    	return processOnHoldPayload;    	
    }

    public UpdateJobAndProcess getUpdateJobAndProcessPayload(int processId) {
    	UpdateJobAndProcess updateJobAndProcessPayload = new UpdateJobAndProcess();
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "ProcessOnHold_Update");
    	
    	updateJobAndProcessPayload.setProcessId(processId)
    							  .setUserId(Integer.parseInt(userId))
    							  .setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
    							  .setTaskStatus(testData.get(0).get("TaskStatus"))
    							  .setTaskCode("TaskCode");
    							 
    	
    	return updateJobAndProcessPayload;
    }
    
    public CancelJob getCancelJobPayload(int processId) {
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "CancelJob");
    	CancelJob cancelJobPayload = new CancelJob();
    	List<String> CcList = new ArrayList<String>();
    	CcList.add(testData.get(0).get("CcList"));
    	
    	List<String> ToList = new ArrayList<String>();
    	ToList.add(testData.get(0).get("ToList"));
    	cancelJobPayload.setBody(TestUtils.getInstance().encodedToBase64(testData.get(0).get("Body")))
    					.setCcList(CcList)
    					.setProcessId(processId)
    					.setSubject(testData.get(0).get("Subject"))
    					.setToList(ToList)
    					.setUnderwriterName(testData.get(0).get("UnderwriterName"))
    					.setUserName(user)
    					.setAccountName(testData.get(0).get("AccountName"))
    					.setUserFullName(userName)
    					.setComplexity(testData.get(0).get("Complexity"))
    					.setTATNotMetReason(testData.get(0).get("TATNotMetReason"))
    					.setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
    					.setAppUserEmail(user + "@xceedance.com")
    					.setUserId(Integer.parseInt(userId));
    					
    	return cancelJobPayload;				    					
    }

    public SaveJobDefaultValue getSaveJobDefaultValuePayload() {
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "SaveJobDefaultValue");
    	SaveJobDefaultValue saveJobDefaultValuePayload = new SaveJobDefaultValue();
    	saveJobDefaultValuePayload.setPerils(testData.get(0).get("Perils"))
    							  .setNoOfLocation(testData.get(0).get("NoOfLocation"))
    							  .setTiv(Integer.parseInt(testData.get(0).get("TIV")))
    							  .setPriority(testData.get(0).get("Priority"))
    							  .setRequestTypeId(Integer.parseInt(testData.get(0).get("RequestTypeId")))
    							  .setCurrencyCode(testData.get(0).get("CurrencyCode"))
    							  .setBusinessTypeId(Integer.parseInt(testData.get(0).get("BusinessTypeId")))
    							  .setLobId(Integer.parseInt(testData.get(0).get("LobId")))
    							  .setBusinessTypeOther(testData.get(0).get("BusinessTypeOther"))
    							  .setSOVFilePath(testData.get(0).get("SOVFilePath"))
    							  .setPlatform(testData.get(0).get("Platform"))
    							  .setUserId(Integer.parseInt(userId))
    							  .setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime());
    	
    	return saveJobDefaultValuePayload;    							  
    	
    }

    public AdditionalEvaluationSave getAdditionaEvaluationSavePayload(int processId, int additionalEvaluationId) {
    	AdditionalEvaluationSave addEvaluationSavePayload = new AdditionalEvaluationSave();
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "AddEvaluation");
    	addEvaluationSavePayload.setAdditionalEvaluationId(additionalEvaluationId)
    							.setProcessId(processId)
    							.setEvaluationStatus(testData.get(0).get("EvaluationStatus"))
    							.setProcessLeadStatus(user)
    							.setEngineerReviewStatus(testData.get(0).get("EngineerReviewStatus"))
    							.setEngineeringLead(user)
    							.setStormSurgeStatus(testData.get(0).get("StormSurgeStatus"))
    							.setFinalReview(user)
    							.setComments(TestUtils.getInstance().encodedToBase64(testData.get(0).get("Comments")))
    							.setAdditionalEvalDueDate(TestUtils.getInstance().getDateAfterAddingDays(5))
    							.setPriority(testData.get(0).get("Priority"))
    							.setPlatform(testData.get(0).get("Platform"))
    							.setApplicationUser(user)
    							.setApplicationDate(TestUtils.getInstance().getUtcFormatCurrentDateTime());
    	
    	return addEvaluationSavePayload;    	
    }
}
