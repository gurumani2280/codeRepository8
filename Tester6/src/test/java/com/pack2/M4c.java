package com.pack2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class M4c {
	
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
		RemoteWebDriver e=(RemoteWebDriver)driver;
		File srcfile=e.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./Screenshot/snap3.png");
		FileHandler.copy(srcfile,destfile);
		driver.quit();
	}

}
