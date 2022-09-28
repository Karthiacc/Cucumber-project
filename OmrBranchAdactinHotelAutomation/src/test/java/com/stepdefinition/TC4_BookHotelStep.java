package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import Baseclass.Baseclass;
import io.cucumber.java.en.Then;

/**
 * @Description used to book a hotel
 * @author karthikeyan
 *
 */
public class TC4_BookHotelStep extends Baseclass {
	PageObjectManager pom = new PageObjectManager();

	@Then("User Should Book hotel {string},{string} and {string}")
	public void user_should_book_hotel_and(String firstname, String lastname, String address,
			io.cucumber.datatable.DataTable dataTable) throws FileNotFoundException, IOException {
		implicitwait();
		pom.getBookHotelPage().bookhotel(firstname, lastname, address ,getPropertyFileValue("creditcardno"),
				getPropertyFileValue("creditcardtype"), getPropertyFileValue("expirymonth"),
				getPropertyFileValue("expiryyear"), getPropertyFileValue("cvv"));
	}

	@Then("User Should select Book now After verifying the success message {string}")
	public void user_should_select_book_now_after_verifying_the_success_message(String bookingconfrimmsg) {
		Assert.assertEquals( "verify booking success msg",bookingconfrimmsg,
				GettheText(pom.getBookingConfirmationPage().getBookngconfirmationmsg()));
	}

	@Then("User Should select Book now without select any fields")
	public void user_should_select_book_now_without_select_any_fields() {
		pom.getBookHotelPage().bookhotel();
	}

	@Then("User Should verify After the error message {string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_verify_after_the_error_message_and(String ferror, String lerror, String aerror,
			String ccerror, String ccterror, String ccmontherror, String cvverror) {
		Assert.assertTrue("verify firstname error",
				pom.getBookHotelPage().getFirstnameerror().getText().contains(ferror));
		Assert.assertTrue("verify lastname error",
				pom.getBookHotelPage().getLastnameerror().getText().contains(lerror));
		Assert.assertTrue("verify address error", pom.getBookHotelPage().getAddresserror().getText().contains(aerror));
		Assert.assertTrue("verify ccno error", pom.getBookHotelPage().getCcnoerror().getText().contains(ccerror));
		Assert.assertTrue("verify cctype error", pom.getBookHotelPage().getCctypeerror().getText().contains(ccterror));
		Assert.assertTrue("verify ccmonth error",
				pom.getBookHotelPage().getCcexpiryerror().getText().contains(ccmontherror));
		Assert.assertTrue("verify cvv error", pom.getBookHotelPage().getCvverror().getText().contains(cvverror));

	}
}
