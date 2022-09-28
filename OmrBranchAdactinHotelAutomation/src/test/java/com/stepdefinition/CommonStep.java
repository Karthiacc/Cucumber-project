package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import Baseclass.Baseclass;
import io.cucumber.java.en.Then;

public class CommonStep extends Baseclass{
	PageObjectManager pom=new PageObjectManager();
//	1.login page
	@Then("User Should verify login message {string}")
	public void user_should_verify_login_message(String exploginsuccessmsg) {
	Assert.assertEquals("verify after login success msg",exploginsuccessmsg, GetAttributes(pom.getSearchHotelPage().getTextwelcomemsg()));
	}
	
}