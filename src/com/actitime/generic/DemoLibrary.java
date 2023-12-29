package com.actitime.generic;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoLibrary {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		FileLib_Actitime f = new FileLib_Actitime();
		
		WebDriver driver = new ChromeDriver();
		driver.get(f.getPropertyData("url"));
		driver.findElement(By.id("username")).sendKeys(f.getPropertyData("username"));
		driver.findElement(By.name("pwd")).sendKeys(f.getPropertyData("password")+Keys.ENTER);
		
//		f.setExcelData("createcustomer",1, 4, "pass");
//		String data = f.getExcelData("createcustomer",1,4);
//		System.out.println(data);
	}

}
