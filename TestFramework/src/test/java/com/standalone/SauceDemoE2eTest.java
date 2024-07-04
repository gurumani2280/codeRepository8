package com.standalone;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SauceDemoE2eTest extends BaseTest{
	
	@Test
	public void sauceE2eTest() throws InterruptedException {
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.name("login-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("checkout")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.name("lastName")).sendKeys("xyz");
		Thread.sleep(2000);
		driver.findElement(By.name("postalCode")).sendKeys("560110");
		Thread.sleep(2000);
		driver.findElement(By.name("continue")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("finish")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("back-to-products")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		Thread.sleep(2000);
	}

}
