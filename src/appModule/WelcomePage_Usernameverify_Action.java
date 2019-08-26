package appModule;

import org.openqa.selenium.WebDriver;

import utility.Constant;
import utility.ExcelUtils;
import utility.Log;

public class WelcomePage_Usernameverify_Action {

	public static WebDriver driver;
	public static void verifyUsername(int iTestCaseRow)
	{
		
String oldusername = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_CurrentUserName);
String newUsername = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UpdatedUserName);
if (oldusername.equals(newUsername))
{
	Log.info("The user name has not been changed");
}
else
{
	Log.info("The user name has been changed");
}
}
}
