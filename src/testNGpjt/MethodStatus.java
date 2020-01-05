package testNGpjt;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class MethodStatus 

{
	
	@Test
	public void DeleteTask()
	{
		
		Reporter.log("DeleteTask", true);
	}
	
	@Test
	public void CreateTask()
	{
		
		Reporter.log("CreateTask", true);
	}
	
	
@AfterMethod
public void postCond(ITestResult res)
	{
	String name = res.getName();
	Reporter.log("mtdname" +name,  true);
	int s = res.getStatus();
	Reporter.log("status" +s, true);	
	}

//method status code:1 - Method pass, code 2 - Fail

}