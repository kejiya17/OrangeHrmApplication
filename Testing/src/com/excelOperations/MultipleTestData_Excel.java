package com.excelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleTestData_Excel {

public static void main(String[] args) throws InterruptedException, IOException {

WebDriver driver;
  String  ApplicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

System.setProperty("webdriver.chrome.driver", "./Browser driver files/chromedriver.exe");
driver =new ChromeDriver();

  
  
driver.get(ApplicationURLAddress);

    
FileInputStream logInTestDataFile = new FileInputStream("./src/com/OHRMTestDataExcelFiles/MultipleTestData.xlsx");
XSSFWorkbook workBook = new XSSFWorkbook(logInTestDataFile);
XSSFSheet logInTestDataSheet = workBook.getSheet("Sheet1");

int rowCount=logInTestDataSheet.getLastRowNum();

for(int rowIndex=1;rowIndex<=rowCount;rowIndex++)
{
Row testDataSheetRow=logInTestDataSheet.getRow(rowIndex);

Cell userNameTestDataCell=testDataSheetRow.getCell(0);

String userNameTestData=userNameTestDataCell.getStringCellValue();


int testDataRowOfCellsCount=testDataSheetRow.getLastCellNum();

for(int rowOfCellIndex=1;rowOfCellIndex<testDataRowOfCellsCount;rowOfCellIndex++)
{

Cell rowOfCell=testDataSheetRow.getCell(rowOfCellIndex);

String passwordTestData=rowOfCell.getStringCellValue();

By userNamePoperty=By.id("txtUsername"); 
WebElement userName=driver.findElement(userNamePoperty); 
userName.sendKeys(userNameTestData);


By passwordProperty=By.name("txtPassword");
WebElement password=driver.findElement(passwordProperty);
password.sendKeys(passwordTestData);


By logInButtonProperty=By.className("button");
WebElement logInButton=driver.findElement(logInButtonProperty);
logInButton.click();

String Expected_OrangeHRMApplicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
System.out.println("The Expected URLAddress of OrangeHRMApplication is:- "+Expected_OrangeHRMApplicationURLAddress);
String Actual_OrangeHRMApplicationURLAddress=driver.getCurrentUrl();
System.out.println("The Actual   URLAddress of OrangeHRMApplication is:- "+Actual_OrangeHRMApplicationURLAddress);

if (Actual_OrangeHRMApplicationURLAddress.equals(Expected_OrangeHRMApplicationURLAddress))
{
    System.out.println("OrangeHRM Application URLAddress is Matched:- pass");
    
    Cell testRowOfCell=testDataSheetRow.createCell(2);
    testRowOfCell.setCellValue ("Successfully Navigated to OrangeHRM Application HomePage - pass");
    
    By welComeAdminProperty=By.partialLinkText("Admin");

    WebElement welComeAdmin=driver.findElement(welComeAdminProperty);
    
    welComeAdmin.click();

    Thread.sleep(3000);

    By logOutProperty=By.linkText("Logout");
    WebElement logOut=driver.findElement(logOutProperty);
    logOut.click();
}
else
{
    System.out.println("OrangeHRMApplicationURLAddress is Not Matched:-Pass ");
    Cell testRowOfCell=testDataSheetRow.createCell(2);
    testRowOfCell.setCellValue("Failed to Navigate to OrangeHRM Application HomePage - PASS ");
}



FileOutputStream testResultFile = new FileOutputStream("./src/com/OHRMResultFiles/MultipleTestData.xlsx");
workBook.write(testResultFile);


}
}
}

}
