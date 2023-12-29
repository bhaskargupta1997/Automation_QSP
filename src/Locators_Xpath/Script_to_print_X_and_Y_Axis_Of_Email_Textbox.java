package Locators_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_to_print_X_and_Y_Axis_Of_Email_Textbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement x = driver.findElement(By.id("email"));
	@SuppressWarnings("unused")
	WebElement y = driver.findElement(By.id("email"));
               int EmailX = x.getSize().getWidth();
               int EmailY = x.getSize().getHeight();
               System.out.println(EmailX);
               System.out.println(EmailY);
               
	}

}
