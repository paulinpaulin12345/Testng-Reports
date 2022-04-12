package com.configuration.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws Exception
	{
	File f=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Mainproject_march22\\src\\main\\java\\com\\Test\\property\\Configuration.properties");
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

}
