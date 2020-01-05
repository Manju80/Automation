package alertInterfaceMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAddressallchildWindows {
static
{
	
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.naukri.com");
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		Set<String> allws = driver.getWindowHandles();
		int count = allws.size();
		System.out.println(count);
		for(String wh1:allws)
		{
			
			System.out.println(wh1);
			
		}

		driver.quit();
	}

}
