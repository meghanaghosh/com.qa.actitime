package com.acti.pages;  // VIDEO 42

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;


/*
 * Script Name: EnterTimePage
 * Created By: Meghana 
 * Date Created: 08/28/2010
 * Verified By: Meghana
 */

public class EnterTimePage extends DriverScript {
	
//******************************** Page Elements ******************************************************//

	
	@FindBy(id="logoutLink") WebElement logoutLink;
	
	@FindBy(xpath="//div[@id='container_tasks']") WebElement taskMenu;
	
//*******************************Page Initialisation **************************************************//

	
	public EnterTimePage() 
	{
		
		PageFactory.initElements(driver, this);  // this means refer to all webelements in @FindBy
	
	}
	
//********************************** Page Actions *****************************************************//
	
	
	public void clickLogout()
	{
		logoutLink.click();
	}
	
//****************************************************************************************************//

	
	public void clickTaskMenu()
	{
		taskMenu.click();
	}
}
