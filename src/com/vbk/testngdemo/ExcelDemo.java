package com.vbk.testngdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDemo {
	
	@DataProvider(name="myData")
	public Object[][] data() throws IOException {
		
		FileInputStream fis = new FileInputStream(new File("D:\\login.xlsx"));
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("login");

		int rows=sheet.getLastRowNum();
		XSSFRow row = sheet.getRow(0);
		int cols = row.getLastCellNum();  
		Object [][]str=new Object[rows+1][cols];
																	
		for (int i = 0; i < 5; i++) {
		
			for (int j = 0; j < 2; j++) {
				row = sheet.getRow(i);
				XSSFCell cell = row.getCell(j);
						str[i][j]=cell.getStringCellValue();
			}
		}
		workbook.close();
		
		return str;
	}
}
