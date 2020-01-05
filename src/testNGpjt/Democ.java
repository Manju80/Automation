package testNGpjt;


import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class Democ {
	
	@Test(enabled=false)
	public void edituser()
	{
		
		Reporter.log("edituser", true);
	}
	
	@Test
	public void registeruser()
	{
		
		Reporter.log("registeruser", true);
	}
	
	@Test
	public void deleteuser()
	{
		Reporter.log("deleteuser", true);
	}
}

