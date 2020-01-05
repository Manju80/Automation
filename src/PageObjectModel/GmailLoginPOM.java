package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPOM {

		//Declaration of webelements
		@FindBy(id="identifierId")
		private WebElement untb;
		
		
		@FindBy(xpath="//span[.='Next']")
		private WebElement next1;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement pwtb;
		
		@FindBy(xpath="//span[.='Next']")
		private WebElement next2;
	
		
		//Initialization of webelements
		
		public GmailLoginPOM(WebDriver driver)
		{
			
			PageFactory.initElements(driver,this);
		}
		
		//utilization
		
		public void enterUsername(String un)
		{
			untb.sendKeys(un);
			
		}
		
		public void clicknext1()
		{
			
			next1.click();
		}
		
		public void enterpassword(String pwd)
		{
			
			pwtb.sendKeys(pwd);
		}
		
		public void clicknext2()
		{
			
			next2.click();
		}
	}

