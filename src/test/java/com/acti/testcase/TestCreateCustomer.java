package com.acti.testcase; //VIDEO 42

public class TestCreateCustomer extends BaseTest {
	
	public TestCreateCustomer() throws Exception
	{
		loginPage.validateLoginFunction("admin", "manager");
		enterTimePage.clickTaskMenu();
		taskListPage.clickAddNewButton();
		taskListPage.clickNewCustomerItem();
		taskListPage.enterCustomerName("Meghana");
		Thread.sleep(3000);
		
		enterTimePage.clickLogout();
	}

}
