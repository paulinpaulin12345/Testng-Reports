package com.Automationpom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Automation_Image {
	public WebDriver driver;
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts'][1]")
	private WebElement imge;
	@FindBy(xpath="(//img[@title='Printed Dress'])[1]")
	private WebElement imge1;
	@FindBy(xpath="//img[@title='Faded Short Sleeve T-shirts']") 
	private WebElement imge2;

	public WebElement getImge() {
		return imge;
	}

	public WebElement getImge1() {
		return imge1;
	}

	public WebElement getImge2() {
		return imge2;
	}

	public Automation_Image(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}



		

}
