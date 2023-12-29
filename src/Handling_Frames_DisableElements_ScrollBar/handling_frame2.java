package Handling_Frames_DisableElements_ScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_frame2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Selenium%20html/page1.html");
		driver.findElement(By.id("t1")).sendKeys("a");
		driver.switchTo().frame("f1");//frame method taking id or Attribute as an argument.
		driver.findElement(By.id("t2")).sendKeys("b");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("c");
		WebElement e = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(e);//frame method taking webelement as argument.
		driver.findElement(By.id("t2")).sendKeys("d");
		driver.close();	
	} 	

}
