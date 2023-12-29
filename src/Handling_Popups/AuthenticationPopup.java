package Handling_Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
//we can handle authentication popup by sending UN and PWD along with the url inside the get method
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
