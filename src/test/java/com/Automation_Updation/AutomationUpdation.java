package com.Automation_Updation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Base_Package.Base_Class;

public class AutomationUpdation extends Base_Class {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = browser_Configuration("chrome");
		wait(10, TimeUnit.SECONDS);
		getUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		inputValueElement(email,"ammukutty252021@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		inputValueElement(pass,"ammukutty252021");
		WebElement sign = driver.findElement(By.id("SubmitLogin"));
		clickOnElement(sign);
		WebElement women = driver.findElement(By.className("sf-with-ul"));
		clickOnElement(women);
		Thread.sleep(1000);
		javaScript();
		Thread.sleep(1000);
		WebElement a = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts'][1]"));
		clickOnElement(a);
		WebElement add = driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]"));
		clickOnElement(add);
		WebElement chekout = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?controller=order'])[1]"));
		clickOnElement(chekout);
		WebElement chekout2 = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=order&step=1']"));
		clickOnElement(chekout2);
		WebElement chekout3 = driver.findElement(By.name("processAddress"));
		clickOnElement(chekout3);
		WebElement w = driver.findElement(By.id("cgv"));
		clickOnElement(w);
		WebElement chekout4 = driver.findElement(By.name("processCarrier"));
		clickOnElement(chekout4);
		WebElement che = driver.findElement(By.className("cheque"));
		clickOnElement(che);
		WebElement submit = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		clickOnElement(submit);
		WebElement orderconform = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']"));
		clickOnElement(orderconform);
		WebElement con = driver.findElement(By.xpath("//a[@title='Log me out']"));
		clickOnElement(con);
		WebElement email1 = driver.findElement(By.id("email"));
		inputValueElement(email1,"ammukutty252021@gmail.com");
		WebElement pass1 = driver.findElement(By.id("passwd"));
		inputValueElement(pass1,"ammukutty252021");
		WebElement sign1 = driver.findElement(By.id("SubmitLogin"));
		clickOnElement(sign1);
		WebElement women1 = driver.findElement(By.className("sf-with-ul"));
		clickOnElement(women1);
		Thread.sleep(1000);
		javaScript();
		Thread.sleep(1000);
		WebElement a1=driver.findElement(By.xpath("(//img[@title='Blouse'])[1]"));
		clickOnElement(a1);
		WebElement add1 = driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]"));
		clickOnElement(add1);
		WebElement chekout1 = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?controller=order'])[1]"));
		clickOnElement(chekout1);
		WebElement chekout2_1 = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=order&step=1']"));
		clickOnElement(chekout2_1);
		WebElement chekout3_1 = driver.findElement(By.name("processAddress"));
		clickOnElement(chekout3_1);
		WebElement w1 = driver.findElement(By.id("cgv"));
		clickOnElement(w1);
		WebElement chekout4_1 = driver.findElement(By.name("processCarrier"));
		clickOnElement(chekout4_1);
		WebElement che1 = driver.findElement(By.className("cheque"));
		clickOnElement(che1);
		WebElement submit1 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		clickOnElement(submit1);
		WebElement orderconform1 = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']"));
		clickOnElement(orderconform1);
		WebElement con1 = driver.findElement(By.xpath("//a[@title='Log me out']"));
		clickOnElement(con1);
		WebElement email2 = driver.findElement(By.id("email"));
		inputValueElement(email2,"ammukutty252021@gmail.com");
		WebElement pass2 = driver.findElement(By.id("passwd"));
		inputValueElement(pass2,"ammukutty252021");
		WebElement sign2 = driver.findElement(By.id("SubmitLogin"));
		clickOnElement(sign2);
		WebElement women2 = driver.findElement(By.className("sf-with-ul"));
		clickOnElement(women2);
		Thread.sleep(1000);
		javaScript();
		Thread.sleep(1000);
		WebElement a2=driver.findElement(By.xpath("(//img[@title='Printed Dress'])[1]"));
		clickOnElement(a2);
		WebElement add2 = driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]"));
		clickOnElement(add2);
		WebElement chek = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?controller=order'])[1]"));
		clickOnElement(chek);
		WebElement chekout2_2 = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=order&step=1']"));
		clickOnElement(chekout2_2);
		WebElement chekout3_2 = driver.findElement(By.name("processAddress"));
		clickOnElement(chekout3_2);
		WebElement w2 = driver.findElement(By.id("cgv"));
		clickOnElement(w2);
		WebElement chekout4_2 = driver.findElement(By.name("processCarrier"));
		clickOnElement(chekout4_2);
		WebElement che2 = driver.findElement(By.className("cheque"));
		clickOnElement(che2);
		WebElement submit2 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		clickOnElement(submit2);
		WebElement orderconform2 = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']"));
		clickOnElement(orderconform2);
		WebElement con2 = driver.findElement(By.xpath("//a[@title='Log me out']"));
		clickOnElement(con2);
		//driver.close();
		
		
		
	

	}

}
