package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/V1/index.php");

		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr284064");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("YdagEja");

		// driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

		// executeScript --> to execute Java Script Code.

		WebElement loginBtn = driver.findElement(By.xpath("//input[@name='btnLogin']")); // Login Button

		flash(loginBtn, driver); // Highlight Login Button

		drawBorder(loginBtn, driver); // draw a border

		// Take screenshot:
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:\\Selenium\\Last\\JavaTrainingConcept\\src\\SeleniumSessions/element.png"));

		// Generate Alert
		// generateAlert(driver, "There is an issue with Login button on Login Page");

		// click on any element by using JS executor
		// clickElementByJS(loginBtn, driver);

		// refresh the page:
		// 1. by using selenium:
		// driver.navigate().refresh();

		// 2. by using JS executor:
		refreshBrowserByJS(driver);

		// get the tile of the page by JS:
		System.out.println(getTitleByJS(driver));

		// get the page text:
		//System.out.println(getPageInnerText(driver));

		// scroll page down:
		//scrollPageDown(driver);

		WebElement footerText = driver.findElement(By.xpath("//li[contains(text(),'Login credentials are only valid for 20 days! So Hurry Up and quickly complete your tasks')]"));
		scrollIntoView(footerText, driver);

		System.out.println("Done!!!");

	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element, driver);// 1
			changeColor(bgcolor, element, driver);// 2
		}
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");

	}

	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}

	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}

	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
