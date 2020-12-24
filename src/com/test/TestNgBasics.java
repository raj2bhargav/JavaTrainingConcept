package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}

	@BeforeClass
	public void beforClass() {
		System.out.println("Before Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@Test
	public void testOne() {
		System.out.println("Test One");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Test Two");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

}
