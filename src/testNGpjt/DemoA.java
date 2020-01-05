package testNGpjt;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {

	@Test(priority=-2)
	public void edituser()
	{
		//Assert.fail();
		Reporter.log("edituser", true);

	}
	
	@Test(priority=-1)
	public void registeruser()
	{
		
		Reporter.log("registeruser", true);
	}
	
	@Test(priority=-3)
	public void deleteuser()
	{
		
		Reporter.log("deleteuser", true);
	}

}
