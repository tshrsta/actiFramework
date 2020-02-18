package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;

public class TasksPage extends DriverScript {
	
	//********Page/Object Initialization**************************************************//
	
			public TasksPage()
			
			{
				PageFactory.initElements(driver, this);	
			}

	//******* Objects on page identification************************************//

	  @FindBy(xpath="//div[@class='title ellipsis']")WebElement AddNewMenu ;
	  @FindBy(xpath="//div[@class='item createNewCustomer']")WebElement AddNewCustomer;
	  @FindBy(xpath="//input[@placeholder='Enter Customer Name']")WebElement CustomerNameField ;
	  @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")WebElement CustDescriptionField ;
	  @FindBy(xpath="//div[contains(text(),'Create Customer')]")WebElement CreateCustbutton ;
	  
	//*********Actions/Methods***********************************************************//

}
