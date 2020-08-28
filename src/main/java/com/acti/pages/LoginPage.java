package com.acti.pages;  //VIDEO 41

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

/*
 * Name: Meghana
 * Date Created: 08/28/2020
 * Approved By: Meghana
 * 
 */


//Extend to DriverScript to have access to all the page loading elements

public class LoginPage extends DriverScript {
	
//In Page Object Model, the element is identified by @FindBy annotation from Seleniumum 
//and not from TestNG
	
	@FindBy(id="username") WebElement usernameTBox;
	@FindBy(name="pwd") WebElement passwordTBox;
	@FindBy(id="loginButton") WebElement loginButton;
	@FindBy(xpath="//div[@class='atLogoImg']") WebElement actiLogo;
	
//*************************************************************************************************************//
	
	
//You have to create a constructor of Login pge and call one class known as PageFactory()	
//Page factory is a class in selenium that supports POM and the use of PageFactory is to initialise the objects	
	
	public LoginPage()
	{ 
		PageFactory.initElements(driver, this);  // this means refer to all webelements in @FindBy
	}

//*************************************************************************************************************//

	
	/*public void validateLoginFunction()
	{
		usernameTBox.sendKeys("admin"); // do not hardcode the test data like this
		passwordTBox.sendKeys("manager");
		loginButton.click();
	}*/
	
//*************************************************************************************************************//
	
		public void validateLoginFunction(String username, String password)
	{
		usernameTBox.sendKeys(username); // do not hardcode the test data like this
		passwordTBox.sendKeys(password);
		loginButton.click();
	}

//*************************************************************************************************************//
	
	public boolean verifyActiLogo()
	{
		return actiLogo.isDisplayed();
	}

//*************************************************************************************************************//

	public String verifyLoginPageTitle()
	{
		return driver.getTitle();
	}
	
}
