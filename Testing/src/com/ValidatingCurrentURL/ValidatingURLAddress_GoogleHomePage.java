package com.ValidatingCurrentURL;
import org.openqa.selenium.chrome.*;
public class ValidatingURLAddress_GoogleHomePage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\vayuv\\OneDrive\\Desktop\\Selenium and Java Clases\\Testing\\Browser driver files\\chromedriver.exe");
    ChromeDriver chrome=new ChromeDriver();
    chrome.get("http://google.com");
    String expect_GoogleHomePageURLAddress="google.com";
    System.out.println("the expected google home page URL address is:-"+expect_GoogleHomePageURLAddress);
     
    String actual_webpageurladdress=chrome.getCurrentUrl();
    System.out.println("the actual web page URL address is:-"+actual_webpageurladdress);
    
    if(actual_webpageurladdress.contains(expect_GoogleHomePageURLAddress)) 
    {
    	System.out.println("the current url address is match:-pass");
    }
    else 
    {
    	System.out.println("the current url address is not match:-fail");
    }
    
    chrome.quit();
    
    
    
    
    
    
    
    
	}

}
