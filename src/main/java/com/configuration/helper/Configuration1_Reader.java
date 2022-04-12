package com.configuration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration1_Reader {
	public static Properties p;
	public Configuration1_Reader() throws Exception
	{
	File f=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\src\\main\\java\\com\\Test\\property\\Configuration1.properties");
	FileInputStream fis=new FileInputStream(f);
	p=new Properties();
	p.load(fis);
	}
	public String get_confi_url()
	{
		String url=p.getProperty("url");
		return url;
	}
	public String get_confi_email()
	{
		String email=p.getProperty("email");
		return email;
	}
	public String get_confi_passwrd()
	{
		String password=p.getProperty("password");
		return password;
	}
	public String get_confi_fname()
	{
		String fname=p.getProperty("fname");
		return fname;
	}
	public String get_confi_lname()
	{
		String lname=p.getProperty("lname");
		return lname;
	}
	public String get_confi_address()
	{
		String address=p.getProperty("address");
		return address;
	}
	public String get_confi_cardno()
	{
		String cardno=p.getProperty("cardno");
		return cardno;
	}
	public String get_confi_cvv()
	{
		String cvv=p.getProperty("cvv");
		return cvv;
	}
	public String get_confi_navigat()
	{
		String navigat=p.getProperty("navigat");
		return navigat;
	}


}
