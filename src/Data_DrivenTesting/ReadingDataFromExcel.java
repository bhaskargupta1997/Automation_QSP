package Data_DrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

		public static void main(String[] args) throws IOException {
			FileInputStream file = new FileInputStream("./data/testscript.xlsx");

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("createcustomer");
			int rowCount =	sheet.getLastRowNum();
			int colCount = sheet.getRow(1).getLastCellNum();

			for(int i=0; i<rowCount ; i++)
			{
				XSSFRow currentRow = sheet.getRow(i);

				for(int j=0 ; j<colCount ; j++)
				{
					String value = currentRow.getCell(j).toString();
					System.out.println(value);
				}
			}
		}
	}

