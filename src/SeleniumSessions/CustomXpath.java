package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CustomXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.driver.chrome", "C:\\Selenium\\SeleniumJars\\NewDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
				
		driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("name");
		
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("rediffmail id");
		
		//driver.findElement(By.xpath("//input[conatins(@name,'btnchkavail')]")).click();
		
		driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[contains(@name,'confirm_passwd')]")).sendKeys("confirm password");
		
		driver.findElement(By.xpath("//input[contains(@name,'altemail')]")).sendKeys("altemail");
		
		driver.findElement(By.id("mobno")).sendKeys("1234567890");
		
		Select selDay = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]")));
		
		Thread.sleep(2000);
		
		selDay.selectByValue("29");
		
		Select selMonth = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]")));
		
		Thread.sleep(2000);
		
		selMonth.selectByVisibleText("DEC");
		
		Select selYear = new Select(driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]")));
		
		Thread.sleep(2000);
		
		selYear.selectByIndex(1);
		
		driver.findElement(By.cssSelector("input[value='f']")).click();
		
		Select selCountry = new Select(driver.findElement(By.xpath("//select[contains(@name,'country')]")));
		
		Thread.sleep(2000);
		
		selCountry.selectByVisibleText("Australia");
		
		System.out.println("Done!!!");
		
		
	}

}
