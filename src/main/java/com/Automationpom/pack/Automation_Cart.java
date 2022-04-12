package com.Automationpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Cart {
	public WebDriver driver;
	@FindBy(xpath="(//span[text()='Add to cart'])[1]")
	private WebElement cart;
	@FindBy(xpath="(//span[text()='Add to cart'])[1]")
	private WebElement cart2;
	
	@FindBy(xpath="//p[@id='add_to_cart']//descendant::span")
	private WebElement cart3;

	public WebElement getCart3()
	{
		return cart3;
	}
	public WebElement getCart2() {
		return cart;
	}

	public Automation_Cart(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCart() {
		return cart;
	}

}
