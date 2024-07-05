package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.CommonUtils;

public class SauceLoginPage {
	
	WebDriver driver;
	
	public SauceLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "user-name")
	private WebElement userNameField;
	
	@FindBy(name = "password")
	private WebElement passwordField;
	
	@FindBy(name = "login-button")
	private WebElement loginButton;
	
	@FindBy(tagName = "h3")
	private WebElement errorMessage;
	
	public void login(String user, String password) {
		userNameField.sendKeys(user);
		CommonUtils.sleep(1000);
		passwordField.sendKeys(password);
		loginButton.click();
	}
	
	public String getLoginErrorMessage() {
		return errorMessage.getText();
	}

}
