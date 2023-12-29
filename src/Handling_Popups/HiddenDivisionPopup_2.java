package Handling_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup_2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='policynumber']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='dob']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='4']"));
		WebElement monthListbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		//by using X-path by Attribute(//a[@href='#']) [5]			

		Select s= new Select(monthListbox);
		s.selectByValue("1");
		WebElement yearlistbox = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2=new Select(yearlistbox);
		s2.selectByVisibleText("1997");

		driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
		driver.findElement(By.xpath("//button[text()='Lets Renew']")).click();
		driver.close();        
	}

}
