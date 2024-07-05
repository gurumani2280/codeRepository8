package com.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.tests.BaseTest;

public class Listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("in onTestStart");
		System.out.println(result.getInstanceName());
		System.out.println(result.getName());
		System.out.println(result.getTestName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("in onTestSuccess");
		System.out.println(result.getInstanceName());
		System.out.println(result.getName());
		System.out.println(result.getTestName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("in onTestFailure");
		System.out.println(result.getInstanceName());
		String methodName = result.getName();
		String fileName = methodName+"_"+
				new SimpleDateFormat("ddMMMYY_HH.mm.ss.S").format(new Date());
		System.out.println(methodName);
		
//		ITestContext context = result.getTestContext();
//	    WebDriver driver = (WebDriver)context.getAttribute("driver");
	    /*
	     java.lang.NullPointerException: Cannot invoke "org.openqa.selenium.TakesScreenshot.getScreenshotAs(org.openqa.selenium.OutputType)
	     " because "e" is null
	     */
//		WebDriver driver = null;
//		try {
//			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
//		} catch (IllegalArgumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NoSuchFieldException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// java.lang.NoSuchFieldException: driver
		
		WebDriver driver  = ((BaseTest)result.getInstance()).driver;
	    SeleniumUtils.takeScreenShot(fileName, driver);
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("in onTestSkipped");
		System.out.println(result.getInstanceName());
		System.out.println(result.getName());
		System.out.println(result.getTestName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("in onTestFailedButWithinSuccessPercentage");
		System.out.println(result.getInstanceName());
		System.out.println(result.getName());
		System.out.println(result.getTestName());
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("in onTestFailedButWithinSuccessPercentage");
		System.out.println(result.getInstanceName());
		System.out.println(result.getName());
		System.out.println(result.getTestName());
	}

	public void onStart(ITestContext context) {
		System.out.println("in onStart");
		System.out.println(context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("in onFinish");
		System.out.println(context.getName());
	}
	
	

}
