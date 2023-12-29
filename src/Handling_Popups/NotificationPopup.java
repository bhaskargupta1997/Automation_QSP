package Handling_Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//To change the setting of the browser we use addArgument() of ChromeOptions class.
		ChromeOptions option=new ChromeOptions();
		option.addArguments("-----disable_Notifications-----");
		WebDriver driver=new ChromeDriver(option);
		
		driver.get("https://www.yatra.com/");
		//WebDriverWait wait=new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.alertIsPresent());//where do we bypass the popup
		
	}

}
