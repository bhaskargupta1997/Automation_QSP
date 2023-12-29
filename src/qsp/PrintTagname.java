package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTagname {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String tagname = driver.findElement(By.id("toPasswordRecoveryPageLink")).getTagName();
		System.out.println(tagname);
		java.lang.String value = driver.findElement(By.id("toPasswordRecoveryPageLink")).getAttribute("href");
		System.out.println(value);
	}
}
