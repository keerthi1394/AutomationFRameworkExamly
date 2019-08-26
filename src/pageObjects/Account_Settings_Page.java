package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Account_Settings_Page extends BaseClass {

	private static WebElement element =null;
	
	public Account_Settings_Page(WebDriver driver)
	{
		super(driver);
	}
	public static WebElement handle_Enteryourpassword()
	{
		try
		{
		element = driver.findElement(By.xpath("//input[@name='currentpass']"));
		Log.info("enteryour password  textbox is found");
	}
	catch(Exception e)
	{
		Log.error("enteryour password  textbox is not found" );
		throw(e);
	}
		return element;
	}
	
	public static WebElement btn_close()
	{
		try
		{
		element = driver.findElement(By.xpath("//button[@class='left-button']"));
		Log.info("close button is found");
		}
		catch(Exception e)
		{
			Log.error("close button is not found" );
			throw(e);
		}
		
		return element;
	}
	public static WebElement btn_Confirm()
	{
		try
		{
		element = driver.findElement(By.xpath("//button[@class='right-button']"));
		Log.info("confirm button is found");
		}
		catch(Exception e)
		{
			Log.error("confirm button is not found" );
			throw(e);
		}
		 return element;
	}
	public static WebElement txt_Mobilenumber()
	{
		try{
			
		element = driver.findElement(By.xpath("//input[@name='mobile']"));
		Log.info("mobile number textbox is found");
	}
	catch(Exception e)
	{
		Log.error("mobile number textbox is not found" );
		throw(e);
	}
		return element;
	}
	public static WebElement txt_newpassword()
	{
		try
		{
		element = driver.findElement(By.xpath("//input[@name='newpass']"));
		Log.info("newpassword  textbox is found");
		}
		catch(Exception e)
		{
			Log.error("new password textbox is not found" );
			throw(e);
		}
		return element;
	}
	
	public static WebElement btn_Save()
	{
		try
		{
		element = driver.findElement(By.xpath("(//button[@class='genotpbtn ladda-button']//span[@class='ladda-label'])[2]"));
		Log.info("save button is found");
	}
	catch(Exception e)
	{
		Log.error("save button is not found" );
		throw(e);
	}
		return element;
	}
}
