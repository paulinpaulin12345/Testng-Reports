package com.configuration.helper;

public class File_Reader_Manager {
	private File_Reader_Manager()
	{
		
	}
	public Configuration_Reader get_Instance_CR() throws Exception
	{
		Configuration_Reader reader=new Configuration_Reader();
		return reader;
	}
	public static File_Reader_Manager get_Instance_Frm()
	{
		File_Reader_Manager frm=new File_Reader_Manager();
		return frm;
	}

}
