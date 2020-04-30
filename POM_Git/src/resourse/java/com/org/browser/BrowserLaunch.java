package com.org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BrowserLaunch 
{
	public static WebDriver driver;
	public static WebDriver drivers(String browser)
	{
	if(browser.equalsIgnoreCase("chrome"))
	{
	System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium\\Driver\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
	System.setProperty("webdriver.gecko.driver","E:\\Selenium\\Selenium\\Driver\\geckodriver.exe");	
	driver=new FirefoxDriver();
	}
	else
	{
	System.out.println("No Browser Present");	
	}
	driver.get("http://newtours.demoaut.com/");
	return driver;
	}
	public void checkbox(WebElement element,String value)
	{
	Select sel=new Select(element);
	sel.selectByValue(value);
	}
}
