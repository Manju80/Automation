package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFbkLogin {

		static
		{
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		}

		public static void main(String[] args)  throws InterruptedException {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
					Thread.sleep(6000);
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					FbookLoginPom lp = new FbookLoginPom(driver);
					Thread.sleep(5000);
					lp.enterUsername("manju.preva@gmail.com");
					lp.enterpassword("damager");
					lp.clickLogin();
					Thread.sleep(5000);
					
					FbookLoginPom lp1 = new FbookLoginPom(driver);
					Thread.sleep(5000);
					lp1.enterUsername("manju.preva@gmail.com");
					lp1.enterpassword("Chintamani!123#");
					lp1.clickLogin();
					Thread.sleep(15000);
					driver.close();
					

		}

	}


