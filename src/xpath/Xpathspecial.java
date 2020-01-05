package xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathspecial {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//div[contains(text(),'free and always will be.')]"));

	}
}
