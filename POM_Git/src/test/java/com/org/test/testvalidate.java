package com.org.test;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.org.browser.BrowserLaunch;
import com.org.location.Locations;

public class testvalidate extends BrowserLaunch

{
static BrowserLaunch browser;
Locations loc;
@BeforeClass
public static void preconditons()
{
browser.drivers("firefox");	
}
@Test
public void method() throws InterruptedException
{
loc=new Locations();
loc.getRegister().click();
loc.setFirstname("Prakash");
loc.setLastname("Alagappan");
loc.setPhonenumber("9940560603");
loc.setEmail("prakashfrenz@gmail.com");
loc.setAddress1("1467,Garden Avenue");
loc.setAddress2("Mogappair");
loc.setCity("Chennai");
loc.setState("TamilNadu");
loc.setPostal("600037");
Thread.sleep(5000);
Select sel=new Select(loc.getDropdowncountry());
sel.selectByIndex(2);
loc.setUsername("Prakash87");
loc.setPassword("Prak@sh87");
loc.setConfirmpassword("Prak@sh87");
loc.getSubmit().click();
Thread.sleep(5000);
loc.getSignon().click();
loc.setUsername1("Prakash87");
loc.setPassword1("Prak@sh87");
loc.getSubmit1().click();
Thread.sleep(5000);
loc.getRadiobutton().click();
Select sel1=new Select(loc.getPassenger());
sel1.selectByIndex(1);
Select sel2=new Select(loc.getDeparture());
sel2.selectByIndex(3);
Select sel3=new Select(loc.getFrommonth());
sel3.selectByVisibleText("March");
Select sel4=new Select(loc.getFromday());
sel4.selectByVisibleText("27");
Select sel5=new Select(loc.getArrive());
sel5.selectByIndex(4);
Select sel6=new Select(loc.getTomonth());
sel6.selectByVisibleText("April");
Select sel7=new Select(loc.getToday());
sel7.selectByVisibleText("10");
loc.getServiceclass().click();
Select sel8=new Select(loc.getAirline());
sel8.selectByVisibleText("Blue Skies Airlines");
loc.getContinued().click();
loc.getDepart().click();
loc.getReturned().click();
loc.getReserveflights().click();
loc.setPassengerfname("Prakash");
loc.setPassengerlname("Alagappan");
Select sel9=new Select(loc.getPassengermeal());
sel9.selectByVisibleText("Low Calorie");
Thread.sleep(5000);
loc.setPassengerfname1("Adam");
loc.setPassengerlname1("villiams");
Select sel13=new Select(loc.getPassengermeal1());
Thread.sleep(5000);
sel13.selectByVisibleText("Low Calorie");
Select sel10=new Select(loc.getCreditcard());
sel10.selectByVisibleText("MasterCard");
loc.setCardnumber("1234567890");
Select sel11=new Select(loc.getExpirymonth());
sel11.selectByVisibleText("03");
Select sel12=new Select(loc.getExpiryyear());
sel12.selectByVisibleText("2009");
loc.setCardfname("Prakash");
loc.setCardmname("A");
loc.setCardlname("Alagappan");
loc.getBilladress1().clear();
loc.setBilladress1("21 dgsf rd");
loc.getBilladress2().clear();
loc.setBilladress2("Chennai");
loc.getBillCity().clear();
loc.setBillCity("Chennai");
loc.getBillState().clear();
loc.setBillState("TN");
loc.getBillzip().clear();
loc.setBillzip("600037");
checkbox(loc.getBillingcountry(),"6");
loc.getSameaddress().click();
Thread.sleep(5000);
loc.getBuyflights().click();
}
}
