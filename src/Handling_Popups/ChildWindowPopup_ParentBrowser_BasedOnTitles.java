package Handling_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.seleniumhq.jetty9.util.Scanner;
import java.util.Scanner;

public class ChildWindowPopup_ParentBrowser_BasedOnTitles {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/");
		driver.findElement(By.id("apple-signin-button")).click();
		driver.findElement(By.id("login-facebook-button")).click();
		String pWh = driver.getWindowHandle();
		Set<String> allWh = driver.getWindowHandles();

		for(String wh:allWh) {
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			if(title.equals(wh)) {

			}
			else {
				driver.close();
			}

		}
	}

}
