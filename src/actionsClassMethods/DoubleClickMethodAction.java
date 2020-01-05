package actionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethodAction 
{

	public static void main(String[] args) throws InterruptedException

	{
		
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

	 WebDriver driver= new FirefoxDriver();
	driver.get("file:///C:/files/Doubleclick.html");
	Thread.sleep(2000);
	WebElement qsp = driver.findElement(By.id("b"));
	Thread.sleep(2000);
	 Actions act= new Actions(driver);
	 Thread.sleep(2000);
	 act.doubleClick(qsp).perform();
	Thread.sleep(8000);
	WebElement TM = driver.findElement(By.id("d"));
	String Text = TM.getText();
	System.out.println(Text);
	
	if(!(Text==null))
		System.out.println("Text displayed");
	  {
		
	if(Text=="Welcome to Qspiders");	
		  {
		   System.out.println("Message is correct");
		
	      }
	     
	driver.close();
	  
	  }
	}
}	
