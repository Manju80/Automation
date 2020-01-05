package testNGpjt;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoG 
{
	
	@BeforeMethod(alwaysRun=true)
	public void login()
	{
		
		Reporter.log("login", true);
	}

	@AfterMethod(alwaysRun=true)
	public void logout()
	{
		
		Reporter.log("logout", true);
	}
	
	@Test(priority=1, groups= {"User", "smoke"})
	public void CreateUser()
	{
		Reporter.log("Createuser", true);
	}
	
	@Test(priority=2, groups="User")
	public void editUser()
	{
		Reporter.log("editUser", true);
		
	}
	
	@Test(priority=3, groups="User")
	public void deleteUser()
	{
		Reporter.log("deleteUser", true);
		
	}

	@Test(priority=4, groups= {"Task", "smoke"})
	public void CreateTask()
	{
		Reporter.log("CreateTask", true);
		
	}
	
	@Test(priority=5, groups="Task")
	public void EditTask()
	{
		Reporter.log("EditTask", true);
	}
	
	@Test(priority=6, groups="Task")
	public void DeleteTask()
	{
		Reporter.log("DeleteTask", true);
	}
}
