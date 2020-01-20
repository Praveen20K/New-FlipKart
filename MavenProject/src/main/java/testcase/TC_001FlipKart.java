package testcase;

import org.testng.annotations.Test;

import FlipkartPages.homePage;
import Test.FlipKart;

public class TC_001FlipKart extends FlipKart {
	@Test
	public void searchResult() throws InterruptedException
	{
		new homePage()
		.visibilityOfImage()
		.enterSearch()
		.verifyFilter()
		.priceLowToHigh()
		.priceHighToLow()
		.selectMobile()
		.checkDetails()
		.ClickBuyNow()
		.GiveDetails();
	}

}
