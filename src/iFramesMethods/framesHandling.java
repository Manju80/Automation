package iFramesMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class framesHandling {
	
	static
	{
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/files/page1.html");
		Thread.sleep(3000);
		driver.findElement(By.id("m")).sendKeys("Ninga");
		Thread.sleep(2000);
		//Switch to frame by Index value
		//driver.switchTo().frame(0);
		//switch to frame by id
		driver.switchTo().frame("frm");
		//switch to frame by name
		//driver.switchTo().frame("frame");
		//switch to frame by address of Webelement
       // WebElement frame = driver.findElement(By.id("frm"));
		//driver.switchTo().frame(frame);

		driver.findElement(By.id("gf1")).sendKeys("Ningi");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("gf2")).sendKeys("mingi");
		Thread.sleep(2000);
		driver.close();
	}

}
