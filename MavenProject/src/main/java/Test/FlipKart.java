package Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class FlipKart {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static ChromeDriver driver;
	@BeforeMethod
	public void main() throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver = new ChromeDriver(options);
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
	}
	@AfterMethod
	public void windowClose() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
