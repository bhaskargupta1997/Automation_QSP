package Data_DrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData_Excel_WithoutHardcoding {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis =new FileInputStream("./Data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int count = wb.getSheet("invalid login").getLastRowNum();
		for(int i=0; i<count;i++) {
			String un = wb.getSheet("invalid login").getRow(i).getCell(0).getStringCellValue();
			String pwd = wb.getSheet("invalid login").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+"  "+pwd); 

		}
	}

}
