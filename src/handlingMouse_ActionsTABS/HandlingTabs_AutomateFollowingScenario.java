package handlingMouse_ActionsTABS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs_AutomateFollowingScenario {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("About your actiTIME")).click();

		driver.findElement(By.linkText("Read Service Agreement")).click();
		//List<WebElement> headings = driver.findElements(By.xpath("//ul[@class='header__menu']"));
		//for(WebElement head:headings) {
		//System.out.println(head.getText());
		driver.close();
	}
		
}
