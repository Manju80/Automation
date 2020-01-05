package alertInterfaceMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenCalendarPopup {
	
	static
	{
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.cleartrip.com");
	Thread.sleep(5000);
	driver.findElement(By.id("DepartDate")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[.='June']/../../..//a[.='29']")).click();
	Thread.sleep(4000);
	driver.close();	
		
	}

}
