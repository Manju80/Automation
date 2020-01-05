package webDriverMethods;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		Thread.sleep(3000);
		
		//Set the size of window
		
		
		Dimension d = new Dimension(200,300);
	driver.manage().window().setSize(d);
		
	Thread.sleep(3000);
		
		//set the position of the window
		
		Point p = new Point(100,300);
		driver.manage().window().setPosition(p);
		Thread.sleep(3000);
		
		//to maximize the window
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		// to delete all cookies
		
		driver.manage().deleteAllCookies();
		
		//to set full screen
		
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		
		
		//to close the browser
		driver.close();
		
		
	}

}
