package testNGpjt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActiTimeTitleVerification 
{

	@Test
	public void test()
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		String acTitle=driver.getTitle();
		String ExpectedTitle = "Gmail";
		Assert.assertEquals(acTitle, ExpectedTitle);
		
	}
	
}
