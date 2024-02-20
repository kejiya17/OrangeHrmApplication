package com.Array;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_headerblock_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		 String applicationurl="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vayuv\\OneDrive\\Desktop\\Selenium and Java Clases\\Testing\\Browser driver files\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		driver=new ChromeDriver();
		driver.get(applicationurl);
		By tsrtc_headerblockproperty=By.className("menu");
		WebElement tsrtc_headerblock=driver.findElement(tsrtc_headerblockproperty);
	    By tsrtc_headerblocklinksproperty=By.tagName("a");
		List<WebElement>tsrtc_headerblocklinks=tsrtc_headerblock.findElements(tsrtc_headerblocklinksproperty);
		 int tsrtc_headerblocklinkscount=tsrtc_headerblocklinks.size();
		System.out.println("The number of links in header block is:-"+tsrtc_headerblocklinkscount);
		for(int arrayindex=0;arrayindex<tsrtc_headerblocklinkscount;arrayindex++) 
		{
			String tsrtc_headerblocklinknames=tsrtc_headerblocklinks.get(arrayindex).getText();
		    System.out.println(arrayindex+"-"+tsrtc_headerblocklinknames);
		    String expected_tsrtcwebpageurl=tsrtc_headerblocklinks.get(arrayindex).getAttribute("href");
		    System.out.println("The tsrtc web page url is:-"+expected_tsrtcwebpageurl);
		    //<a class="selectedtabcopy" href="/oprs-web/guest/home.do?h=1" target="_top" title="Home">
			//Home</a>
		   // String actual_webpageurl=driver.get("/oprs-web/guest/home.do?h=1");
		    System.out.println("sucessfully navigate to tsrtc web page url is same:-pass");
		    tsrtc_headerblocklinks.get(arrayindex).click();
		     String webPageTitle=driver.getTitle();
		    System.out.println(webPageTitle);
		    String webPageURL=driver.getCurrentUrl();
		    System.out.println(webPageURL); 
		    driver.navigate().back();
		    tsrtc_headerblock=driver.findElement(tsrtc_headerblockproperty);
		    tsrtc_headerblocklinks=tsrtc_headerblock.findElements(tsrtc_headerblocklinksproperty);
		    
		 driver.quit();
  
		    
		}
	
	}

}
