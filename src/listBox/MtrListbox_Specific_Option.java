package listBox;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MtrListbox_Specific_Option {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the option");
		String Eoption = sc.nextLine();
		WebDriver driver =new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/Hotel.html");
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select s=new Select(mtrList);
		List<WebElement> Allop = s.getOptions();
		int counter=0;
		for(int i=0;i<Allop.size();i++) {
			String text = Allop.get(i).getText();
			if(text.equals(Eoption)) {
				counter++;
			}
		}
		if(counter==0) {
			System.out.println("Option not found");
		}
		else if (counter==1) {
			System.out.println("option found without duplicate");
		}
		else if (counter>1 ) {
			System.out.println("option found with duplicate");
		}
		driver.close();	
	}

}