package com.pack2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class M3 {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		RemoteWebDriver rv= (RemoteWebDriver) driver;
		// How do I scroll down to the page’s bottom using Selenium?
		String c="window.scrollTo(0,document.body.scrollHeight)";
		rv.executeScript(c);
		Thread.sleep(3000);
		
		//How do you Scroll to the top of the page in Selenium?
		String c1="window.scrollTo(0, 0)";
		rv.executeScript(c1);
		Thread.sleep(3000);
		driver.quit();
	}

}
