package webDriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromebrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");

		ChromeDriver cd=new ChromeDriver();
		Thread.sleep(5000);
		cd.close();
		
	}

}
