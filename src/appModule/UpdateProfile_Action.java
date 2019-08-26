package appModule;

import org.openqa.selenium.WebElement;

import pageObjects.Settings_UpdateProfile_Page;
import pageObjects.Welcome_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class UpdateProfile_Action {
public static WebElement element =null;
	public static void updateProfile(int iTestCaseRow) throws Exception
	{
	Welcome_Page.click_menuid().click();
	Welcome_Page.menu_Setting().click();
	String updatedFirstName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UpdatedFirstName);
	Settings_UpdateProfile_Page.txt_Firstname().clear();
	Settings_UpdateProfile_Page.txt_Firstname().sendKeys(updatedFirstName);
	Log.info("Firstname has been updated");
	String updatedLastName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UpdatedLastName);
	Settings_UpdateProfile_Page.txt_Lastname().clear();
	Settings_UpdateProfile_Page.txt_Lastname().sendKeys(updatedLastName);
	Log.info("Lastname of the user has been updated");
	String updatedMobileNumber = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UpdatedMobileNumber);
	Settings_UpdateProfile_Page.txt_Mobilenumber().clear();
	Settings_UpdateProfile_Page.txt_Mobilenumber().sendKeys(updatedMobileNumber);
	Log.info("Mobile number has been updated");
	Settings_UpdateProfile_Page.btn_Update().click();
	ExcelUtils.setCellData(updatedFirstName+ "" +updatedLastName, 1, 9);
}
}
