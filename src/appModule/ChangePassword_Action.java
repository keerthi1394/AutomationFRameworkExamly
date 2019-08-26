package appModule;

import pageObjects.Account_Settings_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class ChangePassword_Action {

	public static void updPwd(int iTestCaseRow)
	{	
		String newPassword = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UpdatedPassword);
		Account_Settings_Page.txt_newpassword().sendKeys(newPassword);
		Log.info("Password has been changed");
		Account_Settings_Page.btn_Save().click();
		Log.info("Click action has been performed on save button");
	}
}
