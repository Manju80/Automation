package webDriverMethods;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GeckodriverLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
		
		FirefoxDriver ff=new FirefoxDriver();
		Thread.sleep(5000);
		ff.close();
	}

}
