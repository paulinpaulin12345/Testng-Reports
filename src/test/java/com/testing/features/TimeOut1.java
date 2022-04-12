package com.testing.features;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOut1 {
@Test(timeOut=16000)
private void Browser_Launch() {
	

System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumProgram_Concepts\\Driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

}
}
