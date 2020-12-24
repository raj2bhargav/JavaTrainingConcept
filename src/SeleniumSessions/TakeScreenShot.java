package SeleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		takeScreenShot("Google");
		
	}
	
	public static void takeScreenShot(String fileName) throws IOException {
		//1. Take Screen Shot and store it as a file format:
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//2. Now copy the screen shot to desired location using copy file method:
		FileUtils.copyFile(file, new File("C:\\Selenium\\Last\\JavaTrainingConcept\\src\\SeleniumSessions\\"+fileName+".jpg"));
	}
	

}
