package com.actiTime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenTasksPage {
	// to declaration
	@FindBy(xpath = "//a[text()='Projects & Customers']")
	private WebElement proCusBtn;
	@FindBy(xpath = "//span[text()='Create Customer']")
	private WebElement creCus;
	@FindBy(id = "customerLightBox_nameField")
	private WebElement cusNameTxbx ;
	@FindBy(id = "customerLightBox_descriptionField")
	private WebElement cusDesTxbx ;
	@FindBy(xpath = "//button[@type='button']")
	private WebElement droDowBtn ;
	@FindBy(id = "customerLightBox_commitBtn")
	private WebElement creCusBtn;
	@FindBy(xpath = "//th[contains(text(),'Customer')]/../..//td[@class='customer-cell']")
	private WebElement verify ;
	public WebElement getVerify() {
		return verify;
	}
	// to initialization
	public OpenTasksPage(WebDriver dr) {
		PageFactory.initElements(dr, this);
	}
	// to utilization
	public WebElement getProCusBtn() {
		return proCusBtn;
	}
	public WebElement getCreCus() {
		return creCus;
	}
	public WebElement getCusNameTxbx() {
		return cusNameTxbx;
	}
	public WebElement getCusDesTxbx() {
		return cusDesTxbx;
	}
	public WebElement getDroDowBtn() {
		return droDowBtn;
	}
	public WebElement getCreCusBtn() {
		return creCusBtn;
	}
}
