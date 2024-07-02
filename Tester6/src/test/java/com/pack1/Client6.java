package com.pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Client6 {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String url="http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html";
		driver.get(url);
		Actions actions=new Actions(driver);
		Thread.sleep(2000);
		WebElement source=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement target=driver.findElement(By.xpath("//h1[text()='Block 3']"));
		actions.dragAndDrop(source, target).perform();
		Thread.sleep(2000);
		driver.quit();
	}

}
