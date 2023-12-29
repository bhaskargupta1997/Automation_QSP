package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
	//to make the code genric -same code work in every system.	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
	  String title = driver.getTitle();
	  System.out.println(title);
	  driver.close(); 
	}

}
