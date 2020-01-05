package testNGpjt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGpjt.ListnerTestNG.class)
public class ListnerTestNGTestcase {

WebDriver driver;

@BeforeMethod
public void launchBrowser()
{
	WebDriver driver=new FirefoxDriver();
	System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
}

//Test to pass as to verify listeners
@Test(priority=1)
public void TestToPass() throws InterruptedException
{
	driver.getTitle();
	System.out.println("This method is to pass test");
	
}

//Used to skip exception to skip the test
@Test(priority=2)
public void TestToSkip()
{
	System.out.println("The method to skip test");
	throw new SkipException("Skipping -This is not ready for testing");
}

//In the above method, we have already closed the browser so we could not get the title here. it is forcefully fail the test
@Test(priority=3)
public void TestToFail()
{
	driver.getTitle();
	System.out.println("This method to test Fail");
}


@AfterMethod()
public void closebrowser()
{
	driver.quit();
	
}

}


