package testNGpjt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderExample{
	
	//This test method declares that its data should be supplied by the Data Provider
	// "getdata" is the function name which is passing the data
       // Number of columns should match the number of input parameters
	@Test(dataProvider="getData")
	public void Login(String username, String password) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usernam=driver.findElement(By.id("username"));
		WebElement passwd = driver.findElement(By.name("pwd"));
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		System.out.println("you have provided username as::"+usernam);
		System.out.println("you have provided password as::"+passwd);
	}

	@DataProvider
	public Object[][] getData()
	{
	//Rows - Number of times your test has to be repeated.
	//Columns - Number of parameters in test data.
	Object[][] data = new Object[3][2];

	// 1st row
	data[0][0] ="admin";
	data[0][1] ="manager";

	// 2nd row
	data[1][0] ="trainee";
	data[1][1] ="trainee";
	
	// 3rd row
	data[2][0] ="admin";
	data[2][1] ="manager";

	return data;
}
	
	
	@Test(dataProvider="getData")	
	public void createuser(Object un, Object pw)
	{
		Reporter.log("un" + " " +"pw", true);
	}
}
