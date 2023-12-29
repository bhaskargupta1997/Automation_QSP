package Locators_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontType_FontSize_Forgottenpwd_Facabook {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String fontsize = driver.findElement(By.linkText("Forgotten password?")).getAttribute("fontsize");
		String fonttype = driver.findElement(By.linkText("Forgotten password?")).getAttribute("fonttype");
		System.out.println(fontsize);
		System.out.println(fonttype);
	}

}
