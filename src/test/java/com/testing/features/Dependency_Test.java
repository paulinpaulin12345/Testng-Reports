package com.testing.features;

import org.testng.annotations.Test;

public class Dependency_Test {
	@Test
	private void browser() {
		System.out.println("Browser");

	}
	@Test(dependsOnMethods="watch")
	private void offer()
	{
		System.out.println("offer");

	}
	@Test()
	private void watch() {
		System.out.println("watch");

	}
	@Test(dependsOnMethods="browser")
	private void url() {
		System.out.println("Url");

	}

}
