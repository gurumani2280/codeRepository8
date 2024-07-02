package com.pack3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class Tester1 extends SuperTest{

	@Test
	public void test() throws InterruptedException {
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		String parentWh = driver.getWindowHandle();
		System.out.println("parent window handle "+ parentWh);
		Thread.sleep(4000);
		// Opens a new tab and switches to new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
		//Opens a new window and switches to new window
		//driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(4000);
		System.out.println("after opening a new tab or window");
		String childWh = driver.getWindowHandle();
		System.out.println("child_window_handle ======"+ childWh);

		Set<String> allWindowHandles =  driver.getWindowHandles();
		System.out.println("all_window_handles ======" + allWindowHandles);
		
		driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/");
		driver.close();
		Thread.sleep(4000);

		driver.switchTo().window(parentWh);
		driver.findElement(By.xpath("//div[@id='Tabbed']/a/button")).click();
		Thread.sleep(4000);

		driver.quit();

	}

}
