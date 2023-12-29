package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// to declaration
	@FindBy(id = "logoutLink")
	private WebElement lob ; 
	@FindBy(xpath = "//div[text()='TASKS']")
	private WebElement taskBtn ;
	// to initialization
	public HomePage( WebDriver dr ) {
		PageFactory.initElements(dr, this);
	}
	// to close logout the application
	public void toLogout() {
		lob.click();
	}
	public void setTaskTab() {
		taskBtn.click();
	}
}
