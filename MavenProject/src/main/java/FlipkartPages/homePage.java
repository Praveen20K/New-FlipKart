package FlipkartPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Test.FlipKart;

public class homePage extends FlipKart {
	public CategoryPage enterSearch()
	{
		driver.findElementByXPath("//input[@title='Search for products, brands and more']").sendKeys("redmi note 7 pro");
		driver.findElementByClassName("vh79eN").click();
		return new CategoryPage();
	}
	public CategoryPage clickBanners()
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement select = driver.findElementByXPath("(//a[@class='_3MPlks'])[5]");
		wait.until(ExpectedConditions.elementToBeClickable(select)).click();
		return new CategoryPage();
	}
	public CategoryPage selectFromMenu()
	{
		driver.findElementByXPath("//span[text()='Electronics']").click();
		driver.findElementByXPath("//a[@title='Smart Watches']").click();
		return new CategoryPage();
	}
	public homePage visibilityOfImage()
	{
		WebElement image = driver.findElementByXPath("//img[@class='_1e_EAo']");
		if (image.isDisplayed())
		{
			System.out.println("");
			System.out.println("FlipKart LOGO is clearly displayed.");
		}
		else
		{
			System.out.println("");
			System.out.println("FlipKart LOGO is not clearly displayed.");
		}
		return this;
	}
}
