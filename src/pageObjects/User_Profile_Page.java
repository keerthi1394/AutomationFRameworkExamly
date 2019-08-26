package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Log;

public class User_Profile_Page extends BaseClass{

	public static WebElement element = null;

	public User_Profile_Page(WebDriver driver)
	{
		super(driver);
	}
	public static WebElement edit_photo()
	{
		try
		{
		element = driver.findElement(By.xpath("//i[@class='icon-edit profile_edit_icon']"));
		Log.info("Edit photo icon is found");
		}
		catch(Exception e)
		{
			Log.error("Edit photo icon is not found");
		}
		return element;
	}
	
	public static WebElement edit_educationaldetails()
	{
		try
		{
		element = driver.findElement(By.xpath("(//i[@class='icon-edit _card_header'])[1]"));
		Log.info("edit edu details is found on webpage");
		}
		catch(Exception e)
		{
			Log.error("edit education detail is not present");
			throw(e);
		}
		return element;
	}
	
	public static WebElement select_dropdown1()
	{
		try
		{
		element = driver.findElement(By.xpath("(//span[@class='inner-text'])[1]"));
		Log.info("select_dropdown1 is found");
		}
		catch(Exception e)
		{
			Log.error("select dropdown1 is not found");
			throw(e);
		}
		return element;
	}
	public static WebElement select_dropdown2()
	{
		try
		{
		element = driver.findElement(By.xpath("(//span[@class='inner-text'])[2]"));
		Log.info("select dp down 2 is found");
		}
		catch(Exception e)
		{
			Log.error("select drpdown 2 is not found");
		}
		return element;
	}
	public static WebElement select_dropdown3()
	{
		try
		{
		element = driver.findElement(By.xpath("(//span[@class='inner-text'])[3]"));
		Log.info("select dp down 3 is found");
	}
	catch(Exception e)
	{
		Log.error("select drpdown 3 is not found");
	}
		return element;
	}
	public static WebElement select_dropdown4()
	{
		try
		{
		element = driver.findElement(By.xpath("(//span[@class='inner-text'])[4]"));
		Log.info("select dp down 4 is found");
	}
	catch(Exception e)
	{
		Log.error("select drpdown 4 is not found");
	}
		return element;
	}
	public static WebElement select_dropdown5()
	{
		try
		{
		element = driver.findElement(By.xpath("(//span[@class='inner-text'])[5]"));
		Log.info("select dp down 5 is found");
		}
		catch(Exception e)
		{
			Log.error("select drpdown 5 is not found");
		}
		return element;
	}
	public static WebElement select_dropdown6()
	{
		try
		{
		element = driver.findElement(By.xpath("(//span[@class='inner-text'])[6]"));
		Log.info("select dp down 6 is found");
		}
		catch(Exception e)
		{
			Log.error("select drpdown 6 is not found");
		}
		return element;
	}
	
	public static WebElement btn_Republish()
	{
		try
		{
		element = driver.findElement(By.xpath("//button[@class='req_button _description']"));
		Log.info("republish button is found");
		}
		catch(Exception e)
		{
			Log.error("republish button is not found");
		}
		return element;
	}
	
}
