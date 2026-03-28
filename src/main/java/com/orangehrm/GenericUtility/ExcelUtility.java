package com.orangehrm.GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelUtility {
	Workbook wb;
	Sheet sheet;
	public void loadExcelFile(String filePath,String sheetName) throws Exception, IOException {
		FileInputStream fis = new FileInputStream(filePath);
		wb = WorkbookFactory.create(fis);
		sheet = wb.getSheet(sheetName);
		
	}
	//read data 
	public String getDataFromSingleCell(int rowNo, int cellNo) {
	    Row row = sheet.getRow(rowNo);
	    if (row == null) {
	        return "";
	    }

	    Cell cell = row.getCell(cellNo, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);

	    switch (cell.getCellType()) {
	        case STRING:
	            return cell.getStringCellValue();

	        case NUMERIC:
	            return String.valueOf((int) cell.getNumericCellValue());

	        default:
	            return "";
	    }
	}
	//write data
	public void writeDataInTheCell(String filePath,int rowNo,int cellNo,String data) throws IOException {
		Row row = sheet.getRow(rowNo);
		
		if(row==null) {
			row=sheet.createRow(rowNo);
		}
		Cell cell = row.getCell(cellNo);
		if(cell==null) {
			cell=row.createCell(cellNo);
		}
		cell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(filePath);
		wb.write(fos);
		fos.close();
	}	
	//Get Entire data using Data properties
	public Object[][] getDataFromExcelSheet() {

	    int rowCount = sheet.getLastRowNum();
	    int colCount = sheet.getRow(0).getLastCellNum();

	    Object[][] data = new Object[rowCount][colCount];

	    for(int i = 1; i <= rowCount; i++) {
	        Row row = sheet.getRow(i);

	        for(int j = 0; j < colCount; j++) {
	            Cell cell = row.getCell(j, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
	            data[i-1][j] = cell.toString();
	        }
	    }
	    return data;
	}	

}
