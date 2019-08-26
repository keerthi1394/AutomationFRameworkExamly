package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Buy_Page extends BaseClass {
	private static WebElement element =null;
	
	public Buy_Page(WebDriver driver)
	{
		super(driver);
	}
	public static WebElement click_view_cart()
	{
		try
		{
		element = driver.findElement(By.xpath("//i[@class='icon icon-shopping-cart badgeicon']"));
		Log.info("view cart element is found");
		}
		catch(Exception e)
		{
			Log.error("viewcart element is not found" );
		}
		return element;
	}
	
	public static WebElement click_Market_Place()
	{
		try
		{
		element = driver.findElement(By.xpath("//span[text()='Market Place']"));
		Log.info("marketplace element is found");
		}
		catch(Exception e)
		{
			Log.error("marketplace element is not found" );
		}
		return element;
	}

}
