package handlingMouse_ActionsTABS;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Tabs {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	//In selenium Tab is also treated as new Window.
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		driver.findElement(By.partialLinkText("actiT")).click();
		Thread.sleep(2000);
		Set<String> allwh = driver.getWindowHandles();
		int count = allwh.size();
		System.out.println(count);
		for(String wh:allwh) {
			System.out.println(wh);//this statement prints the Address of both the Tabs.
			driver.switchTo().window(wh);
			Thread.sleep(2000);
			driver.close();/*How control shifting works here it only close child tab?
								It actually closes the current tab only*/	
		}
		//driver.close();//It only closes the parent window    Why &How?
		//driver.quit();//It closes all the Tabs.
	}

}
