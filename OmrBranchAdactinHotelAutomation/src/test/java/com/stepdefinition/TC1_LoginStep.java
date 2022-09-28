package com.stepdefinition;

import java.awt.AWTException;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import Baseclass.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @Description used to enter the login page
 * @author karthikeyan
 *
 */
public class TC1_LoginStep extends Baseclass {
	PageObjectManager pom=new PageObjectManager();
	@Given("User is on Adactin page")
	public void user_is_on_adactin_page() {

	}

	@When("User Should perform login {string},{string}")
	public void user_should_perform_login(String username, String password) {
		pom.getLoginPage().login(username, password);
	}

	@When("User Should perform login {string},{string} with Enter key")
	public void user_should_perform_login_with_enter_key(String username, String password) throws AWTException {
	pom.getLoginPage().loginwithenter(username, password);
	}

	@Then("User Should verify login with invalid credentials error message {string}")
	public void user_should_verify_login_with_invalid_credentials_error_message(String invalidlogin) {
		Assert.assertTrue("verify the invalid", pom.getLoginPage().getGeterrormsg().getText().contains(invalidlogin));
	}

}
