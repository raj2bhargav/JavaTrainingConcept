package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriver driver = new HtmlUnitDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		if(title.equals("Google")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title Didn't Matched");
		}
		
		System.out.println("Done!!!");
		
		driver.close();
		
		
		
	}

}
