package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FacebookLocationUNPWD {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement E=driver.findElement(By.id("email"));
		System.out.println(E);
		//to get the location
		
		Point location = E.getLocation();
		int x = location.getX();
		System.out.println("x co-ordinate is : " +x);
		int y = location.getY();
		System.out.println("y co-ordinate is : " +y);
		
		WebElement P=driver.findElement(By.id("pass"));
		
		Point location1 = P.getLocation();
		int x1 = location1.getX();
		System.out.println("x1 co-ordinate is : " +x1);
		int y1 =location1.getY();
		System.out.println("y1 co-ordinate is : " +y1);
		
		if (x==x1 && y==y1)
			
		{
			
			System.out.println("Both are same");
		}
		
	
		else 
			
		{
			System.out.println("Both are not same");
		}
		
		
		}
		
	}

/*
 * Exception in thread "main" java.lang.NullPointerException
	at seleniumPractice.webElementMethods.ActitimeFieldSize_UNPWD.main(ActitimeFieldSize_UNPWD.java:25)
 * 
 */
