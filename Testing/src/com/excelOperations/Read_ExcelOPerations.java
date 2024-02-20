package com.excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_ExcelOPerations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream testDataFile = new FileInputStream("./src/com/OHRMTestDataExcelFiles/kejiya.xlsx");

		// Identify the workBook in the File
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);

		 // Identify the Sheet in the WorkBook
		XSSFSheet testDataSheet = workBook.getSheet("Sheet1");

		// Identify a Particular Row in the Sheet
		Row testDataSheetRow=testDataSheet.getRow(1);

		// Identify a Particular Row of a Cell in the Row
		Cell testDataRowOfCell=testDataSheetRow.getCell(0);

		// Get the Test data from the Row Of Cell
		String testData=testDataRowOfCell.getStringCellValue();

		System.out.println(testData);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
