package com.testing.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LisenorDemo_Runner {
	@Test 
	private void username()
	{
		String expected_username="Gosling";
		String actual_username="James Gosling";
		Assert.assertEquals(actual_username, expected_username);

	}
	@Test
	private void password()       
	{
		String expected_password="Gosling123";
		String actual_password="Gosling1234";
		Assert.assertEquals(actual_password, expected_password); 

	}


}
