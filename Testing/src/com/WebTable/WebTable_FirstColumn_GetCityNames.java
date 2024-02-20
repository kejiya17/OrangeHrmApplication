package com.WebTable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_FirstColumn_GetCityNames extends Basetest {
	
	@Test
	public void firstColumn_GettingCityNames() throws IOException 
	{
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[2]/td[1]
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[3]/td[1]
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
		
		FileInputStream testDataFile=new FileInputStream("./src/com/OHRMTestDataExcelFiles/FirstColumn_Citynames.xlsx");
		XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
		XSSFSheet sheet=workBook.getSheet("Sheet1");
		
		
		for(int rowIndex=1;rowIndex<=36;rowIndex++) 
		{
			Row newRow=sheet.createRow(rowIndex);
			 Cell newRowOfCell=newRow.createCell(0);
			
			By webTableCityNameProperty=By.xpath(" /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td[1]");
			WebElement cityName=driver.findElement(webTableCityNameProperty);
			String cityNameText=cityName.getText();
			System.out.println("City NAme Text is:-"+cityNameText);
			
			newRowOfCell.setCellValue(cityNameText);
			
			FileOutputStream testResultFile=new FileOutputStream("./src/com/OHRMResultFiles/SingleColumn_CityNames.xlsx");
			workBook.write(testResultFile);
			
		}
		
	}
	
	
	
	

}
