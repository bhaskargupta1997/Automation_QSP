package Locators_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gender_Radio_Buttons_Allignment {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	driver.findElement(By.linkText("Create New Account")).click();
	//  driver.findElement(By.xpath("//a[contains(@id,'u_0_0_wV')]")).click(); //its not working
	Thread.sleep(3000);
		int allignF = driver.findElement(By.xpath("//input[@value='1']")).getLocation().getY();
		int allignM = driver.findElement(By.xpath("//input[@value='2']")).getLocation().getY();
		int allignC = driver.findElement(By.xpath("//input[@value='-1']")).getLocation().getY();
		System.out.println(allignF);
		System.out.println(allignM);
		System.out.println(allignC); 
		
	}
  
}
