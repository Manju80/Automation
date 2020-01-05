package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestGmailLogin {

		
		static
		{
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new FirefoxDriver();
					Thread.sleep(6000);
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					GmailLoginPOM lp = new GmailLoginPOM(driver);
					Thread.sleep(5000);
					lp.enterUsername(" ");
					lp.clicknext1();
					Thread.sleep(3000);
					lp.enterpassword("Chintamani!123");
					lp.clicknext2();
					Thread.sleep(5000);
					
					GmailLoginPOM lp1 = new GmailLoginPOM(driver);
					Thread.sleep(5000);
					lp1.enterUsername(" ");
					lp.clicknext1();
					lp1.enterpassword("Chintamani!123#");
					lp1.clicknext2();
					Thread.sleep(15000);
					driver.close();
					

		}

	}

