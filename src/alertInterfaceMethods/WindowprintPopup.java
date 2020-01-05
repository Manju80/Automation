package alertInterfaceMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowprintPopup {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Runtime.getRuntime().exec("D:\\printt.aut");
		Thread.sleep(3000);
		driver.close();
	}

}
