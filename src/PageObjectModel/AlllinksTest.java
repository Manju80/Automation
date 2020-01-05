package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlllinksTest {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		
WebDriver driver = new FirefoxDriver();
driver.get("https://demo.actitime.com/login.do");
driver.manage().window().maximize();
ActitimeLoginPage al=new ActitimeLoginPage(driver);
al.getallLinks();
Thread.sleep(3000);
driver.close();

	}
}	
		
