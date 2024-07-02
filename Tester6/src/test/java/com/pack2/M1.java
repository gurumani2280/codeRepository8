package com.pack2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class M1 {
	
	@Test
	public void test() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/Development/repo/javaSeleniumChinchuVeena/BasicHtmlElement.html");
		Thread.sleep(1000);
		driver.findElement(By.id("firstname")).sendKeys("admin");
		Thread.sleep(1000);
		driver.quit();
	}
	

}
