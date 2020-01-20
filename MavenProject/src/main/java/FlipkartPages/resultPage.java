package FlipkartPages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import Test.FlipKart;

public class resultPage extends FlipKart {
	public resultPage checkDetails() throws InterruptedException
	{
		Set<String> window = driver.getWindowHandles();
		List<String> lis = new ArrayList<String>();
		lis.addAll(window);
		driver.switchTo().window(lis.get(1));
		Thread.sleep(2000);
		System.out.println("");
		System.out.println("");
		System.out.println("Verified details of the Product:");
		System.out.println("********************************");
		System.out.println("The name of the product is: "+ driver.findElementByXPath("//span[@class='_35KyD6']").getText());
		System.out.println("");
		System.out.println("The Price of the Product is: "+driver.findElementByXPath("//div[@class='_1vC4OE _3qQ9m1']").getText().replace("₹", "Rs."));
		System.out.println("");
		System.out.println("The Description of the Product is: "+driver.findElementByXPath("//div[@class='_3la3Fn _1zZOAc']").getText());
		return this;
	}
	public SigninPage ClickBuyNow() throws InterruptedException
	{
		driver.findElementByXPath("//button[@type='button']").click();
		return new SigninPage();
	}


}
