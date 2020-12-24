package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.xpath("//input[@name='proceed']")).click();

		// Click Alert Pop Up
		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		Thread.sleep(4000);

		alert.accept();

		System.out.println("Done!!!");

		driver.close();

	}

}
