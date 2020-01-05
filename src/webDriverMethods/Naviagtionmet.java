package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naviagtionmet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
  WebDriver driver=new FirefoxDriver();
  
  driver.get("https://www.gmail.com");
  Thread.sleep(3000);
  
  //Navigate to facebook site
  
  driver.navigate().to("https://facebook.com");
  Thread.sleep(3000);
  
  //Navigate back method
  
  driver.navigate().back();
  Thread.sleep(3000);
  
  //Navigate forward method
  
  driver.navigate().forward();
  Thread.sleep(3000);
  
  //Refresh method
  
  driver.navigate().refresh();
  Thread.sleep(3000);
  driver.close();
  
  
	}

}
