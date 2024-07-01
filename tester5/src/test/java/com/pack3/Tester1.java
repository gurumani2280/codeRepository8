package com.pack3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tester1 extends SuperTest{
	
	
	@Test
	public void atitimeLogin()
	{
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("Swag Labs"));
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		String expectedTitle = "Swag Labs";
		Assert.assertEquals(actualtitle, expectedTitle, "The title didnot match");	
		driver.findElement(By.id("react-burger-menu-btn")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
	}
}
