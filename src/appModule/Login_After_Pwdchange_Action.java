package appModule;

import org.testng.Reporter;

import pageObjects.Login_Page;
import pageObjects.Welcome_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class Login_After_Pwdchange_Action {

	public static void afterpwdChange(int  iTestCaseRow) 
	{
      Login_Page.btn_Login1().click();
      Log.info("First login button has been clicked and popup should open for entering email and pwd");
      String sUserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
      Login_Page.txtbx_email().sendKeys(sUserName);
      Log.info(sUserName+ "is entered");
      String sPassword = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UpdatedPassword);
      Login_Page.txtbx_Password().sendKeys(sPassword);
      Log.info(sPassword+ "is entered");
      Login_Page.btn_LogIn().click();
      Log.info("Click action is performed on the login button");
      Utils.waitForElement(Welcome_Page.btn_Logout());
      Reporter.log("SignIn action is successfull");
		
		
	}
}
