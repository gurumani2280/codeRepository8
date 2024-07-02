package com.pack2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class M4 {
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		ChromeDriver e=(ChromeDriver) driver;
		File srcfile= e.getScreenshotAs(OutputType.FILE);
		File destfile= new File("./Screenshot/snap1.png");
		FileHandler.copy(srcfile,destfile);
		driver.quit();
	}

}
