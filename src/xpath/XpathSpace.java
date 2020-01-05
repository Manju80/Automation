package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathSpace {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/files/Xpath-NormalisedSpace.html");
		driver.findElement(By.xpath("//h1[normalize-space(text()='Product   list')"));
/*
 * Output return is a string with spaces trimmed : Product list 
 * 
 * 
 */
	}

}
