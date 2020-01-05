package testNGpjt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GmailButtonIsDisplayed
{

	@Test
	public void test() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		WebElement btn = driver.findElement(By.cssSelector("//span[class='RveJvd snByac']"));
		boolean Next = btn.isDisplayed();
		Thread.sleep(3000);
		//Assert.assertEquals(Next, true);
		Assert.assertTrue(Next);
		
		
	}
	
}
