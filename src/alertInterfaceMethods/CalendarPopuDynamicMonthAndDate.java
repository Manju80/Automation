package alertInterfaceMethods;

	import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class CalendarPopuDynamicMonthAndDate {
	
		static
		{
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			
			Date d= new Date();
			System.out.println(d);
			SimpleDateFormat s1= new SimpleDateFormat("d");
			String day = s1.format(d);
			SimpleDateFormat s2= new SimpleDateFormat("MMMM");
			String month=s2.format(d);
			
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com");
		Thread.sleep(5000);
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='"+month+"']/../../..//a[.='"+day+"']")).click();
		Thread.sleep(4000);
		driver.close();	
			
		}

	}
