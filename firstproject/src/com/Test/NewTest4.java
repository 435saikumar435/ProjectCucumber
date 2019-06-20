package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest4 {
	
	@Test
	public void testAssertions()
	{
		SoftAssert soft= new SoftAssert();
		System.out.println("first Assertion");
		soft.assertEquals(5, 5);
		System.out.println("second assertion");
        soft.assertTrue(5>12); 	
	    soft.assertAll();  
	}
	
	
	

}
