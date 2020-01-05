package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class GmailLogin {
	
	public static void main(String[] args) throws InterruptedException

	{
		
	System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
	
	WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("Input[Type='email']")).sendKeys("manju.preva@gmail.com");
		driver.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("Input[Type='password']")).sendKeys("Chintamani!123#");
		driver.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
			Thread.sleep(3000);
			driver.close();
		
	}
	}

