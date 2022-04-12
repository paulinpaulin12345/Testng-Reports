package com.Automationpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Women {
	public WebDriver driver;
	@FindBy(className="sf-with-ul")
	private WebElement women;
	@FindBy(xpath="(//a[@class='sf-with-ul'])[4]")
	private WebElement dress;
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement tshirt;

	public WebElement getDress() {
		return dress;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public Automation_Women(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}
		

}
