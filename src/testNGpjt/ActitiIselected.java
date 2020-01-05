package testNGpjt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActitiIselected
{

	@Test
	public void test() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement cb = driver.findElement(By.id("keepLoggedInLabel"));
		cb.click();
		boolean ck = cb.isSelected();	
		Thread.sleep(3000);
		//Assert.assertEquals(Next, true);
		Assert.assertFalse(ck);
		
		
	}
	
}
