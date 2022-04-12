package com.adactinpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Log {
	public WebDriver driver;
	@FindBy(xpath="//a[@href='index.php']")
	private WebElement logg;

	public Adactin_Log(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);

	}

	public WebElement getLogg() {
		return logg;
	}

}
