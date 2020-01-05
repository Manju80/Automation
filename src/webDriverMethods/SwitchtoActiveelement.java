package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchtoActiveelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(3000);
		driver.switchTo().activeElement().sendKeys("Rajesh");
		driver.close();
	}

}
