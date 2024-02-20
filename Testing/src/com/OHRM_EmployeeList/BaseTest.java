package com.OHRM_EmployeeList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver","./Browser driver files/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
	}
	
	@AfterTest
	public void termsDown() 
	{
		driver.quit();
		
	}
	
	
}
