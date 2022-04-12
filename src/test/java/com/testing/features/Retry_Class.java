package com.testing.features;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

//Retry_Class is a class implements method named retry() ( ie ) override method from Interface IRetryAnalyzer
public class Retry_Class implements IRetryAnalyzer {  
	int start=1;
	int end=3;

	@Override
	public boolean retry(ITestResult result) { //Its returntype is boolean because it says whether the execution is true or false
		if(start<=end)
		{
			start++;
			return true;
		
		}
		return false;
	}

}
