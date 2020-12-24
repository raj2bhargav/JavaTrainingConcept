package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	public static void main(String[] args) {

		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

		// Create object of WebDriverWait class and it will wait max of 20 seconds.
		// By default it will accepts in Seconds
		WebDriverWait wait = new WebDriverWait(driver, 20);

		// Here we will wait until element is not visible, if element is visible then it
		// will return web element
		// or else it will throw exception
		WebElement element = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='Register']")));

		// if element found then we will use- In this example I just called isDisplayed
		// method
		boolean status = element.isDisplayed();

		// if else condition
		if (status) {
			System.out.println("===== WebDriver is visible======");
		} else {
			System.out.println("===== WebDriver is not visible======");
		}

	}

}
