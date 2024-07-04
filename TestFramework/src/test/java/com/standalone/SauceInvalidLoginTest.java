package com.standalone;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pages.SauceLoginPage;

public class SauceInvalidLoginTest extends BaseTest{
	
	@Test
	public void invalidLoginTest() throws InterruptedException {
		SauceLoginPage slp = new SauceLoginPage(driver);
		slp.login("locked_out_user", "secret_sauce");
		Thread.sleep(1000);
		String expectedError = "Epic sadface: Sorry, this user has been locked out.";
		Assert.assertEquals(slp.getLoginErrorMessage(), expectedError, "Error Message Did not Match");
	}

}
