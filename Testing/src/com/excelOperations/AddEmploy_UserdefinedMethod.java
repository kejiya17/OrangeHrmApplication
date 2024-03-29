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
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddEmploy_UserdefinedMethod {
   
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	public void applicationlaunch() 
	{
		System.setProperty("webdriver.chrome.driver", "./Browser driver files/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
	}	
		
	FileInputStream	loginTestDataFile;
	XSSFWorkbook workbook;
	XSSFSheet loginTestDataSheet;
	Row loginpageTextRow;
	FileOutputStream testResultFile;
	
	
	public void loginpageText() throws IOException 
	{
		FileInputStream	loginTestDataFile=new FileInputStream("./src/com/OHRMTestDataExcelFiles/AddEmployeeTestSheet.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(loginTestDataFile);
		XSSFSheet loginTestDataSheet=workbook.getSheet("Sheet1");
		Row loginpageTextRow=loginTestDataSheet.getRow(1);
		Cell rowOfCell=loginpageTextRow.getCell(0);
		
		String loginpageTextCellValue=rowOfCell.getStringCellValue();
		System.out.println("The expected title is:-"+loginpageTextCellValue);
         //<div id="logInPanelHeading">LOGIN Panel</div>
        By logInPanelProperty=By.id("logInPanelHeading");
        WebElement logInPanel=driver.findElement(logInPanelProperty);
        String text=logInPanel.getText();
        System.out.println("The Actual Webpage Title is:-"+text);
        
        Cell RowOfNewCell=loginpageTextRow.createCell(1);

     // Sending the Test data into the New Row Of Cell Created
     RowOfNewCell.setCellValue(text);

        
        if(loginpageTextCellValue.equals(text)) 
        {
        	 System.out.println("Title Matched-Pass");
        	 Cell TestResult=loginpageTextRow.createCell(2);
        	 TestResult.setCellValue("Pass");
        }
        else 
        {
        	System.out.println("Title not Matched:-Fail");
        	 Cell TestResult=loginpageTextRow.createCell(2);
        	 TestResult.setCellValue("Fail");
        }
        FileOutputStream testResultFile=new FileOutputStream("./src/com/OHRMResultFiles/AddEmployeeResultSheet.xlsx");
        workbook.write(testResultFile);
	}

	// Login with valid credentials
	 public void LoginDetails() throws IOException 
	 {
		 FileInputStream	loginTestDataFile=new FileInputStream("./src/com/OHRMTestDataExcelFiles/AddEmployeeTestSheet.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(loginTestDataFile);
			XSSFSheet loginTestDataSheet=workbook.getSheet("Sheet1");
		 Row loginpageTextRow=loginTestDataSheet.getRow(1);
		 Cell rowOfCell=loginpageTextRow.getCell(3);
			String userNameCellValue=rowOfCell.getStringCellValue(); 
			System.out.println("The valid UserName is:-"+userNameCellValue);

		    By UsernameProperty=By.id("txtUsername");
			WebElement Username=driver.findElement(UsernameProperty);
			Username.sendKeys(userNameCellValue);
			
			Cell passwordrowOfCell=loginpageTextRow.getCell(4);
			String passwordCellValue=passwordrowOfCell.getStringCellValue();
			System.out.println("The Password is:- "+passwordCellValue);
			
			By paswordProperty=By.id("txtPassword");
		    WebElement password=driver.findElement(paswordProperty);
		    password.sendKeys(passwordCellValue);
		    
		    By loginProperty=By.className("button");
		    WebElement login=driver.findElement(loginProperty);
		    login.click();
		    
		    testResultFile=new FileOutputStream("./src/com/OHRMResultFiles/AddEmployeeTestSheet.xlsx");
	        workbook.write(testResultFile);
		    
		   
	 }
	
	 //Application Close
	public void ApplicationClose()
	{
		driver.close();
	}
	
	// Home page text
	public void HomePageText() throws IOException 
	{
		 FileInputStream loginTestDataFile=new FileInputStream("./src/com/OHRMResultFiles/AddEmployeeResultSheet.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(loginTestDataFile);
			XSSFSheet loginTestDataSheet=workbook.getSheet("Sheet1");
		loginpageTextRow=loginTestDataSheet.getRow(1);
		 Cell rowOfCell=loginpageTextRow.getCell(8);
		 String homePageTextValue=rowOfCell.getStringCellValue();
		 System.out.println("Expected text is:-"+homePageTextValue);
		//<a href="#" id="welcome" class="panelTrigger activated-welcome">Welcome Admin</a>
		By welComeProperty=By.id("welcome");
		WebElement welCome=driver.findElement(welComeProperty);
		String webPageText=welCome.getText();
		System.out.println("Actual web page text is:-"+webPageText);
		
		Cell rowOfcell=loginpageTextRow.createCell(9);
		rowOfcell.setCellValue(webPageText);
		
		if(webPageText.contains(homePageTextValue)) 
		{
			System.out.println("The expected home text is Matching:-Pass");
			Cell createrowOfcell=loginpageTextRow.createCell(10);
			createrowOfcell.setCellValue("Pass");
		}
		else 
		{
			System.out.println("The actual web page title is Not MAtching:-Fail");
			Cell RowOfcell=loginpageTextRow.createCell(10);
			RowOfcell.setCellValue("Fail");
		}
		FileOutputStream testResultFile=new FileOutputStream("./src/com/OHRMResultFiles/AddEmployeeTestSheet2.xlsx");
        workbook.write(testResultFile);
	  	
	}
	
	// clicl on AddEmployee
	public void AddEmployee_PageText() throws InterruptedException, IOException 
	{   
		By PimProperty=By.id("menu_pim_viewPimModule");
		WebElement Pim=driver.findElement(PimProperty);
		
		// mouse Hover Operation
		
		Actions mouseHoverOperation = new Actions(driver);
		mouseHoverOperation.moveToElement(Pim).build().perform();
        Thread.sleep(3000);
		
        // id="menu_pim_addEmployee"
        
        By addEmployeeProperty=By.id("menu_pim_addEmployee");
		WebElement addEmployee=driver.findElement(addEmployeeProperty);
		addEmployee.click();
		
		// AddEmployee page Text
		
		FileInputStream loginTestDataFile=new FileInputStream("./src/com/OHRMResultFiles/AddEmployeeTestSheet2.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(loginTestDataFile);
		XSSFSheet loginTestDataSheet=workbook.getSheet("Sheet1");
		loginpageTextRow=loginTestDataSheet.getRow(1);
		 Cell rowOfCell=loginpageTextRow.getCell(11);
		 String addEmployeePageText=rowOfCell.getStringCellValue();
		System.out.println("Expected addemployee page text is:-"+addEmployeePageText);
		
		//<label class="hasTopFieldHelp">Full Name</label>
		
		By fullNameProperty=By.className("hasTopFieldHelp");
		WebElement fullName=driver.findElement(fullNameProperty);
		String fullNameText=fullName.getText();
		System.out.println("Actual webpagetext is:-"+fullNameText);
		Cell createrowOfcell=loginpageTextRow.createCell(12);
		createrowOfcell.setCellValue(fullNameText);
		
		
		if(fullNameText.equals(addEmployeePageText)) 
		{
			System.out.println("Text is MAtching:-Pass");
			Cell rowOfcell=loginpageTextRow.createCell(13);
			rowOfcell.setCellValue("Pass");
		}
		else 
		{
			System.out.println("Text is not Matching:-Fail");
			Cell RowOfcell=loginpageTextRow.createCell(13);
			RowOfcell.setCellValue("Fail");
			
		}
		
		FileOutputStream testResultFile=new FileOutputStream("./src/com/OHRMResultFiles/AddEmployeeTestSheet3.xlsx");
        workbook.write(testResultFile);
		
	}
		
	public void EnterDetails() throws IOException, InterruptedException 
	{
		FileInputStream loginTestDataFile=new FileInputStream("./src/com/OHRMResultFiles/AddEmployeeTestSheet3.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(loginTestDataFile);
		XSSFSheet loginTestDataSheet=workbook.getSheet("Sheet1");
		loginpageTextRow=loginTestDataSheet.getRow(1);
		
		//id="firstName"
		 Cell rowOfCell=loginpageTextRow.getCell(14);
		 String firstNameText=rowOfCell.getStringCellValue();
		System.out.println("The first name text is:-"+firstNameText);
		
		By firstNameProperty=By.id("firstName");
	     WebElement firstName=driver.findElement(firstNameProperty);
	     firstName.sendKeys(firstNameText);
	   
	     //id="middleName"
	     loginpageTextRow=loginTestDataSheet.getRow(1);
	     Cell middleNamerowOfCell=loginpageTextRow.getCell(15);
	     String middleNameText=middleNamerowOfCell.getStringCellValue();
		 System.out.println("The middle name text is:-"+middleNameText);
		  
		 By middleNameProperty=By.id("middleName");
		 WebElement middleName=driver.findElement(middleNameProperty);
		 middleName.sendKeys(middleNameText);
		
		//id="lastName"
		 Cell lastNamerowOfCell=loginpageTextRow.getCell(16);
	     String lastNameText=lastNamerowOfCell.getStringCellValue();
		 System.out.println("The last name text is:-"+lastNameText);
		  
		 By lastNameProperty=By.id("lastName");
		 WebElement lastName=driver.findElement(lastNameProperty);
	       lastName.sendKeys(lastNameText);
		 
		//id="employeeId" 
		 WebElement EmployeeId=driver.findElement(By.id("employeeId"));
			String EmployeeIdValue=EmployeeId.getAttribute("value");
			System.out.println(EmployeeIdValue);
			Cell RowOfcell=loginpageTextRow.createCell(17);
			RowOfcell.setCellValue(EmployeeIdValue);
			
		//id="btnSave"
			By saveProperty=By.id("btnSave");
			WebElement save=driver.findElement(saveProperty);
			save.click();
			Thread.sleep(5000);
		 FileOutputStream testResultFile=new FileOutputStream("./src/com/OHRMResultFiles/AddEmployeeTestSheet4.xlsx");
	        workbook.write(testResultFile);
	
	}
	
	  public void EmployeePageValidation() throws IOException 
		{
		  FileInputStream loginTestDataFile=new FileInputStream("./src/com/OHRMResultFiles/AddEmployeeTestSheet4.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(loginTestDataFile);
			XSSFSheet loginTestDataSheet=workbook.getSheet("Sheet1");
			loginpageTextRow=loginTestDataSheet.getRow(1);
			
			Cell rowOfCell=loginpageTextRow.getCell(18);
			 String EmployeePageText=rowOfCell.getStringCellValue();
			System.out.println("The Employee page text is:-"+EmployeePageText);
			
			//<label for="Full_Name" class="hasTopFieldHelp">Full Name</label>
			
			By fullNameProperty=By.className("hasTopFieldHelp");
			WebElement fullName=driver.findElement(fullNameProperty);
			String fullNameText=fullName.getText();
			System.out.println("Actual webpagetext is:-"+fullNameText);
			Cell createrowOfcell=loginpageTextRow.createCell(19);
			createrowOfcell.setCellValue(fullNameText);
			
			if(fullNameText.equals(EmployeePageText)) 
			{
				System.out.println("Text is MAtching:-Pass");
				Cell rowOfcell=loginpageTextRow.createCell(20);
				rowOfcell.setCellValue("Pass");
			}
			else 
			{
				System.out.println("Text is not Matching:-Fail");
				Cell RowOfcell=loginpageTextRow.createCell(20);
				RowOfcell.setCellValue("Fail");
				
			}
			
			FileOutputStream testResultFile=new FileOutputStream("./src/com/OHRMResultFiles/AddEmployeeTestSheet5.xlsx");
	        workbook.write(testResultFile);
	
		}
		
		public void fullNameValidation() throws IOException, InterruptedException 
		{
			 FileInputStream loginTestDataFile=new FileInputStream("./src/com/OHRMResultFiles/AddEmployeeTestSheet5.xlsx");
				XSSFWorkbook workbook=new XSSFWorkbook(loginTestDataFile);
				XSSFSheet loginTestDataSheet=workbook.getSheet("Sheet1");
				loginpageTextRow=loginTestDataSheet.getRow(1);

			//FirstName Validation
			
			// id="personal_txtEmpFirstName"
			 Cell rowOfCell=loginpageTextRow.getCell(14);
			 String firstNameText=rowOfCell.getStringCellValue();
			System.out.println("The first name text is:-"+firstNameText);
			
			By firstNameProperty=By.id("personal_txtEmpFirstName");
		     WebElement firstName=driver.findElement(firstNameProperty);
		     String firstNameValue=firstName.getAttribute("value");
		   System.out.println("Web page first name value is:-"+firstNameValue);
		     Cell RowOfcell=loginpageTextRow.createCell(21);
				RowOfcell.setCellValue(firstNameValue);
			
			if(firstNameValue.equals(firstNameText)) 
			{
				System.out.println("FirstName value is same -Pass");
				Cell rowOfcell=loginpageTextRow.createCell(22);
				rowOfcell.setCellValue("pass");
			}
			else 
			{
				System.out.println("FirstName value is not same -Fail");
				Cell rowOfcell=loginpageTextRow.createCell(22);
				rowOfcell.setCellValue("Fail");
			}

			//MiddleName Validation	
			 
			// id="personal_txtEmpMiddleName" 
		     Cell middleNamerowOfCell=loginpageTextRow.getCell(15);
		     String middleNameText=middleNamerowOfCell.getStringCellValue();
			 System.out.println("The middle name text is:-"+middleNameText);
			  
			 By middleNameProperty=By.id("personal_txtEmpMiddleName");
			 WebElement middleName=driver.findElement(middleNameProperty);
			 String middlenameValue=middleName.getAttribute("value");
             System.out.println("The middle name value is :-"+middlenameValue);
             
			 Cell rowOfcell=loginpageTextRow.createCell(23);
				rowOfcell.setCellValue(middlenameValue);
			
			if(middlenameValue.equals(middleNameText)) 
			{
				System.out.println("middleName value is same -Pass");
				Cell middleNamerowOfcell=loginpageTextRow.createCell(24);
				middleNamerowOfcell.setCellValue("pass");
			}
			else 
			{
				System.out.println("middleName value is not same -Fail");
				Cell middlenamerowOfcell=loginpageTextRow.createCell(24);
				middlenamerowOfcell.setCellValue("Fail");
			}
			
			//LastName Validatiion
			
			//id="personal_txtEmpLastName"
			 Cell lastNamerowOfCell=loginpageTextRow.getCell(16);
		     String lastNameText=lastNamerowOfCell.getStringCellValue();
			 System.out.println("The last name text is:-"+lastNameText);
			  
			 By lastNameProperty=By.id("personal_txtEmpLastName");
			 WebElement lastName=driver.findElement(lastNameProperty);
		       String lastNameValue=lastName.getAttribute("value");
			 System.out.println("The last name value is:-"+lastNameValue);
			 
			 Cell lastnamerowOfcell=loginpageTextRow.createCell(25);
			 lastnamerowOfcell.setCellValue(lastNameValue);
			 
		       if(lastNameValue.equals(lastNameText)) 
				{
					System.out.println("lastName value is same -Pass");
					Cell lastNamerowOfcell=loginpageTextRow.createCell(26);
					lastNamerowOfcell.setCellValue("pass");
				}
				else 
				{
					System.out.println("lastName value is not same -Fail");
					Cell lastNamerowOfcell=loginpageTextRow.createCell(26);
					lastNamerowOfcell.setCellValue("Fail");
				}
		       
		       //Employee Id VAlidation
		       
		      //id="personal_txtEmployeeId"
		       
					By employeeidProperty=By.id("personal_txtEmployeeId");
					WebElement employeeid=driver.findElement(employeeidProperty);
					String employeeidValue=employeeid.getAttribute("value");
					
					 Cell employeeIdRowOfcell=loginpageTextRow.createCell(27);
					employeeIdRowOfcell.setCellValue(employeeidValue);
		       
					 employeeIdRowOfcell=loginpageTextRow.createCell(28);
						employeeIdRowOfcell.setCellValue("pass");
				
		       
						
						
						
						
						
						
						
						
		       
				
		       FileOutputStream testResultFile=new FileOutputStream("./src/com/OHRMResultFiles/AddEmployeeTestSheet6.xlsx");
		        workbook.write(testResultFile);
			
		        By WelcomeAdminProperty=By.linkText("Welcome Admin");
				WebElement WelcomeAdmin=driver.findElement(WelcomeAdminProperty);
				WelcomeAdmin.click();
				
				Thread.sleep(4000);
				
				By logoutProperty=By.linkText("Logout");
				WebElement logout=driver.findElement(logoutProperty);
				logout.click();
				Thread.sleep(2000);
		        
	}
		
		public void ValidationLoginPageAfterLogout() throws IOException 
		{
			
			FileInputStream	loginTestDataFile=new FileInputStream("./src/com/OHRMResultFiles/AddEmployeeTestSheet6.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(loginTestDataFile);
			XSSFSheet loginTestDataSheet=workbook.getSheet("Sheet1");
			Row loginpageTextRow=loginTestDataSheet.getRow(1);
			Cell rowOfCell=loginpageTextRow.getCell(29);
			
			String loginpageTextCellValue=rowOfCell.getStringCellValue();
			System.out.println("The expected title is:-"+loginpageTextCellValue);
	         //<div id="logInPanelHeading">LOGIN Panel</div>
	        By logInPanelProperty=By.id("logInPanelHeading");
	        WebElement logInPanel=driver.findElement(logInPanelProperty);
	        String text=logInPanel.getText();
	        System.out.println("The Actual Webpage Title is:-"+text);
	        
	        Cell RowOfNewCell=loginpageTextRow.createCell(30);

	     // Sending the Test data into the New Row Of Cell Created
	     RowOfNewCell.setCellValue(text);

	        
	        if(loginpageTextCellValue.equals(text)) 
	        {
	        	 System.out.println("Title Matched-Pass");
	        	 Cell TestResult=loginpageTextRow.createCell(31);
	        	 TestResult.setCellValue("Pass");
	        }
	        else 
	        {
	        	System.out.println("Title not Matched:-Fail");
	        	 Cell TestResult=loginpageTextRow.createCell(31);
	        	 TestResult.setCellValue("Fail");
	        }
	        FileOutputStream testResultFile=new FileOutputStream("./src/com/OHRMResultFiles/AddEmployeeResultSheet7.xlsx");
	        workbook.write(testResultFile);
		}

			
		
		
		
		
		public static void main(String[]args) throws IOException, InterruptedException
		{
			
			AddEmploy_UserdefinedMethod m1=new AddEmploy_UserdefinedMethod();
			m1.applicationlaunch();
			m1.loginpageText();
			m1.LoginDetails();
			m1.HomePageText();
			m1.AddEmployee_PageText();
			m1.EnterDetails();
			m1.EmployeePageValidation();
			m1.fullNameValidation();
			m1.ValidationLoginPageAfterLogout();
			m1.ApplicationClose();
			
		}
		
		
		
		

	}


