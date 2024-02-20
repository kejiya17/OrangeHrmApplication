package com.Userdefined_SelectLanguages;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class SelectLanguage_dropdown {
     
	WebDriver driver;
	String applicationurladdress="https://www.osmania.ac.in/";
	
	public void applicationLaunch()
	{
		
		System.setProperty("webdriver.chrome.driver", "./Browser driver files/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationurladdress);
		driver.manage().window().maximize();
		
	}
	public void applicationclose() 
	{
			driver.quit();
	}
	public void gettingOptionalValuesOfSelectLanguageDropDown()	
	{
		
		By dropDownProperty=By.id("gtranslate_selector");
		WebElement dropDown=driver.findElement(dropDownProperty);
		dropDown.click();
		
		By optionalLanguageProperty=By.tagName("option");
		List<WebElement>optionLanguage=dropDown.findElements(optionalLanguageProperty);
		int optionalLanguagesCount =optionLanguage.size();
		System.out.println(optionalLanguagesCount);
		
		for(int index=0;index<optionalLanguagesCount;index++)
		{
			String optionalLanguagesNames=optionLanguage.get(index).getText();
			System.out.println(index+" "+optionalLanguagesNames);
			
		}
		

		}
		public static void main(String[] args) 
			{
				SelectLanguage_dropdown osmaniyaUniversity=new SelectLanguage_dropdown();
				osmaniyaUniversity.applicationLaunch();
				osmaniyaUniversity.gettingOptionalValuesOfSelectLanguageDropDown();
				osmaniyaUniversity.applicationclose();
				
				
			}	
	
}
