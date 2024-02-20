package com.GetURL;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.Log;
public class GetURL_GoogleHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\vayuv\\OneDrive\\Desktop\\Selenium and Java Clases\\Testing\\Browser driver files\\chromedriver.exe" );
ChromeDriver chrome=new ChromeDriver();
chrome.get("http://google.com");
String googleCurrentwebPageURLAddress=chrome.getCurrentUrl();

Log.info("The current URL address of the web page is:-"+googleCurrentwebPageURLAddress);
chrome.quit();


	}

}
