package com.pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Client3 {
 // //Q.SCRIPT TO EXPLAIN StaleElementReferenceException
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		driver.get("file:///D:/Development/repo/codeRepository8/BasicHtmlElement.html");
		Thread.sleep(1000);
		WebElement userName = driver.findElement(By.name("username"));
		driver.findElement(By.linkText("google")).click();
		driver.navigate().back();
		//driver.navigate().refresh();
		Thread.sleep(1000);
		userName = driver.findElement(By.name("username"));
		userName.sendKeys("anyName");
		Thread.sleep(1000);
		
		driver.quit();
		

	}

}
