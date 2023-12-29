package com.actitime.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScreenshot {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");

		TakesScreenshot t=(TakesScreenshot)driver;
		//press the printscreen button.
		File src = t.getScreenshotAs(OutputType.FILE);
		//create the empty file in the screenshot folder.
		File dest = new File("./screenshot/ss.png");
		//Move the screenshot from source to destination.
		FileUtils.copyFile(src, dest);
		driver.close();  
		 
	}

}
