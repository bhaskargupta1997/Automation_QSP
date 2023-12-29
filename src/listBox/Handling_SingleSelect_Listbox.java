package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_SingleSelect_Listbox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		WebElement monthlistbox = driver.findElement(By.id("month"));
		
		Select s=new Select(monthlistbox);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("6");
		Thread.sleep(3000);
		s.selectByVisibleText("Nov");
	}

}
