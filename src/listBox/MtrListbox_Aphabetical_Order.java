package listBox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrListbox_Aphabetical_Order {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Hotel.html");
		WebElement Mtrlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(Mtrlistbox);
		List<WebElement> Allop = s.getOptions();
		ArrayList<String> al=new ArrayList<>();
		for(int i=0;i<Allop.size();i++) {
			String text = Allop.get(i).getText();
			al.add(text);
		}
		Collections.sort(al);
		for(int i=0;i<al.size();i++) {
			String temp = al.get(i);
			System.out.println(temp);
		}
	}

}
