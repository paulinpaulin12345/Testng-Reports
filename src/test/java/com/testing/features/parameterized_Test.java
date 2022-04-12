package com.testing.features;

import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterized_Test {
	@Ignore
@Test
@Parameters({"username","password"})
private void credentials(@Optional("Smith12")String username,String password) {
	System.out.println("Username:"+username);
	System.out.println("Password:"+password);
	

}
@Test
@Parameters({"username","password"})
private void data(@Optional("kutty")String username,String password) 
{
	System.out.println("username:"+username);
	System.out.println("password:"+password);

}
}
