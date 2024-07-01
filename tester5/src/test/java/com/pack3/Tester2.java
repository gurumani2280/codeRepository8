package com.pack3;

import org.testng.annotations.Test;
import com.pages.SwagLabLogin;

public class Tester2 extends SuperTest{
	
	
	@Test
	public void atitimeLogin3()
	{
		System.out.println("login test");
		SwagLabLogin al = new SwagLabLogin(driver);
		al.login("standard_user", "SwagLabLogin");
	}
}
