package testNGpjt;

import org.junit.Before;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test5 {

	@BeforeSuite
	public void OpenAUT()
	{
		
		{	
			Reporter.log("OpenAUT", true);
			
		}
	}
	@BeforeTest
	public void deletescookies()
	{
		
		{	
			Reporter.log("deletecookies", true);
			
		}
	}
	
	@BeforeClass
	public void StartSystem()
	{
		
		{	
			Reporter.log("StartSystem", true);
			
		}
	}
	
	
	@BeforeMethod
	public void Invokebrowser()
	{
		
		{	
			Reporter.log("Invokebrowser", true);
			
		}
	}

	
		@Test(priority=3, groups="Integration Test}")
		public void Deleteuser()
		{
			
			Reporter.log("Deleteuser", true);
			
		}
		
		
		@AfterMethod
		public void CloseBrowser()
		{
			
			{	
				Reporter.log("Closebrowser", true);
				
			}
		}
		
		@AfterClass
		public void RestartSysstem()
		{
			
			{	
				Reporter.log("RestartSysstem", true);
				
			}
		}
		
		
		@AfterTest
		public void closeDBConnection()
		{
			
			{	
				Reporter.log("closeDBConnection", true);
				
			}
		}
		@AfterSuite
		public void CloseAUT()
		{
			
			{	
				Reporter.log("CloseAUT", true);
				
			}
		
	}
		
}