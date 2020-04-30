package com.org.location;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.org.browser.BrowserLaunch;

public class Locations extends BrowserLaunch
{
@FindBy(xpath="//*[text()='REGISTER']")
private WebElement register;
@FindBy(name="firstName")
private WebElement firstname;
@FindBy(name="lastName")
private WebElement lastname;
@FindBy(xpath="//*[@name='phone']")
private WebElement phonenumber;
@FindBy(xpath="//*[@id='userName']")
private WebElement email;
@FindBy(xpath="//*[@name='address1']")
private WebElement address1;
@FindBy(xpath="//*[@name='address2']")
private WebElement address2;
@FindBy(xpath="//*[@name='city']")
private WebElement city;
@FindBy(name="state")
private WebElement state;
@FindBy(name="postalCode")
private WebElement postal;
@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select")
private WebElement dropdowncountry;
@FindBy(xpath="//*[@name='email']")
private WebElement username;
@FindBy(name="password")
private WebElement password;
@FindBy(name="confirmPassword")
private WebElement confirmpassword;
@FindBy(xpath="//*[@src='/images/forms/submit.gif'] ")
private WebElement submit;
@FindBy(xpath="//*[text()='SIGN-OFF']")
private WebElement signon;
@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td[2]/input")
private WebElement username1;
@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
private WebElement password1;
@FindBy(name="login")
private WebElement submit1;
@FindBy(name="tripType")
private WebElement Radiobutton;
@FindBy(name="passCount")
private WebElement passenger;
@FindBy(name="fromPort")
private WebElement departure;
@FindBy(name="toPort")
private WebElement arrive;
@FindBy(name="fromMonth")
private WebElement frommonth;
@FindBy(name="fromDay")
private WebElement fromday;
@FindBy(name="toMonth")
private WebElement tomonth;
@FindBy(name="toDay")
private WebElement today;
@FindBy(name="servClass")
private WebElement serviceclass;
@FindBy(name="airline")
private WebElement airline;
@FindBy(name="findFlights")
private WebElement continued;
@FindBy(xpath="//*[@value='Pangea Airlines$362$274$9:17']")
private WebElement depart;
@FindBy(xpath="//*[@value='Unified Airlines$633$303$18:44']")
private WebElement returned;
@FindBy(name="reserveFlights")
private WebElement reserveflights;
@FindBy(name="passFirst0")
private WebElement passengerfname;
@FindBy(name="passLast0")
private WebElement passengerlname;
@FindBy(name="pass.0.meal")
private WebElement passengermeal;
@FindBy(name="passFirst1")
private WebElement passengerfname1;
@FindBy(name="passLast1")
private WebElement passengerlname1;
@FindBy(name="pass.1.meal")
private WebElement passengermeal1;
@FindBy(name="passFirst2")
private WebElement passengerfname2;
@FindBy(name="passLast2")
private WebElement passengerlname2;
@FindBy(name="pass.2.meal")
private WebElement passengermeal2;
@FindBy(name="creditCard")
private WebElement creditcard;
@FindBy(name="creditnumber")
private WebElement cardnumber;
@FindBy(name="cc_exp_dt_mn")
private WebElement expirymonth;
@FindBy(name="cc_exp_dt_yr")
private WebElement expiryyear;
@FindBy(name="cc_frst_name")
private WebElement cardfname;
@FindBy(name="cc_mid_name")
private WebElement cardmname;
@FindBy(name="cc_last_name")
private WebElement cardlname;
@FindBy(name="billAddress1")
private WebElement billadress1;
@FindBy(name="billAddress2")
private WebElement billadress2;
@FindBy(name="billCity")
private WebElement billCity;
@FindBy(name="billState")
private WebElement billState;
@FindBy(name="billZip")
private WebElement billzip;
@FindBy(name="ticketLess")
private WebElement sameaddress;
@FindBy(name="billCountry")
private WebElement billingcountry;
@FindBy(name="buyFlights")
private WebElement buyflights;
public WebElement getBillingcountry() {
	return billingcountry;
}
public void setBillingcountry(WebElement billingcountry) {
	this.billingcountry = billingcountry;
}

public WebElement getBuyflights() {
	return buyflights;
}
public void setBuyflights(WebElement buyflights) {
	this.buyflights = buyflights;
}
public WebElement getSameaddress() {
	return sameaddress;
}
public void setSameaddress(WebElement sameaddress) {
	this.sameaddress = sameaddress;
}
public WebElement getBilladress1() {
	return billadress1;
}
public void setBilladress1(String billadress1) {
	this.billadress1.sendKeys(billadress1);
}
public WebElement getBilladress2() {
	return billadress2;
}
public void setBilladress2(String billadress2) {
	this.billadress2.sendKeys(billadress2);
}
public WebElement getBillCity() {
	return billCity;
}
public void setBillCity(String billCity) {
	this.billCity.sendKeys(billCity);
}
public WebElement getBillState() {
	return billState;
}
public void setBillState(String billState) {
	this.billState.sendKeys(billState);
}
public WebElement getBillzip() {
	return billzip;
}
public void setBillzip(String billzip) {
	this.billzip.sendKeys(billzip);
}
public WebElement getPassengerfname1() {
	return passengerfname1;
}
public void setPassengerfname1(String passengerfname1) {
	this.passengerfname1.sendKeys(passengerfname1);
}
public WebElement getPassengerlname1() {
	return passengerlname1;
}
public void setPassengerlname1(String passengerlname1) {
	this.passengerlname1.sendKeys(passengerlname1);
}
public WebElement getPassengermeal1() {
	return passengermeal1;
}
public void setPassengermeal1(WebElement passengermeal1) {
	this.passengermeal1 = passengermeal1;
}
public WebElement getPassengermeal2() {
	return passengermeal2;
}
public void setPassengermeal2(WebElement passengermeal2) {
	this.passengermeal2 = passengermeal2;
}
public WebElement getPassengerfname2() {
	return passengerfname2;
}
public void setPassengerfname2(String passengerfname2) {
	this.passengerfname2.sendKeys(passengerfname2);
}
public WebElement getPassengerlname2() {
	return passengerlname2;
}
public void setPassengerlname2(String passengerlname2) {
	this.passengerlname2.sendKeys(passengerlname2);
}



public WebElement getPassengerfname() {
	return passengerfname;
}
public void setPassengerfname(String passengerfname) {
	this.passengerfname.sendKeys(passengerfname);
}
public WebElement getPassengerlname() {
	return passengerlname;
}
public void setPassengerlname(String passengerlname) {
	this.passengerlname.sendKeys(passengerlname);
}
public WebElement getPassengermeal() {
	return passengermeal;
}
public void setPassengermeal(WebElement passengermeal) {
	this.passengermeal = passengermeal;
}
public WebElement getCreditcard() {
	return creditcard;
}
public void setCreditcard(WebElement creditcard) {
	this.creditcard = creditcard;
}
public WebElement getCardnumber() {
	return cardnumber;
}
public void setCardnumber(String cardnumber) {
	this.cardnumber.sendKeys(cardnumber);
}
public WebElement getExpirymonth() {
	return expirymonth;
}
public void setExpirymonth(WebElement expirymonth) {
	this.expirymonth = expirymonth;
}
public WebElement getExpiryyear() {
	return expiryyear;
}
public void setExpiryyear(WebElement expiryyear) {
	this.expiryyear = expiryyear;
}
public WebElement getCardfname() {
	return cardfname;
}
public void setCardfname(String cardfname) {
	this.cardfname.sendKeys(cardfname);
}
public WebElement getCardmname() {
	return cardmname;
}
public void setCardmname(String cardmname) {
	this.cardmname.sendKeys(cardmname);
}
public WebElement getCardlname() {
	return cardlname;
}
public void setCardlname(String cardlname) {
	this.cardlname.sendKeys(cardlname);
}
public WebElement getDepart() {
	return depart;
}
public void setDepart(WebElement depart) {
	this.depart = depart;
}
public WebElement getReturned() {
	return returned;
}
public void setReturned(WebElement returned) {
	this.returned = returned;
}
public WebElement getReserveflights() {
	return reserveflights;
}
public void setReserveflights(WebElement reserveflights) {
	this.reserveflights = reserveflights;
}
public WebElement getContinued() {
	return continued;
}
public void setContinued(WebElement continued) {
	this.continued = continued;
}
public WebElement getDeparture() {
	return departure;
}
public void setDeparture(WebElement departure) {
	this.departure = departure;
}
public WebElement getArrive() {
	return arrive;
}
public void setArrive(WebElement arrive) {
	this.arrive = arrive;
}
public WebElement getFrommonth() {
	return frommonth;
}
public void setFrommonth(WebElement frommonth) {
	this.frommonth = frommonth;
}
public WebElement getFromday() {
	return fromday;
}
public void setFromday(WebElement fromday) {
	this.fromday = fromday;
}
public WebElement getTomonth() {
	return tomonth;
}
public void setTomonth(WebElement tomonth) {
	this.tomonth = tomonth;
}
public WebElement getToday() {
	return today;
}
public void setToday(WebElement today) {
	this.today = today;
}
public WebElement getServiceclass() {
	return serviceclass;
}
public void setServiceclass(WebElement serviceclass) {
	this.serviceclass = serviceclass;
}
public WebElement getAirline() {
	return airline;
}
public void setAirline(WebElement airline) {
	this.airline = airline;
}
public WebElement getRadiobutton() {
	return Radiobutton;
}
public void setRadiobutton(WebElement radiobutton) {
	Radiobutton = radiobutton;
}
public WebElement getPassenger() {
	return passenger;
}
public void setPassenger(WebElement passenger) {
	this.passenger = passenger;
}
public WebElement getUsername1() {
return username1;
}
public void setUsername1(String username1) {
	this.username1.sendKeys(username1);
}
public WebElement getPassword1() {
	return password1;
}
public void setPassword1(String password1) {
	this.password1.sendKeys(password1);
}
public WebElement getSubmit1() {
	return submit1;
}
public void setSubmit1(WebElement submit1) {
	this.submit1 = submit1;
}
public WebElement getSignon() {
	return signon;
}
public void setSignon(WebElement signon) {
	this.signon = signon;
}
public WebElement getRegister() {
	return register;
}
public void setRegister(WebElement register) {
	this.register = register;
}
public WebElement getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname.sendKeys(firstname);
}
public WebElement getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname.sendKeys(lastname);
}
public WebElement getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber.sendKeys(phonenumber);
}
public WebElement getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email.sendKeys(email);
}
public WebElement getAddress1() {
	return address1;
}
public void setAddress1(String address1) {
	this.address1.sendKeys(address1);
}
public WebElement getAddress2() {
	return address2;
}
public void setAddress2(String address2) {
	this.address2.sendKeys(address2);
}
public WebElement getCity() {
	return city;
}
public void setCity(String city) {
	this.city.sendKeys(city);
}
public WebElement getState() {
	return state;
}
public void setState(String state) {
	this.state.sendKeys(state);
}
public WebElement getPostal() {
	return postal;
}
public void setPostal(String postal) {
	this.postal.sendKeys(postal);
}
public WebElement getDropdowncountry() {
	return dropdowncountry;
}
public void setDropdowncountry(WebElement dropdowncountry) {
	this.dropdowncountry = dropdowncountry;
}
public WebElement getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username.sendKeys(username);
}
public WebElement getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password.sendKeys(password);
}
public WebElement getConfirmpassword() {
	return confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
	this.confirmpassword.sendKeys(confirmpassword);
}
public WebElement getSubmit() {
	return submit;
}
public void setSubmit(WebElement submit) {
	this.submit = submit;
}
public Locations()
{
PageFactory.initElements(driver,this);	
}
}
