package com.pack3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tester2b extends SuperTest{
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get("file:///C:/Users/tester_android/Desktop/MorningBatch01/Demo2.html");
		driver.findElement(By.id("t1")).sendKeys("abc");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		//driver.switchTo().frame("f1");
		//driver.switchTo().frame("if1");
		//WebElement f=driver.findElement(By.className("c1"));
		//driver.switchTo().frame(f);
		driver.findElement(By.id("t2")).sendKeys("xyz");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("updated");
		Thread.sleep(2000);
	}

}
