package alertInterfaceMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookUploadPhoto {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

			public static void main(String[] args) throws InterruptedException
			
			{
				WebDriver driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
				driver.get("https://www.facebook.com");
				driver.findElement(By.id("email")).sendKeys("manju.preva@gmail.com");
				driver.findElement(By.name("pass")).sendKeys("Chintamani!123#");
				driver.findElement(By.id("loginbutton")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@title='Choose a file to upload']")).sendKeys("C:\\Users\\Admin\\Desktop\\Manjunath-Profile.docx");
				Thread.sleep(8000);
				driver.close();
			}	
}
