package actionsClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeClickActions {

	static
	
	{
		
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		driver.get("https://demo.actiTime.com/login.do");
		Actions act=new Actions(driver);
		WebElement link=driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		//act.contextClick(link).perform();
		act.sendKeys(Keys.CONTROL).click(link).build().perform();
		Thread.sleep(5000);
		driver.close();

	}

}
