package com.ApplicationLaunch;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigateTo_Bing_HomePage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vayuv\\OneDrive\\Desktop\\Selenium and Java Clases\\Testing\\Browser driver files\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://bing.com");
		chrome.get("http://flipkart.com");
		chrome.get("http://google.com");
		chrome.close();
		chrome.quit();
	}

}
