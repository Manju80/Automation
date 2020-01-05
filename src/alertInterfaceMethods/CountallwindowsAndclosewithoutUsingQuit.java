package alertInterfaceMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountallwindowsAndclosewithoutUsingQuit {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.naukri.com");
		Set<String> wh1 = driver.getWindowHandles();
		int count = wh1.size();
		for(String whs:wh1) 
		{
			driver.switchTo().window(whs);
			System.out.println(whs);
			Thread.sleep(3000);
			driver.close();
			
		}

	}

}
