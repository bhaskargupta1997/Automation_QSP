package handling_MultipleElements_ImplicitExplicitWait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Multiple_Links {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Selenium%20html/Demo.html");
					List<WebElement> allinks = driver.findElements(By.tagName("a"));
					WebElement link = allinks.get(1);
					int count = allinks.size();
					System.out.println(count);
						String text = link.getText();
						System.out.println(text);
	}
	

}
