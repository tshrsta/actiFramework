package com.acti.Base;


import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//The primary/parent class which drives the entire framework:driver script
// top most item to get started with selenium is web driver.

public class DriverScript {
	
	public static WebDriver driver; //ctrl+space after webdriver and select org.openqa.sel.
	static Properties prop;
	
	//constructor to initialize the object of properties class or to get details from the properties file.	
	public DriverScript()
	{
		try
		{
			prop = new Properties();//create an object of properties class
			FileInputStream src = new FileInputStream("./acti.configuration/config.properties");
			prop.load(src);
			
		}                      
		
		catch(Exception e)
		{
		  System.out.println("File Not Found"+e.getMessage());
		}
	}
	
	
	public static void initBrowser()
	{
	  String browser = prop.getProperty("browser");
	  if(browser.equalsIgnoreCase("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "./acti.browser/chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  
	  else if(browser.equalsIgnoreCase("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "./acti.browser/geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  
	  else
	  {
		 System.out.println("No proper browser specified : Please check the properties file");  
	  }
	
	
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  String url = prop.getProperty("qaurl");
	  driver.get(url);
	}
}
