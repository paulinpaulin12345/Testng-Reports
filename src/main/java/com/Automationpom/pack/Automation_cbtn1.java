package com.Automationpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_cbtn1 {
	public WebDriver driver;
	@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?controller=order'])[1]")
	private WebElement btn1;
	@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?controller=order'])[3]")
	private WebElement btn1_3;

	public WebElement getBtn1_3() {
		return btn1_3;
	}

	public Automation_cbtn1(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getBtn1() {
		return btn1;
	}
	

}
