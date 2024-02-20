package com.OHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
public class OrangeHRM_loginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String ApplicationURLAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vayuv\\OneDrive\\Desktop\\Selenium and Java Clases\\Testing\\Browser driver files\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(ApplicationURLAddress);
		
	String	expect_OrangeHRMApplicationTitle="OrangeHRM";
	System.out.println("The expected Orange application title is:-"+expect_OrangeHRMApplicationTitle);
	String actual_webApplicationTitle=driver.getTitle();
	System.out.println("The actualmweb page title is:-"+actual_webApplicationTitle);
	
	if(actual_webApplicationTitle.equals(expect_OrangeHRMApplicationTitle)) 
	{
		System.out.println("Sucessfully navigate to OrangeHRM login page-pass");
	}
	else 
	{
		System.out.println("Not navigate to OrangeHRM login page-fail");
	}
	
	// driver.findElement(By.id("txtUsername")).sendKeys("kejiyarani");
	 
	// WebElement username=driver.findElement(By.id("txtUsername"));
	// username.sendKeys("kejiyarani");
	
	 String UsernameTestData="kejiyarani";
	 By UsernameProperty=By.id("txtUsername");
	WebElement Username=driver.findElement(UsernameProperty);
	 Username.sendKeys(UsernameTestData);
    
	String passwordTestData="K@kejiya57";
	  By passwordProperty=By.name("txtPassword");
	 WebElement password=driver.findElement(passwordProperty);
	 password.sendKeys(passwordTestData);
	
      By LoginbuttonProperty=By.className("button");
    WebElement Loginbutton=driver.findElement(LoginbuttonProperty);
    Loginbutton.click();
	 
	 driver.quit();
	 
	 
	
		
		
		
		
		
		
		
		
		

	}

}
