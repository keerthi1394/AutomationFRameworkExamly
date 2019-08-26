package appModule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageObjects.User_Profile_Page;
import pageObjects.Welcome_Page;
import utility.Log;

public class Profile_User_Edit_Action {
	public static WebElement element =null;
public static WebDriver driver = null;
	public static void dropdown_value1(WebDriver driver)
	{
		Select dropdown = new Select(User_Profile_Page.select_dropdown1());
		dropdown.selectByVisibleText("Percentage");
		Log.info("Percentage dropdown valeu has been selected");
	}
	public static void dropdown_value2(WebDriver driver)
	{
		Select dropdown = new Select(User_Profile_Page.select_dropdown1());
		dropdown.selectByVisibleText("CGPA");
		Log.info("CGPA dropdown value has been selected");
	}
	public static void editPhoto() throws AWTException
	{
		Welcome_Page.menu_Profile().click();
		User_Profile_Page.edit_photo().click();
		Robot rb = new Robot();
		for(int i=0; i<=9; i++)
		{
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
		}
		for (int i=0; i<=3; i++)
		{
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);	
		}
		rb.keyPress(KeyEvent.VK_ENTER);
		System.out.println(" Profile photo has been updated successfully");
	}
	
public static void editEducationdetails()
{
	Welcome_Page.menu_Profile().click();
	User_Profile_Page.edit_educationaldetails().click();
	User_Profile_Page.select_dropdown1().click();
	Profile_User_Edit_Action.dropdown_value1(driver);
	element = driver.findElement(By.xpath("(//input[@class='inputtextBox'])[1]"));
	element.sendKeys("95");
	Log.info("Percentage o 10th standard has been updated");
User_Profile_Page.btn_Republish().click();
Log.info("Profle has been re-published");
}
}


