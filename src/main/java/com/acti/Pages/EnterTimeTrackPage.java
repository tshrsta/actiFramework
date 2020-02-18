package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;

public class EnterTimeTrackPage extends DriverScript
{

//********Page/Object Initialization**************************************************//
	
		public EnterTimeTrackPage()
		{
			PageFactory.initElements(driver, this);	
		}

//******* Objects Repository************************************//

  @FindBy(id="logoutLink")WebElement Logoutlink;
  @FindBy(xpath="//div[@id='container_tasks']")WebElement Tasksmenu;
  
//*********Actions/Methods***********************************************************//
 
       public void verifyLogoutfunction()
       {
    	   Logoutlink.click();
       }
       
       public boolean verifyTaskMenuDisplayed()
       {
    	   return Tasksmenu.isDisplayed();
       }

       public void ClickTaskMenu()
       {
    	   Tasksmenu.click();
       }
}



