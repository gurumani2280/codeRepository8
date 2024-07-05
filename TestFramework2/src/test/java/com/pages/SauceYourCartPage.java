package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceYourCartPage extends BasePage{
	
	WebDriver driver;
	
	public SauceYourCartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "checkout")
	private WebElement checkoutButton;
	
	public void clickCheckoutButton() {
		checkoutButton.click();
	}
	

}
