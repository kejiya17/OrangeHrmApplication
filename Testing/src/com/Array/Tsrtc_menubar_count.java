package com.Array;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_menubar_count {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub
		String applicationurl="https://www.tsrtconline.in/oprs-web/";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\vayuv\\OneDrive\\Desktop\\Selenium and Java Clases\\Testing\\Browser driver files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(applicationurl);
		
	 /* <div class="menu">
		<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
		Home</a>
	<a class="tabcopy blinking" href="/oprs-web/guest/specialHire.do" target="_top" title="Bus on Contract">Bus on Contract</a>
	<a class="tabcopy" href="/oprs-web/ticket/waitlist.do" target="_top" title="Enquiry">Enquiry</a>
	<a class="tabcopy" href="/oprs-web/guest/ticket/cancel.do" target="_top" title="Cancel Tickets">Cancel Tickets</a>
	<a class="tabcopy" href="/oprs-web/services/cancel.do" target="_top" title="Cancelled Services">Cancelled Services</a>
	<a class="tabcopy" href="/oprs-web/home/aboutus.do" target="_top" title="About Us">About Us</a>
	<a class="tabcopy blinking" href="/oprs-web/services/packagetours.do" target="_top" title="Tourism">Tourism</a>
	<a class="tabcopy" href="/oprs-web/services/driverInfo.do" target="_top" title="Driver Info">Driver Info</a>
	<!-- <a class="tabcopy" href="https://forms.gle/BVVhmKJ8gnd7rWvr8" target="_blank" title="Customer Survey Form" style="float: right !important;">Customer Survey Form</a> -->
</div>
		*/
		
	By	tsrtc_applicationHomepag_menu_proprty=By.className("menu");
	WebElement tsrtcApplicationHomePagemenu=driver.findElement(tsrtc_applicationHomepag_menu_proprty);
	 By tsrtc_applicationHomepag_menulinks_proprty =By.tagName("a");
	  
	  List<WebElement>tsrtcApplicationHomePagemenuLinks=tsrtcApplicationHomePagemenu.findElements( tsrtc_applicationHomepag_menulinks_proprty);
	//  Thread.sleep(5000);
      int tsrtcApplicationHomePagemenulinks_count=tsrtcApplicationHomePagemenuLinks.size();
      System.out.println(" The number of WebElements which are of type links on the TSRTC Application HomePage is :- "+tsrtcApplicationHomePagemenulinks_count);

     for(int arrayindex=0;arrayindex<tsrtcApplicationHomePagemenulinks_count;arrayindex++)
     {
    	 String tsrtcmenulinks_name=tsrtcApplicationHomePagemenuLinks.get(arrayindex).getText();
    	 System.out.println(arrayindex+"-"+tsrtcmenulinks_name);
     } 
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
