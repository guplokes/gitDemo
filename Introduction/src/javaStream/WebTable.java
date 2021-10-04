package javaStream;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		//1.click on column
		driver.findElement(By.cssSelector("tr th:nth-child(1)")).click();

		//2.capture all web elements into a list
		List<WebElement> aList = driver.findElements(By.cssSelector("table[class='table table-bordered'] tbody tr td:nth-child(1)"));


		//3.capture text of all web elements into a  new list(original list)
		List<String> origList = aList.stream().map(s->s.getText()).collect(Collectors.toList());
		

		//4.perform sort on original list -> sorted list
		List<String> sortedList = origList.stream().sorted().collect(Collectors.toList());
		//System.out.println(sortedList.get(0));

		//4.compare oringinal list vs sorted list
		//(correct scenario) original list alsredy should be in sorted manner

		Assert.assertTrue(origList.equals(sortedList));


		//Scan the column with getText -> Beans -> get the price
		List<String> price;

		do {
			List<WebElement> elementList = driver.findElements(By.cssSelector("table[class='table table-bordered'] tbody tr td:nth-child(1)"));

			price = elementList.stream().filter(s->s.getText().contains("Wheat")).map(s->getPrice(s)).collect(Collectors.toList());
			
			price.forEach(s->System.out.println(s)); //s->getPrice(s) calling the fucking method
			
			if(price.size()==0)
				driver.findElement(By.cssSelector("[aria-label='Next']")).click();
			
		}while(price.size()==0);
			
		
		/*
			 * //extra practice List<String> priceList =
			 * aList.stream().map(s->getPrice(s)).collect(Collectors.toList());
			 * 
			 * System.out.println("Items\tPrice"); for(int i=0;i<origList.size();i++)
			 * System.out.println(origList.get(i) + "\t" + priceList.get(i) );
			 */


	}

	private static String getPrice(WebElement s) {
		return	s.findElement(By.xpath("following-sibling::td[1]")).getText(); //concept of nested driver		

	}

}
