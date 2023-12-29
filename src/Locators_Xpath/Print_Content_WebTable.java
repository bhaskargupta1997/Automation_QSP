package Locators_Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Content_WebTable {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Selenium%20html/Traversing.html");
		List<WebElement> content = driver.findElements(By.tagName("//td"));
		Thread.sleep(4000);
						int count = content.size();
						System.out.println(count);
		for(int i=0;i<count;i++) {
			
					String text = content.get(i).getText();
					System.out.println(text);
		}

		
	}

}
