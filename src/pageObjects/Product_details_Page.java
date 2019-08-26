package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Product_details_Page extends BaseClass{

	private static WebElement element = null;
	public Product_details_Page(WebDriver driver)
	{
		super(driver);
	}
	
	public static WebElement click_addtocart()
	{
		try
		{
		element = driver.findElement(By.xpath("//button[@class='pay_btn'][text()='Add to cart']"));
		Log.info("addtocard element is found");
		}
		catch(Exception e)
		{
			Log.error("addtocart element is not found" );
		}
		return element;
	}
	
	public static WebElement click_Buynow()
	{
		try
		{
		element = driver.findElement(By.xpath("//button[@class='buy_btn'][text()='Buy now']"));
		Log.info("buynow element is found");
		}
		catch(Exception e)
		{
			Log.error("Buynow element is not found" );
		}
		return element;
	}
	
}
