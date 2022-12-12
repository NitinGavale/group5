package neostoxUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.testng.Reporter;

public class NewUtility {

	public static String readdataFromPropertyFile (String key) throws IOException
	{
	
	
		// create object of properties class
		
		   Properties  prop = new Properties();
		
		  //create object of FileInputStream and pass properties file path as a parameter
		
	    	FileInputStream myfile = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Investment_Banking\\neostox.properties");
		
		    prop.load(myfile);
		      
		     String value = prop.getProperty(key);
		     Reporter.log("Reading  "+key+ " from property file...",true);
		     return value;
	     
	     	
		
		
		
		
		
	}	
		
		

	}


