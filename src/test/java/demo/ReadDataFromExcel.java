package demo;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcel {
	@Test
	public void test() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Orangehrm_Testscript_Data\\VacanciesData.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("AddVacancy");
//		Row row = sheet.getRow(1);
//		Cell cell = row.getCell(1);
//		String vacancyName = cell.getStringCellValue();
		
		for(int i=1; i<=sheet.getLastRowNum(); i++) {
			String names = sheet.getRow(i).getCell(1).getStringCellValue();
			System.out.println(names);
		}
		
		workbook.close();
		
//		System.out.println(vacancyName);
	}

}
