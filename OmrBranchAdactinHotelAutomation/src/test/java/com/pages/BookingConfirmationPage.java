package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class BookingConfirmationPage extends Baseclass {
	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement bookngconfirmationmsg;
	@FindBy(id = "order_no")
	private WebElement orderno;

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getBookngconfirmationmsg() {
		return bookngconfirmationmsg;
	}

	public String getorderid() throws InterruptedException {
		sleep(5000);
		String orderid =GettheText(getOrderno());
		return orderid;

	}

}
