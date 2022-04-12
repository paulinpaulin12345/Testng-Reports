package com.testing.features;

import org.testng.annotations.Test;

public class ExpectedException2 {
	@Test(expectedExceptions=NullPointerException.class)
	private void calculator3()
	{
		int a=10;
		System.out.println(a/0);
		System.out.println("Display the Output");

	}
	@Test(expectedExceptions=ArithmeticException.class)
	private void calc() {
		int a=20;
		System.out.println(a/2);
		System.out.println("output");

	}
	


}
