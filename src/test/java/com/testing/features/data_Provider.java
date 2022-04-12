package com.testing.features;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_Provider {
	@Test(dataProvider="testData")
	private void data(String username,int password)
	{
		System.out.println("username:"+username);
		System.out.println("password:"+password);

	}
	@DataProvider
	private Object[][] testData() {
		return new Object[][] {
			{"ammu",123},{"smith",456},{"gosling",897}
		};
	}
	
	
	
	
	
	
	
}
