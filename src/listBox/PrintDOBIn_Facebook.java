package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintDOBIn_Facebook {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		 WebElement dayListbox = driver.findElement(By.id("day"));
		Select s=new Select(dayListbox);
		s.selectByIndex(3);
		 WebElement monthListbox = driver.findElement(By.id("month"));
		 Select t=new Select(monthListbox);
		 t.selectByValue("2");
		 WebElement yearListbox = driver.findElement(By.id("year"));
		 Select d=new Select(yearListbox);
		 d.selectByVisibleText("1997");
		 driver.close();
	}

}
