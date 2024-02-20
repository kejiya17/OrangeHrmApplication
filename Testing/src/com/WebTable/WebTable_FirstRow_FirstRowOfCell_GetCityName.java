package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_FirstRow_FirstRowOfCell_GetCityName extends Basetest {

	@Test
	public void webTable_getCityName()
	{
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
         
		By webTableCityNameProperty=By.xpath(" /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
		WebElement cityName=driver.findElement(webTableCityNameProperty);
		String cityNameText=cityName.getText();
		System.out.println("City NAme Text is:-"+cityNameText);
		
	}
	
	
	
	
}
