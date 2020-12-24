package examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VisibilityConditions {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Google";
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title Didn't Matched");
		}
		
		
		boolean submitButton = driver.findElement(By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']")).isDisplayed();
		
		System.out.println("Submit Button is displayed = " + submitButton );
		
	}

}
