package Handling_Frames_DisableElements_ScrollBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames_Type_JSP {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		try {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("file:///C:/Users/HP/Desktop/iframe.html");
			driver.switchTo().frame(0);
			driver.findElement(By.id("t2")).sendKeys("jsp");
			driver.switchTo().parentFrame();
			driver.findElement(By.id("t1")).sendKeys("qsp");
			Thread.sleep(2000);
			driver.quit();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
