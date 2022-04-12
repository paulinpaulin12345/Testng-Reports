package com.testing.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Groups_Concept {
	
	@Test(groups="Books")
	private void books()
	{
		System.out.println("Books");

	}

	@Test(groups="Social Media")
	private void whatsapp() 
	{
		System.out.println("whatApp");

	}

	@Test(groups="Social Media")
	private void instagram()
	{
		
     System.out.println("instagram");
	}
	@Test(groups="Music")
	private void spotify()
	{
		System.out.println("Spotify");

	}
	
	@Test(groups="Music")
	private void wynkMusic()
	{
	System.out.println("wynkmusic");

	}
	@Ignore
	@Test(groups="Single")
   private void glossary() {
	System.out.println("Glossary");

}

}
