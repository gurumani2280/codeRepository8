package com.tests;

import org.testng.annotations.Test;

import com.pages.SauceCheckoutCompletePage;
import com.pages.SauceCheckoutOverviewPage;
import com.pages.SauceCheckoutYourInfoPage;
import com.pages.SauceLoginPage;
import com.pages.SauceProductPage;
import com.pages.SauceYourCartPage;

public class SauceE2eTest extends BaseTest{
	
	@Test
	public void sauceE2eTest() throws InterruptedException {
		
		
		SauceLoginPage slp = new SauceLoginPage(driver);
		slp.login("standard_user", "secret_sauce");
		Thread.sleep(2000);
		
		SauceProductPage spp = new SauceProductPage(driver);
		spp.addBackpackToCart();
		Thread.sleep(2000);
		spp.addLightToCart();
		spp.clickCartLink();
		Thread.sleep(2000);
		
		SauceYourCartPage sycp = new SauceYourCartPage(driver);
		sycp.clickCheckoutButton();
		Thread.sleep(2000);
		
		SauceCheckoutYourInfoPage scyip = new SauceCheckoutYourInfoPage(driver);
		scyip.enterInformation("abc", "xyz", "560110");
		scyip.clickContinue();
		Thread.sleep(2000);

		SauceCheckoutOverviewPage scop = new SauceCheckoutOverviewPage(driver);
		scop.clickFinishButton();
		Thread.sleep(2000);
		
		SauceCheckoutCompletePage sccp = new SauceCheckoutCompletePage(driver);
		sccp.clickBackHomeButton();
		Thread.sleep(2000);

		spp.logout(); 
		
		Thread.sleep(2000);
	}

}
