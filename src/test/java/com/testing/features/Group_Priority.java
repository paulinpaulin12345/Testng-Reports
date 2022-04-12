package com.testing.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Group_Priority {
	@Test(priority=-2,groups="Books")
	private void books()
	{
		System.out.println("Books");

	}

	@Test(priority=0,groups="Social Media")
	private void whatsapp() 
	{
		System.out.println("whatApp");

	}

	@Test(priority=-1,groups="Social Media")
	private void instagram()
	{
		
     System.out.println("instagram");
	}
	
	@Test(priority=2,groups="Music")
	private void spotify()
	{
		System.out.println("Spotify");

	}
	
	@Test(priority=-2,groups="Music")
	private void wynkMusic()
	{
	System.out.println("wynkmusic");

	}
	
}



