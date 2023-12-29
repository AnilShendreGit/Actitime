package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// to declare the all element
	@FindBy(id = "username")
	private WebElement utb ;
	@FindBy(name = "pwd")
	private WebElement ptb;
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement lib ;
	// to initialation 
	public LoginPage(WebDriver dr ) {
		PageFactory.initElements(dr , this);
	}
	// to utilization
	public void toLogin(String un , String pw) {
		utb.sendKeys(un);
		ptb.sendKeys(pw);
		lib.click();
	}
}
