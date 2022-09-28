package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class CancelBookingPage extends Baseclass {
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement bookedid;
	@FindBy(id = "order_id_text")
	private WebElement searchid;
	@FindBy(id = "search_hotel_id")
	private WebElement btngo;
	@FindBy(id = "btn_id_728364")
	private WebElement cancelbuttonclick;
	@FindBy(xpath = "//input[@name='ids[]']")
	private WebElement cancelorderidbutton;
	@FindBy(xpath = "//input[@name='cancelall']")
	private WebElement cancelBooking;
	@FindBy(id = "search_result_error")
	private WebElement successCancelMsg;
	

	public WebElement getCancelbuttonclick() {
		return cancelbuttonclick;
	}

	public WebElement getCancelorderidbutton() {
		return cancelorderidbutton;
	}

	public WebElement getCancelBooking() {
		return cancelBooking;
	}

	public WebElement getSuccessCancelMsg() {
		return successCancelMsg;
	}

	public WebElement getBookedid() {
		return bookedid;
	}

	public WebElement getSearchid() {
		return searchid;
	}

	public WebElement getBtngo() {
		return btngo;
	}

	public void cancelBookingPage(String orderid) {
		click(getBookedid());
		sendkeys(getSearchid(), orderid);
		click(getBtngo());
		click(getCancelorderidbutton());
		click(getCancelbuttonclick());
		switchToAlertAccept();

	}

}
