package Handling_Popups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/naukri.html");
		Thread.sleep(4000);
		File f=new File("C:\\Users\\HP\\Desktop\\Interview Questions\\BhaskarGupta CV.docx");
		String asolutepath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(asolutepath);
	
	}

}
