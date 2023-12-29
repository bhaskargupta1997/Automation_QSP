package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Cut2fit_Admin {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//why we are taking chromeoptions class first than webdriver.
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://cut2fit.co.in/login");
		driver.manage().window().maximize();
		//		WebDriverWait wait = new WebDriverWait(driver, 10);
		//		wait.until(ExpectedConditions.elementToBeClickable(By.id("")));
		driver.findElement (By.id("email")).sendKeys("adminuser@adminuser.com");
		driver.findElement (By.id("password")).sendKeys("Info9179@");
		Thread.sleep(2000);
		driver.findElement (By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		//		Alert alert = driver.switchTo().alert();
		//		alert.dismiss();

		driver.close();



	}

}
