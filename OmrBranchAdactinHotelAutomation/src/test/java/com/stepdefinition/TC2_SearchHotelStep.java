package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import Baseclass.Baseclass;
import io.cucumber.java.en.Then;

public class TC2_SearchHotelStep extends Baseclass {
	PageObjectManager pom = new PageObjectManager();

	@Then("User Should select all Fields {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_select_all_fields_and(String location, String hotels, String roomtype, String roomno,
			String checkin, String checkout, String adultroom, String childroom) throws InterruptedException {
		pom.getSearchHotelPage().searchhotelpage(location, hotels, roomtype, roomno, checkin, checkout, adultroom,
				childroom);

	}

	@Then("User Should verfiy After Search hotel success message {string}")
	public void user_should_verfiy_after_search_hotel_success_message(String successmessage) {
		Assert.assertEquals("verify success message",successmessage,
				GettheText(pom.getSelectHotelPage().getSuccessSearch()));

	}

	@Then("User Should select only Mandatory Fields {string},{string},{string},{string} and {string}")
	public void user_should_select_only_mandatory_fields_and(String location, String roomno, String checkin,
			String checkout, String adultroom) throws InterruptedException {
		pom.getSearchHotelPage().searchhotelpage(location, roomno, checkin, checkout, adultroom);
	}

	@Then("User Should verify after checkin and checkout error message {string}, {string}")
	public void user_should_verify_after_checkin_and_checkout_error_message(String checkinmsg, String checkoutmsg) {
		Assert.assertTrue("verify checkin msg",
				pom.getSearchHotelPage().getCheckinErrorMsg().getText().contains(checkinmsg));
		Assert.assertTrue("verify checkout msg",
				pom.getSearchHotelPage().getCheckoutErrorMsg().getText().contains(checkoutmsg));
	}

	@Then("User Should select search button without click any fields")
	public void user_should_select_search_button_without_click_any_fields() {
		pom.getSearchHotelPage().searchhotelpage();
		;
	}

	@Then("User Should verify after without select any fields error message {string}")
	public void user_should_verify_after_without_select_any_fields_error_message(String locationerrormsg) {
		Assert.assertTrue("verify without select any field msg",
				pom.getSearchHotelPage().getLocationErrormsg().getText().contains(locationerrormsg));
	}

}
