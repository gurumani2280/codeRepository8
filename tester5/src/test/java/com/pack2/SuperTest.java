package com.pack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class SuperTest {
	
public WebDriver driver;
	
	
	@BeforeMethod
	@Parameters("browser")
	public void beforeMethod(String browser)
	{
		if(browser.contains("chrome"))
		{
			System.out.println(browser);
			driver = new ChromeDriver();
			
		}
		else
		{
			System.out.println(browser);
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/"); 
		
		
	}
	
	
	@AfterMethod
	public void afterMethod()
	{
		driver.quit();
	}

}
