package com.ApplicationLaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
public class Testing_OrangeHRMApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vayuv\\OneDrive\\Desktop\\Selenium and Java Clases\\Testing\\Browser driver files\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(applicationUrlAddress);
		
		System.out.println("1st-EXPECTED TITLE OrangeHRM");
		System.out.println();
		
		String expected_OrangeHRMApplication="OrangeHRM";
		System.out.println("The Expected OrangeHRM Application Title is:-"+expected_OrangeHRMApplication);
		String actual_webpageTitle=driver.getTitle();
		System.out.println("The actual webpage Title is:-"+ actual_webpageTitle);
		
		if(actual_webpageTitle.equals(expected_OrangeHRMApplication)) 
		{
			System.out.println("The Expected OrangeHRM Application Title is:-pass");
		}
		else 
		{
			System.out.println("The NOT Expected OrangeHRM Application Title is:-fail");
		}
		System.out.println();
		System.out.println("2nd-EXPECTED URL ADDRESS OrangeHRM-4.2.0.1");
		System.out.println();
		
		String expected_OrangeHRMApplicationURL="orangehrm-4.2.0.1";
		System.out.println("The Expected OrangeHRM Application URL is:-"+expected_OrangeHRMApplicationURL);
		String actual_webpageURL=driver.getCurrentUrl();
		System.out.println("The actual webpage URL is:-"+ actual_webpageURL);
		
		if(actual_webpageURL.contains(expected_OrangeHRMApplicationURL)) 
		{
			System.out.println("The Expected OrangeHRM Application URL is:-pass");
		}
		else 
		{
			System.out.println("The NOT Expected OrangeHRM Application URL is:-fail");
		}
		
		
		System.out.println();
		System.out.println("3rd-LOGIN(VALID TEST DATA)");
		System.out.println();
		 
		String UsernameTestdata="kejiyarani";
		By UsernameProperty=By.id("txtUsername");
		WebElement Username=driver.findElement(UsernameProperty);
		Username.sendKeys(UsernameTestdata);
		System.out.println("Valid Username is:-"+UsernameTestdata);
		String passwordTestdata="K@kejiya57";
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestdata);
		System.out.println("Valid Password is:-"+passwordTestdata); 
		By loginbuttonproperty=By.className("button");
		WebElement login=driver.findElement(loginbuttonproperty);
		login.click();
		
		System.out.println();
		System.out.println("4th-Homepage Title is OrangeHRM");
		System.out.println();
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
		System.out.println();
		System.out.println("5th-welcomeAdmin");
		System.out.println();
		By WelcomeAdminProperty=By.linkText("Welcome Admin");
		WebElement WelcomeAdmin=driver.findElement(WelcomeAdminProperty);
		WelcomeAdmin.click();
		
		Thread.sleep(4000);
		
		By logoutProperty=By.linkText("Logout");
		WebElement logout=driver.findElement(logoutProperty);
		logout.click();
		 driver.quit();
	}

}
