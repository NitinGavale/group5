package neostoxTEST;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import neostoxBase.NewBase;
import neostoxPOM.NeostoxHomePage;
import neostoxPOM.NeostoxLoginPage;
import neostoxPOM.NeostoxPasswordPage;
import neostoxUtility.NewUtility;
import neostoxUtility.Utility;

@Listeners(neostoxBase.Listener.class)
         
       public class Validation extends NewBase {
    	   
    	           NeostoxLoginPage login; 
	               NeostoxPasswordPage pass;
	               NeostoxHomePage home;
	
               @BeforeClass
      public void launchNeostox() throws InterruptedException, IOException 
 
{
            	   launchBrowser(); 
            	   
	           login= new NeostoxLoginPage(driver);
	           pass= new NeostoxPasswordPage(driver);
	           home= new   NeostoxHomePage(driver);
	      
	 }
             @BeforeMethod
         public void loginNeostox() throws EncryptedDocumentException, IOException, InterruptedException
         {
        	 
        	 login.enterMoNumber(driver, NewUtility.readdataFromPropertyFile("moNumber"));
        	 
        	 login.clickonSignup(driver);
        	
          	 Utility.wait(driver, 3000);
        	 
        	 pass.enterPassword(driver,NewUtility.readdataFromPropertyFile("password"));
        	 Thread.sleep(1000);
        	 pass.clickOnSubmit();
        	 Thread.sleep(1000);
        	 
        	 home.handlePopup(driver);
        	 
        	 
    }
         
         @Test
         public void validateUserName() throws EncryptedDocumentException, IOException
         {
        	 
        	 Assert.assertEquals(home.getActualUserName(driver), NewUtility.readdataFromPropertyFile("userName")," Actual and Expected user name are not matched TC is failled ");
        		
      //  	Utility.screenshot(driver, "nitin");
        	
    }
        @Test
         public void validateAccountBalance() throws IOException
         {
        	 
        	 Assert.assertNotNull(home.getAccountBalance(driver), "TC is failed unabel to fetch");
        	 
        	 Utility.screenshot(driver, "accountBalane");
        	 
         }
         
         
         @AfterMethod
         public void logOut()
         {
        	 
        	 home.logout(driver);
        	 
        	 
         }
         
         @AfterClass
         public void closeBrowser()
         {
        	 Reporter.log("Closing browser...", true);
        	 driver.close();
        	 
        	 
         }
               
               
               
}
