package testNGpjt;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demod 
{
	@Test(invocationCount=3)
	public void createuser()
	{
		
		Reporter.log("createuser", true);
		
	}
}
