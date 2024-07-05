package com.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SeleniumUtils {
	
	public static void takeScreenShot(String dest, WebDriver driver )
	{
		TakesScreenshot e=(TakesScreenshot)driver;
		File srcfile=e.getScreenshotAs(OutputType.FILE);
		File destfile=new File("./Screenshot/"+dest+".png");
		try {
			FileHandler.copy(srcfile,destfile);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

}
