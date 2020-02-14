package com.powderhook.appium.cases.homescreen;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.powderhook.appium.OR.HomeScreen;
import com.powderhook.appium.OR.VendorCheckInScreen;
import com.powderhook.appium.base.ActionHelper;
import com.powderhook.appium.common.LoginPage;
import com.powderhook.appium.constants.HomeScreenConst;
import com.powderhook.appium.utilities.ReadExcel;

public class VerifyCheckinBack extends ActionHelper{
	
	
	static File file = new File("src/main/resources/TestData.xls");
	static String absolutePath = file.getAbsolutePath();
	public static ReadExcel excel1 = new ReadExcel(absolutePath,
			"Sheet1");
	
	@Test
	public static void verifyCheckInBack() {
		//test checkin test
		
		String username = excel1.getCellValue("valid", "id");
		String password = excel1.getCellValue("valid", "password");
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
		click(VendorCheckInScreen.driverCheckBox);
		waitForElementClickable(VendorCheckInScreen.nextButton);
		click(VendorCheckInScreen.nextButton);
		waitForElementClickable(VendorCheckInScreen.cancelButton);
		click(VendorCheckInScreen.cancelButton);
		waitForElementClickable(VendorCheckInScreen.backButton);
		click(VendorCheckInScreen.backButton);
		Assert.assertEquals(findByXapth(HomeScreen.title).getText(), HomeScreenConst.title);
		*/
		//String currentDirectory = System.getProperty("user.dir");
	   // System.out.println("The current working directory is " + currentDirectory);
		File file = new File("resources/TestData.xls");
		String absolutePath = file.getAbsolutePath();
		System.out.println(absolutePath);
		

	}
	
	
	

}
