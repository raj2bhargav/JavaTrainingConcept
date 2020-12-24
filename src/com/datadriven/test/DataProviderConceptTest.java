package com.datadriven.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProviderConceptTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	

	@Test
	public void createRediffAccountTest(String name, String loginid, String password, String confirmPassword,
			String alternateEmailId) {

		driver.findElement(By.xpath("//input[starts-with(@name,'namebd')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name,'namebd')]")).sendKeys(name);

		driver.findElement(By.xpath("//input[starts-with(@name,'loginbd')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name,'loginbd')]")).sendKeys(loginid);

		driver.findElement(By.xpath("//input[starts-with(@name,'passwdbd')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name,'passwdbd')]")).sendKeys(password);

		driver.findElement(By.xpath("//input[starts-with(@name,'confirm_passwdbd')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name,'confirm_passwdbd')]")).sendKeys(confirmPassword);

		driver.findElement(By.xpath("//input[starts-with(@name,'altemailbd')]")).clear();
		driver.findElement(By.xpath("//input[starts-with(@name,'altemailbd')]")).sendKeys(alternateEmailId);

	}
	
	

	@AfterMethod
	public void tearDwon() {
		driver.quit();
	}

}
