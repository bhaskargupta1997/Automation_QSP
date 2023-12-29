package Handling_Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup_PrintTitleIndeed {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.indeed.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//button[@id='apple-signin-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-facebook-button']")).click();
			Set<String> allWh = driver.getWindowHandles();
						
			for(String wh:allWh) {
				driver.switchTo().window(wh);
				String title = driver.getTitle();
				System.out.println(title);
			}
	//driver.close(); when use driver.close() only apple child window close why
			driver.quit();
	}

}
