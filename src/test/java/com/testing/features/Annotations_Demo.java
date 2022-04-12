package com.testing.features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations_Demo {
	@BeforeTest
	private void browser_Launch() {
		System.out.println("Browser Launch");
	}

	@BeforeSuite
	private void setProperty() {
		System.out.println("Set Property");

	}

	@BeforeClass
	private void getUrl() {
		System.out.println("Url");
	}

	@Test
	private void women() {
		System.out.println("Women");

	}

	@BeforeMethod
	private void signin() {
		System.out.println("signin");

	}

	@AfterMethod
	private void signout() {
		System.out.println("Signout");

	}

	@Test
	private void children() 
	{
		System.out.println("children");

	}
	@AfterClass
	private void Verify_HomePage()
	{
		System.out.println("Assert");

	}
	@AfterTest
	private void close() 
	{
		System.out.println("close");

	}
	@AfterSuite
	private void deleteAllCookies() 
	{
		System.out.println("Delete All Cookies");

	}

}
