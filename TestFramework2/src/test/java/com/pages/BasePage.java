package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "react-burger-menu-btn")
	private WebElement expandMenu;

	@FindBy(id = "logout_sidebar_link")
	private WebElement logoutLink;

	@FindBy(className = "shopping_cart_link")
	private WebElement cartLink;

	public void logout() {
		expandMenu.click();
		logoutLink.click();
	}

	public void clickCartLink() {
		cartLink.click();
	}

}
