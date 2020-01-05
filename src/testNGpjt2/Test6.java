package testNGpjt2;

import org.testng.Reporter;
import org.testng.annotations.Test;

import testNGpjt.Test5;

public class Test6 extends Test5 {
	

		@Test(priority=2, groups= {"Sanity", "Regression"})
		public void Edituser()
		{
			
			Reporter.log("Edituser", true);
			
		}
	}



