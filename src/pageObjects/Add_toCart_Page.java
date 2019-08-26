package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Add_toCart_Page extends BaseClass{

	private static WebElement element=null;
	public Add_toCart_Page(WebDriver driver)
	{
		super(driver);
	}
	
	public static WebElement click_ContinueShopping()
	{
		try
		{
		element = driver.findElement(By.xpath("//button[@class='continue_shopping']"));
		Log.info("continueshopping button is found");
		}
		catch(Exception e)
		{
			Log.error("continueshopping button is not found" );
		}
		return element;
	}
	
	public static WebElement click_PaySecurely()
	{
		try
		{
		element = driver.findElement(By.xpath("//button[@class='pay_btn']"));
		Log.info("paysecurely button is found");
		}
		catch(Exception e)
		{
			Log.error("paysecurely button is not found" );
		}
		return element;
	}
}
