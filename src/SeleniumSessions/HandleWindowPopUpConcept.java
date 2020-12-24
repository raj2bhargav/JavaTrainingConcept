package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUpConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.findElement(By.linkText("Good PopUp #3")).click();

		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentWindowId = it.next();
		System.out.println("Parent Window Id = " + parentWindowId);

		String childWindowId = it.next();
		System.out.println("Child Window Id = " + childWindowId);

		driver.switchTo().window(childWindowId);
		System.out.println("Title of child window = " + driver.getTitle());

		Thread.sleep(2000);

		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println("Title of parent window = " + driver.getTitle());

		Thread.sleep(2000);

		driver.close();

	}

}
