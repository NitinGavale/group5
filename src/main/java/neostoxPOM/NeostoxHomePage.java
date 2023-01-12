package neostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import neostoxUtility.Utility;


public class NeostoxHomePage {
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
                @FindBy(xpath="(//a[text()='OK'])[2]") private WebElement ok;
                @FindBy(xpath="(//a[text()='Close'])[5]") private WebElement close;
                @FindBy(id="lbl_username") private WebElement username;
                @FindBy(id="lbl_curbalancetop") private WebElement avlBalance;
                @FindBy(id="lnk_logout")  private WebElement logout;
	 
	
	public  NeostoxHomePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
		}
	
	public void handlePopup(WebDriver driver )
	{
		
		if(ok.isDisplayed())
		{
		                  Reporter.log("Handling popup...", true);
		           
		                  Utility.wait(driver, 1000);
		                	 ok.click();
	                      Reporter.log("Clicking on OK button...", true);
		
		            
		                  Utility.wait(driver, 1000);
	                      close.click();
	                     Reporter.log("Clicking on Close button...", true);
	}
		
		else {
			
			Reporter.log("There is no popup...", true);
			
		       }
	}
	
	
	public String  getActualUserName(WebDriver driver)
	
	{                  Utility.wait(driver, 1000);
		               String actualUserName = username.getText() ;   
		               Reporter.log("getting actual user name...", true);
		               
		               Reporter.log("Actual user name is" +actualUserName, true) ;
		               
				       return actualUserName;
		               
	}
	public String getAccountBalance(WebDriver driver)
	{               
		                 Utility.wait(driver, 1000);
		                 String accBalance = avlBalance.getText();
		                 Reporter.log("getting account balnace...", true);
		                 
		                 Reporter.log("Account balnace is " +accBalance, true);
						 return accBalance;
		                 
}
	              public void logout(WebDriver driver)
	 {  
		 
		                 Utility.wait(driver, 2000);
	                	 username.click();
		 
		 
		         //       Utility.wait(driver, 1000);
	                 	  logout.click();
		 
		                Reporter.log("Logging out...", true);
		 
		 
	 }
	
	
	
	
	
	
	
	
	
	

}
