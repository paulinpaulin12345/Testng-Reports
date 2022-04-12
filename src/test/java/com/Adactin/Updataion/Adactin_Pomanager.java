package com.Adactin.Updataion;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Adactin_Pomanager.Adactin_Manager;
import com.configuration.helper.File1_Reader_Manager;

import Adactin_RunnerPack.AdactinDataDriven_log;
import Base_Package.Base_Class;

public class Adactin_Pomanager extends Base_Class {
	public static WebDriver driver = browser_Configuration("chrome");
	public static Adactin_Manager pom = new Adactin_Manager(driver);
	public static Logger log=Logger.getLogger(AdactinDataDriven_log.class);

	public static void main(String[] args) throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		String url=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_url();
		getUrl(url);
		log.info("Url Launch");
		String email=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_email();
		inputValueElement(pom.get_AL().getMailid(),email);
		String password=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_passwrd();
		inputValueElement(pom.get_AL().getPassword(), password);
		clickOnElement(pom.get_AL().getLoginbtn());
		select(pom.get_AS().getLocation(), "ByIndex", "2");
		select(pom.get_AS().getHotel(), "ByValue", "Hotel Cornice");
		select(pom.get_AS().getRoomtype(), "ByText", "Super Deluxe");
		select(pom.get_AS().getNoofroom(), "Byvalue", "2");
		select(pom.get_AS().getAdultroom(), "ByText", "2 - Two");
		select(pom.get_AS().getChildroom(), "ByIndex", "0");
		clickOnElement(pom.get_AS().getSubmit());
		clickOnElement(pom.get_Ase().getBtn1());
		clickOnElement(pom.get_Ase().getBtn2());
		String fname=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_fname();
		inputValueElement(pom.getAB().getFname(),fname );
		String lname=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_lname();
		inputValueElement(pom.getAB().getLname(), lname);
		String address=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_address();
		inputValueElement(pom.getAB().getAddres(), address);
		String cardno=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_cardno();
		inputValueElement(pom.getAB().getCreditno(), cardno);
		select(pom.getAB().getCardtype(), "ByValue", "MAST");
		select(pom.getAB().getExpmonth(), "ByText", "November");
		select(pom.getAB().getExpyear(), "ByValue", "2022");
		String cvv=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_cvv();
		inputValueElement(pom.getAB().getNo(), cvv);
		clickOnElement(pom.getAB().getBookbtn());
		String navigat=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_navigat();
	    navigate(navigat);
		screenshot("img.png");
		clickOnElement(pom.get_AI().getOptbtn1());
		clickOnElement(pom.get_AI().getLogoutbtn());
		clickOnElement(pom.getAlog().getLogg());
		log.info("Successfully Conformed");
		
		log.info("Url Launch");
		String email2=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_email();
		inputValueElement(pom.get_AL().getMailid(),email2);
		String password2=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_passwrd();
		inputValueElement(pom.get_AL().getPassword(), password2);
		clickOnElement(pom.get_AL().getLoginbtn());
		select(pom.get_AS().getLocation(), "ByIndex", "3");
		select(pom.get_AS().getHotel(), "ByValue", "Hotel Creek");
		select(pom.get_AS().getRoomtype(), "ByText", "Deluxe");
		select(pom.get_AS().getNoofroom(), "Byvalue", "2");
		select(pom.get_AS().getAdultroom(), "ByText", "2 - Two");
		select(pom.get_AS().getChildroom(), "ByIndex", "2");
		clickOnElement(pom.get_AS().getSubmit());
		clickOnElement(pom.get_Ase().getBtn1());
		clickOnElement(pom.get_Ase().getBtn2());
		String fname2=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_fname();
		inputValueElement(pom.getAB().getFname(),fname2 );
		String lname2=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_lname();
		inputValueElement(pom.getAB().getLname(), lname2);
		String address2=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_address();
		inputValueElement(pom.getAB().getAddres(), address2);
		String cardno2=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_cardno();
		inputValueElement(pom.getAB().getCreditno(), cardno2);
		select(pom.getAB().getCardtype(), "ByValue", "MAST");
		select(pom.getAB().getExpmonth(), "ByText", "November");
		select(pom.getAB().getExpyear(), "ByValue", "2022");
		String cvv2=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_cvv();
		inputValueElement(pom.getAB().getNo(), cvv2);
		clickOnElement(pom.getAB().getBookbtn());
		String navigat2=File1_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_navigat();
	    navigate(navigat2);
	     screenshot("img.png");
		clickOnElement(pom.get_AI().getOptbtn1());
		clickOnElement(pom.get_AI().getLogoutbtn());
		clickOnElement(pom.getAlog().getLogg());
		log.info("Successfully Conformed");



}
}
