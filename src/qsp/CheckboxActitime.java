package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxActitime {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}	
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			boolean checkbox = driver.findElement(By.xpath("//input[@id='keepLoggedInCheckBox']")).isEnabled();
			
			if(checkbox==true)
			{
				System.out.println("checkbox is present");
			}
			else {
				System.out.println("checkbox is not present");
			}
	}

}
