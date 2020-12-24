package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadless {

	public static void main(String[] args) {

		FirefoxBinary firefoxBinary = new FirefoxBinary();
		firefoxBinary.addCommandLineOptions("--headless");

		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\NewDriver\\geckodriver.exe");

		FirefoxOptions fo = new FirefoxOptions();
		fo.setBinary(firefoxBinary);

		WebDriver driver = new FirefoxDriver(fo);

		driver.get("http://www.google.com");

		System.out.println(driver.getTitle());

	}

}
