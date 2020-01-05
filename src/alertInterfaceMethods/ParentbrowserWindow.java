package alertInterfaceMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParentbrowserWindow {

	static
	{
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com");
		Thread.sleep(6000);
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		driver.quit();
	}

}
