package Locators_Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IphoneNameAndPrie {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 11"+Keys.ENTER);
		
		List<WebElement> allName = driver.findElements(By.xpath("//div[contains(text(), 'APPLE iPhone 11')]"));
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[contains(text(), 'APPLE iPhone11')]/../../div[2]/div[1]/div[1]/div[1]"));

		for(int i = 0; i<allName.size(); i++) {
			System.out.println(allName.get(i).getText() +"-------->>"+ allPrice.get(i).getText());
		}
		//driver.close();
	
	
	}
}
