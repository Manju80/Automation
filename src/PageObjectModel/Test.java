package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	
	static
	{
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
				Thread.sleep(6000);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				LoginPage lp = new LoginPage(driver);
				Thread.sleep(5000);
				lp.enterUsername("admin");
				lp.enterpassword("damager");
				lp.clickLogin();
				Thread.sleep(5000);
				
				LoginPage lp1 = new LoginPage(driver);
				Thread.sleep(5000);
				lp1.enterUsername("admin");
				lp1.enterpassword("manager");
				lp1.clickLogin();
				Thread.sleep(15000);
				driver.close();
				

	}

}
