package com.testing.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	@Test(enabled=false)
	private void books()
	{
		System.out.println("Books");

	}
	@Ignore
	@Test(priority=1)
	private void whatsapp() 
	{
		System.out.println("whatApp");

	}
	@Test(priority=2)
	private void instagram()
	{
		
     System.out.println("instagram");
	}
	@Test(priority=-1)
	private void spotify() {
		System.out.println("Spotify");

	}
	
	@Test(priority=0)
	private void wynkMusic()
	{
	System.out.println("wynkmusic");

	}
	
	

}
