package examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAssertions {
	
	WebDriver driver;
	
	
	@BeforeTest
	public void setDriver() {
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	@Test
	public void verifyTitle() throws InterruptedException {
		driver.get("https://www.google.com/");
		String actualTitle = driver.getTitle();
		String expecttedTitle = "Google";
		
		Thread.sleep(2000);
		Assert.assertEquals(actualTitle, expecttedTitle);
		System.out.println("Assert Passed and Title Matched");
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
	}
	
	

}
