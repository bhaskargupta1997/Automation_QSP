package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * It is a generic class to access the data 
 * @author Bhaskar
 *
 */

public class ZohoGeneric {
	/**
	 * This method is for extrating data for property data
	 * @param key
	 * @return String
	 * @throws IOException
	 */
	
	public String getPropertyData(String key) throws IOException {
		FileInputStream f = new FileInputStream("./data/zohocrm.property");
		Properties p = new Properties();
		p.load(f);
		String data = p.getProperty(key);
		return data;
		
	}
	/**
	 * This method is for extrating data from excel data
	 * @param sheet
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	
	public String getExcelData(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream("./data/zohocrmdata.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		String data = wb.getSheet(sheet).getRow(cell).getCell(cell).getStringCellValue();
		return data;
	}
	
	/**
	 * This method is for extrating data from excel data
	 * @param sheet
	 * @param row
	 * @param cell
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public void  setExcelData(String sheet, int row, int cell, String value) throws IOException {
		FileInputStream f = new FileInputStream("./data/zohocrmdata.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		 wb.getSheet(sheet).getRow(cell).getCell(cell).setCellValue(value);
		 FileOutputStream fos = new FileOutputStream("./data/zohocrmdata.xlsx");
		 
		 wb.write(fos);
		 wb.close();
		
	}

}
