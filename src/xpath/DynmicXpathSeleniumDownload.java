package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynmicXpathSeleniumDownload {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/download");
		driver.findElement(By.xpath("//td[.='C#']/..//a[.='Download']"));

		//Identify dynamic element Download link under C# static element
		
		//td[.='C#']/..//a[text()='Download']
		
		//Identify dynamic element Download link under Ruby static element
		//td[.='Ruby']/..//a[.='Download']
		
		//Identify dynamic element Download link under Python static element
		//td[.='Python']/..//a[.='Download']
		
		//Identify dynamic element Download link under Javascript (Node) static element
		//td[.='Javascript (Node)']/..//a[.='Download']"));
		
		driver.findElement(By.xpath("//td[.='Javascript (Node)']/..//a[.='Download']")).click();
		//Identify dynamic element Change log link under Java static element
		
		//td[.='Java']/..//a[.='Change log']
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Change log']")).click();
		
		//Identify dynamic element Change log link under C# static element
		
		//td[.='C#']/..//a[.='Change log']
		driver.findElement(By.xpath("//td[.='C#']/..//a[.='Change log']")).click();
				
		//Identify dynamic element Change log link under Ruby static element
		//td[.='Ruby']/..//a[.='Change log']
		driver.findElement(By.xpath("//td[.='Ruby']/..//a[.='Change log']")).click();
				
	    //Identify dynamic element Change log link under Python static element
		//td[.='Python']/..//a[.='Change log']
		driver.findElement(By.xpath("//td[.='Ruby']/..//a[.='Change log']")).click();
		
		//Identify dynamic element Change log link under Javascript (Node) static element
		//td[.='Javascript (Node)']/..//a[.='Change log']"));
		driver.findElement(By.xpath("//td[.='Javascript (Node)']/..//a[.='Change log']")).click();
		
				
       //Identify dynamic element Change log link under Javascript (Node) static element
	   //td[.='Javascript (Node)']/..//a[.='Change log']"));
		driver.findElement(By.xpath(" //td[.='Javascript (Node)']/..//a[.='Change log']")).click();
		
	}

}
