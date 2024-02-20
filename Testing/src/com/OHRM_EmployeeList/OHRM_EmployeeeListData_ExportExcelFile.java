package com.OHRM_EmployeeList;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OHRM_EmployeeeListData_ExportExcelFile extends BaseTest{

	FileInputStream propertiesFile;
	Properties properties;
	
	@Test(priority=1)
	public void logInDetails() throws IOException
	{
		propertiesFile = new FileInputStream("./src/com/Config/OrangeHRMApplication.Properties");

		properties = new Properties();
		properties.load(propertiesFile);

		
		
		
	  String userNameTsetData="kejiyarani";
	  By userNameProperty=By.id(properties.getProperty("OHRMApplication_LogIn_UserName_Property"));
	  WebElement Username=driver.findElement(userNameProperty);
	  Username.sendKeys(userNameTsetData);
	
	  String passWordTestData="K@kejiya57";
	  By passWordProperty=By.id(properties.getProperty("OHRMApplication_LogIn_Password_Property"));
	  WebElement passWord=driver.findElement(passWordProperty);
	  passWord.sendKeys(passWordTestData);
	  
	  By logInProperty=By.className(properties.getProperty("OHRMApplication_LogIn_LoginButton_Property"));
	  WebElement logIn=driver.findElement(logInProperty);
	  logIn.click();
	  
	}
	
	@Test(priority=2)
	public void employeeList() throws InterruptedException, IOException 
	{
		By PimProperty=By.id("menu_pim_viewPimModule"); 
		WebElement Pim=driver.findElement(PimProperty);
		
		Actions MouseHoverOperation_pim=new Actions(driver);
		MouseHoverOperation_pim.moveToElement(Pim).build().perform();
		
		Thread.sleep(3000);
		
		//id="menu_pim_viewEmployeeList"
		
		By employeeListProperty=By.id("menu_pim_viewEmployeeList");
		WebElement employeeList=driver.findElement(employeeListProperty);
		employeeList.click();
		
		// Identify TableProperty
		// /html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody
		
		By tableProperty=By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody");
		WebElement table=driver.findElement(tableProperty);
		
		
		// In the table- identify a row
		// /html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]
		
		By tableRowProperty=By.tagName("tr");
	     List<WebElement>tableRows=table.findElements(tableRowProperty);
	     int tableRow_Count=tableRows.size();
	     System.out.println("Total number of rows in webtable:-"+tableRow_Count);
	     
	     
	     FileInputStream testDataFile=new FileInputStream("./src/com/OHRMTestDataExcelFiles/EmployeeListFile.xlsx");
			XSSFWorkbook workBook=new XSSFWorkbook(testDataFile);
			XSSFSheet sheet=workBook.getSheet("Sheet1");
			
	     
	     
		for(int rowIndex=0;rowIndex<tableRow_Count;rowIndex++) 
		{
			WebElement rows=tableRows.get(rowIndex);
			
			Row newRow=sheet.createRow(rowIndex);
			
			
			// Identify row of cell
		    // /html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[1]/td[1]
			
			By rowOfCellProperty=By.tagName("td");
			List<WebElement>rowOfCells=rows.findElements(rowOfCellProperty);
			int rowOfCells_Count=rowOfCells.size();
			System.out.println("Total number of cells in a row:-"+rowOfCells_Count);
			
			for(int rowOfCellIndex=0;rowOfCellIndex<4;rowOfCellIndex++) 
			{
				WebElement rowOfCell=rowOfCells.get(rowOfCellIndex);
				String rowOfCellValue=rowOfCell.getText();
				System.out.print(rowOfCellValue+" ");
				
				Cell Cell=newRow.createCell(rowOfCellIndex);
				Cell.setCellValue(rowOfCellValue);
				
			}
			
			System.out.println();
			
			FileOutputStream webTableDataResultfile=new FileOutputStream("./src/com/OHRMResultFiles/EmployeeList.xlsx");  
			workBook.write(webTableDataResultfile);
			
		}
	    
		
	}
	
	
	
}
