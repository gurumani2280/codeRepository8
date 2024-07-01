package com.pack3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SuperTest {
	
	public WebDriver driver;
	
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod()
	{	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/"); 
		
	}
	
	
	@AfterMethod(alwaysRun = true)
	public void afterMethod()
	{
		driver.quit();
	}

}
