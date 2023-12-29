package handling_MultipleElements_ImplicitExplicitWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iphone_autosuggestion {
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicitWait Condition
		driver.findElement(By.xpath("(//button)[2]")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(2000);
		List<WebElement> allsug = driver.findElements(By.xpath("(//span[contains(text(),'iphone')])/.."));
		int count = allsug.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			String text = allsug.get(i).getText();
			System.out.println(text);
		}

		//by using advance for loop or ForEach loop				
		//							for(WebElement text:allsug) {
		//								System.out.println(text);
		//}
		//allsug.get(count-1).click();
	driver.close();
	}

}
