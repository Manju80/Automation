package alertInterfaceMethods;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingMultipleTabs {

	static
	
	{
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
     WebDriver driver = new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
     driver.get("https://demo.actiTime.com/login.do");
     driver.findElement(By.xpath("//a[.='actiTIME Inc.']")).click();
     Thread.sleep(5000);
     Set<String> alltabs = driver.getWindowHandles();
     String pw=driver.getWindowHandle();
     System.out.println(pw);
     for(String tbs:alltabs)
     {
    	 
    	 driver.switchTo().window(tbs);
    	 int count=alltabs.size();
    	 System.out.println(count);
    	 String tit = driver.getTitle();
    	 Thread.sleep(8000);
    	 System.out.println(tit);
    	 
     }

  Thread.sleep(5000);
  driver.close();
     
	}

}
