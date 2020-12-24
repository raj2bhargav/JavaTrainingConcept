package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//Select Drop Down Menu
		Select select = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
		
		select.selectByIndex(2);
		
		Thread.sleep(2000);
		
		//select.selectByVisibleText("Option3");
		
		System.out.println("Done!!!");
		
		driver.close();
		
	}

}
