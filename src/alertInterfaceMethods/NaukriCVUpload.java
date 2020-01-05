package alertInterfaceMethods;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NaukriCVUpload 
{
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException
	
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Thread.sleep(20000);
		driver.findElement(By.id("input_resumeParser")).sendKeys("C:\\Users\\Admin\\Desktop\\Manjunath-Profile.docx");
		Thread.sleep(12000);
		driver.findElement(By.id("bd_email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("bd_email")).sendKeys("manjunath.preva@gmail.com");
		driver.findElement(By.name("password")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("Chintamani!123#");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("bd_adv_workExp_year"));
		Select sel = new Select(ele);
		sel.selectByValue(" 11");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[.='Register']")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
