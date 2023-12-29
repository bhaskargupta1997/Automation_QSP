package handling_MultipleElements_ImplicitExplicitWait;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custom_Wait {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//Handling the synchronization of automation script by writing our own code.
		int i=0;
		while(i<100) {
			try {
				 driver.findElement(By.id("logoutLink")).click();
				break;
				}
			catch (NoSuchElementException e) {
			i++;
			}
		}
		System.out.println(i);
	}
}


