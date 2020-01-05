package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	//to enter url	
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		
	//to get the title
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		
	//to get current url
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
        Thread.sleep(3000);
        
     //to close the current browser
        driver.close();
        
	}
	
	
	

}
