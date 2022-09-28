package com.stepdefinition;

import java.util.List;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import Baseclass.Baseclass;
import io.cucumber.java.en.Then;

/**
 * @Description cancel the booking
 * @author karthikeyan
 *
 */
public class TC5_CancelBookingStep extends Baseclass {
	PageObjectManager pom = new PageObjectManager();

	@Then("User Should cancel Order id")
	public void user_should_cancel_order_id() throws InterruptedException {
		implicitwait();
		pom.getCancelBookingPage().cancelBookingPage(pom.getBookingConfirmationPage().getorderid());
	}

	@Then("Should verify after Order id cancel success message {string}")
	public void should_verify_after_order_id_cancel_success_message(String cancelorderidsuccessmsg) {
		Assert.assertEquals("verify cancel boking orderid", cancelorderidsuccessmsg,
				GetAttributes(pom.getCancelBookingPage().getSuccessCancelMsg()));
	}

	@Then("User Should cancel existing Order id")
	public void user_should_cancel_existing_order_id(io.cucumber.datatable.DataTable dataTable) {
		List<String> orderids = dataTable.asList();
		String orderid = orderids.get(0);
		pom.getCancelBookingPage().cancelBookingPage(orderid);
	}
}
