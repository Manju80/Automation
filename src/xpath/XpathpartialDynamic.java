package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathpartialDynamic {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[type='email']"));
		driver.findElement(By.xpath("//iput[span='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//input[type='password']")).sendKeys("Chintamani!123#");
		driver.findElement(By.xpath("//iput[span='RveJvd snByac']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[Contains(text(), 'Inbox[1]')]")).click();
		

	}

}
