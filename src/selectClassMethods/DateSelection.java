package selectClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DateSelection {

	static
	
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
				
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		WebElement fb = driver.findElement(By.id("day"));
		//select required date option
		Select day=new Select(fb);//create select class object to perform select operations
		
		day.selectByIndex(3);
		 System.out.println();
		 Thread.sleep(6000);
		 
		 if(day.isMultiple())
			 
		    {
			 System.out.println("Multi select list box");
		     }
		 
		 else 
			 
		 {
			 System.out.println("Single select list box");
			 
		 }
		 
		 
		 //to select month from the list box
		 
		 WebElement fb1 = driver.findElement(By.id("month"));
		 
		 Select Month = new Select(fb1);
		 Month.selectByVisibleText("Jun");
		 
		 if(Month.isMultiple())
		 
		    {
			 System.out.println("Multi select list box");
		     }
		 
		 else 
			 
		 {
			 System.out.println("Single select list box");
			 
		 }
		 
		 //to select year from list box
 WebElement fb2 = driver.findElement(By.id("year"));
		 
		 Select Year = new Select(fb2);
		 Year.selectByVisibleText("1980");
		 Thread.sleep(6000);
		 
		 if(Year.isMultiple())
		 
		    {
			 System.out.println("Multi select list box");
		     }
		 
		 else 
			 
		 {
			 System.out.println("Single select list box");
			 
		 }
		 
		 driver.close();
	}
		
}

