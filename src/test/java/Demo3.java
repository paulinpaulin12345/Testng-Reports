import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.Logs;

public class Demo3 {
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//Ask driver to wait for a certain time before throwing NoSuchElement Exception
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);//set amount of Time to wait for PageLoad
		driver.manage().timeouts().setScriptTimeout(40,TimeUnit.SECONDS);//Set amount of time wait for an Asynchronous Script
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("ammukutty252021@gmail.com");
		WebElement pass = driver.findElement(By.id("passwd"));
		pass.sendKeys("ammukutty252021");
		WebElement sign = driver.findElement(By.id("SubmitLogin"));
		sign.click();
		Duration d=driver.manage().timeouts().getPageLoadTimeout();//get Amount of time to wait for pageLoad
		System.out.println("Amount of Time to wait for PageLoad:"+d);
		Duration d1=driver.manage().timeouts().getScriptTimeout();//get Amount of Time to Wait for an Asynchronous Script
		System.out.println("Amount of Time wait for an AsynchronousScript:"+d1);
		driver.quit();
		
	}

}
