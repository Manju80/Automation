package alertInterfaceMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitleOfAllChildWindows{

	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.naukri.com");
		Set<String> wh1 = driver.getWindowHandles();
		System.out.println(wh1);
		int count = wh1.size();
		System.out.println(count);
		for(String whs:wh1) 
		{
			driver.switchTo().window(whs);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(3000);
			driver.close();
			
		}

	}

}
