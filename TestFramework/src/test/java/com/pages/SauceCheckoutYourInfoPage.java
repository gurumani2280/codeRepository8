package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCheckoutYourInfoPage extends BasePage{
	WebDriver driver;

	public SauceCheckoutYourInfoPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "firstName")
	private WebElement firstnamField;

	@FindBy(name = "lastName")
	private WebElement lastnameField;

	@FindBy(name = "postalCode")
	private WebElement postalCodeField;

	@FindBy(name = "continue")
	private WebElement continueButton;

	public void enterInformation(String firstName, String lastName, String postalCode) {
		firstnamField.sendKeys(firstName);
		lastnameField.sendKeys(lastName);
		postalCodeField.sendKeys(postalCode);
	}

	public void clickContinue() {
		continueButton.click();
	}

}
