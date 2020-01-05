package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbookLoginPom {

	//Declaration of webelements
		@FindBy(id="email")
		private WebElement untb;
		
		@FindBy(id="pass")
		private WebElement pwtb;
		
		@FindBy(xpath="////input[@type='submit']")
		private WebElement logbtn;
		
		//Initialization of webelements
		
		public FbookLoginPom(WebDriver driver)
		{
			
			PageFactory.initElements(driver,this);
		}
		
		//utilization
		
		public void enterUsername(String un)
		{
			untb.sendKeys(un);
			
		}
		
		public void enterpassword(String pwd)
		{
			
			pwtb.sendKeys(pwd);
		}
		
		public void clickLogin()
		{
			
			logbtn.click();
		}
	}

