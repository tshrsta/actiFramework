package com.acti.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.Base.DriverScript;

public class LoginPage extends DriverScript{
	
	//******* Objects on a login page identification************************************//
	
	@FindBy(id="username") WebElement usernameTextBox;
	@FindBy(name="pwd") WebElement passwordtextbox;
	@FindBy(id ="loginButton")WebElement Loginbutton;
	@FindBy(xpath="//div[@class='atLogoImg']")WebElement actilogo;
	@FindBy(xpath="//nobr[contains(text(),'actiTIME 2020 Online')]")WebElement ActiTimetext;
	@FindBy(xpath="//a[contains(text(),'actiTIME Inc.')]") WebElement ActitimeLink;
	
	
	//********Page/Object Initialization**************************************************//
	
	public LoginPage()
	{
		
		PageFactory.initElements(driver, this);
		//initElements> ctrl+space>choose the last option on the pop up
		
	}
	
	//*********Actions/Methods***********************************************************//
	
	public String verifyTitile()
	{
		return driver.getTitle();
	}
	
	public boolean verifyLogoisdisplayed()
	{
		
		return actilogo.isDisplayed();
	}

	public void validateLoginFunction(String username, String password )
	{
		usernameTextBox.sendKeys(username);
		passwordtextbox.sendKeys(password);
		Loginbutton.click();
	}
}
