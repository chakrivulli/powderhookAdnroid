package com.powderhook.appium.OR;

public class HomeScreen {
	public static String title = "//*[@resource-id='com.kroger.dsdreceiver:id/toolbar']/*[@class='android.widget.TextView']";
	public static String tabsList = "//*[@class='android.support.v7.app.ActionBar$Tab']/*";
	
	public static String vendorList = "//*[@text='VENDOR LIST']";
	public static String vendorInStore = "//*[@text='VENDORS IN-STORE']";
	public static String tilesFrame = "//*[@resource-id='com.kroger.dsdreceiver:id/rvVendorList']/*[@class='android.widget.FrameLayout']";
	public static String BLetterLink = "//*[@text='B']";
	public static String vendorNamesFromFrame = "//*[@resource-id='com.kroger.dsdreceiver:id/rvVendorList']/*[@class='android.widget.FrameLayout'][5]/following::*[@resource-id='com.kroger.dsdreceiver:id/tvTileVendorName']";
	public static String vendorNamesOnTiles = "//*[@resource-id='com.kroger.dsdreceiver:id/tvTileVendorName']";
	public static String navigateUpButton = "//*[@content-desc='Navigate up']";
	public static String noVendorLabel = "//*[@resource-id='com.kroger.dsdreceiver:id/store_no_vendor']";
	public static String schwanVendor = "//*[contains(@text,'SCHWAN')]";
	public static String moreOptions = "//*[@content-desc='More options']";
	public static String logOutButton = "//*[@text='Log Out']";
}
