package handling_MultipleElements_ImplicitExplicitWait;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_Autosugg_Iphone14promax {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
		Thread.sleep(3000);
		List<WebElement> allsugg = driver.findElements(By.xpath(  "//span[contains(text(),'iphone 14 pro max')]/.."));
						int count = allsugg.size();
						System.out.println(count);
			/*for(int i=0;i<count;i++) {
				String text = allsugg.get(i).getText();
				System.out.println(text);
			}*/
			driver.close();
	}

}
