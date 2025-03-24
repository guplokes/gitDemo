package com.rdp.api.testcases;

import static com.rdp.api.utils.SpecBuilder.getRequestSpec;
import static com.rdp.api.utils.SpecBuilder.getResponseSpec;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rdp.api.pojo.Filter;
import com.rdp.api.pojo.job.GetAllProcess;
import com.rdp.api.testdata.TaskTestData;
import com.rdp.api.utils.APIResource;
import com.rdp.api.utils.Endpoints;
import com.rdp.api.utils.PropertyUtils;
import com.rdp.api.utils.TestUtils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

@Test(groups = { "CMR" })
public class TaskTest {
TaskTestData data = new TaskTestData();


public int getProcessId(String value) {
	int processId;
	GetAllProcess getAllProcessPayload = new GetAllProcess();
	List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("JobTestData", "GetAllProcess");
	String user = PropertyUtils.getInstance().getValue("User");
	
	List<Filter> filterList = new ArrayList<Filter>();
   	
	Filter filter = new Filter();
	filter.setColumnName("ProcessingStatus")
		  .setOperator("contains")
		  .setValue(value)
		  .setLogicalOperator("");

	filterList.add(filter);

	
	getAllProcessPayload.setFilterColumn(testData.get(0).get("FilterColumn"))
						.setSkip(Integer.parseInt(testData.get(0).get("Skip")))
						.setTake(Integer.parseInt(testData.get(0).get("Take")))
						.setUserName(user)
						.setAppDate(TestUtils.getInstance().getUtcFormatCurrentDateTime())
						.setFilter(filterList);
	
	Endpoints endpoint = Endpoints.valueOf("GetAllProcess");    	
	Response response = given().spec(getRequestSpec()).body(getAllProcessPayload).when().post(endpoint.getEndpoint()).then()
			.spec(getResponseSpec()).extract().response();
	

	assertThat(response.getStatusCode(), equalTo(200));
	JsonPath js = new JsonPath(response.asString());
	processId = js.getInt("EntityData[0].ID");
	return processId;
}
	@DataProvider(name = "testing")
	public Object[][] getData() {
		List<Map<String,String>> testData = TestUtils.getInstance().getExcelSheetData("CMRTestData", "Parameterization");
		int size = testData.size();
		Object data[][] =  new Object[size-1][1];
		for(int i = 0; i < size-1; i++)
			data[i][0] = i;
		
		return data;
	}
	
//	@Test(dataProvider = "testing")
//	public void verifyDataProvider(int index) {
//		data.getParamPAylaod(index);
//	}
	
	@Test(priority = 1, description = "Verify Cleansing/Get API")
	public void verifyCleansingGetApi() {
		int processId = this.getProcessId("Cleansing");
		Response response = APIResource.getWithQueryparameter("CleansingGet", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
		JsonPath js = new JsonPath(response.asString());
		assertThat(js.getInt("ProcessId[0]"), equalTo(processId));
	}
	
	@Test(priority = 1, description = "Verify Modelling/Get API")
	public void verifyModellingGetApi() {
		int processId = this.getProcessId("Modelling");
		Response response = APIResource.getWithQueryparameter("ModellingGet", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));

		JsonPath js = new JsonPath(response.asString());
		assertThat(js.getInt("ProcessId[0]"), equalTo(processId));
	}
	
	@Test(priority = 1, description = "Verify Reporting/Get API")
	public void verifyReportingGetApi() {
		int processId = this.getProcessId("Reporting");
		Response response = APIResource.getWithQueryparameter("ReportingGet", "processId", processId);
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath js = new JsonPath(response.asString());
		assertThat(js.getInt("ProcessId[0]"), equalTo(processId));
		
	}
	
	
	

}
