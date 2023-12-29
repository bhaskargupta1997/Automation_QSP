package listBox;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect_ListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Hotel.html");
		WebElement CpList = driver.findElement(By.id("cp"));
		Select s=new Select(CpList);
		s.selectByIndex(0);
		s.selectByValue("m");
		s.selectByVisibleText("sandwich");
		s.deselectByIndex(2);
		s.deselectByValue("f");
		s.deselectByVisibleText("puttu");
		Thread.sleep(1000);
		boolean status = s.isMultiple();
		System.out.println(status);		
}

}
