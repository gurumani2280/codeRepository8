package com.pack2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pages.SwagLabLogin;

public class M2 extends SuperTest{
	
	@Test(dataProvider="logindata")
	public void atitimeLogin(String userName, String pwd) 
	{
		System.out.println(userName+ pwd);
		
		SwagLabLogin al = new SwagLabLogin(driver);
		al.login(userName, pwd);

	}
	
	@DataProvider(name="logindata")
	public Object[][] loginData()
	{
		return new String[][] {{"standard_user", "secret_sauce"},
							{"locked_out_user", "secret_sauce"}};
		
	}


}
