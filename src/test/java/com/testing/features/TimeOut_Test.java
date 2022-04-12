package com.testing.features;

import org.testng.annotations.Test;

public class TimeOut_Test {
	@Test(timeOut=8000)
	private void browser_Execution() throws Throwable
	{   Thread.sleep(2000);
		System.out.println("Browser Launch");
		Thread.sleep(1000);
		System.out.println("url launch");
		Thread.sleep(1000);
		System.out.println("Credentials Entered");
		Thread.sleep(1000);
		System.out.println("next Page");

	}

}
