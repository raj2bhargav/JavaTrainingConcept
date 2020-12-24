package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://www.rediff.com/");
		
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		System.out.println(linkList.size());
		
		try {
			for(int i = 0 ; i < linkList.size() ; i++) {
				System.out.println(linkList.get(i).getText());
			}
		} catch (Exception e) {
			System.out.println("Error = " + e);
		}
		
		
		System.out.println("Done!!!!");
		
	}

}
