package alertInterfaceMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BreakSpecificWindow{

	static
	{
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.naukri.com");
		Set<String> allws = driver.getWindowHandles();
		int count = allws.size();
		System.out.println(count);
		for(String wh1:allws)
		{
			
			
			driver.switchTo().window(wh1);
			System.out.println(wh1);
			String tit = driver.getTitle();
			System.out.println(tit);
			if(tit.equals("HCL"))
			{
				break;
			}
			
		}

	}
}
