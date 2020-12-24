package examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("http://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		
		WebElement source = driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]"));
		
		WebElement target = driver.findElement(By.id("mydropzone"));
		
		Actions action = new Actions(driver);
		
		Thread.sleep(2000);
		
		action.clickAndHold(source).moveToElement(target).release().build().perform();
		//release(target).build().perform();
		
		//action.dragAndDrop(source, target).build().perform();
		
		System.out.println("Done!!!");
		
		
	}

}
