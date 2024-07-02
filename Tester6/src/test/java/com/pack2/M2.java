package com.pack2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class M2 {
	
	@Test
	public void test() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///D:/Development/repo/javaSeleniumChinchuVeena/BasicHtmlElement.html");
		Thread.sleep(1000);
		JavascriptExecutor rv=(JavascriptExecutor) driver;
		String c="document.getElementById('firstname').value='admin'";
		rv.executeScript(c);
		Thread.sleep(2000);
		driver.quit();
	}
	

}
