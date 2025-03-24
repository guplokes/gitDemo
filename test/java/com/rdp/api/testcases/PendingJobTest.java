package com.rdp.api.testcases;

import org.testng.annotations.Test;

import com.rdp.api.pojo.ResponseBody;
import com.rdp.api.pojo.job.SavePendingJob;

import com.rdp.api.testdata.JobTestDataBuild;
import com.rdp.api.utils.APIResource;
import com.rdp.api.utils.PropertyUtils;
import com.rdp.api.utils.TestUtils;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.io.File;

@Test(groups = { "CMR" })
public class PendingJobTest {

	JobTestDataBuild data = new JobTestDataBuild();
	int pendingJobId;

	@Test(priority = 1, description = "Verify GetAllPendingJob Api")
	public void verifyGetAllPendingJobApi() {
		int userId = Integer.parseInt(PropertyUtils.getInstance().getValue("UserId"));
		Response response = APIResource.getWithPathparameter("GetAllPendingJob", "UserId", userId);
		File responseSchema = TestUtils.getInstance().getApiResponseSchema("GetAllPendingJob");
		assertThat(response.getStatusCode(), equalTo(200));
		response.then().body(JsonSchemaValidator.matchesJsonSchema(responseSchema));

	}

	@Test(priority = 2, description = "Verify user is able to save pending job using SavePendingJob Api")
	public void verifySavePendingJobApi() {
		SavePendingJob savePendingJobPayload = data.SavePendingJobPayload();
		Response response = APIResource.post("SavePendingJob", savePendingJobPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		ResponseBody responseBody = response.as(ResponseBody.class);
		pendingJobId = Integer.parseInt(responseBody.getMessage());

		SavePendingJob getPendingJobPayload = data.GetPendingJobPayload(pendingJobId);
		Response response1 = APIResource.post("GetPendingJob", getPendingJobPayload);
		assertThat(response1.getStatusCode(), equalTo(200));

	}

	@Test(priority = 3, description = "Verify GetPendingJob Api", dependsOnMethods = "verifySavePendingJobApi")
	public void verifyGetPendingJobApi() {
		SavePendingJob getPendingJobPayload = data.GetPendingJobPayload(pendingJobId);
		Response response = APIResource.post("GetPendingJob", getPendingJobPayload);
		assertThat(response.getStatusCode(), equalTo(200));
	}

	@Test(priority = 3, description = "Verify user is able to update pending job using updatePendingJob Api")
	public void verifyUpdatePendingJobApi() {
		SavePendingJob getPendingJobPayload = data.updatePendingJob(pendingJobId);
		Response response = APIResource.post("UpdatePendingJob", getPendingJobPayload);
		assertThat(response.getStatusCode(), equalTo(200));
		ResponseBody responseBody = response.as(ResponseBody.class);

		assertThat(responseBody.getMessage(), equalToIgnoringCase("Updated"));

	}

	@Test(priority = 4, description = "Verify user is able to delete pending job using DeletePendingJob Api", dependsOnMethods = "verifyUpdatePendingJobApi")
	public void deletePendingJobApi() {
		Response response = APIResource.getWithQueryparameter("DeletePendingJob", "pendingJobId",
				Integer.toString(pendingJobId));
		assertThat(response.getStatusCode(), equalTo(200));

		ResponseBody responseBody = response.as(ResponseBody.class);
		assertThat(responseBody.getMessage(), equalToIgnoringCase("Deleted"));
		
		//Validating with GetPendingJob
		
		SavePendingJob getPendingJobPayload = data.GetPendingJobPayload(pendingJobId);
		Response response1 = APIResource.post("GetPendingJob", getPendingJobPayload);
		assertThat(response1.getStatusCode(), equalTo(200));
		JsonPath js = new JsonPath(response1.asString());
		assertThat(js.getString("JSONData"), is(nullValue()));
	}
}
