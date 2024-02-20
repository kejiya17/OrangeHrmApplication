package com.RadioButonsTest;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;

import jdk.internal.org.jline.utils.Log;

  public class radioButtonsTest extends BaseTest
 {
	@Test
	public void group1RadioButtons() throws InterruptedException 
	{
		/*
		<input type="radio" name="group1" value="Milk">
		<input type="radio" name="group1" value="Butter" checked="">
		<input type="radio" name="group1" value="Cheese">

		<input type="radio" name="group2" value="Water">
		<input type="radio" name="group2" value="Beer">
		<input type="radio" name="group2" value="Wine" checked="">
		*/

		By group1RadioButtonProperty=By.name("group1");
		List<WebElement>group1RadioButtons=driver.findElements(group1RadioButtonProperty);
		
		int group1RadioButtons_Count=group1RadioButtons.size();
		System.out.println(group1RadioButtons_Count);
		
		
		
		for(int index=0;index<group1RadioButtons_Count;index++) 
		{
			String group1RadioButtonsNames=group1RadioButtons.get(index).getAttribute("value");
			System.out.println(group1RadioButtonsNames);
			
			group1RadioButtons.get(index).click();
			
			System.out.println(group1RadioButtons.get(0).getAttribute("value")+" - "+ group1RadioButtons.get(0).getAttribute("checked"));
			System.out.println(group1RadioButtons.get(1).getAttribute("value")+" - "+ group1RadioButtons.get(1).getAttribute("checked"));
			System.out.println(group1RadioButtons.get(2).getAttribute("value")+" - "+ group1RadioButtons.get(2).getAttribute("checked"));
			
			By group2RadioButtonProperty=By.name("group2");
			List<WebElement>group2RadioButtons=driver.findElements(group2RadioButtonProperty);
			
			int group2RadioButtons_Count=group1RadioButtons.size();
			
			//System.out.println(group2RadioButtons_Count);
			
			
			
			
			for(int group2Index=index;group2Index==index;group2Index++ )
			{
				String group2RadioButtonsNames=group2RadioButtons.get(group2Index).getAttribute("value");
				System.out.println(group2RadioButtonsNames);
							Thread.sleep(2000);
				group2RadioButtons.get(group2Index).click();
				
				
				
			
			 System.out.println(group2RadioButtons.get(0).getAttribute("value")+" - "+ group2RadioButtons.get(0).getAttribute("checked"));
			 System.out.println(group2RadioButtons.get(1).getAttribute("value")+" - "+ group2RadioButtons.get(1).getAttribute("checked"));
			 System.out.println(group2RadioButtons.get(2).getAttribute("value")+" - "+ group2RadioButtons.get(2).getAttribute("checked"));
			}
			
			
			
			

		}
		
		
		
		
	}
	
	
	

}
