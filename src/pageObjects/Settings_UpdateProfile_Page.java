package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class Settings_UpdateProfile_Page  extends BaseClass {

	private static WebElement element = null;
	public Settings_UpdateProfile_Page(WebDriver driver)
	{
		super(driver);
	}

	public static WebElement txt_Firstname()
	{
		try
		{
		element = driver.findElement(By.xpath("//input[@formcontrolname='firstname']"));
		Log.info("firstname text is found");
		}
		catch(Exception e)
		{
			Log.error("first name textbox is not found" );
		}
		return element;
	}
	
	public static WebElement txt_Lastname()
	{
		try
		{
		element=driver.findElement(By.xpath("//input[@formcontrolname='lastname']"));
		Log.info("Lastname text is found");
	}
	catch(Exception e)
	{
		Log.error("Last name textbox is not found" );
	}
		return element;
	}
	
	public static WebElement txt_Mobilenumber()
	{
		try
		{
		element=driver.findElement(By.xpath("//input[@formcontrolname='mobile']"));
		Log.info("mobilenumber textbox is found");
	}
	catch(Exception e)
	{
		Log.error("mobilenumber textbox is not found" );
	}
		return element;
	}
	
	public static WebElement btn_Update()
	{
		try
		{
		element = driver.findElement(By.xpath("//button[@class='change_button ladda-button']"));
		Log.info("update button  is found");
		}
		catch(Exception e)
		{
			Log.error("Update button is not found" );
		}
		
		return element;
	}
}
