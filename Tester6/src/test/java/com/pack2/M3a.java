package com.pack2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class M3a {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tutorialspoint.com/index.htm");
		Thread.sleep(1000);
		RemoteWebDriver rv= (RemoteWebDriver) driver;
		// How do I scroll based on the visibility of the Web element on the page in Selenium?
		// identify element
		WebElement element = driver.findElement(By.xpath("//h5[text()='About us']"));
		String jsCode="arguments[0].scrollIntoView();";
		rv.executeScript(jsCode, element );
		Thread.sleep(3000);
		driver.quit();
	}

}


