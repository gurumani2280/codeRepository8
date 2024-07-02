package com.pack3;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tester3a extends SuperTest{
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get("file:///C:/Users/tester_android/Desktop/MorningBatch01/BasicHtmlElement.html");
		driver.findElement(By.name("resume")).sendKeys(System.getProperty("user.dir") + File.separator + "Downloads"+
				File.separator +"menu.pdf");
		Thread.sleep(5000);
	}

}
