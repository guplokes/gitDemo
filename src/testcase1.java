
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		/*
		 * driver.get("http://www.facebook.com"); System.out.println(driver.getTitle());
		 * //System.out.println(driver.getCurrentUrl());
		 * 
		 * //Find element //driver.findElement(By.className("inputtext _55r1 _6luy")).
		 * sendKeys("this is lawda lassan");
		 * driver.findElement(By.id("email")).sendKeys("lawdalassAn@pappu.com");
		 * driver.findElement(By.name("pass")).sendKeys("passsswordd");
		 * driver.findElement(By.linkText("Forgotten password?")).click();
		 */
		
		/*
		 * to prctice the customized Xpath from parent child traversal
		 * see code Below::
		 */
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//div[@class='LX3sZb']/div/div/div/div/div[2]/a")).click();
		
	}

}
