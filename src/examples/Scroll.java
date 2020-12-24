package examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Username
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		// Password
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		// Clicking Login Button
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		admin.click();

		WebElement job = driver.findElement(By.id("menu_admin_Job"));
		job.click();
		
		WebElement jobtitle_link = driver.findElement(By.linkText("Job Titles"));
		jobtitle_link.click();

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform(); // Page Down
		System.out.println("Scroll down perfomed");
		Thread.sleep(3000);

		act.sendKeys(Keys.PAGE_UP).build().perform(); // Page Up
		System.out.println("Scroll up perfomed");
		Thread.sleep(3000);

	}

}
