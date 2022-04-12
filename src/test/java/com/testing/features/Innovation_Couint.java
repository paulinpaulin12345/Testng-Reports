package com.testing.features;

import org.testng.annotations.Test;

public class Innovation_Couint {
	@Test(priority=-1)
	private void browser_Launch()
	{
		System.out.println("Browser Launch");

	}
	@Test
	private void launchUrl() 
	{
		System.out.println("Launch Url");

	}
	@Test(priority=0,invocationCount=3)
	private void refresh()
	{
		System.out.println("refresh");

	}
	@Test(priority=2)
	private void credentials()
	{
		System.out.println("credentials");

	}
	
	

}
