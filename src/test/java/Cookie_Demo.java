import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.Logs;

public class Cookie_Demo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// How to Capture Cookie From the Browser
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Size of Cookie:" + cookies.size());
		// How to print Cookies from the Browser
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + ": " + cookie.getValue());
		}
		// How to add and Delete Cookie
		Cookie obj = new Cookie("MyCookie", "1234");
		driver.manage().addCookie(obj);
		Cookie obj1 = new Cookie("CustomCookie", "5567");
		driver.manage().addCookie(obj1);
		cookies = driver.manage().getCookies();
		System.out.println("The Size of Cookie is:" + cookies.size());// 6
		// delete specific Cookie with object
		driver.manage().deleteCookie(obj);
		cookies = driver.manage().getCookies();
		System.out.println("The Sizeof Cookie is:" + cookies.size());// 5
		// Delete cookie with name
		driver.manage().deleteCookieNamed("CustomCookie");
		cookies = driver.manage().getCookies();
		System.out.println("The Size of Cookie is:" + cookies.size());// 4
		// Delete All Cookies
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("The Sizeof Cookie is:" + cookies.size());// 0
		Logs s = driver.manage().logs();
		System.out.println(s);
		System.out.println("ime:"+driver.manage().ime());

		driver.quit();

	}

}
