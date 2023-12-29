package Data_DrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Handling_Property_file {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException  {
		//Get the java representative object of physical file.
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		//create an object for property class
		Properties p=new Properties();
		//Load the file. 
		p.load(fis);
		//get the data (value) by passing Key.
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pwd = p.getProperty("password");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pwd);
	}
}
