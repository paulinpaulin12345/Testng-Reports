package com.Adactin.Updataion;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base_Package.Base_Class;

public class Adactin_Update extends Base_Class {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		driver = browser_Configuration("chrome");
		getUrl("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
		inputValueElement(username, "ammukutty25202125202");
		WebElement passcode = driver.findElement(By.id("password"));
		inputValueElement(passcode, "ammukutty252021");
		WebElement btn = driver.findElement(By.id("login"));
		clickOnElement(btn);
		WebElement web = driver.findElement(By.xpath("//select[@id='location']"));
		select(web, "ByIndex", "2");
		WebElement web1 = driver.findElement(By.xpath("//select[@id='hotels']"));
		select(web1, "ByValue", "Hotel Cornice");
		WebElement web2 = driver.findElement(By.xpath("//select[@id='room_type']"));
		select(web2, "ByText", "Super Deluxe");
		WebElement web3 = driver.findElement(By.xpath("//select[@id='room_nos']"));
		select(web3, "Byvalue", "2");
		WebElement web5 = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4 = new Select(web5);
		select(web5, "ByText", "2 - Two");
		WebElement web6 = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5 = new Select(web6);
		select(web6, "ByIndex", "0");
		WebElement searchbtn = driver.findElement(By.xpath("//input[@id='Submit']"));
		clickOnElement(searchbtn);
		WebElement submitbtn = driver.findElement(By.cssSelector("input[value='0']"));
		clickOnElement(submitbtn);
		WebElement continuebtn = driver.findElement(By.xpath("//input[@id='continue']"));
		clickOnElement(continuebtn);
		WebElement fname = driver.findElement(By.id("first_name"));
		inputValueElement(fname, "Ammu");
		WebElement lname1 = driver.findElement(By.id("last_name"));
		inputValueElement(lname1, "Kutty");
		WebElement address = driver.findElement(By.id("address"));
		inputValueElement(address, " No1.Everest Garden ,Errandam Kattalai,Koovoor,Chennai-600128");
		WebElement credit = driver.findElement(By.name("cc_num"));
		inputValueElement(credit, "1111 1111 1111 1111");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		select(cardtype, "ByValue", "MAST");
		WebElement expmnth = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(expmnth);
		select(expmnth, "ByText", "November");
		WebElement expyear = driver.findElement(By.name("cc_exp_year"));
		Select s8 = new Select(expyear);
		select(expyear, "ByValue", "2022");
		WebElement bookbtn = driver.findElement(By.id("book_now"));
		clickOnElement(bookbtn);
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		inputValueElement(cvv, "123446");
		WebElement bookbtn1 = driver.findElement(By.id("book_now"));
		clickOnElement(bookbtn1);
		driver.navigate().to("https://adactinhotelapp.com/BookedItinerary.php");
		screenshot("img.png");
		WebElement logoutbtn = driver.findElement(By.id("logout"));
		clickOnElement(logoutbtn);
		WebElement log = driver.findElement(By.xpath("//a[@href='index.php']"));
		log.click();

		
		WebElement username2 = driver.findElement(By.id("username"));
		inputValueElement(username2, "ammukutty25202125202");
		WebElement passcode2 = driver.findElement(By.id("password"));
		inputValueElement(passcode2, "ammukutty252021");
		WebElement btn2 = driver.findElement(By.id("login"));
		clickOnElement(btn2);
		WebElement web_2 = driver.findElement(By.xpath("//select[@id='location']"));
		select(web_2, "ByIndex", "3");
		WebElement web1_2 = driver.findElement(By.xpath("//select[@id='hotels']"));
		select(web1_2, "ByValue", "Hotel Creek");
		WebElement web2_2 = driver.findElement(By.xpath("//select[@id='room_type']"));
		select(web2_2, "ByText", "Deluxe");
		WebElement web3_2 = driver.findElement(By.xpath("//select[@id='room_nos']"));
		select(web3_2, "Byvalue", "2");
		WebElement web5_2 = driver.findElement(By.xpath("//select[@id='adult_room']"));
		Select s4_2 = new Select(web5_2);
		select(web5_2, "ByText", "2 - Two");
		WebElement web6_2 = driver.findElement(By.xpath("//select[@id='child_room']"));
		Select s5_2 = new Select(web6_2);
		select(web6_2, "ByIndex", "2");
		WebElement searchbtn2 = driver.findElement(By.xpath("//input[@id='Submit']"));
		clickOnElement(searchbtn2);
		WebElement submitbtn2 = driver.findElement(By.cssSelector("input[value='0']"));
		clickOnElement(submitbtn2);
		WebElement continuebtn2 = driver.findElement(By.xpath("//input[@id='continue']"));
		clickOnElement(continuebtn2);
		WebElement fname2 = driver.findElement(By.id("first_name"));
		inputValueElement(fname2, "Ammu");
		WebElement lname1_2 = driver.findElement(By.id("last_name"));
		inputValueElement(lname1_2, "Kutty");
		WebElement address2 = driver.findElement(By.id("address"));
		inputValueElement(address2, " No1.Everest Garden ,Errandam Kattalai,Koovoor,Chennai-600128");
		WebElement credit2 = driver.findElement(By.name("cc_num"));
		inputValueElement(credit2, "1111 1111 1111 1111");
		WebElement cardtype2 = driver.findElement(By.id("cc_type"));
		select(cardtype2, "ByValue", "MAST");
		WebElement expmnth2 = driver.findElement(By.id("cc_exp_month"));
		Select s7_2 = new Select(expmnth2);
		select(expmnth2, "ByText", "November");
		WebElement expyear2 = driver.findElement(By.name("cc_exp_year"));
		Select s8_2 = new Select(expyear2);
		select(expyear2, "ByValue", "2022");
		WebElement bookbtn2 = driver.findElement(By.id("book_now"));
		clickOnElement(bookbtn2);
		WebElement cvv2 = driver.findElement(By.id("cc_cvv"));
		inputValueElement(cvv2, "123446");
		WebElement bookbtn1_2 = driver.findElement(By.id("book_now"));
		clickOnElement(bookbtn1_2);
		driver.navigate().to("https://adactinhotelapp.com/BookedItinerary.php");
		screenshot("img.png");
		WebElement logoutbtn2 = driver.findElement(By.id("logout"));
		clickOnElement(logoutbtn2);
		WebElement log2 = driver.findElement(By.xpath("//a[@href='index.php']"));
		log2.click();


	}

}
