package com.OHRM_PIM_AddEmploy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OHRM_Pim_AddEmploy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver","./Browser driver files/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		String UsernameTsetData="kejiyarani";
		By UsernameProperty=By.id("txtUsername");
		WebElement Username=driver.findElement(UsernameProperty);
		Username.sendKeys(UsernameTsetData);
		
	    driver.findElement(By.id("txtPassword")).sendKeys("K@kejiya57");
		driver.findElement(By.className("button")).click();
		
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
		
		By PimProperty=By.id("menu_pim_viewPimModule");
		WebElement Pim=driver.findElement(PimProperty);
		
		Actions MouseHoverOperation_pim=new Actions(driver);
		MouseHoverOperation_pim.moveToElement(Pim).build().perform();
		
		Thread.sleep(5000);
		
		// <a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
		
	     driver.findElement(By.id("menu_pim_addEmployee")).click();
	     
		//<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
		
		driver.findElement(By.id("firstName")).sendKeys("kejiya");
		
		//<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
		
		driver.findElement(By.id("middleName")).sendKeys("rani");
		
		//<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
		
		driver.findElement(By.id("lastName")).sendKeys("medida");
		
        //<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0001" id="employeeId">
		WebElement EmployeeId=driver.findElement(By.id("employeeId"));
		String EmployeeIdValue=EmployeeId.getAttribute("value");
		System.out.println(EmployeeIdValue);
	     System.out.println();
		//<input type="button" class="hover" id="btnSave" value="Save">
		
		driver.findElement(By.id("btnSave")).click();
		
		//<input value="kejiya" type="text" name="personal[txtEmpFirstName]" class="block default editable" maxlength="30" title="First Name" id="personal_txtEmpFirstName" disabled="disabled">
		
		By firstNameProperty=By.id("personal_txtEmpFirstName");
		WebElement firstName=driver.findElement(firstNameProperty);
		firstName.getAttribute("value");
		
		String excepted_firstNameTestData="kejiya";
		System.out.println("The expected fiestName Test Data is:-"+excepted_firstNameTestData);
		String actual_firstNameTestData=firstName.getAttribute("value");
		System.out.println("The actual first name is:-"+actual_firstNameTestData);
		
		if(actual_firstNameTestData.equals(excepted_firstNameTestData))
		{
			System.out.println("Actual first name is equal to expected first name-pass");
		}
		else 
		{
			System.out.println("Actual first name is not equal to expected first name-fail");
		}
		System.out.println();
		//<input value="rani" type="text" name="personal[txtEmpMiddleName]" class="block default editable" maxlength="30" title="Middle Name" id="personal_txtEmpMiddleName" disabled="disabled">
		
		By middleNameProperty=By.id("personal_txtEmpMiddleName");
		WebElement middleName=driver.findElement(middleNameProperty);
		middleName.getAttribute("value");
		
		String expected_middleNameTestData="rani";
		System.out.println("The expected middle name is:-"+expected_middleNameTestData);
		String actual_middleNameTestData=middleName.getAttribute("value");
		System.out.println("The actual midle name is:-"+actual_middleNameTestData);
		
		if(actual_middleNameTestData.equals(expected_middleNameTestData))
		{
			System.out.println("Actual midd name is equal to expected middle name-pass");
		}
		else 
		{
			System.out.println("The actual middle name is not equal to expected middle name-fail");
		}
		System.out.println();
		//<input value="medida" type="text" name="personal[txtEmpLastName]" class="block default editable" maxlength="30" title="Last Name" id="personal_txtEmpLastName" disabled="disabled">
		
		By lastNameProperty=By.id("personal_txtEmpLastName");
		WebElement lastName=driver.findElement(lastNameProperty);
		lastName.getAttribute("value");
		
		String expected_lastNameTestData="medida";
		System.out.println("The expected lastName is:-"+expected_lastNameTestData);
		String actual_lastNameTestData=lastName.getAttribute("value");
		System.out.println("The actual lastName is:-"+actual_lastNameTestData);
		
		if(actual_lastNameTestData.equals(expected_lastNameTestData))
		{
			System.out.println("The actual lastName is equal to expected lastName:-pass");
		}
		else 
		{
			System.out.println("The actual lastName is not equal to expected lastName:-fail");
		}
		
		
		
	driver.quit();	
		
	}

}
