package com.ValidatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTitle_BingHomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\vayuv\\OneDrive\\Desktop\\Selenium and Java Clases\\Testing\\Browser driver files\\chromedriver.exe" );
ChromeDriver chrome=new ChromeDriver();
chrome.get("http://bing.com");
String expect_TitleofBingHomePage="Bing";
System.out.println("Expect title of the bing home page:-"+expect_TitleofBingHomePage);

String actual_webPageTitle=chrome.getTitle();
System.out.println("The actual Title of the bing home page is:-"+actual_webPageTitle);

if(actual_webPageTitle.equals(expect_TitleofBingHomePage)) 
{
	System.out.println("The Title of Bing home page is MATCHED:-pass");
}
else 
{
	System.out.println("The Title of Bing home page is NOT MATCHED:-fail");
}

chrome.quit();










	}

}
