package com.powderhook.appium.cases.login;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.powderhook.appium.OR.LoginScreen;
import com.powderhook.appium.base.ActionHelper;
import com.powderhook.appium.common.LoginPage;
import com.powderhook.appium.utilities.ReadExcel;

public class VerifyInvalidLogin extends ActionHelper{
	
	public static ReadExcel excel1 = new ReadExcel(config.getProperty("TestData"),
			config.getProperty("sheetName1"));
	@Test
	public static void verifyInvalidLogin() {
			LoginPage.login(excel1.getCellValue("invalid", "id"),
					excel1.getCellValue("invalid", "password"));
			WebElement we = findByXapth(LoginScreen.signInButton);
			Assert.assertTrue(we.isEnabled());
	}
	
	
	

}
