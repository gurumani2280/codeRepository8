package com.pack3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tester2 extends SuperTest{
	
	@Test
	public void test() throws InterruptedException
	{
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.switchTo().frame(0);

		//get the header and print text
		System.out.println(driver.findElement(By.tagName("h5")).getText());
		driver.findElement(By.tagName("input")).sendKeys("some text");
		Thread.sleep(4000);
		// back to default web page frame
		driver.switchTo().defaultContent();

		//print the text for single frame element
		System.out.println(driver.findElement(By.cssSelector("li.active>a[href='#Single']")).getText());
		Thread.sleep(4000);

		driver.quit();

	}

}
