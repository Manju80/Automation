package selectClassMethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakeScreenshot {
	
	static
	{
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
	WebDriver driver= new FirefoxDriver();
	driver.manage().window().maximize();
		
	driver.get("https://www.google.com");
		
		//create a reference of TakeScreenshot and assign to object of browser class
	
 TakesScreenshot ts= (TakesScreenshot) driver;
		//Take the screenshot
		File src = ts.getScreenshotAs(OutputType.FILE);
		
	File dest = new File("./Screenshot/screenshot.jpg");
		
	//copy from src to dest
	FileUtils.copyFile(src, dest);
	driver.close();
		
		

	}

}
