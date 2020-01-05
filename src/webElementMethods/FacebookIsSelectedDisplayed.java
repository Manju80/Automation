package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookIsSelectedDisplayed {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	WebElement rb1 = driver.findElement(By.id("u_0_6"));
	Thread.sleep(3000);
	System.out.println(rb1);
	if (rb1.isSelected())
	{
		System.out.println("Selected");
	}
	
	else

	{
		System.out.println("Not Selected");
		
	}

	WebElement rb2 = driver.findElement(By.id("u_0_7"));
	Thread.sleep(2000);
	System.out.println(rb2);
	
if (rb2.isSelected())
		
	{
		System.out.println("Selected");
	}
	
	else 

	{
		System.out.println("Not Selected");
		
	}
	
driver.close();
	}
}
