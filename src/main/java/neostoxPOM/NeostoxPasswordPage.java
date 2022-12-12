package neostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neostoxUtility.Utility;



public class NeostoxPasswordPage {
	   
               @FindBy(id="txt_accesspin") private WebElement password;
	       @FindBy(id="lnk_submitaccesspin") private WebElement submit;
	
	
  public NeostoxPasswordPage (WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
		
	}	
	
	public void enterPassword(WebDriver driver,String pass)
	{
		           Utility.wait(driver, 2000);
	            	password.sendKeys(pass);
	            	Reporter.log("Entering password ...", true);
		
	}
	
	public void clickOnSubmit() throws InterruptedException
	{
		        //    Thread.sleep(1000);
	            	submit.click();
	            	Reporter.log("Clicking on submit button...", true);
		
	}
	
	
	
	
	
	
	

}
