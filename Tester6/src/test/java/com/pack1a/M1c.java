package com.pack1a;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M1c {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/tester_android/Desktop/MorningBatch01/BasicHtmlElement.html");
		Thread.sleep(1000);
		
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		Thread.sleep(1000);
		System.out.println(alt.getText());
		alt.dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='testing']")).click();
		Thread.sleep(1000);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
