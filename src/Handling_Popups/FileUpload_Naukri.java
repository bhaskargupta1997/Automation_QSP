package Handling_Popups;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Naukri {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[@id='login_Layer']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("bhaskargupta537@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bhaskar1997");
		//driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("(//button[contains(text(),'Login')])[1]")).click();
		//Using file class( To convert relative path to absolute path).
		File f= new File("C:\\Users\\HP\\Desktop\\Interview Questions\\BhaskarGupta CV.docx");
		String absolutepath = f.getAbsolutePath();
		driver.findElement(By.id("c")).sendKeys(absolutepath);
		driver.close();
	}   

}
