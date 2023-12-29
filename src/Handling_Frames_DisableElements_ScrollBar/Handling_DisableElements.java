package Handling_Frames_DisableElements_ScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Handling_DisableElements {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/disableelement.html");
		driver.findElement(By.id("d1")).sendKeys("admin");
		RemoteWebDriver d=(RemoteWebDriver)driver;//Downcasting
		d.executeScript("document.getElementById('d2').value='manager'");
			driver.close();
			
	}

}
