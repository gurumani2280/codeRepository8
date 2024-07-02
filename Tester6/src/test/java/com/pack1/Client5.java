package com.pack1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Client5 {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Actions actions=new Actions(driver);
		WebElement menu = driver.findElement(By.xpath("//span[text()='right click me']"));
		actions.contextClick(menu).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.quit();
	}

}
