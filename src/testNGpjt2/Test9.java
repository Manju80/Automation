package testNGpjt2;

import org.testng.Reporter;
import org.testng.annotations.Test;
import testNGpjt.Test5;

public class Test9 extends Test5 {
	
		@Test(priority=1, groups= {"Sanity"})
		public void createuser()
		{
			
			Reporter.log("createuser", true);
			
		}
	}

