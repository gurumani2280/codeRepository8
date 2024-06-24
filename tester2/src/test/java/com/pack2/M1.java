package com.pack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/"); 
		Thread.sleep(1000);
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title .equals("Swag Labs"))
		{
			System.out.println("Login is success");
		}
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		Thread.sleep(1000);
		driver.quit();


	}

}
