package com.leaftaps.ui.utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
public static String[][] getData(String excelFileName) throws IOException {
	// Locate and open the excel file
	XSSFWorkbook book = new XSSFWorkbook("./test-data/"+excelFileName+".xlsx");
	// Get into a particular Sheet
	XSSFSheet sheet = book.getSheetAt(0);
	// Get the total number of rows
	int rowNumber = sheet.getLastRowNum();
	System.out.println(rowNumber);
	// Get the total number of cols
	XSSFRow header = sheet.getRow(0);
	int colNumber = header.getLastCellNum();
	System.out.println(colNumber);
	
	// Create a 2D array for storing the data
	String[][] data = new String[rowNumber][colNumber];
	
	// Iterate over the rows to get each row for each iteration
	for (int i = 1; i <= rowNumber; i++) {
		XSSFRow eachRow = sheet.getRow(i);
		for (int j = 0; j < colNumber; j++) {
			XSSFCell eachCell = eachRow.getCell(j);
			String cellValue = eachCell.getStringCellValue();
			data[i-1][j] = cellValue;
			System.out.println(cellValue);
		}
	}
	book.close();
	return data;
}
}
