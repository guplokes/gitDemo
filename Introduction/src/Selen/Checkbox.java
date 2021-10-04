package Selen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// clicking on the check box
		driver.get("https://www.spicejet.com/");
		System.out.println("This is demo Git practice");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		//System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());	
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		// number of checkboxes using ist of webElements{also used assertions}
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 8);
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		
		//??checking ui elements(enabled or disabled)::::
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).getAttribute("style"));
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("calender is enabled");
		}
		else {
			System.out.println("Calender is disabled");
		}

	}

}
