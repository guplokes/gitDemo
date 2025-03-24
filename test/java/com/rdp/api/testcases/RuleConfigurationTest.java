package com.rdp.api.testcases;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.rdp.api.utils.APIResource;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RuleConfigurationTest {

	@Test(groups = {"Rule Config"})
	public void verifyGetRuleTypesApi() {
		Response response = APIResource.get("GetRuleTypes");		
		assertThat(response.getStatusCode(), equalTo(200));
		
		
		JsonPath js = new JsonPath(response.asString());
		int size = js.getList("$").size();
		ArrayList<String> ruleTypeNameList = new ArrayList<String>();
		ruleTypeNameList.add("Error");
		ruleTypeNameList.add("Warning");
		for(int i = 0; i < size; i++ ) {
			assertThat(ruleTypeNameList, hasItem(js.getString("RuleTypeName[" + i + "]")));			
		}
			
	}
	
	public void verifyGetRuleContextsApi() {		
		Response response = APIResource.get("GetRuleContexts");		
		assertThat(response.getStatusCode(), equalTo(200));
	}
	
	public void verifyGetRuleExecutionTypesApi() {
		
		Response response = APIResource.get("GetRuleExecutionTypes");		
		assertThat(response.getStatusCode(), equalTo(200));
		
		JsonPath js = new JsonPath(response.asString());
		int size = js.getList("$").size();
		ArrayList<String> executionTypeNameList = new ArrayList<String>();
		executionTypeNameList.add("Assignment");
		executionTypeNameList.add("Duplicate");
		for(int i = 0; i < size; i++ ) {
			assertThat(executionTypeNameList, hasItem(js.getString("Name[" + i + "]")));			
		}
	}
}
