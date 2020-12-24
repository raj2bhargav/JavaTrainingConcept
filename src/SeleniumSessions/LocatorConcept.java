package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Checking Radio Button
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		
		//Text
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("hello");
		
		//CheckBox
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		
		System.out.println("Done!!!");
		
	}

}
