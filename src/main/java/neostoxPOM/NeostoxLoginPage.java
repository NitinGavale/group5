package neostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neostoxUtility.Utility;



public class NeostoxLoginPage {
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="(//input [@type='number'])[1]")  private WebElement mobileNumber;;
	@FindBy(id="lnk_signup1") private WebElement signup;
	
	
	public NeostoxLoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver , this);
		
	}
	
	public void enterMoNumber(WebDriver driver ,String mobNum)
	{
		         Utility.wait(driver, 1000);
		        mobileNumber.sendKeys(mobNum);
		        Reporter.log("Entering mobile number...", true);
		
		
	}
	
	public void clickonSignup(WebDriver driver )
	{
		        Utility.wait(driver, 1000);
		         signup.click();
		         Reporter.log("Clicking on signIn button...", true);
		
	
}
}
