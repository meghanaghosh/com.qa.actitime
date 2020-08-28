package com.acti.base;  // VIDEO 40

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/*
 * Name: Meghana
 * Date Created: 08/27/2020
 * Date Modified:
 * Approved: Meghana
 * Email:
 */

public class DriverScript {

	//make it public static to give driver reference access is all places
	//Define a WebDrive global instance
	public static WebDriver driver;
	
	//to access the properties file outside of the try block, declare it globally
	public static Properties prop;
	
	//Create constructor of DriverScript
	
//This DriverScript() we will be loading the config.properties file which has the details about the environment
//and about the browser
	
//Whenever you are dealing with any external file like and excel file or a property file or any other,
//then it is always good to have this under try/catch block
	
	public DriverScript()
	{
		
		try
		{
			// Tell exactly where the source of the file config.properties is
			File file = new File("./config/config.properties");
			
			FileInputStream fis = new FileInputStream(file);
			
			//import from java.util.properties
		//	Properties prop = new Properties(); //instead of XSSFWorkbook, here it's a property file
			prop = new Properties(); //instead of XSSFWorkbook, here it's a property file
			
			//from prop, call method called load() to load the property file
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Unable to load the Properties File "+e.getMessage());
		}
		
	}
	
	//Next is launching the browser
	
	
	// Make sure to remove this @Test method after you are done with testing this file/unit testing
	//else it will open dual browsers
	//@Test 
	public static void initBrowser()
	{
		String browser = prop.getProperty("browser"); //browser key is coming from config.properties file
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/meghanaghosh/Downloads/chromedriver");
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/meghanaghosh/Downloads/geckodriver");
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("No Browser specified properly");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		String url = prop.getProperty("url"); // the key qa url is from config.properties file
		driver.get(url);
	}
	
	
}
