package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//print all options without using collections and any looping statement.
public class GetWrappedElement_AllOptions {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Hotel.html");
		WebElement cpListbox = driver.findElement(By.id("cp"));
		Select s=new Select(cpListbox);
		String text = s.getWrappedElement().getText();
		System.out.println(text);
		driver.close();
	}

}
