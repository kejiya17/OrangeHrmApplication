 package com.WebTable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CompleteWebTableData extends Basetest{

	@Test
	public void completeWebTableData() throws IOException 
	{
	
		//WebTableProperty
		
		///html/body/div[5]/section[1]/div/section/div[1]/div/table

		By webTableProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody");
	     WebElement webTable=driver.findElement(webTableProperty);
	
	     //Identifying the row
	     
	     By webTableRowProperty=By.tagName("tr");
	     List<WebElement>webTableRows=webTable.findElements(webTableRowProperty);
	     int webTableRow_Count=webTableRows.size();
	     System.out.println("Total number of rows in webtable:-"+webTableRow_Count);
	     
	     FileInputStream testDataFile=new FileInputStream("./src/com/OHRMTestDataExcelFiles/CompleteWebTableData.xlsx");
			XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
			XSSFSheet sheet=workBook.getSheet("Sheet1");
		
	for(int rowIndex=0;rowIndex<webTableRow_Count;rowIndex++) 
	{
		Row newRow=sheet.createRow(rowIndex);
		
		WebElement row=webTableRows.get(rowIndex);
		
		//Identifying the cell
		
		By rowOfCellProperty=By.tagName("td");
		List<WebElement>rowOfCells=row.findElements(rowOfCellProperty);
		int rowOfCellsCount=rowOfCells.size();
		System.out.println("Total number of cells in a row:-"+rowOfCellsCount);
	
		
		for(int rowOfCellIndex=0;rowOfCellIndex<rowOfCellsCount;rowOfCellIndex++) 
		{
			WebElement rowOfCell=rowOfCells.get(rowOfCellIndex);
			String webTabledata=rowOfCell.getText();
			System.out.print(webTabledata+"  |");
			
			Cell newCell=newRow.createCell(rowOfCellIndex);
			newCell.setCellValue(webTabledata);
			
		}
	
		System.out.println();
		
		FileOutputStream webTableDataResultfile=new FileOutputStream("./src/com/OHRMResultFiles/WebTableDataResult.xlsx");  
		workBook.write(webTableDataResultfile);
		
	}
	
	}	 
	
}
