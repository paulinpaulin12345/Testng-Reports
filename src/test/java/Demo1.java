


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	Dimension d= new Dimension (500,600);
	Thread.sleep(1000);
	driver.manage().window().setSize(d);
	Dimension dimension=driver.manage().window().getSize();
	System.out.println(dimension);
	Thread.sleep(1000);
	Point p=new Point(700,900);
	Thread.sleep(1000);
	driver.manage().window().setPosition(p);
	Point point=driver.manage().window().getPosition();
	System.out.println(point);
	Thread.sleep(1000);
	driver.manage().window().fullscreen();
	driver.quit();
	
	
	
	
	

}
}
