package appModule;
import pageObjects.Account_Settings_Page;
import pageObjects.Welcome_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class AccountSettingsPopup_Verify_Action {

	public static void verfiyPopup(int iTestCaseRow)
	{
		Welcome_Page.click_menuid().click();
		Log.info("click action on menu icon  is successfull");
		Welcome_Page.menu_AccountSetting().click();
		Log.info("Click action on account settign menu is successfull");
		String password = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
		Account_Settings_Page.handle_Enteryourpassword().sendKeys(password);
		Account_Settings_Page.btn_Confirm().click();
		Log.info("After clicking on Account setting menu, the opened pop-up has been handled and entered into page where we change pwd and mobile num");
		
		
	}
}
