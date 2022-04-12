package com.testing.features;

import org.testng.annotations.Test;

public class Expected_Exception {
	@Test(expectedExceptions=ArithmeticException.class)
	private void calculator()
	{
		int a=10;
		System.out.println(a/0);
		System.out.println("Display the Output");

	}
	@Test(expectedExceptions=ArithmeticException.class)
	private void calculator1() {
	int a=10;
	System.out.println(a/2);
	System.out.println("Display the OutPut");

	}
	
	

}
