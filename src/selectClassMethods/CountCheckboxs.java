package selectClassMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountCheckboxs {
	
	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/files/MultipleCheckboxCountSelect.html");
		
		String xpath = "//input[@type='checkbox']";
		
	List<WebElement> allcbs = driver.findElements(By.xpath(xpath));
		
	int count = allcbs.size();
	System.out.println(count);
	
	for (int i=0; i<=count; i++)
	{
		
		WebElement cb = allcbs.get(i);
		Thread.sleep(6000);
		cb.click();
		
	}
	
	driver.close();

}
}
