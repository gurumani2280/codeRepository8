package com.standalone;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	WebDriver driver;
	
	@BeforeMethod
	public void init() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
