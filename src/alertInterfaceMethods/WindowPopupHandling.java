package alertInterfaceMethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowPopupHandling {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='3.141.59']")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\print.aut");
		Thread.sleep(2000);
		driver.close();
	}

}
