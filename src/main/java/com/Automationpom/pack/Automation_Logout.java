package com.Automationpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Logout {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement Logoff;

	public Automation_Logout(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getLogoff() {
		return Logoff;
	}

}
