package testNGpjt;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB {
	
	@Test
	public void edituser()
	{
		
		Reporter.log("edituser", true);
	}
	
	@Test
	public void registeruser()
	{
		
		Reporter.log("registeruser", true);
	}
	
	@Test(dependsOnMethods={"registeruser", "edituser"})
	public void deleteuser()
	{
		Reporter.log("deleteuser", true);
	}
}

