package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.switchTo().frame(driver.findElement(By.id("courses-iframe")));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='nav-outer clearfix']//a[contains(text(),'Contact')]")).click();
		
		System.out.println("Done!!!");
		
		driver.close();
	}

}
