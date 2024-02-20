package com.WebTable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Basetest {

	WebDriver driver;
	String applicationUrlAddress="https://www.timeanddate.com/worldclock/";
	
	@BeforeTest
	public void setUp() 
	{
		
		System.setProperty("webdriver.chrome.driver","./Browser driver files/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
	}
	
	@AfterTest
	public void tearDown() 
	{
		driver.quit();
	}
	
}
