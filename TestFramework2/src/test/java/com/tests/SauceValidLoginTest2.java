package com.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.SauceLoginPage;
import com.pages.SauceProductPage;
import com.utils.CommonUtils;

public class SauceValidLoginTest2 extends BaseTest{
	
	@Test(dataProvider = "sauceLoginData")
	public void invalidLoginTest(String user, String password)  {
		SauceLoginPage slp = new SauceLoginPage(driver);
		slp.login(user, password);
		CommonUtils.sleep(1000);
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		SauceProductPage spp = new SauceProductPage(driver);
		Assert.assertEquals(spp.getProductPageUrl(), expectedUrl, "login not succesful");
		spp.logout();
		CommonUtils.sleep(1000);
	}
	
	
	@DataProvider(name = "sauceLoginData")
	public Object[][] sauceLoginData() {
		
		String[][] loginData = {
				{"standard_user", "secret_sauce"},
				{"problem_user", "secret_sauce"},
				{"performance_glitch_user", "secret_sauce"},
				{"error_user", "secret_sauce"},
				{"visual_user", "secret_sauce"}
		};
		
		return loginData;
		
	}

}
