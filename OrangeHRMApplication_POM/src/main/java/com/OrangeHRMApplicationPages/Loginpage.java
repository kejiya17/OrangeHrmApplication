package com.OrangeHRMApplicationPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.utility.Log;

public class Loginpage extends BaseTest{
	
	
	public Loginpage() // Constructor - When a Class Name is similar to the Method Name
	{

	PageFactory.initElements(driver,this );
	}

	
	
	
	
	// 1.Identification Of WebElements
	//<div id="logInPanelHeading">LOGIN Panel</div>
	
	@FindBy(id="logInPanelHeading")
	WebElement logInPanelText;
	
	//Performing Operation on the WebElement
	
	public void OrangeHRM_logInPage_LogInPanelText() 
	{
		String expected_OrangeHRMApplicationLogInPageLogInPannelText="LOGIN Panel";
		Log.info("The Expected LogInPanel text is:-"+expected_OrangeHRMApplicationLogInPageLogInPannelText);
		
		String actual_OrangeHRMApplicationLogInPageLogInPannelText=logInPanelText.getText();
		Log.info("The Actual LogInPanel text is:-"+actual_OrangeHRMApplicationLogInPageLogInPannelText);
		
		if(actual_OrangeHRMApplicationLogInPageLogInPannelText.equals(expected_OrangeHRMApplicationLogInPageLogInPannelText)) 
		{
			Log.info(" LogIn Pannel Text Validation Successful - PASS");
		}
		else 
		{
			Log.info(" LogIn Pannel Text Validation Not Successful - Fail");
		}
		
	}
	
	
	// OrangeHRM Application WebElement Property
	// /html/body/div[1]/div/div[2]/div/img

	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/img")
	WebElement orangeHRMApplicationLogInPageLogo;


	public void orangeHRMApplicationLogInPageLogoValidation()
	{

	boolean flag=orangeHRMApplicationLogInPageLogo.isDisplayed();

	if(flag)
	{
	
	Log.info(" OrangeHRM Applicaiton LogIn page Logo found - PASS ");
	}
	else
	{
	Log.info(" OrangeHRM Applicaiton LogIn page Logo NOT found - FAIL ");
	}

	}

	
	
	// id="txtUsername"

	@FindBy(id="txtUsername")
	WebElement userName;


	// name="txtPassword"
	@FindBy(name="txtPassword")
	WebElement password;

	// class="button"
	@FindBy(className="button")
	WebElement logInButton;


	public void orangeHRMApplicationLogInPage_logInValdiation(String UserName,String Password)
	{
	/*	FileInputStream logInTestDataFile = new FileInputStream("./src/com/OHRMTestDataExcelFiles/MultipleTestData.xlsx");
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

	*/	
		
	    userName.sendKeys(UserName);
	    password.sendKeys(Password);
	    logInButton.click();
		}
	// Log Message
//	}

	/*	FileOutputStream testResultFile = new FileOutputStream("./src/main/java/com/OHRMTestResultFiles/MultipleTestData.xlsx");
		workBook.write(testResultFile);
*/

		
//	}
	
	

}
