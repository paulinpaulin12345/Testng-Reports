package com.Automation_Updation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Base_Package.Base_Class;

public class sample_base extends Base_Class {
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
	
		WebElement email2 = driver.findElement(By.id("email"));
		inputValueElement(email2,"ammukutty252021@gmail.com");
		WebElement pass2 = driver.findElement(By.id("passwd"));
		inputValueElement(pass2,"ammukutty252021");
		WebElement sign2 = driver.findElement(By.id("SubmitLogin"));
		clickOnElement(sign2);
		WebElement Dress=driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[4]"));
		clickOnElement(Dress);
		javaScript();
		WebElement imge1=driver.findElement(By.xpath("(//img[@title='Printed Dress'])[1]"));
		clickOnElement(imge1);
	
		WebElement add2 = driver.findElement(By.xpath("(//span[text()='Add to cart'])[1]"));
		clickOnElement(add2);
		WebElement chekout_2 = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?controller=order'])[1]"));
		clickOnElement(chekout_2);
		WebElement chekout2_2= driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=order&step=1']"));
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
		
		WebElement email3 = driver.findElement(By.id("email"));
		inputValueElement(email3,"ammukutty252021@gmail.com");
		WebElement pass3 = driver.findElement(By.id("passwd"));
		inputValueElement(pass3,"ammukutty252021");
		WebElement sign3 = driver.findElement(By.id("SubmitLogin"));////img[@title='Faded Short Sleeve T-shirts']
		clickOnElement(sign3);
		WebElement Tshirts=driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
		clickOnElement(Tshirts);
		javaScript();
		WebElement imge2=driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		clickOnElement(imge2);
		driver.switchTo().frame(0);
		WebElement add3 = driver.findElement(By.xpath("//p[@id='add_to_cart']//descendant::span"));
		clickOnElement(add3);
		driver.switchTo().defaultContent();
		WebElement chekout_3 = driver.findElement(By.xpath("(//a[@href='http://automationpractice.com/index.php?controller=order'])[3]"));
		clickOnElement(chekout_3);
		WebElement chekout2_3= driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?controller=order&step=1']"));
		clickOnElement(chekout2_3);
		WebElement chekout3_3 = driver.findElement(By.name("processAddress"));
		clickOnElement(chekout3_3);
		WebElement w3 = driver.findElement(By.id("cgv"));
		clickOnElement(w3);
		WebElement chekout4_3 = driver.findElement(By.name("processCarrier"));
		clickOnElement(chekout4_3);
		WebElement che3 = driver.findElement(By.className("cheque"));
		clickOnElement(che3);
		WebElement submit3 = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		clickOnElement(submit3);
		WebElement orderconform3 = driver.findElement(By.xpath("//a[@class='button-exclusive btn btn-default']"));
		clickOnElement(orderconform3);
		WebElement con3 = driver.findElement(By.xpath("//a[@title='Log me out']"));
		clickOnElement(con3);
	
	
		
	
}

}
