package Selen;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// implicit wait
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// explicit wait
		WebDriverWait w = new WebDriverWait(driver, 5);

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String[] veggies = { "Brocolli", "Cucumber", "Beetroot" };

		addItems(driver, veggies);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='promoCode']")));

		// Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacadem");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		// explicit Wait

		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));

		System.out.println(driver.findElement(By.className("promoInfo")).getText());
	}

	public static void addItems(WebDriver driver, String[] veggies) {
		List<WebElement> list = driver.findElements(By.cssSelector("h4.product-name"));
		String formattedName;

		List<String> veggiesList = Arrays.asList(veggies);
		int k = 0; // for break from unnecessary looping

		for(int i=0;i<list.size();i++) {
			//format name to get actual name
			String[] name=list.get(i).getText().split("-");
			formattedName=name[0].trim(); //to trim all unwanted whitespace
			//System.out.println(formattedName);
						
			//convert array to arrayList for easy search
			//List<String> veggiesList = Arrays.asList(veggies);	
			//check whether name u extracted is present in arrayList or not
			
			if(veggiesList.contains(formattedName)) {
				
				k++;
				
//				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//				Thread.sleep(6000);
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(k==veggiesList.size())
					break;
			}
		}
	}
}
