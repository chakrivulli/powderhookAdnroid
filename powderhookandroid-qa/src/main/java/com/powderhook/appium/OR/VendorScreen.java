package com.powderhook.appium.OR;

public class VendorScreen {
	public static String checkoutButton = "//*[@text='CHECK-OUT']";
	public static String checkoutButton2 = "//*[@resource-id='com.kroger.dsdreceiver:id/checkOutButton']";
	public static String backArrowButton = "//*[@class='android.widget.ImageButton']";
	
	public static String yesRadio = "//*[@resource-id='com.kroger.dsdreceiver:id/rb_credit_Yes']";
	public static String noRadio = "//*[@resource-id='com.kroger.dsdreceiver:id/rb_credit_No']";
	public static String nextButton = "//*[@resource-id='com.kroger.dsdreceiver:id/bNext']";
	
	public static String driverQCheckBox = "//*[@resource-id='com.kroger.dsdreceiver:id/cbDriver']";
	public static String checkInButton = "//*[@resource-id='com.kroger.dsdreceiver:id/checkInButton']";
	public static String salesRepCheckBox = "//*[@resource-id='com.kroger.dsdreceiver:id/cbSalesRep']";
	public static String merchendiserCheckBox = "//*[@resource-id='com.kroger.dsdreceiver:id/cbMerch']";
	
	public static String BLetterLink = "//*[@text='B']";
	public static String vendorNamesFromFrame = "//*[@resource-id='com.kroger.dsdreceiver:id/rvVendorList']/*[@class='android.widget.FrameLayout'][5]/following::*[@resource-id='com.kroger.dsdreceiver:id/tvTileVendorName']";
	public static String vendorNamesOnTiles = "//*[@resource-id='com.kroger.dsdreceiver:id/tvTileVendorName']";
	public static String checkoutVendorButton = "//*[@text='CHECK-OUT VENDOR']";
	public static String vendorSpecificScreenTitle = "//*[@resource-id='com.kroger.dsdreceiver:id/toolbar']/*[@class='android.widget.TextView']";
	
}
