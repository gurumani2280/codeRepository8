package com.pack2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class M2a1 {
	
	@Test
	public void test() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/Development/repo/javaSeleniumChinchuVeena/BasicHtmlElement.html");
		Thread.sleep(1000);
		
		WebElement ele = driver.findElement(By.xpath("//input[@value='testing']"));
		JavascriptExecutor rv=(JavascriptExecutor) driver;
		rv.executeScript("arguments[0].click();", ele);
		Thread.sleep(2000);
		driver.quit();
	}
	

}
