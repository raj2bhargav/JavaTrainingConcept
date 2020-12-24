package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
	}
	
	
	@Test(priority = 1, groups = "Smoke")
	public void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	
	@Test(priority = 2, groups = "Smoke")
	public void logo() {
		
		boolean b = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		
		Assert.assertTrue(b);
	}
	
	@Test(priority = 3, groups = "Test")
	public void searchBtn() {
		boolean c = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).isDisplayed();
		
		Assert.assertTrue(c);
	}
	
	@Test(priority = 4, groups = "Test")
	public void testFour() {
		System.out.println("Four");
	}
	
	@Test(priority = 5, groups = "Regression")
	public void testFive() {
		System.out.println("Five");
	}
	
	@Test(priority = 6, groups = "Regression")
	public void testSix() {
		System.out.println("Six");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
