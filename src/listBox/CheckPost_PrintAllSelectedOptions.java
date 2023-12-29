package listBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckPost_PrintAllSelectedOptions {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Hotel.html");
		WebElement cpListbox = driver.findElement(By.id("cp"));
		Select s=new Select(cpListbox);
		List<WebElement> AlsOptions = s.getAllSelectedOptions();
		/*int count = AlsOptions.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = AlsOptions.get(i).getText();
			System.out.println(text);*/
		for(int i=0;i<AlsOptions.size();i++) {
			String text = AlsOptions.get(i).getText();
			System.out.println(text);
		}
		driver.close();
	}

}
