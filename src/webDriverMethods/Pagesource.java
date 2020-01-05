package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Pagesource {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(3000);		
	String pagesrc=driver.getPageSource();
	System.out.println(pagesrc);

	}

}
