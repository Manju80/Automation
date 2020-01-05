package alertInterfaceMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopup {
	
	static
	
	{
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.actitime.com/contact-support");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.id("first-name")).sendKeys("Manjunath");
		driver.findElement(By.id("last-name")).sendKeys("Reddy");
		driver.findElement(By.id("email")).sendKeys("manju.preva@gmail.com");
		driver.findElement(By.id("question")).sendKeys("Hi");
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Admin\\Downloads\\image002.png");
		Thread.sleep(6000);
		driver.close();
		
	}
	
}	