package com.pack3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Client1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		String title = driver.getTitle();
		if(title.equals("Google"))
		{
			System.out.println(" google page loaded ");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		WebElement googleSearchBox= driver.findElement(By.name("q"));
		googleSearchBox.sendKeys("selenium");
		Thread.sleep(4000);
		List<WebElement> autoSugestion = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println("total autosuggestions "+ autoSugestion.size());
		autoSugestion.get(5).click();
		Thread.sleep(4000);
		driver.quit();
		

	}

}
