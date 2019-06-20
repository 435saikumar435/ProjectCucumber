package com.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	@Test(dataProvider ="dp1")
	public void testdata(String username,String password) 
	{
	System.out.println("Username: "+username);	
	System.out.println("Password: "+password);
	}
	
	@DataProvider(name ="dp1")
	public Object[][] getData()
	{
		Object[][] obj= {
				          {"Kim","Kim"},
				          {"Lee","Lee"},
				          {"park","park"}
				
		};
		return obj;
	}
}
