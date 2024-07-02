package com.pack2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.helper.Helper;



public class Tester2 {
	
public WebDriver driver;
	
	@Test
	public void test1()
	{
		driver.get("https://www.facebook.com/");
		Assert.fail("failed");
	}
	
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	
	@AfterMethod
	public void afterMethod(ITestResult result)
	{
		String methodName = result.getName().trim();
		if(ITestResult.FAILURE == result.getStatus())
		{
			Reporter.log("\n*** "+methodName+ " has FAILED ***" , true);
			String fileName = methodName+"_"+
					new SimpleDateFormat("ddMMMYY_HH.mm.ss.S").format(new Date());

			Helper.takeScreenShot(fileName, driver);
		}
		driver.quit();
	}


}
