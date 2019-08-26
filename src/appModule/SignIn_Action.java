package appModule;
import org.testng.Reporter;

import pageObjects.Login_Page;
import pageObjects.Welcome_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class SignIn_Action {

	public static void Execute(int  iTestCaseRow) throws Exception 
	{
      Login_Page.btn_Login1().click();
      Log.info("First login button has been clicked and popup should open for entering email and pwd");
      String sUserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
      Login_Page.txtbx_email().sendKeys(sUserName);
      Log.info(sUserName+ "is entered");
      String sPassword = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
      Login_Page.txtbx_Password().sendKeys(sPassword);
      Log.info(sPassword+ "is entered");
      Login_Page.btn_LogIn().click();
      Log.info("Click action is performed on the login button");
      Utils.waitForElement(Welcome_Page.btn_Logout());
      Reporter.log("SignIn action is successfull");
	  ExcelUtils.setCellData(sUserName+ "" +sPassword, 1, 5);	
	  Log.info("Curent username column will be updated with this username and password value");
 }
	
		
	}
	
