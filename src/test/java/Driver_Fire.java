import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver_Fire {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement id=driver.findElement(By.id("email"));
		id.sendKeys("paulin.rajasekar@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("paulininfa");
		WebElement log=driver.findElement(By.name("login"));
		log.click();
		
	}
	

}
