package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check_Height_width_Of_Username_password_Textbox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement un = driver.findElement(By.id("username"));
		WebElement pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
		int heightun = un.getSize().getHeight();
		int widthun = un.getSize().getWidth();
		int heightpwd = un.getSize().getHeight();
		int widthpwd= un.getSize().getWidth();
		if(heightun==heightpwd && widthun==widthpwd)
		{
			System.out.println("un and pwd box same size");
		} 
		else
		{
			System.out.println("un and pwd box  not same size");
		}


	}

}
