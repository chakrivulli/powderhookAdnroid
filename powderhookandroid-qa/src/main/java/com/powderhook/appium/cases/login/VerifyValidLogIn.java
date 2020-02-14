package com.powderhook.appium.cases.login;

import org.testng.annotations.Test;

import com.powderhook.appium.base.ActionHelper;
import com.powderhook.appium.common.LoginPage;
import com.powderhook.appium.utilities.ReadExcel;

public class VerifyValidLogIn extends ActionHelper{
	
	public static ReadExcel excel1 = new ReadExcel(config.getProperty("TestData"),
			config.getProperty("sheetName1"));
	@Test
	public void verifyValidLogin() {
		
			LoginPage.VerifiedLogin(excel1.getCellValue("valid", "id"),
					excel1.getCellValue("valid", "password"));		
	}	
}
