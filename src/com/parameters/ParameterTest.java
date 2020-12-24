package com.parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	WebDriver driver;
	
	@Test
	@Parameters({"url","emailId"})
	public void amazonLoginTest(String url, String emailId) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get(url);
		
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='nav-action-inner']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(emailId);
		
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		
	}

}
