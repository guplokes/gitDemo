package com.rdp.api.utils;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.HttpClientConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class SpecBuilder {
	
//public RequestSpecification getRequestSpecWithReuseConnection() {
//	
//	 RestAssured config = RestAssured.config().httpClient(httpClientConfig().reuseHttpClientInstance());
//		
//		return  new RequestSpecBuilder()
//				.setBaseUri(PropertyUtils.getInstance().getValue("baseURL"))
//				.setRelaxedHTTPSValidation()
//				.addHeaders(getRequestHeadersMap())
//				.setContentType(ContentType.JSON)
//				.log(LogDetail.ALL).build();
//		
//			
//		
//		
//
//	}
	
	public static RequestSpecification getRequestSpec() {
		
		return  new RequestSpecBuilder()
				.setBaseUri(PropertyUtils.getInstance().getValue("baseURL"))
				.setRelaxedHTTPSValidation()
				.addHeaders(getRequestHeadersMap())
				.setContentType(ContentType.JSON)
				.log(LogDetail.ALL).build();
		
			
		
		

	}
	
	public static ResponseSpecification getResponseSpec() {
		return  new ResponseSpecBuilder()
				.log(LogDetail.ALL).build();
	}

	
	private static HashMap<String,String> getRequestHeadersMap()  {
		HashMap<String,String> headers = new HashMap<String, String>();
		headers.put("Accept", "application/json, text/plain, */*");
		headers.put("Accept-Encoding", "gzip, deflate");
		headers.put("Accept-Language", " en-US,en;q=0.9");
		headers.put("Connection", "keep-alive");
		headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36 Edg/116.0.1938.69");
		headers.put("access-control-allow-credentials", "true");
		
		headers.put("server", "Microsoft-IIS/10.0");
		headers.put(PropertyUtils.getInstance().getValue("keyname"),
				PropertyUtils.getInstance().getValue("key"));
		
		return headers;
		
	}
}
