	package Data_DrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_Data_From_ExcelFile {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Get the java representative object of the physical file.
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		//create a workbook or open the excel in read mode.
		Workbook wb = WorkbookFactory.create(fis);
		//get the control of the sheet, then row , then cell, and then read the data.
		String data=wb.getSheet("createCustomer").getRow(1).getCell(2).getStringCellValue();
		//print the data in the console.
		System.out.println(data);
			
	}
}
