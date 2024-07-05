package com.tests;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.utils.GetData;

public class BaseTest {
	public WebDriver driver;
	public static String propPath = System.getProperty("user.dir") + File.separator +"data" + File.separator + "config.properties";
	public static String browserName = GetData.fromProperties(propPath, "browser");
	public static String url = GetData.fromProperties(propPath, "url");
	public static String TESTNG_TESTREPORT_FOLDER = System.getProperty("user.dir") + File.separator + "Test-Reports//"
			+ new SimpleDateFormat("ddMMMYY_HH.mm.ss.S").format(new Date()) + "//";

	@BeforeSuite
	public void preSuite() {
		File targetfolder = new File(TESTNG_TESTREPORT_FOLDER);
		File srcfolder = new File("./test-output");
		try {
			FileHandler.createDir(targetfolder);
			FileHandler.copy(srcfolder, targetfolder);
			Reporter.log("Old report backed up to folder " + TESTNG_TESTREPORT_FOLDER, true);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	@BeforeMethod(alwaysRun = true)
	public void init() {
		if (browserName.equalsIgnoreCase("gc")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get(url);
	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		System.out.println("tearDown afterTest");
		driver.quit();
	}

}
