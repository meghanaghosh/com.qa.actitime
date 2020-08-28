package com.acti.pages;  //VIDEO 41

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acti.base.DriverScript;

public class TaskListPage extends DriverScript {
	
//******************************** Page Elements ******************************************************//

	@FindBy(xpath="//div[@class='title ellipsis']") WebElement addNewButton;
	@FindBy(xpath="//div[@class='item createNewCustomer']") WebElement newCustomerItem;
	@FindBy(xpath="//input[@placeholder='Enter Customer Name'][2]") WebElement custNameTBox;
	
//add more
	
//*******************************Page Initialisation **************************************************//

	public TaskListPage()
	{
		PageFactory.initElements(driver, this);  // this means refer to all webelements in @FindBy

	}

//********************************** Page Actions *****************************************************//

	public void clickAddNewButton()
	{
		addNewButton.click();
	}
	
	
	public void clickNewCustomerItem()
	{
		newCustomerItem.click();
	}
	
	
	public void enterCustomerName(String customerName)
	{
		custNameTBox.sendKeys("Testing");
	}
}
