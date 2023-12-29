package handlingMouse_ActionsTABS;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs_Using_ITERATORCloseChildTabFirstThanParentTab {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		//driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		driver.findElement(By.partialLinkText("actiT")).click();
		Set<String> allWh = driver.getWindowHandles();
		Thread.sleep(3000);
		Iterator<String> i = allWh.iterator();
		while(i.hasNext()==true){
			String wh= i.next();
			driver.switchTo().window(wh);
			Thread.sleep(3000);
			driver.close();
		}
		//driver.close();
	}

}
