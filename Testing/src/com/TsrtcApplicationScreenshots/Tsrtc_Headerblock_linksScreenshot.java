package com.TsrtcApplicationScreenshots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tsrtc_Headerblock_linksScreenshot {


	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
	String	applicationurladdress="https://www.tsrtconline.in/oprs-web/";
		System.setProperty("webdriver.chrome.driver", "./Browser driver files/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(applicationurladdress);
		
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
		      tsrtc_headerblocklinks.get(arrayindex).click();
		      
		
		      
		     String webPageTitle=driver.getTitle();
		    System.out.println(webPageTitle);
		    String webPageURL=driver.getCurrentUrl();
		    System.out.println(webPageURL); 
		    driver.navigate().back();
		    tsrtc_headerblock=driver.findElement(tsrtc_headerblockproperty);
		    tsrtc_headerblocklinks=tsrtc_headerblock.findElements(tsrtc_headerblocklinksproperty);
		    
		
		    Thread.sleep(2000);
		      
		     File webPageScreenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 FileUtils.copyFile(webPageScreenshots, new File("./ApplicationScrenShots/tsrtcHeaderblocklinksscreenshots"+arrayindex+tsrtc_headerblocklinknames+".png"));
		      
		    
  
		}
		
		driver.quit();
		
	}

}
