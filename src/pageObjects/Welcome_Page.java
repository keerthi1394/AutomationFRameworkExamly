package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Welcome_Page extends BaseClass{
	private static WebElement element = null;
	public Welcome_Page(WebDriver driver)
	{
		super(driver);
	}
	public static WebElement click_menuid() {
		try
		{
		element =driver.findElement(By.xpath("//i[@class='icon icon-menu sidenav-menu-i']"));
		Log.info("Menu Id element is found");
		}
		catch(Exception e)
		{
			Log.error("Menu_id element is not found in the webpage");
		}
		return element;
	}
	
	public static WebElement menu_Buy() {
		try
		{
			 element = driver.findElement(By.xpath("//span[@class='icon icon-shopping-cart buy_icon_font']"));
		Log.info("Buy menu element is present in the page");
		}
		catch(Exception e)
		{
			Log.error("Buy menu is not present in the webpage");
		}
		return element;
	}
	
	public static WebElement menu_Setting() {
		try
		{
		element = driver.findElement(By.xpath("//span[@class='icon icon-settings-1 icon_font']"));
		Log.info("Settings menu is found on the webpage" );
		}
		catch(Exception e)
		{
			Log.error("settings menu is found on the webpage" );
			throw(e);
		}
		return element;
	}
	
	public static WebElement menu_AccountSetting() {
		try
		{
		element = 	driver.findElement(By.xpath("//span[@class='icon icon-settings icon_font']"));
        Log.info("Account settings menu is found on the webpage");
		}
		catch(Exception e)
		{
			Log.error("Account settings is not present on the webpage");
			throw(e);
		}
		return element;
	}
	
	public static WebElement menu_Profile() {
		try
		{
		element = 	driver.findElement(By.xpath("//span[@class='icon icon-login-5 icon_font']"));
		Log.info("profile menu is found on the webpage");
		}
		catch(Exception e)
		{
			Log.error("Profile menu is not found on the webpage");
		}
		return element;
	}
	
	public static WebElement btn_Logout() {
		try
		{
		element = 	driver.findElement(By.xpath("//i[@class='icon icon-logout btn-logout']"));
		Log.info("Logout button element is present on the webpage");
		}
		catch(Exception e)
		{
			Log.error("Logout button is not present  on the webpage");
			throw(e);
		}
		return element;
	}
	
}
