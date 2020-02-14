package com.powderhook.appium.cases.homescreen;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.powderhook.appium.OR.HomeScreen;
import com.powderhook.appium.OR.VendorCheckInScreen;
import com.powderhook.appium.base.ActionHelper;
import com.powderhook.appium.common.LoginPage;
import com.powderhook.appium.utilities.ReadExcel;

public class VerifyCheckinCancel extends ActionHelper {
	
	public static ReadExcel excel1 = new ReadExcel(config.getProperty("TestData"),
			config.getProperty("sheetName1"));
	@Test
	public static void verifyCheckInCancle() {
		/*
		int tileNo = 1;
		LoginPage.VerifiedLogin(excel1.getCellValue("valid", "id"), excel1.getCellValue("valid", "password"));
		click(HomeScreen.vendorList);

		for (int i = 1; i <= 6; i++) {
			String count = appium.findElement(By.xpath(
					"//*[@resource-id='com.kroger.dsdreceiver:id/rvVendorList']/*[@class='android.widget.FrameLayout']["
							+ i + "]/following::*[@resource-id='com.kroger.dsdreceiver:id/tvTileCount']")).getText();
			if (count.equalsIgnoreCase("0")) {
				tileNo = i + 1;
				break;
			}
		}
		click("//*[@resource-id='com.kroger.dsdreceiver:id/rvVendorList']/*[@class='android.widget.FrameLayout']["
				+ tileNo + "]");
		Assert.assertTrue(waitForElementClickable(VendorCheckInScreen.cancelButton), "Cancle button is not Clickable");
		click(VendorCheckInScreen.cancelButton);
		Assert.assertEquals(findByXapth(HomeScreen.title).getText(), "DSD - Vendor Select");
		*/
	}
	
	
	

}
