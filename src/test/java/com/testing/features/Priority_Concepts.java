package com.testing.features;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Priority_Concepts {
	public static ExtentReports reports;
	public static ExtentTest test;
	public static ExtentSparkReporter spark_Reporter;
	
	@BeforeTest
	private void report_Generation() {
		spark_Reporter=new ExtentSparkReporter("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\Reports_Data//Reports.html");
		reports=new ExtentReports();
		reports.attachReporter(spark_Reporter);

	}
	@AfterTest
	private void flush()
	{
		reports.flush();

	}
	@Test(priority=-1)
	private void username() 
	{
		System.out.println("username");

	}
	@Test //default zero
	private void password() 
	{
		System.out.println("Password");

	}
	@Test(priority=-1)
	private void login() {
		System.out.println("Login");

	}
	

}
