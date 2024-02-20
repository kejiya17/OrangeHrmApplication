package com.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public WebDriver driver;
	String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";
	
	@BeforeTest
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver", "./Browser driver files/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
