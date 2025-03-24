package com.rdp.api.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.rdp.api.pojo.Filter;
import com.rdp.api.pojo.ResponseBody;
import com.rdp.api.pojo.job.GetAllProcess;
import com.rdp.api.pojo.taskDetail.ComplexityMetricsNew;
import com.rdp.api.pojo.taskDetail.OtherActivityNew;
import com.rdp.api.testdata.TaskDetailTestDataBuild;
import com.rdp.api.utils.APIResource;
import com.rdp.api.utils.Endpoints;
import com.rdp.api.utils.PropertyUtils;
import com.rdp.api.utils.TestUtils;

import static org.hamcrest.Matchers.*;
import static com.rdp.api.utils.SpecBuilder.getRequestSpec;
import static com.rdp.api.utils.SpecBuilder.getResponseSpec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

@Test(groups = { "CMR" })
public class TaskDetailTest {

	TaskDetailTestDataBuild testData = new TaskDetailTestDataBuild();
	int processId;
	
	@BeforeClass
	public void getProcessId() {
		GetAllProcess getAllProcessPayload = new GetAllProcess();
    	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "ComplexityMetrics-New");
    	
    	List<Filter> filterList = new ArrayList<Filter>();
    	Filter filter1 = new Filter();
    	filter1.setColumnName("AccountName")
    		  .setOperator("contains")
    		  .setValue(testData.get(0).get(""))
    		  .setLogicalOperator("and");
    	
    	Filter filter2 = new Filter();
    	filter2.setColumnName("CurrentUser")
    		  .setOperator("contains")
    		  .setValue(PropertyUtils.getInstance().getValue("UserName"))
    		  .setLogicalOperator("");

    	filterList.add(filter1);
      	filterList.add(filter2);
    	
    	getAllProcessPayload.setFilterColumn("")
    						.setSkip(0)
    						.setTake(5)
    						.setUserName(PropertyUtils.getInstance().getValue("User"))
    						.setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
    						.setFilter(filterList);
    	
    	Endpoints endpoint = Endpoints.valueOf("GetAllProcess");    	
		Response response = given().spec(getRequestSpec()).body(getAllProcessPayload).when().post(endpoint.getEndpoint()).then()
				.spec(getResponseSpec()).extract().response();
    	
//    	Response response = APIResource.post("GetAllProcess", getAllProcessPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		JsonPath js = new JsonPath(response.asString());
		processId = js.getInt("EntityData[0].ID");
    	
	}

	
	@Test(priority=1, description= "Verify GetOtherActivityType/Get API")
	public void verifyOtherActivityTypeApi() {
		Response response = APIResource.get("GetOtherActivityType");
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath  js = new JsonPath(response.asString());
		List<Map<String, Object>> listOfMaps = js.get("$");
		Map<String, Object> analystMap = listOfMaps.get(0);
		assertThat(analystMap, hasKey("Id"));
		assertThat(analystMap, hasKey("Value"));
		assertThat(analystMap, hasKey("Selectedvalue"));
	}
	
	@Test(priority=1, description= "Verify OtherActivity/New API when taskcategory is Break")
	public void verifyOtherActivityNewApiWithTaskCategoryBreak() {
		OtherActivityNew otherActivityNewPayload = testData.getOtherActivityNewPayload("Break");
		Response response = APIResource.post("OtherActivityNew", otherActivityNewPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		 ResponseBody responseBody = response.as(ResponseBody.class);
		 assertThat(responseBody.getMessageCode(), equalTo("OK"));
	}
	
	@Test(priority=1, description= "Verify OtherActivity/New API when taskcategory is Meeting")
	public void verifyOtherActivityNewApiWithTaskCategoryMeeting() {
		OtherActivityNew otherActivityNewPayload = testData.getOtherActivityNewPayload("Meeting");
		Response response = APIResource.post("OtherActivityNew", otherActivityNewPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		 ResponseBody responseBody = response.as(ResponseBody.class);
		 assertThat(responseBody.getMessageCode(), equalTo("OK"));
	}
	
	@Test(priority=1, description= "Verify OtherActivity/New API when taskcategory is Monthly Presentation - Client")
	public void verifyOtherActivityNewApiWithTaskCategoryMonthlyPresentationClient() {
		OtherActivityNew otherActivityNewPayload = testData.getOtherActivityNewPayload("Monthly Presentation - Client");
		Response response = APIResource.post("OtherActivityNew", otherActivityNewPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		 ResponseBody responseBody = response.as(ResponseBody.class);
		 assertThat(responseBody.getMessageCode(), equalTo("OK"));
	}
	
	@Test(priority=1, description= "Verify OtherActivity/New API when taskcategory is Monthly Presentation - Internal")
	public void verifyOtherActivityNewApiWithTaskCategoryMonthlyPresentationInternal() {
		OtherActivityNew otherActivityNewPayload = testData.getOtherActivityNewPayload("Monthly Presentation - Internal");
		Response response = APIResource.post("OtherActivityNew", otherActivityNewPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		 ResponseBody responseBody = response.as(ResponseBody.class);
		 assertThat(responseBody.getMessageCode(), equalTo("OK"));
	}
	
	@Test(priority=1, description= "Verify OtherActivity/New API when taskcategory is One on Ones")
	public void verifyOtherActivityNewApiWithTaskCategoryOneonOnes() {
		OtherActivityNew otherActivityNewPayload = testData.getOtherActivityNewPayload("One on Ones");
		Response response = APIResource.post("OtherActivityNew", otherActivityNewPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		
		 ResponseBody responseBody = response.as(ResponseBody.class);
		 assertThat(responseBody.getMessageCode(), equalTo("OK"));
	}
	
	@Test(priority=1, description= "Verify TaskDetail/View API")
	public void verifyTaskDetailViewApi() {
		Response response = APIResource.getWithQueryparameter("TaskDetailView", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	@Test(priority=1, description= "Verify ComplexityMetrics/New API")
	public void verifyComplexityMetricsNewApi() {
		Response responseView = APIResource.getWithQueryparameter("TaskDetailView", "processId", processId);
		assertThat(responseView.getStatusCode(), equalTo(200));
		
		JsonPath js = new JsonPath(responseView.asString()); 
		int id = js.getInt("Id[0]");
		String createdDate = js.getString("CreatedDate[0]");
		String modifiedDate = js.getString("ModifiedDate[0]");
		
		ComplexityMetricsNew complexityMetricsPayload = testData.getComplexityMetricsNewPayload(processId, id, createdDate, modifiedDate);
		Response responseComplexityMetrics = APIResource.post("ComplexityMetricsNew", complexityMetricsPayload);
		assertThat(responseComplexityMetrics.getStatusCode(), equalTo(200));
		
		 ResponseBody responseBody = responseComplexityMetrics.as(ResponseBody.class);
		 assertThat(responseBody.getMessageCode(), equalTo("OK"));
		 
	}
	
	@Test(priority=1, description= "Verify OtherActivity/Get API")
	public void OtherActivityGet() {
		
		int otherActivityId = 40;
		Response response = APIResource.getWithQueryparameter("OtherActivityGet", "otherActivityId", otherActivityId);
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath js = new JsonPath(response.asString());
		assertThat(js.getInt("OtherActId[0]"), equalTo(otherActivityId));
	}
	
}
