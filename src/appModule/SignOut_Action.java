package appModule;

import pageObjects.Welcome_Page;
import utility.Log;

public class SignOut_Action {

	public static void signOut()
	{
		Welcome_Page.btn_Logout();
		Log.info("user has been logged out");
	}
}
