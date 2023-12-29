package handling_MultipleElements_ImplicitExplicitWait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspiders_Autosuggestion {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("qspiders");//search qspiders in the search box
		Thread.sleep(2000);
		//find all the autosuggestions and print the count.
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
		int count = allsugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++) { //to capture all the atosuggestion
			String text = allsugg.get(i).getText();
			System.out.println(text);
		}
		//for printing the autosuggestion in reverse order
//		for(int i=count-1;i>0;i--) {
//			String t = allsugg.get(i).getText();
//			System.out.println(t);
//		}
		allsugg.get(count-1).click();	
		driver.close();
	}

}
