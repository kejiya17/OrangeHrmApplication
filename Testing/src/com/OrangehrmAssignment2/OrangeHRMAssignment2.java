package com.OrangehrmAssignment2;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRMAssignment2 {

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vayuv\\OneDrive\\Desktop\\Selenium and Java Clases\\Testing\\Browser driver files\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		
		
		
		String expect_OrangeHRMTitle="OrangeHRM";
		System.out.println("The expected title is:-"+expect_OrangeHRMTitle);
		String actual_webpageTitle=driver.getTitle();
		System.out.println("The actual title is:-"+actual_webpageTitle);
		if(expect_OrangeHRMTitle.equals(actual_webpageTitle)) 
		{
			System.out.println("Title is same:-pass");
		}
		else 
		{
			System.out.println("the title is not same:-fail");
		}
		System.out.println();
		String expect_OrangehrmURL="orangehrm-4.2.0.1";
		System.out.println("The Orangehrm URL is:-"+expect_OrangehrmURL);
		String actual_webpageURL=driver.getCurrentUrl();
		System.out.println("The webpage URL is:-"+actual_webpageURL);
		if(actual_webpageURL.contains(expect_OrangehrmURL)) 
		{
			System.out.println("matching-pass");
		}
		else 
		{
			System.out.println("Not Matchinmg-fail");
		}
		System.out.println();
		//<div id="logInPanelHeading">LOGIN Panel</div>
		By loginProperty=By.id("logInPanelHeading");
		WebElement login=driver.findElement(loginProperty);
		String loginText=login.getText();
		System.out.println("expected login text is:-"+loginText);
		
		
		FileInputStream propertiesFile=new FileInputStream("./src/com/Config/OrangeHRMApplication.Properties");
		
		Properties properties=new Properties();
		properties.load(propertiesFile);
		
		
		String UsernameTestdata="kejiyarani";
		By UsernameProperty=By.id(properties.getProperty("OHRMApplication_LogIn_UserName_Property "));
		WebElement Username=driver.findElement(UsernameProperty);
		Username.sendKeys(UsernameTestdata);
		System.out.println("Valid Username is:-"+UsernameTestdata);
		String passwordTestdata="K@kejiya57";
		By passwordProperty=By.name(properties.getProperty("OHRMApplication_LogIn_Password_Property"));
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestdata);
		System.out.println("Valid Password is:-"+passwordTestdata); 
		By loginbuttonproperty=By.className(properties.getProperty("OHRMApplication_LogIn_LoginButton_Property"));
		WebElement loginbutton=driver.findElement(loginbuttonproperty);
		loginbutton.click();
		
		String expected_HomepageTitle="OrangeHRM";
		System.out.println("The Expected Home page title is:-"+expected_HomepageTitle);
		String actual_pageTitle=driver.getTitle();
		System.out.println("The actual web page title is:-"+actual_pageTitle);
		if(actual_pageTitle.equals(expected_HomepageTitle)) 
		{
			System.out.println("Home page title is same-pass");
		}
		else 
		{
			System.out.println("Home page title is not same-fail");
		}
		
		By welcomeProperty=By.partialLinkText("Welcome");
		WebElement Welcome=driver.findElement(welcomeProperty);
		String WelcomeText=Welcome.getText();
		System.out.println("The expected link text is:-"+welcomeProperty);
		
		By WelcomeAdminProperty=By.linkText(properties.getProperty("OHRMApplication_HomePage_welComeAdmin_Property"));
		WebElement WelcomeAdmin=driver.findElement(WelcomeAdminProperty);
		WelcomeAdmin.click();
		
		Thread.sleep(4000);
		
		By logoutProperty=By.linkText(properties.getProperty("OHRMApplication_HomePage_welComeAdmin_logOut_Property"));
		WebElement logout=driver.findElement(logoutProperty);
		logout.click();
		
//<img src="/orangehrm-4.2.0.1/symfony/web/webres_5bdfdad33dec87.24121780/themes/default/images/login/logo.png">
		
		
		
		
		driver.quit();
		
		
		
	}

}