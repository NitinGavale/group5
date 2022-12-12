package neostoxBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neostoxUtility.NewUtility;



public class NewBase {
	
    protected static WebDriver driver;
    
    public void launchBrowser() throws InterruptedException, IOException {     

    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

     driver = new ChromeDriver();
    
  	driver.manage().window().maximize();
  	
    Thread.sleep(1000);
    
    Reporter.log("Launching browser...", true);  
    
   driver.get(NewUtility.readdataFromPropertyFile("url"));
   
  
 

}
}