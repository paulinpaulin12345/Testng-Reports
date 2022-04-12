package com.testing.features;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Automation_pomanger.Automation_Manger;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.configuration.helper.File_Reader_Manager;

import Automation_RunnerPack.AutomationDataDriven_Log;
import Base_Package.Base_Class;

public class Automation_Tng extends Base_Class {
	public static WebDriver driver = browser_Configuration("chrome");
	public static Automation_Manger pom = new Automation_Manger(driver);
	public static Logger log=Logger.getLogger(Automation_Tng.class);
	public static ExtentReports reports;
	public static ExtentTest test;
	public static ExtentSparkReporter spark_Reporter;
	
	@BeforeTest
	private void report_Generation() {
		spark_Reporter=new ExtentSparkReporter("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\Reports_Data\\AutomationReports.html");
		reports=new ExtentReports();
		reports.attachReporter(spark_Reporter);

	}
	@AfterTest
	private void flush()
	{
		reports.flush();

	}

	
	@Test(priority=1,timeOut=48000)
	private void womenOrder() throws InterruptedException 
	{
		
		clickOnElement(pom.get_Women().getWomen());
		Thread.sleep(1000);
		javaScript();
		Thread.sleep(1000);
		clickOnElement(pom.get_Img().getImge());
		clickOnElement(pom.get_Cart().getCart());
		clickOnElement(pom.get_Btn1().getBtn1());
		clickOnElement(pom.get_Btn2().getBtn2());
		clickOnElement(pom.get_Btn3().getBtn3());
		clickOnElement(pom.get_Process().getCheckBox());
		clickOnElement(pom.get_Process().getProcessbtn());
			} 

	@Test(priority=0,timeOut=48000)
	private void Dress() throws InterruptedException 
	{
		Thread.sleep(1000);
		clickOnElement(pom.get_Women().getDress());
		javaScript();
		Thread.sleep(1000);
		clickOnElement(pom.get_Img().getImge1());
		clickOnElement(pom.get_Cart().getCart());
		clickOnElement(pom.get_Btn1().getBtn1());
		clickOnElement(pom.get_Btn2().getBtn2());
		clickOnElement(pom.get_Btn3().getBtn3());
		clickOnElement(pom.get_Process().getCheckBox());
		clickOnElement(pom.get_Process().getProcessbtn());
	}
	@Test(priority=-1,timeOut=47000)
	private void Tshirt()
	{
		clickOnElement(pom.get_Women().getTshirt());
		javaScript();
		clickOnElement(pom.get_Img().getImge2());
		driver.switchTo().frame(0);
		clickOnElement(pom.get_Cart().getCart3());
		driver.switchTo().defaultContent();
		clickOnElement(pom.get_Btn1().getBtn1_3());
		clickOnElement(pom.get_Btn2().getBtn2());
		clickOnElement(pom.get_Btn3().getBtn3());
		clickOnElement(pom.get_Process().getCheckBox());
		clickOnElement(pom.get_Process().getProcessbtn());
		

	}
	@BeforeMethod
	private void Browser_Launch() throws Exception 
	{
		PropertyConfigurator.configure("log4j.properties");
		wait(10, TimeUnit.SECONDS);
		String url=File_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_url();
		getUrl(url);
		log.info("Url Launch");
		String userid=File_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_email();
		inputValueElement(pom.get_Login().getEmail(),userid );
		String passwrd=File_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_passwrd();
		inputValueElement(pom.get_Login().getPassword(),passwrd );
		clickOnElement(pom.get_Login().getSubmitbtn());
	
		
	}
	@AfterMethod
	private void Browser_launch() 
	
	{
		clickOnElement(pom.get_Cheq().getCheqq());
		clickOnElement(pom.get_Submit().getSubmitbtn());
		clickOnElement(pom.get_Order().getConform());
		clickOnElement(pom.get_Logout().getLogoff());
		log.info("Thank You ,Your Order Arriving Soon");

		}
	@AfterClass
	private void close_Driver() {
		driver.close();

	}
	
		
	
	}
