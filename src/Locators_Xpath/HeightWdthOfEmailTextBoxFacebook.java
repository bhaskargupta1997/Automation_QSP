package Locators_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWdthOfEmailTextBoxFacebook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement EmailTbx = driver.findElement(By.id("email"));
		int height = EmailTbx.getSize().getHeight();
		int width = EmailTbx.getSize().getWidth();
		System.out.println("heigth= "+height);
		System.out.println("width= "+width);
		driver.close();
		
	}

}
