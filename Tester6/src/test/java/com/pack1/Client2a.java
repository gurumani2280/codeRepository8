package com.pack1;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Client2a {

	public static void main(String[] args) throws InterruptedException {
		
		Map<String, Object> p = new HashMap<String, Object>();
	      // File.separator to get folder path 
		p.put("download.default_directory", System.getProperty("user.dir") + File.separator + "Downloads");
	      // adding capabilities to browser
	      ChromeOptions o = new ChromeOptions();
	      o.setExperimentalOption("prefs", p);
	      // adding desired capabilities to browser
	     
		WebDriver driver = new ChromeDriver(o);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/jqueryui/menu#");
		Actions actions=new Actions(driver);
		WebElement menu = driver.findElement(By.linkText("Enabled"));
		actions.moveToElement(menu).perform();
		Thread.sleep(2000);
		WebElement downloadMenu = driver.findElement(By.linkText("Downloads"));
		actions.moveToElement(downloadMenu).perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("PDF")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
