package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTextSeleniumdownloadPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.seleniumhq.org/download");
		driver.findElement(By.xpath("//td[text()='Java']"));
		driver.findElement(By.xpath("//td[text()='C#']"));
		driver.findElement(By.xpath("//td[text()='Ruby']"));
	    driver.findElement(By.xpath("//td[text()='Python']"));
	    driver.findElement(By.xpath("//td[text()='Javascript (Node)']"));
	    
	}

}
