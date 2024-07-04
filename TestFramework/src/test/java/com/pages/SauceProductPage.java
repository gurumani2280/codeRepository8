package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceProductPage extends BasePage{
	
	WebDriver driver;
	
	public SauceProductPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "add-to-cart-sauce-labs-backpack")
	private WebElement backpackAddToCart;
	
	@FindBy(name = "add-to-cart-sauce-labs-bike-light")
	private WebElement lightAddToCart;
	
	@FindBy(className =  "shopping_cart_link")
	private WebElement cartLink;
	
	
	public void addBackpackToCart() {
		backpackAddToCart.click();
	}
	
	public void addLightToCart() {
		lightAddToCart.click();
	}
	
	public void clickCartLink() {
		cartLink.click();
	}

}
