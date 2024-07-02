package com.pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Client3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/index.htm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// identify element
		WebElement l = driver.findElement(By.xpath("//h5[text()='About us']"));
		// Actions class with moveToElement()
		Actions a = new Actions(driver);
		a.moveToElement(l).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
