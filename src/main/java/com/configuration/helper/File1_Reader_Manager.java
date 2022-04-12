package com.configuration.helper;

public class File1_Reader_Manager {
	private File1_Reader_Manager()
	{
		
	}
	public Configuration1_Reader get_Instance_CR() throws Exception
	{
		Configuration1_Reader reader=new Configuration1_Reader();
		return reader;
	}
	public static File1_Reader_Manager get_Instance_Frm()
	{
		File1_Reader_Manager frm=new File1_Reader_Manager();
		return frm;
	}


}
