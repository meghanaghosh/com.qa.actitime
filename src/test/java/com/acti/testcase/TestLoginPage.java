package com.acti.testcase;  //VIDEO 42

import org.testng.Assert;
import org.testng.annotations.Test;


//Just write test cases here

public class TestLoginPage extends BaseTest {
	
	@Test(priority=0)
	public void verifyLoginPageTitle()
	{
		String actual="actiTIME - Login";
		String title = loginPage.verifyLoginPageTitle();
		Assert.assertEquals(title, actual);
		
		//System.out.println(title);
		//driver.close(); // write all this in @AfterMethod
	}
	
	
	@Test(priority=1)
	public void validateLoginFunctionality()
	{	
		loginPage.validateLoginFunction("admin", "manager");
				
		enterTimePage.clickLogout();	
	}
	
	
	@Test(priority=2)
	public void veriyActiLogo()
	{
		boolean flag = loginPage.verifyActiLogo();
		
		Assert.assertTrue(flag);
	}
}
