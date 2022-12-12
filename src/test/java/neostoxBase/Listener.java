package neostoxBase;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


import neostoxUtility.Utility;

public class Listener extends NewBase implements ITestListener{
	public void onTestSuccess(ITestResult result)
	{
	        	Reporter.log("Test Case " + result.getName() + " is Copmpleted Successfuly...", true);
		
     }	
	
	public void onTestFailure(ITestResult result)
	{
		
	            Reporter.log("Test Case  " +  result.getName() +" is Failed Please try Again..", true);
	            try {
					Utility.screenshot(driver, result.getName());
				} catch (IOException e) {
					
					e.printStackTrace();
				}
	}
	
	public void onTestSkipped(ITestResult result)
	{
		
		Reporter.log("Test Case " +  result.getName() + " is Skipped Please Cheaked...", true);
		
	}

	
	
	
	
	
	
	
	
	

}
