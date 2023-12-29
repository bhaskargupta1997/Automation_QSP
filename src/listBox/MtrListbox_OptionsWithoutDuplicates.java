package listBox;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrListbox_OptionsWithoutDuplicates {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Hotel.html");
		WebElement MTRlistbox = driver.findElement(By.id("mtr"));
		Select s=new Select(MTRlistbox);
		List<WebElement> alloptions = s.getOptions();
		HashSet<String>hs=new HashSet<>();//use LinkedHashset for sorted order 

		for(int i=0;i<alloptions.size();i++) {
			String text = alloptions.get(i).getText();
			if(hs.add(text));
		}
		for(String option:hs) {
			System.out.println(option);
		}
	}

}
