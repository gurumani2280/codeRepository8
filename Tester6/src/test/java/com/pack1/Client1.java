package com.pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Client1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/jqueryui/menu#");
		Actions actions=new Actions(driver);
		WebElement menu = driver.findElement(By.linkText("Enabled"));
		actions.moveToElement(menu).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Back to JQuery UI")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
