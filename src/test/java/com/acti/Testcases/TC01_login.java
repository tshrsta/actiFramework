package com.acti.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.acti.Base.DriverScript;
import com.acti.Pages.LoginPage;


//prepared by Tripti

public class TC01_login extends DriverScript
{
	
	LoginPage lp;
	
       public TC01_login()
       {
    	 //super keyword is used to call the base class constructor i.e.driverscript() constructor
    	  super();//hover on super and press ctrl+click on mouse
       }
       
       @BeforeMethod
       public void preTest()
       {
    	   initBrowser();//open browser
    	   lp = new LoginPage(); //object is created for loginpage class 
    	   
       }
       
       
       @Test(priority=1)
       public void testVerifyTitle()
       {
    	  
    	  String title = lp.verifyTitile();
    	  System.out.println(title);
       }
       
       @Test(priority=2)
       public void testVerifyLogoDisplayed()
       {
    	 boolean res = lp.verifyLogoisdisplayed();
    	 System.out.println(res);
       }
       
       @Test(priority=3)
       public void testValidateLoginFunction()
       {
    	   lp.validateLoginFunction("admin", "manager");
       }
       
       @AfterMethod
       public void postTest()
       {
    	   driver.close();
       }
}



