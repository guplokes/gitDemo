package Selen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutosuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));//list of Web elements
		
		System.out.println(options);
		
		  for(WebElement e:options) {
		  
		  if(e.getText().equalsIgnoreCase("India")) {
			  
			  e.click();
			  System.out.println("hurrrah!! India found");
			  
			  break;
			  		  
		  }
		  	  
		  		}
		 
		
	}

}
