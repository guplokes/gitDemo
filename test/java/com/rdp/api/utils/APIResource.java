package com.rdp.api.utils;

import static com.rdp.api.utils.SpecBuilder.getRequestSpec;
import static com.rdp.api.utils.SpecBuilder.getResponseSpec;
import static io.restassured.RestAssured.given;

import java.io.File;

import com.rdp.api.reporting.ExtentReportManager;

import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class APIResource {

	static Endpoints endpoint;

	public static Response post(String apiName, Object payload) {
		endpoint = Endpoints.valueOf(apiName);
		RequestSpecification requestSpec = getRequestSpec();
		Response response = given().spec(getRequestSpec()).body(payload).when().post(endpoint.getEndpoint()).then()
				.spec(getResponseSpec()).extract().response();

		logRequestInfoDetails(requestSpec);
		ExtentReportManager.logInfoDetails("Request Payload: ");
		ExtentReportManager.logJson(payload);
		logResponseDetails(response);
		return response;
	}
	
	//POST with String Payload
	public static Response post(String apiName, String payload) {
		endpoint = Endpoints.valueOf(apiName);
		RequestSpecification requestSpec = getRequestSpec();
		Response response = given().spec(getRequestSpec()).body(payload).when().post(endpoint.getEndpoint()).then()
				.spec(getResponseSpec()).extract().response();

		logRequestInfoDetails(requestSpec);
		ExtentReportManager.logInfoDetails("Request Payload: ");
		ExtentReportManager.logJsonAsString(payload);;
		logResponseDetails(response);
		return response;
	}
	
	// POST Request with Integer Query Parameter and String query parameter(with payload)
	public static Response postWithQueryParameter(String apiName, String queryParameterName1, int queryParameterValue1, String queryParameterName2, String queryParameterValue2, Object payload) {
		endpoint = Endpoints.valueOf(apiName);
		RequestSpecification requestSpec = getRequestSpec();
		requestSpec.queryParam(queryParameterName1, queryParameterValue1)
					.queryParam(queryParameterName2, queryParameterValue2);
		Response response = given().spec(requestSpec)
									.body(payload)
									.when()
									.post(endpoint.getEndpoint())
									.then()
									.spec(getResponseSpec()).extract().response();

		logRequestInfoDetails(requestSpec);
		ExtentReportManager.logInfoDetails("Request Payload: ");
		ExtentReportManager.logJson(payload);
		logResponseDetails(response);
		return response;
	}
	
	// POST Request with Integer Query Parameter and String query parameter(without payload)
		public static Response postWithQueryParameter(String apiName, String queryParameterName1, int queryParameterValue1, String queryParameterName2, String queryParameterValue2) {
			endpoint = Endpoints.valueOf(apiName);
			RequestSpecification requestSpec = getRequestSpec();
			requestSpec.queryParam(queryParameterName1, queryParameterValue1)
						.queryParam(queryParameterName2, queryParameterValue2);
			Response response = given().spec(requestSpec)
										.when()
										.post(endpoint.getEndpoint())
										.then()
										.spec(getResponseSpec()).extract().response();

			logRequestInfoDetails(requestSpec);
			logResponseDetails(response);
			return response;
		}
	
	// POST Request with Integer Path Parameter(no payload)
	public static Response postWithPathParameter(String apiName, String pathParameterName, int pathParameterValue) {
		endpoint = Endpoints.valueOf(apiName);
		RequestSpecification requestSpec = getRequestSpec();
		requestSpec.pathParam(pathParameterName, pathParameterValue);
		Response response = given().spec(requestSpec)
									.when()
									.post(endpoint.getEndpoint())
									.then()
									.spec(getResponseSpec()).extract().response();

		logRequestInfoDetails(requestSpec);
		logResponseDetails(response);
		return response;
	}
	
	// POST Request with String Path Parameter(no payload)
	public static Response postWithPathParameter(String apiName, String pathParameterName, String pathParameterValue) {
		endpoint = Endpoints.valueOf(apiName);
		RequestSpecification requestSpec = getRequestSpec();
		requestSpec.pathParam(pathParameterName, pathParameterValue);
		Response response = given().spec(requestSpec)
									.when()
									.post(endpoint.getEndpoint())
									.then()
									.spec(getResponseSpec()).extract().response();

		logRequestInfoDetails(requestSpec);
		logResponseDetails(response);
		return response;
	}
	
	// POST Request with Integer Query Parameter(no payload)
		public static Response postWithQueryParameter(String apiName, String queryParameterName, int queryParameterValue) {
			endpoint = Endpoints.valueOf(apiName);
			RequestSpecification requestSpec = getRequestSpec();
			requestSpec.queryParam(queryParameterName, queryParameterValue);
			Response response = given().spec(requestSpec)
										.when()
										.post(endpoint.getEndpoint())
										.then()
										.spec(getResponseSpec()).extract().response();

			logRequestInfoDetails(requestSpec);
//			ExtentReportManager.logInfoDetails("Request Payload: ");
//			ExtentReportManager.logJson(payload);
			logResponseDetails(response);
			return response;
		}
	
	// POST Request with Integer query Parameter and Boolean query Parameter
		public static Response postWithQueryParameter(String apiName, String queryParameterName1, int queryParameterValue1,
				String queryParameterName2, boolean queryParameterValue2) {
			endpoint = Endpoints.valueOf(apiName);
			RequestSpecification requestSpec = getRequestSpec();
			requestSpec.queryParam(queryParameterName1, queryParameterValue1)
						.queryParam(queryParameterName2, queryParameterValue2);
			Response response = given().spec(requestSpec)
										.when()
										.post(endpoint.getEndpoint())
										.then()
										.spec(getResponseSpec()).extract().response();

			logRequestInfoDetails(requestSpec);
			logResponseDetails(response);
			return response;
		}
	
	// POST Request with Integer Query Parameter and File requestPayload
	public static Response postWithQueryparameterAndPayload(String apiName, String queryParameterName, int queryParameterValue, File payloadFile) {
		endpoint = Endpoints.valueOf(apiName);
		RequestSpecification requestSpec = getRequestSpec();
		requestSpec.queryParam(queryParameterName, queryParameterValue)
					.body(payloadFile);
		Response response = given().spec(requestSpec)
								   .when()
								   .post(endpoint.getEndpoint())
								   .then()
								   .spec(getResponseSpec())
								   .extract().response();
		logRequestInfoDetails(requestSpec);
		logResponseDetails(response);
		return response;
	}
	
	// POST Request with  File requestPayload
	public static Response postWithFilePayload(String apiName, File payloadFile) {
		endpoint = Endpoints.valueOf(apiName);
		RequestSpecification requestSpec = getRequestSpec();
		requestSpec.body(payloadFile);
		Response response = given().spec(requestSpec)
								   .when()
								   .post(endpoint.getEndpoint())
								   .then()
								   .spec(getResponseSpec())
								   .extract().response();
		logRequestInfoDetails(requestSpec);
		logResponseDetails(response);
		return response;
	}


	// GET Request without Path or Query Parameter
	public static Response get(String apiName) {
		endpoint = Endpoints.valueOf(apiName);
		RequestSpecification requestSpec = getRequestSpec();
		Response response = given().spec(requestSpec)
									.when()
									.get(endpoint.getEndpoint())
									.then()
									.spec(getResponseSpec())
									.extract()
									.response();
		logRequestInfoDetails(requestSpec);
		logResponseDetails(response);
		return response;

	}

	// GET Request with String Query Parameter
	public static Response getWithQueryparameter(String apiName, String queryParameterName,
			String queryParameterValue) {
		endpoint = Endpoints.valueOf(apiName);
		RequestSpecification requestSpec = getRequestSpec();
		requestSpec.queryParam(queryParameterName, queryParameterValue);
		Response response = given().spec(requestSpec).when().get(endpoint.getEndpoint()).then().spec(getResponseSpec())
				.extract().response();
		logRequestInfoDetails(requestSpec);
		logResponseDetails(response);
		return response;
	}
	
	// GET Request with  two String Query Parameter
	public static Response getWithQueryparameter(String apiName, String queryParameterName1,
			String queryParameterValue1, String queryParameterName2,
			String queryParameterValue2) {
		endpoint = Endpoints.valueOf(apiName);
		RequestSpecification requestSpec = getRequestSpec();
		requestSpec.queryParam(queryParameterName1, queryParameterValue1)
					.queryParam(queryParameterName2, queryParameterValue2);
		Response response = given().spec(requestSpec).when().get(endpoint.getEndpoint()).then().spec(getResponseSpec())
				.extract().response();
		logRequestInfoDetails(requestSpec);
		logResponseDetails(response);
		return response;
	}

	// GET Request with  three String Query Parameter
	public static Response getWithQueryparameter(String apiName, String queryParameterName1,
			String queryParameterValue1, String queryParameterName2, String queryParameterValue2,
			String queryParameterName3,	String queryParameterValue3) {
		endpoint = Endpoints.valueOf(apiName);
		RequestSpecification requestSpec = getRequestSpec();
		requestSpec.queryParam(queryParameterName1, queryParameterValue1)
					.queryParam(queryParameterName2, queryParameterValue2)
					.queryParam(queryParameterName3, queryParameterValue3);
		Response response = given().spec(requestSpec).when().get(endpoint.getEndpoint()).then().spec(getResponseSpec())
				.extract().response();
		logRequestInfoDetails(requestSpec);
		logResponseDetails(response);
		return response;
	}
	
	// GET Request with with Integer and string  Query Parameter
		public static Response getWithQueryparameter(String apiName, String queryParameterName1,
				int queryParameterValue1, String queryParameterName2, String queryParameterValue2) {
			endpoint = Endpoints.valueOf(apiName);
			RequestSpecification requestSpec = getRequestSpec();
			requestSpec.queryParam(queryParameterName1, queryParameterValue1)
						.queryParam(queryParameterName2, queryParameterValue2);
						
			Response response = given().spec(requestSpec).when().get(endpoint.getEndpoint()).then().spec(getResponseSpec())
					.extract().response();
			logRequestInfoDetails(requestSpec);
			logResponseDetails(response);
			return response;
		}
		
		// GET Request with with two Integer Query Parameter
		public static Response getWithQueryparameter(String apiName, String queryParameterName1,
				int queryParameterValue1, String queryParameterName2, int queryParameterValue2) {
			endpoint = Endpoints.valueOf(apiName);
			RequestSpecification requestSpec = getRequestSpec();
			requestSpec.queryParam(queryParameterName1, queryParameterValue1)
						.queryParam(queryParameterName2, queryParameterValue2);
						
			Response response = given().spec(requestSpec).when().get(endpoint.getEndpoint()).then().spec(getResponseSpec())
					.extract().response();
			logRequestInfoDetails(requestSpec);
			logResponseDetails(response);
			return response;
		}
	
	
	// GET Request with Integer Query Parameter
	public static Response getWithQueryparameter(String apiName, String queryParameterName, int queryParameterValue) {
		endpoint = Endpoints.valueOf(apiName);
		RequestSpecification requestSpec = getRequestSpec();
		requestSpec.queryParam(queryParameterName, queryParameterValue);
		Response response = given().spec(requestSpec).when().get(endpoint.getEndpoint()).then().spec(getResponseSpec())
				.extract().response();
		logRequestInfoDetails(requestSpec);
		logResponseDetails(response);
		return response;
	}

	// GET Request with Integer Path Parameter
	public static Response getWithPathparameter(String apiName, String pathParameterName, int pathParameterValue) {
		endpoint = Endpoints.valueOf(apiName);
		RequestSpecification requestSpec = getRequestSpec();
		requestSpec.pathParam(pathParameterName, pathParameterValue);
		Response response = given().spec(requestSpec).when().get(endpoint.getEndpoint()).then().spec(getResponseSpec())
				.extract().response();

		logRequestInfoDetails(requestSpec);
		logResponseDetails(response);
		return response;
	}
	
	// GET Request with Integer and string Path Parameter
	public static Response getWithPathparameter(String apiName, String pathParameterName1, int pathParameterValue1, String pathParameterName2, String pathParameterValue2) {
		endpoint = Endpoints.valueOf(apiName);
		RequestSpecification requestSpec = getRequestSpec();
		requestSpec.pathParam(pathParameterName1, pathParameterValue1)
					.pathParam(pathParameterName2, pathParameterValue2);
		Response response = given().spec(requestSpec).when().get(endpoint.getEndpoint()).then().spec(getResponseSpec())
				.extract().response();

		logRequestInfoDetails(requestSpec);
		logResponseDetails(response);
		return response;
	}

	// GET Request with String Path Parameter
		public static Response getWithPathparameter(String apiName, String pathParameterName, String pathParameterValue) {
			endpoint = Endpoints.valueOf(apiName);
			RequestSpecification requestSpec = getRequestSpec();
			requestSpec.pathParam(pathParameterName, pathParameterValue);
			Response response = given().spec(requestSpec).when().get(endpoint.getEndpoint()).then().spec(getResponseSpec())
					.extract().response();

			logRequestInfoDetails(requestSpec);
			logResponseDetails(response);
			return response;
		}
		
	private static void logRequestInfoDetails(RequestSpecification requestSpec) {
		QueryableRequestSpecification queryRequest = SpecificationQuerier.query(requestSpec);
		String uri = queryRequest.getBaseUri() + endpoint.getEndpoint();
		String requestSpecUri = queryRequest.getURI();
		if (requestSpecUri.contains("?")) {
			String[] queryParameters = requestSpecUri.split("/");
			uri = uri + queryParameters[queryParameters.length - 1];
		}
		ExtentReportManager.logInfoDetails("Endpoint is " + uri);
//		ExtentReportManager.logInfoDetails("Method is " + queryRequest.getMethod());
//		ExtentReportManager.logInfoDetails("Headers are " + queryRequest.getHeaders().asList().toString());

	}

	private static void logResponseDetails(Response response) {
		ExtentReportManager.logInfoDetailsInOrange(response.getStatusLine());
		ExtentReportManager.logInfoDetails("Status code : " + response.getStatusCode());
		ExtentReportManager.logInfoDetails("Response: ");
		ExtentReportManager.logJson(response.asString());

	}
}
