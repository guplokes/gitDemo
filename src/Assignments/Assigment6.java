package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		WebElement checkbox = driver.findElement(By.xpath("//div[@class='right-align']/fieldset/label[1]"));
		String str=checkbox.getText();
		checkbox.findElement(By.xpath(".//input[@id='checkBoxOption1']")).click();
		//checkbox.findElement(By.xpath("//input")).click();

		WebElement elm = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown=new Select(elm);
		dropdown.selectByVisibleText(str);

		driver.findElement(By.cssSelector("input[class='inputs']")).sendKeys(str);
		driver.findElement(By.id("alertbtn")).click();
		String[] text=driver.switchTo().alert().getText().split(",");
		String[] arr=text[0].split(" ");

		//validation if grabed text present in alert
		if(str.equals(arr[1]))
			System.out.println("Alert contains the grabed text");
		else
			System.out.println("Alert doesn't contains the grabed text");

	}

}
