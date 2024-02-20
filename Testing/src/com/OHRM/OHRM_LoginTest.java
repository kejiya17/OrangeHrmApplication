package com.OHRM;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
public class OHRM_LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

   System.setProperty("webdriver.chrome.driver", "C:\\Users\\vayuv\\OneDrive\\Desktop\\Selenium and Java Clases\\Testing\\Browser driver files\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get(applicationUrlAddress);
    String expected_OrangeHRMLoginPAgeTitle="OrangeHRM";
    System.out.println("The expected OrangeHRM login page title is:-"+ expected_OrangeHRMLoginPAgeTitle);
    String actual_webPAgeTitle=driver.getTitle();
    System.out.println("The actual web page  title is:-"+ actual_webPAgeTitle);
    if(actual_webPAgeTitle.equals( expected_OrangeHRMLoginPAgeTitle)) 
    {
    	System.out.println("Sucessfully navigated to OrangeHRM login web pag-pass");
    }
    else 
    {
    	System.out.println("failed to navigate OrangeHRM login web page-fail");
    }
      driver.findElement(By.id("txtUsername")).sendKeys("srini");
     
      driver.findElement(By.name("txtPassword")).sendKeys("Q@Trainer7"); 
      
       driver.findElement(By.className("button")).click();
       driver.quit();

    /* //1. Identifying the Element of the WebPage - done using the properites

     driver.findElement(By.id("txtUsername")).sendKeys("srini");

     // <input name="txtPassword" autocomplete="off" type="password">

     driver.findElement(By.name("txtPassword")).sendKeys("Q@Trainer7");

     // <input type="submit"  class="button"  value="LOGIN">

     driver.findElement(By.className("button")).click();

       //driver.quit(); */

	}

}
