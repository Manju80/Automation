package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitlyWait {
	
	static
	
	{

		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
	}


	public static void main(String[] args) throws InterruptedException{
	
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//ImplicitWait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("manju.preva@gmail.com");
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Chintamani!123#");
		try
		{
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		try
		{
		Thread.sleep(8000);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		driver.close();
	}		
}
