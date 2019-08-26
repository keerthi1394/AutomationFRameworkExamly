package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Login_Page extends BaseClass {

	private static WebElement element = null;
	
	public Login_Page(WebDriver driver)
	{
		super(driver);
	}
	
	public static WebElement btn_Login1()
	{
		try
		{
		element = driver.findElement(By.xpath("//button[@class='top-button']"));
		Log.info("Login Button1 is found on the login page");
		}
		catch(Exception e)
		{
			Log.error("Login button1 is not present on the wenpage");
			throw(e);
		}
		return element;
		
	}
	public static WebElement txtbx_email() {
		try
		{
		element = 	driver.findElement(By.id("emailAddress"));
		Log.info("Email textbox element is found on the webpage");
		}
		catch(Exception e)
		{
			Log.error("Email textbox is not present");
			throw(e);
		}
		return element;
	}

	public static WebElement txtbx_Password() {
		try
		{
		element = driver.findElement(By.id("password"));
		Log.info("Password textbox element is found on the webpage");
		}
		catch(Exception e)
		{
			Log.error("Password textbox element is not found");		
	throw(e);		
		}
		return element;
	}

	public static WebElement btn_LogIn() {
		try
		{
		element  = driver.findElement(By.xpath("//button[@class='form__button min-width-unset ladda-button']"));
		Log.info("Login button element is present in the webpage");
		}
		catch(Exception e)
		{
			Log.error("Login button element is not present");
			throw(e);
		}
		return element;
	}
}
