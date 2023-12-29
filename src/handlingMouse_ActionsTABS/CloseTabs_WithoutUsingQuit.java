package handlingMouse_ActionsTABS;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTabs_WithoutUsingQuit {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		driver.findElement(By.partialLinkText("actiT")).click();
		Thread.sleep(2000);
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh) {
			driver.switchTo().window(wh);
			driver.close();//how this method closes both the Tabs simultaneously?And working of this for Each Loop
		}
	
	//driver.close();//how this driver.close() method differs from above driver.close() Method.
	}

}
