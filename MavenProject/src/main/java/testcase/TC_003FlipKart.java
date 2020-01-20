package testcase;

import org.testng.annotations.Test;

import FlipkartPages.homePage;
import Test.FlipKart;

public class TC_003FlipKart extends FlipKart {
	@Test
	public void searchResult() throws InterruptedException
	{
		new homePage()
		.visibilityOfImage()
		.selectFromMenu()
		.verifyMenuFilter()
		.priceLowToHigh()
		.priceHighToLow()
		.selectWatch()
		.checkDetails()
		.ClickBuyNow()
		.GiveDetails();
	} 
	

}
