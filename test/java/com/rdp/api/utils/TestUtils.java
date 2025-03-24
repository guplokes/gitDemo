package com.rdp.api.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class TestUtils {

	public static TestUtils getInstance() {
		TestUtils object = new TestUtils();
		return object;
	}

	public String getCurrentDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		return formatter.format(date);
	}
	
	public String getDateAfterAddingDays(int numberOfDays) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		Calendar c = Calendar.getInstance();
		c.setTime(new Date()); // Using today's date
		c.add(Calendar.DATE, numberOfDays); // Adding  days
		String dateAfterAddingDays = sdf.format(c.getTime());
		
		return dateAfterAddingDays;
				
	}
	public String getUtcFormatDateTimeAfterAddingDays(int numberOfDays) {
		Date date = new Date();
		OffsetDateTime utcDateTime = date.toInstant().atOffset(ZoneOffset.UTC);

		return utcDateTime.plusDays(numberOfDays).toString();
	}
	public String getUtcFormatCurrentDateTime() {
		Date date = new Date();
		OffsetDateTime utcDateTime = date.toInstant().atOffset(ZoneOffset.UTC);

		return utcDateTime.toString();
	}

	public File getApiResponseSchema(String apiName) {
		File schema = new File(System.getProperty("user.dir") + "\\src\\main\\java\\com\\rdp\\api\\responseschemas\\" + apiName + ".json");
		
		return schema;
	}
	
	public File getApiRequestPayloadFile(String apiName) {
		File schema = new File(System.getProperty("user.dir") + "\\src\\main\\java\\com\\rdp\\api\\requestPayload\\" + apiName + ".json");
		
		return schema;
	}
	
	
	public List<Map<String,String>> getExcelSheetData(String fileName, String sheetName) {
		ExcelReader excelReader = new ExcelReader();
		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\" + fileName + ".xlsx" ;

		List<Map<String,String>> testData = null;
			try {
				testData = excelReader.getData(filePath, sheetName);
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return testData;
		
	}
	
	public String encodedToBase64(String str) {
		
		byte[] bytesEncoded = Base64.encodeBase64(str.getBytes());
		return  new String(bytesEncoded);
	}
}
