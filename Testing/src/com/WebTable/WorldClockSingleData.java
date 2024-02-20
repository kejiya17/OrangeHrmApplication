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

public class WorldClockSingleData extends Basetest {

	@Test
	public void singleData() throws IOException {
		
		
	By webTableProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody");
	WebElement webTable=driver.findElement(webTableProperty);
	
	
	FileInputStream testDataFile=new FileInputStream("./src/com/OHRMTestDataExcelFiles/SingleColumnData.xlsx");
	XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
	XSSFSheet sheet=workBook.getSheet("sheet1");
	
	
	By webTableRowProperty=By.tagName("tr");
    List<WebElement>webTableRows=webTable.findElements(webTableRowProperty);
	
	for(int rowIndex=0;rowIndex<webTableRows.size();rowIndex++) 
	{
		WebElement rows=webTableRows.get(rowIndex);
		
		Row newRow=sheet.createRow(rowIndex);
	//	 Cell newRowOfCell=newRow.createCell(0);
		 
		 By rowOfCellProperty=By.tagName("td");
			List<WebElement>rowOfCells=rows.findElements(rowOfCellProperty);
		 
		 for(int rowOfCell=0;rowOfCell<1;rowOfCell++) 
		 {
			 WebElement Cell=rowOfCells.get(rowOfCell);
				String webTabledata=Cell.getText();
				System.out.print(webTabledata+"  |");
				
				Cell newCell=newRow.createCell(0);
				newCell.setCellValue(webTabledata);
				
			 
		 }
		 
		 System.out.println();
		 
		
		FileOutputStream testResultFile=new FileOutputStream("./src/com/OHRMResultFiles/SingleData_WebTable.xlsx");
		workBook.write(testResultFile);
		
	}
	
}
}
