package TestCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import appModule.AccountSettingsPopup_Verify_Action;
import appModule.AddingtoCart_Action;
import appModule.ChangePassword_Action;
import appModule.Login_After_Pwdchange_Action;
import appModule.SignIn_Action;
import appModule.SignOut_Action;
import appModule.UpdateProfile_Action;
import appModule.WelcomePage_Usernameverify_Action;
import pageObjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class Framework_1 {
	public WebDriver driver;
	private String sTestCaseName;
	private int iTestCaseRow;
	@BeforeMethod

	public void beforeMethod() throws Exception
	{
		try
		{
			DOMConfigurator.configure("log4j.xml");
			sTestCaseName = this.toString();
			sTestCaseName = Utils.getTestCaseName(this.toString());
			Log.startTestCase(sTestCaseName);
			ExcelUtils.setExcelFile(Constant.Path_TestData +Constant.File_TestData , "Sheet1");
			iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, Constant.Col_TestCaseName);
			driver= Utils.openBrowser(iTestCaseRow);

			new BaseClass(driver);
		}
		catch(Exception e)
		{
			Log.error("message");
		}
	}

	@AfterMethod
	public void afterMethod() {
		Log.endTestCase(sTestCaseName);
		driver.close();
	}
	@Test
	public void main() throws Exception {

		try
		{
			SignIn_Action.Execute(iTestCaseRow);
			AddingtoCart_Action.addtoCart();
			UpdateProfile_Action.updateProfile(iTestCaseRow);
			WelcomePage_Usernameverify_Action.verifyUsername(iTestCaseRow);
			AccountSettingsPopup_Verify_Action.verfiyPopup(iTestCaseRow);
			ChangePassword_Action.updPwd(iTestCaseRow);
			SignOut_Action.signOut();
			Login_After_Pwdchange_Action.afterpwdChange(iTestCaseRow);
			ExcelUtils.setCellData("Passed", 1, 4);
		}
		catch(Exception e)
		{
			Log.error("Execution failed in any one of the steps");
			
		}






	}

}
