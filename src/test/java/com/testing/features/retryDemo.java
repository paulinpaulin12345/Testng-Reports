package com.testing.features;

import org.testng.Assert;
import org.testng.annotations.Test;

public class retryDemo {
	@Test(retryAnalyzer=Retry_Class.class)    //retryAnalyzer feature is include for this @Test only
	private void username()
	{
		String expected_username="Gosling";
		String actual_username="James Gosling";
		Assert.assertEquals(actual_username, expected_username);// it check whether actual_username & expected _username is equals by Assert feature

	}
	@Test
	private void password()       // here User does not include the feature retryAnalyzer from TestNg
	{
		String expected_password="Gosling123";
		String actual_password="Gosling1234";
		Assert.assertEquals(actual_password, expected_password); //check whether actual_password & expected _password is equals by Assert feature

	}

}
