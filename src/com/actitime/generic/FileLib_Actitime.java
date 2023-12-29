package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This is a generic class for data driven Testing
 * @Bhaskar
 * 
 */
public class FileLib_Actitime {

	
		
			/**
			 * This is a generic method for reading the data from the property file
			 * @param key
			 * @return String
			 * @throws IoException
			 */
			public String getPropertyData(String key)throws IOException{
				FileInputStream fis = new FileInputStream("./Data/commondata.property");
				Properties p= new Properties();
				p.load(fis);
				String data = p.getProperty(key);
				return data;
			}
			
			
			
			
			/**
			 * This is a generic mrethod for reading the data from the excel file
			 * @param SheetName
			 * @param row
			 * @param cell
			 * @return String
			 * @throws EncrypteDocumentException
			 * throws IoException
			 */
			public String getExcelData(String sheetname,int row,int cell)throws EncryptedDocumentException,IOException{
				FileInputStream fis =new FileInputStream("./Data/testscript.xlsx");
				Workbook wb = WorkbookFactory.create(fis);
				String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
				return data;
			}
			
			
			
			
			
			
			/**
			 * this is generic method for writing the data from the excel file
			 * @param Sheetname
			 * @param row
			 * @param cell
			 * @param value
			 * @throws EncryptedDocumentException
			 * @throws IoException
			 */
			public void setExcelData(String sheetname,int row,int cell,String value)throws EncryptedDocumentException,IOException{
				FileInputStream fis =new FileInputStream("./Data/testscript.xlsx");
				Workbook wb = WorkbookFactory.create(fis);
				wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
				FileOutputStream fos=new FileOutputStream("./Data/testscript.xlsx");
				wb.write(fos);
				wb.close();
			}

		

}

