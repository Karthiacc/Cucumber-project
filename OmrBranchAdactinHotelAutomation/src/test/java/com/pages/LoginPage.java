package com.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baseclass.Baseclass;

public class LoginPage extends Baseclass {
	
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}

@FindBy(id="username")
private WebElement txtusername;
@FindBy(id="password")
private WebElement txtpassword;
@FindBy(id="login")
private WebElement btnlogin;
@FindBy(xpath = "//b[(text()='Invalid Login details or Your Password might have expired. ')]")
private WebElement  geterrormsg;

public WebElement getGeterrormsg() {
	return geterrormsg;
}

public WebElement getTxtusername() {
	return txtusername;
}

public WebElement getTxtpassword() {
	return txtpassword;
}
public WebElement getBtnlogin() {
	return btnlogin;
}

public void login(String username,String password) {
sendkeys(getTxtusername(), username);
sendkeys(getTxtpassword(), password);
click(getBtnlogin());
}

public void loginwithenter(String username,String password) throws AWTException {
	sendkeys(getTxtusername(), username);
	sendkeys(getTxtpassword(), password);
	robotkeyTab();
	robotkeyTab();
	robotkeyenter();

}




}

