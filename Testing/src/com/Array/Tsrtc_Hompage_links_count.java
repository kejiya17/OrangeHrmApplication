package com.Array;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_Hompage_links_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String applicationurl="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vayuv\\OneDrive\\Desktop\\Selenium and Java Clases\\Testing\\Browser driver files\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get(applicationurl);
		
/*		By tsrtchomepagelinkproperty=By.tagName("a");
	List<WebElement>tsrtchomepagelinks=driver.findElements(tsrtchomepagelinkproperty);
	int tsrtchomepagelinks_count=tsrtchomepagelinks.size();
		System.out.println("The number of tsrtc home page links is:-"+tsrtchomepagelinks_count);
		
		for(int arrayindex=0;arrayindex<tsrtchomepagelinks_count;arrayindex++) 
		{
			String tsrtchomepagelinks_name=tsrtchomepagelinks.get(arrayindex).getText();
			System.out.println(arrayindex+"-"+tsrtchomepagelinks);
		}
		
		driver.quit();
		*/

By linksProperty=By.tagName("a");
List<WebElement>tsrtcApplicationHomePageLinks=driver.findElements(linksProperty);

int tsrtcApplicationHomePageLinks_Count=tsrtcApplicationHomePageLinks.size();

System.out.println(" The number of WebElements which are of type links on the TSRTC Application HomePage is :- "+tsrtcApplicationHomePageLinks_Count);

   for(int arrayIndex=0;arrayIndex<tsrtcApplicationHomePageLinks_Count;arrayIndex++)
   {
    String tsrtcHomePage_LinkName=tsrtcApplicationHomePageLinks.get(arrayIndex).getText();
    System.out.println(arrayIndex+" - "+tsrtcHomePage_LinkName);

   }
 }
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


