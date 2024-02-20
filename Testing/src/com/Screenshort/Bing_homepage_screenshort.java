package com.Screenshort;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bing_homepage_screenshort {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		WebDriver driver;
	String	applicationurladdress="http://bing.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vayuv\\OneDrive\\Desktop\\Selenium and Java Clases\\Testing\\Browser driver files\\chromedriver.exe");
         driver=new ChromeDriver();
		driver.get(applicationurladdress);
		
		
	
		File webPageScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(webPageScreenShot, new File("./ApplicationScreenShots/bingHomePageScreenShot.png"));

		
		
		
		
		 
		
		
		
		
	}

}
