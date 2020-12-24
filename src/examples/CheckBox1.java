package examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

		WebElement input = driver.findElement(By.className("dropdown-toggle"));
		input.click();

		WebElement checkBox = driver.findElement(By.linkText("Checkbox Demo"));
		checkBox.click();
		System.out.println("Check Box....");

		WebElement check1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
		check1.click();
		System.out.println("Clicked Check Box....");

		WebElement checkAll = driver.findElement(By.xpath("//input[@id='check1']"));
		checkAll.click();
		System.out.println("Checked all Boxes....");

	}

}
