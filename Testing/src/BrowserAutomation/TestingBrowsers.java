package BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class TestingBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vayuv\\OneDrive\\Desktop\\Selenium and Java Clases\\Testing\\Browser driver files\\chromedriver.exe");
		ChromeDriver Chrome=new ChromeDriver(); 
		
       System.setProperty("webdriver.edge.driver","C:\\Users\\vayuv\\OneDrive\\Desktop\\Selenium and Java Clases\\Testing\\Browser driver files\\msedgedriver.exe");
       EdgeDriver edge=new EdgeDriver();
       
	}

}
