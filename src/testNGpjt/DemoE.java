package testNGpjt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoE extends BaseTest

{
	
	@Test
	public void registeruser()
	{
		
		Reporter.log("registeruser",true);
	}

	
	@Test
	public void edituser()
	{
		Reporter.log("edituser", true);
		
	}

}
