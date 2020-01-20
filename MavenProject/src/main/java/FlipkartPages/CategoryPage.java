package FlipkartPages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;

import Test.FlipKart;

public class CategoryPage extends FlipKart {
	public CategoryPage verifyFilter() throws InterruptedException
	{
		String search1 = "Mobiles";
		String result1 = driver.findElementByXPath("(//a[@title='Mobiles'])[2]").getText();
		if(search1.equals(result1))
		{
			System.out.println("");
			System.out.println("This Page shows the result of Mobiles");
		}
		else
		{
			System.out.println("");
			System.out.println("This Page doesn't show the result of Mobiles");
		}
		driver.findElementByXPath("//div[text()='4★ & above']").click();
		Thread.sleep(2000);
		List<WebElement> filter = driver.findElementsByXPath("//div[@class='_3wU53n']");
		List<String> ListFilter = new ArrayList<String>();
		System.out.println("");
		System.out.println("The result shows the mobiles having rating more than 4*");
		System.out.println("-------------------------------------------------------");
		for(int i=0; i<filter.size(); i++)
		{
			ListFilter.add(filter.get(i).getText());
			int sno = i+1;
			System.out.print(sno+". ");
			System.out.println(filter.get(i).getText());
		}
		return this;
	}
	public CategoryPage priceLowToHigh() throws InterruptedException
	{
		driver.findElementByXPath("//div[text()='Price -- Low to High']").click();
		Thread.sleep(2000);
		List<WebElement> lis = driver.findElementsByXPath("//div[@class='_1vC4OE _2rQ-NK']");
		//List<String> pricelist = new ArrayList<String>();
		List<Integer> price= new ArrayList<Integer>();
		for(int i=0; i<lis.size(); i++)
		{
			//pricelist.add(lis.get(i).getText());
			String arr= lis.get(i).getText().replace("₹", "").replace(",", "");
			price.add(Integer.valueOf(arr));
		}
		List<Integer> sorted= new ArrayList<Integer>(price);
		Collections.sort(sorted);
		System.out.println("");
		System.out.println("The Prices are listed from Low to HIGH");
		System.out.println("--------------------------------------");
		for(int i=0; i<sorted.size(); i++)
		{
			int sno = i+1;
			System.out.print(sno+".  Rs.");
			System.out.println(sorted.get(i));
		}
		return this;
	}
	public CategoryPage priceHighToLow() throws InterruptedException
	{
		driver.findElementByXPath("//div[text()='Price -- High to Low']").click();
		Thread.sleep(2000);
		List<WebElement> lis = driver.findElementsByXPath("//div[@class='_1vC4OE _2rQ-NK']");
		//List<String> pricelist = new ArrayList<String>();
		List<Integer> price= new ArrayList<Integer>();
		for(int i=0; i<lis.size(); i++)
		{
			//pricelist.add(lis.get(i).getText());
			String arr= lis.get(i).getText().replace("₹", "").replace(",", "");
			price.add(Integer.valueOf(arr));
		}
		List<Integer> sorted= new ArrayList<Integer>(price);
		Collections.sort(sorted);
		System.out.println("");
		System.out.println("The Prices are listed from HIGH to Low");
		System.out.println("--------------------------------------");
		for(int i=sorted.size()-1; i>=0; i--)
		{
			int sno = sorted.size()-i;
			System.out.print(sno+".  Rs.");
			System.out.println(sorted.get(i));
		}
		driver.findElementByXPath("//div[text()='Price -- Low to High']").click();
		Thread.sleep(2000);
		return this;
	}
	public resultPage selectMobile()
	{
		driver.findElementByXPath("(//div[@class='_3wU53n'])[1]").click();
		return new resultPage();
	}
	public resultPage selectFromBanner()
	{
		driver.findElementByXPath("(//div[@class='_3wU53n'])[1]").click();
		return new resultPage();
	}
	public CategoryPage verifyMenuFilter() throws InterruptedException
	{
		String search = driver.findElementByXPath("(//a[@title='Smart Watches'])[4]").getText();
		Thread.sleep(2000);
		String result = "Smart Watches";
				if (search.equals(result))
				{
					System.out.println("");
					System.out.println("The search result shows the Smart Watch Page");
					System.out.println("--------------------------------------------");
				}
				else
				{
					System.out.println("");
					System.out.println("The search result doesn't show the Smart Watch Page");
				}
				driver.findElementByXPath("//div[text()='4★ & above']").click();
				Thread.sleep(2000);
				List<WebElement> filter = driver.findElementsByXPath("//div[@class='_3wU53n']");
				List<String> ListFilter = new ArrayList<String>();
				for(int i=0; i<filter.size(); i++)
				{
					ListFilter.add(filter.get(i).getText());
					int sno = i+1;
					System.out.print(sno+". ");
					System.out.println(filter.get(i).getText());
				}
				return this;

	}
	public resultPage selectWatch()
	{
		driver.findElementByXPath("(//div[@class='_3wU53n'])[1]").click();
		return new resultPage();
	}
}
