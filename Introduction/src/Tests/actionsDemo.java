package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.cssSelector("[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT)
				.sendKeys("Hello").doubleClick().build().perform();
		// moves to a specific element
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();// mouse over

		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();

	}

}
