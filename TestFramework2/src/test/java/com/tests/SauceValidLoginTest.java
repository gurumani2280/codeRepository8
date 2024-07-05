package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.SauceLoginPage;
import com.pages.SauceProductPage;

public class SauceValidLoginTest extends BaseTest{
	
	@Test
	public void invalidLoginTest() throws InterruptedException {
		SauceLoginPage slp = new SauceLoginPage(driver);
		slp.login("standard_user", "secret_sauce");
		Thread.sleep(1000);
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		SauceProductPage spp = new SauceProductPage(driver);
		Assert.assertEquals(spp.getProductPageUrl(), expectedUrl, "login not succesful");
		spp.logout();
		Thread.sleep(1000);
	}

}
