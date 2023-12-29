package handling_MultipleElements_ImplicitExplicitWait;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAll_Links_Amazon_Count {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the URL");
		String url = s.nextLine(); //method to take string input from the user.
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		//driver.get("https://www.amazon.in/");//hardcoded way
		List<WebElement> allinks = driver.findElements(By.xpath("//a"));
		int count = allinks.size();
		System.out.println(count);
		//				for(int i=0;i<count;i++)
		//				{
		//					String text = allinks.get(i).getText();
		//					System.out.println(text);
		//				}
		//By using Advance for Loop
		for(WebElement l:allinks) {
			System.out.println(l.getText());
			driver.close();
		}
		//driver.close();
	}
}
