package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.utility.Log;

public class BaseTest {

	
	public static WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
@AfterMethod
public void setUp() 
{
	System.setProperty("webdriver.chrome.driver", "./Browser driver files/chromedriver.exe");
	driver=new ChromeDriver();
	Log.info("ChromeBrowser Launched Successfully");
	
	driver.get(applicationUrlAddress);
	Log.info("Successfully Navigate to OrangeHRMApplication");
}
	
@BeforeMethod
public void tearDown() 
{
	driver.quit();
	Log.info("Application Closed Successfuly");
}



	
}
