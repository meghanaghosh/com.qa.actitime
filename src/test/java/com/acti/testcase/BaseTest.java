package com.acti.testcase;  //VIDEO 42

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.acti.base.DriverScript;
import com.acti.pages.EnterTimePage;
import com.acti.pages.LoginPage;
import com.acti.pages.TaskListPage;

public class BaseTest extends DriverScript {
	
	LoginPage loginPage;  
	EnterTimePage enterTimePage;
	TaskListPage taskListPage;
	
	public BaseTest() 
	{
		
		super(); // Super keyword is used to call the parent class constructor which here is DriverScript()
	}
	
	@BeforeMethod
	public void beforeTest()
	{
		initBrowser();
		loginPage = new LoginPage();
		//EnterTimePage enterTimePage = new EnterTimePage(); //declare globally
		enterTimePage = new EnterTimePage();
		taskListPage = new TaskListPage();
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
