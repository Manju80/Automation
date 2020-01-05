package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/files/AbsoluteXpath.html");
		driver.findElement(By.xpath("/html/body/div[1]/input[2]")).clear();
		driver.findElement(By.xpath("/html/body/div[1]/input[1]"));
		driver.findElement(By.xpath("/html/body/div[2]/input[1]"));
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Manju"); //Absolute Xpath
		
		driver.findElement(By.xpath("//div[2]/input[1]")).sendKeys("ABCD"); //relative Xpath
		
		//Absolute Xpath of the below html elements
		
		/*/html/body/div[1]/input[1] - 'A'
		
		/html/body/div[1]/input[2] - 'B'
		/html/body/div[2]/input[1] - 'C'
		/html/body/div[2]/input[2] - 'D'
		/html/body/div/input- 'AC'
		/html/body/div/input[1] - 'AD'
		/html/body/div/input[2]  - 'BD'
		/html/body/div[1]/input - 'AB'
		/html/body/div/input - 'BC'
       /html/body/div[1]/input | /html/body/div[2]/input[1] - 'ABC'
		/html/body/div[1]/input  | /html/body/div[2]/input[2] - 'ABD'
		/html/body/div/input[1] | /html/body//div[2]/input[2] - 'ACD'
		/html/body/div/input - 'ABCD'
		 
		 */ 
		 
		
		//Relative Xpath of below html elements
		
		//div[1]/input[1] A
		//div[1]/input[2] B
		//div[2]/input[2] D
		//div[2]/input[1] C
		
		//div[1]/input - AB
		//div[2]/input - CD
		//div/input[1] - AC
		//div/input[2] - BD
		//div[1]/input[1] | //div[2]/input[2]  - AD
		//div[1]/input | //div[2]/input[1]  - ABC
		//div[1]/input | //div[2]/input[2] - ABD
		//div/input[1] | //div[2]/input[2] - ACD
		//div/input - ABCD
		
		
/*  Replace index value of an element with @attribute name='value' in the xpath irrespective of Absolute or relative Xpath
 to consistently identify the position of the element without any error.
 
 /*   Replacing index value in Absolute Xpath with attribute values
 *       /html/body/div[1]/input[@value='A'] - 'A'	
		/html/body/div[1]/input[@value='B'] - 'B'
		/html/body/div[2]/input[@Value='Test'] - 'C'
		/html/body/div[2]/input[@Value='Selenium'] - 'D'
		
 */
		
		/* Replacing index value in relative Xpath with [ Attribute name='value']
		//div[1]/input[1] A ....> //div[1]/input[@value='A'] 
		//div[1]/input[2] B ....> //div[1]/input[@value='B']
		//div[2]/input[2] D ....> //div[2]/input[@value='Selenium']
		//div[2]/input[1] C .....> //div[2]/input[@value='Test']
		 
		 
		 * Inorder to identify multiple items on webpage use or, and in the Absolute or relative xpaths
		 
		 /Using Absolute Xpath with attribute value and OR
		    /html/body/div/input[@value='A' or @value='B']
		    /html/body/div/input[@value ='Test' or @value='Selenium']
		     
		     * Using relative Xpath with attribute value and OR
		     //div/input[@value='A' or @value='B']
		      //div/input[@value='Test' or @value='Selenium']
		      //div/input[@value='Selenium' or @value='B' or @value='Test']
		      //div/input[@value='Selenium' or @value='B' or @value='Test or @value='A']
		     
										
		
	*/	
		
	}

}
