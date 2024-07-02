package com.pack1a;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class M1a {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("just1Enter");
		Thread.sleep(4000);
		String alertText = driver.switchTo().alert().getText();
		System.out.println("alert text "+ alertText);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.quit();
	}

}
