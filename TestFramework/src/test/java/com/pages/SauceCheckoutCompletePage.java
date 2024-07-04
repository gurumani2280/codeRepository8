package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCheckoutCompletePage extends BasePage{
	WebDriver driver;

	public SauceCheckoutCompletePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "back-to-products")
	private WebElement backHomeButton;

	public void clickBackHomeButton() {
		backHomeButton.click();
	}
}
