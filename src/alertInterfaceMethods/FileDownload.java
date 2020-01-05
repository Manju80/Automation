package alertInterfaceMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownload {

	static
	{
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
		Thread.sleep(5000);
		Robot r =  new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.close();
		
	}

}
