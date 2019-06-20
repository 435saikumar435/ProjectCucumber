package com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstproject {

	@Test
	public void testGoogleHomepage()
	{
		System.out.println("Google");
	}
	
	@AfterMethod
	public void testSelenium()
	{
		System.out.println("Selenium Homepage");
	}
	
	 @BeforeMethod
	public void testAccenture()
	{
		System.out.println("in Accenture Homepage");
	}
	 @AfterTest
	 public void aftertest()
	 {
		 System.out.println("Hello");
	 }
	 @BeforeTest
	 public void beforetest()
	 {
		 System.out.println("Hiiii");
	 }
	
	@BeforeClass
	public void Beforeclass()
	{
		System.out.println("bbbb");
	}
	@AfterClass
	public void Afterclass()
	{
		System.out.println("ddddd");
	}
}
