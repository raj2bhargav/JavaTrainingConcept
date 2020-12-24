package SeleniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("C:\\Selenium\\Last\\JavaTrainingConcept\\src\\SeleniumSessions\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("browser"));
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\SeleniumJars\\NewDriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		System.out.println(driver.getTitle());
		
		System.out.println("Done!!!");
		
		driver.close();
		
	}
	
	

}
