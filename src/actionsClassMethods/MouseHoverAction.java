package actionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	WebDriver driver;
	static
	
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://home.redbrickhealth.com/why-redbrick/");
		Thread.sleep(5000);
		
String xp="//a[.='RedBrick Health']/../..//a[.='Solutions']";
driver.findElement(By.xpath(xp));

//to perform mousehover action

Actions act=new Actions(driver);
act.moveToElement(driver.findElement(By.xpath(xp))).perform();
Thread.sleep(5000);

//to click on specified element

driver.findElement(By.xpath("//a[.='Problems We Solve']")).click();

Thread.sleep(5000);

driver.close();
		
	}
	
	
}