package appModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pageObjects.Add_toCart_Page;
import pageObjects.Buy_Page;
import pageObjects.Product_details_Page;
import pageObjects.Welcome_Page;
import utility.Log;
import utility.Utils;


public class AddingtoCart_Action {
	public static WebElement element= null;
	public static WebDriver driver = null;
	public static WebElement select_Course(WebDriver driver)
	{
		element =driver.findElement(By.xpath("(//div[@class='card_title'][text()='CourseCheck3'])[1]"));
		return element;
	}
	public static void addtoCart()
	{
		Welcome_Page.click_menuid().click();
		Log.info("click action has been done on Menu element");
		Actions action = new Actions(driver);
		action.moveToElement(Welcome_Page.menu_Buy()).click().perform();
		Utils.waitForElement(Product_details_Page.click_addtocart());
		AddingtoCart_Action.select_Course(driver).click();
		Log.info("Course has been selected successfully to view its details");
		Product_details_Page.click_addtocart().click();
		Log.info("Course has been added to cart successfully");
		Buy_Page.click_view_cart().click();
		Add_toCart_Page.click_ContinueShopping().click();
		Log.info("User is now back to Prodctdetails page for more shopping");
	}
}
