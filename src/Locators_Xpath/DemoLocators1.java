package Locators_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLocators1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Demo.html");
		 driver.findElement(By.tagName("a")).click();
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.findElement(By.id("d1")).click();
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.findElement(By.name("n1")).click();
		 driver.navigate().back();
		 Thread.sleep(2000);
		 driver.findElement(By.className("c1")).click();
		 

	}
	
	
}
