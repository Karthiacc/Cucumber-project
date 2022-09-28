package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class SearchHotelPage extends Baseclass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username_show")
	private WebElement textwelcomemsg;
	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels;
	@FindBy(id = "room_type")
	private WebElement roomtype;
	@FindBy(id = "datepick_in")
	private WebElement checkin;
	public WebElement getTextwelcomemsg() {
		return textwelcomemsg;
	}
	@FindBy(id = "datepick_out")
	private WebElement checkout;
	@FindBy(id = "room_nos")
	private WebElement roomno;
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	@FindBy(id = "child_room")
	private WebElement childroom;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	@FindBy(xpath="//span[text()='Check-In Date shall be before than Check-Out Date']")
	private WebElement checkinErrorMsg;
	@FindBy(xpath="//span[text()='Check-Out Date shall be after than Check-In Date']")
	private WebElement checkoutErrorMsg;
	@FindBy(xpath="//span[contains(text(), 'Please Select a Location')]")
	private WebElement locationErrormsg;
	
	
	

	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getCheckinErrorMsg() {
		return checkinErrorMsg;
	}

	public WebElement getCheckoutErrorMsg() {
		return checkoutErrorMsg;
	}

	public WebElement getLocationErrormsg() {
		return locationErrormsg;
	}

	public void searchhotelpage(String location, String hotels, String roomtype, String roomno,String checkin, String checkout,
			 String adultroom, String childroom) throws InterruptedException {

		selectbyvisibletext(getLocation(), location);
		selectbyvisibletext(getHotels(), hotels);
		selectbyvisibletext(getRoomtype(), roomtype);
		selectbyvisibletext(getRoomno(), roomno);
		clear(getCheckin());
		sendkeys(getCheckin(), checkin);
		clear(getCheckout());
		sendkeys(getCheckout(), checkout);
		selectbyvisibletext(getAdultroom(), adultroom);
		selectbyvisibletext(getChildroom(), childroom);
		click(getSubmit());
	}

	public void searchhotelpage(String location,String roomno,String checkin,String checkout,String adultroom) throws InterruptedException {
		selectbyvisibletext(getLocation(), location);
		selectbyvisibletext(getRoomno(), roomno);
		clear(getCheckin());
		sendkeys(getCheckin(), checkin);
		clear(getCheckout());
		sendkeys(getCheckout(), checkout);
		selectbyvisibletext(getAdultroom(),adultroom);
		click(getSubmit());
	}
	
	public void searchhotelpage() {
		click(getSubmit());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
