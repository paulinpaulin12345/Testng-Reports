package com.testing.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore2_Concept {
	@Test(enabled=false)
	private void books()
	{
		System.out.println("books");

	}
	
	@Test
	private void whatsapp() 
	{
		System.out.println("whatApp");

	}
	@Test
	private void instagram()
	{
		
     System.out.println("instagram");
	}
	@Test
	private void spotify() {
		System.out.println("Spotify");

	}
	
	@Test
	private void wynkMusic()
	{
	System.out.println("wynkmusic");

	}


}
