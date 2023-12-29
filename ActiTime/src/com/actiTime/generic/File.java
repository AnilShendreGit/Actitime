package com.actiTime.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File {
	// to read the data from the property file
	public String getPropertyDate(String key) throws Exception {
		FileInputStream fis = new FileInputStream("./data/commandata.property");
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(key);
	}
	// to read the data from the ecell file
	public String getExcelData(String sheetName , int row , int cell ) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/fireflink users.xlsx");	
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	// to update the excell date 
	public void setExcelData(String sheetName , int row , int cell ,String update) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./data/fireflink users.xlsx");	
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheetName).getRow(row).getCell(cell).setCellValue(update);
		FileOutputStream fos = new FileOutputStream("./data/fireflink users.xlsx");
		wb.write(fos);
		wb.close();
	}
}
