package Tests;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Scope {

	public static void main(String[] args) throws InterruptedException {
		
		//1.to get the count of link present on the webpage
		//2. count of link in footer section(lower area of web page)
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// Limiting the scope of driver(driver subsets)
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));//it will act as new driver
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3.limiting the scope of driver(using xpath )....IMP****
		//WebElement couponsdriver=driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		WebElement couponsdriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));//*********Imp-xpath parent-child relationship
		int size=couponsdriver.findElements(By.tagName("a")).size();
		System.out.println(size);

		
		//4. clicking on each link in the column and check if pages are opening
		for(int i=0;i<size;i++) {
			String clickOnLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			couponsdriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);	
			Thread.sleep(15000L);
		}//THIS FOR LOOP OPENS ALL TAB
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> itr=windows.iterator();
		/*
		 * String pId=itr.next();
		 * 
		 * for(int i=0;i<size;i++) { driver.switchTo().window(itr.next());
		 * System.out.println(driver.getTitle()); }
		 */
		//itr.next();
		while(itr.hasNext()) {
			driver.switchTo().window(itr.next());
			System.out.println(driver.getTitle());
		}
		
		
//		driver.switchTo().window(pId);
//		System.out.println(driver.getTitle());
//		System.out.println(size);
		
		
	}

}
