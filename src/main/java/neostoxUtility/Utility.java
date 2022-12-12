package neostoxUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {
	
	
	public static String readdataFrromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		
	                       File myfile = new File ("D:\\Appache_poi\\myfile.xlsx");
	                      
	                String value = WorkbookFactory.create(myfile).getSheet("Sheet6").getRow(row).getCell(cell).getStringCellValue();
	                //      Reporter.log("Reading data from excel...", true);
	                       return value;
		
}
	 
	public static void screenshot(WebDriver driver ,String screenShotName) throws IOException
{
		
		                   File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		      
		                   File dest = new File("D:\\Screenshot\\"+screenShotName+".png");
		     
		                  FileHandler.copy(src, dest);
		     
		                  Reporter.log("taking screenshot ...", true);
		
		
	}
	
	public static  void wait(WebDriver driver ,int waittime)
	{
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
		Reporter.log("Waiting for "+waittime+"ms", true);
		
}
	
	

	
	
	
	
	
	
	
	
	
	
	
	

}
