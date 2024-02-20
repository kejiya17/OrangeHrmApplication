package com.GetTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle_BingHomePage {
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vayuv\\OneDrive\\Desktop\\Selenium and Java Clases\\Testing\\Browser driver files\\chromedriver.exe");
	ChromeDriver chrome=new ChromeDriver();
	chrome.get("http://bing.com");
	 String bingTitle=chrome.getTitle();
	 System.out.println("the Title of the bing home page is:-"+bingTitle);
	 chrome.quit();
	
	
	
	
}
}
