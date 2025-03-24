package com.rdp.api.testcases;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;

import org.testng.annotations.Test;

import com.rdp.api.pojo.ResponseBody;
import com.rdp.api.pojo.job.*;
import com.rdp.api.testdata.JobTestDataBuild;
import com.rdp.api.utils.APIResource;
import com.rdp.api.utils.TestUtils;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

@Test(groups = { "CMR" })
public class BulkUploadJobTest {

	JobTestDataBuild data = new JobTestDataBuild();
	
	@Test(priority = 2, description = "Verify GetJobDefaultValue Api")
	public void verifyGetJobDefaultValueApi() {
				
		Response response = APIResource.get("GetJobDefaultValue");
		assertThat(response.getStatusCode(), equalTo(200));
		
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetJobDefaultValue");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 2, description = "Verify SaveJobDefaultValue Api")
	public void verifySaveJobDefaultValueApi() {
			SaveJobDefaultValue saveJobDefaultValuePayload = data.getSaveJobDefaultValuePayload();
			Response response = APIResource.post("SaveJobDefaultValue", saveJobDefaultValuePayload);
			assertThat(response.statusCode(), equalTo(200));	
			ResponseBody responseBody = response.as(ResponseBody.class);
			assertThat(responseBody.getMessageCode(), equalTo("200"));	
			
	}
	
	@Test(priority = 2, description = "Verify Download Template Api")
	public void verifyDownloadTemplateApi() {
			
			Response response = APIResource.post("DownloadTemplate", "{}");
			assertThat(response.statusCode(), equalTo(200));	
			JsonPath js = new JsonPath(response.asString());
			String actualPath = js.getString("filePath");
			String expectedPath = "CATOne\\BulkAccounts\\BulkUploadTemplate.xlsx";
			assertThat(actualPath, equalTo(expectedPath));
			
	}
	
	@Test(priority = 2, description = "Verify CheckCapacityforPrimaryAccounts Api")
	public void verifyCheckCapacityforPrimaryAccountsApi() {
		String currentDate = TestUtils.getInstance().getUtcFormatCurrentDateTime();
		String inceptionDate = TestUtils.getInstance().getUtcFormatDateTimeAfterAddingDays(180);
		Response response = APIResource.getWithQueryparameter("CheckCapacityforPrimaryAccounts", "inceptionDate", inceptionDate, "currentDate", currentDate);
		assertThat(response.statusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("CheckCapacityforPrimaryAccounts");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
	
	@Test(priority = 2, description = "Verify GetAvailableDates Api")
	public void verifyGetAvailableDatesApi() {
		String currentDate = TestUtils.getInstance().getUtcFormatCurrentDateTime();
		String inceptionDate = TestUtils.getInstance().getUtcFormatDateTimeAfterAddingDays(180);
		String regionPeril = "All Earthquake";
		Response response = APIResource.getWithQueryparameter("GetAvailableDates", "inceptionDate", inceptionDate,"regionPeril",regionPeril,"currentDate", currentDate);
		assertThat(response.statusCode(), equalTo(200));
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("CheckCapacityforPrimaryAccounts");
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));
	}
}
