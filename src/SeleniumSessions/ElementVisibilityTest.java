package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {
	
	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//1. isDisplayed() method : applicable for all the elements
		boolean b1 = driver.findElement(By.xpath("//input[@name='proceed']")).isDisplayed();
		System.out.println(b1); //true
		
		
		//2. isEnabled() method
		boolean b2 = driver.findElement(By.xpath("//input[@id='remember']")).isEnabled();
		System.out.println(b2); //true
		
		driver.findElement(By.xpath("//input[@id='remember']")).click();
		Thread.sleep(2000);
		
		boolean b3 = driver.findElement(By.xpath("//input[@id='remember']")).isEnabled();
		System.out.println(b3); //false
		
		//3. isSelected() method
		boolean b4 = driver.findElement(By.xpath("//input[@id='remember']")).isSelected();
		System.out.println(b4); //false
		
		
		
	}

}
