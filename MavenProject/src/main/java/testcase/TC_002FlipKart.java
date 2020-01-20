package testcase;

import org.testng.annotations.Test;

import FlipkartPages.homePage;
import Test.FlipKart;

public class TC_002FlipKart extends FlipKart {
	@Test
	public void searchResult() throws InterruptedException
	{
		new homePage()
		.visibilityOfImage()
		.clickBanners()
		.verifyFilter()
		.priceLowToHigh()
		.priceHighToLow()
		.selectFromBanner()
		.checkDetails()
		.ClickBuyNow()
		.GiveDetails();
	} 

}
