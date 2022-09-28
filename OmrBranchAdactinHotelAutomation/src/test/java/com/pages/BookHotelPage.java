package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class BookHotelPage extends Baseclass {
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "first_name_span")
	private WebElement firstnameerror;
	@FindBy(id = "last_name_span")
	private WebElement lastnameerror;
	@FindBy(id = "address_span")
	private WebElement addresserror;
	@FindBy(id = "cc_num_span")
	private WebElement ccnoerror;
	@FindBy(id = "cc_type_span")
	private WebElement cctypeerror;
	@FindBy(id = "cc_expiry_span")
	private WebElement ccexpiryerror;
	@FindBy(id = "cc_cvv_span")
	private WebElement cvverror;
	
	
	@FindBy(id = "first_name")
	private WebElement htfirstname;
	@FindBy(id = "last_name")
	private WebElement htlastname;
	@FindBy(id = "address")
	private WebElement htaddress;
	@FindBy(id = "cc_num")
	private WebElement htccnum;
	@FindBy(xpath = "//select[@class='select_combobox']")
	private WebElement htcctype;
	@FindBy(id = "cc_exp_month")
	private WebElement htccexpmonth;
	@FindBy(id = "cc_exp_year")
	private WebElement htccexpyear;
	@FindBy(id = "cc_cvv")
	private WebElement htcvv;
	@FindBy(id = "book_now")
	private WebElement htbooknow;
	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement Bookhotelsuccessmsg;

	public WebElement getBookhotelsuccessmsg() {
		return Bookhotelsuccessmsg;
	}

	

	public WebElement getHtbooknow() {
		return htbooknow;
	}

	public WebElement getHtfirstname() {
		return htfirstname;
	}

	public WebElement getHtlastname() {
		return htlastname;
	}

	public WebElement getHtaddress() {
		return htaddress;
	}


	public WebElement getHtccnum() {
		return htccnum;
	}

	public WebElement getHtcctype() {
		return htcctype;
	}

	public WebElement getHtccexpmonth() {
		return htccexpmonth;
	}

	public WebElement getHtccexpyear() {
		return htccexpyear;
	}

	public WebElement getHtcvv() {
		return htcvv;
	}
	public WebElement getFirstnameerror() {
		return firstnameerror;
	}

	public WebElement getLastnameerror() {
		return lastnameerror;
	}

	public WebElement getAddresserror() {
		return addresserror;
	}

	public WebElement getCcnoerror() {
		return ccnoerror;
	}

	public WebElement getCctypeerror() {
		return cctypeerror;
	}

	public WebElement getCcexpiryerror() {
		return ccexpiryerror;
	}

	public WebElement getCvverror() {
		return cvverror;
	}
//1.select all field
	public void bookhotel(String firstname, String lastname, String address, String creditcardno, String creditcardtype,
			String expirymonth, String expiryyear,String cvv) {
		
		sendkeys(getHtfirstname(), firstname);
		sendkeys(getHtlastname(), lastname);
		sendkeys(getHtaddress(), address);
		sendkeys(getHtccnum(), creditcardno);
		selectbyvisibletext(getHtcctype(), creditcardtype);
		selectbyvisibletext(getHtccexpmonth(), expirymonth);
		selectbyvisibletext(getHtccexpyear(), expiryyear);
		sendkeys(getHtcvv(), cvv);
		click(getHtbooknow());
		
	}


//2.without select any fields
public void bookhotel() {
	click(getHtbooknow());
}












}
