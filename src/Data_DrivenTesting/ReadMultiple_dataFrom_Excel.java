package Data_DrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultiple_dataFrom_Excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//Get the last row number where the data is pesent.
		int rowcount = wb.getSheet("invalid login").getLastRowNum();
		for(int i=1;i<=rowcount;i++) {
			String un = wb.getSheet("invalid login").getRow(i).getCell(0).getStringCellValue();
			String pwd = wb.getSheet("invalid login").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+" "+pwd);
		}


	}

}
