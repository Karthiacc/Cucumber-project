package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class SelectHotelPage extends Baseclass {
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement selecthotel;

	@FindBy(xpath = "//td[@class='login_title']")
	private WebElement successSearch;

	@FindBy(id = "continue")
	private WebElement btncontinue;

@FindBy(xpath = "//label[text()='Please Select a Hotel']")
private WebElement withoutselectbookhotelerrormsg;
	
	public WebElement getWithoutselectbookhotelerrormsg() {
	return withoutselectbookhotelerrormsg;
}

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}

	public WebElement getSuccessSearch() {
		return successSearch;
	}

	public void selecthotel() {
		click(getSelecthotel());
		click(getBtncontinue());
	}

	public void clickhotel() {
		click(getBtncontinue());
	}

}
