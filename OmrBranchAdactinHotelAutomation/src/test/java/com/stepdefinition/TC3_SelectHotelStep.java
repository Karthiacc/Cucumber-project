package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import Baseclass.Baseclass;
import io.cucumber.java.en.Then;

/**
 * @Description used to select the hotel
 * @author karthikeyan
 *
 */
public class TC3_SelectHotelStep extends Baseclass {
	PageObjectManager pom = new PageObjectManager();

	@Then("User Should select Hotel Name")
	public void user_should_select_hotel_name() {
		pom.getSelectHotelPage().selecthotel();
	}

	@Then("User Should verify success message after selecting Hotel {string}")
	public void user_should_verify_success_message_after_selecting_hotel(String selecthotelsuccessmsg) {
		Assert.assertEquals("verify select hotel", selecthotelsuccessmsg,
				GettheText(pom.getBookHotelPage().getBookhotelsuccessmsg()));
	}

	@Then("User Should continue without selecting any Hotel Name")
	public void user_should_continue_without_selecting_any_hotel_name() {
		pom.getSelectHotelPage().clickhotel();
	}

	@Then("User Should verify without selecting any hotel name error message {string}")
	public void user_should_verify_without_selecting_any_hotel_name_error_message(String bookhotelerror) {
		Assert.assertTrue("verify hotel name error msg",
				pom.getSelectHotelPage().getWithoutselectbookhotelerrormsg().getText().contains(bookhotelerror));
	}

}
