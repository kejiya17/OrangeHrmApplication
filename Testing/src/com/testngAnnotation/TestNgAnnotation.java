package com.testngAnnotation;

import org.testng.annotations.Test;

public class TestNgAnnotation {
	@Test(priority=1)
	public void applicationLaunch()
	{
	System.out.println(" Gmail Application Launch Successful ");
	}

	@Test(priority=4)
	public void ComposeMailTest()
	{
	System.out.println(" Compose Mail Functionality Test Successful ");
	}



	
	
	
	
}



