package actionsClassMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOrContextClick {

	static
	
	{
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		driver.get("https://demo.actiTime.com/login.do");
		Thread.sleep(5000);
		Actions act= new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		act.contextClick(link).perform();
		Thread.sleep(5000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(5000);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(5000);
		driver.close();

	}

}
