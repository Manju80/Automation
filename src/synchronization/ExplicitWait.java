package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	static
	
	{
		
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Thread.sleep(7000);
		String Title = "actiTIME -  Enter Time-Track";
		driver.getTitle();
		System.out.println(Title);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		try
		
		{
		wait.until(ExpectedConditions.titleIs(Title));
		System.out.println("Pass");
		}
		
		catch (Exception e)
		
		{
		
			System.out.println("fail");
	    }
		
		driver.close();
	}
	
}
