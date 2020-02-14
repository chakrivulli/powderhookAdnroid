package com.powderhook.appium.common;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.powderhook.appium.OR.HomeScreen;
import com.powderhook.appium.OR.LoginScreen;
import com.powderhook.appium.base.ActionHelper;
import com.sun.corba.se.spi.orbutil.fsm.ActionBase;
import com.sun.corba.se.spi.orbutil.fsm.FSM;
import com.sun.corba.se.spi.orbutil.fsm.Input;

public class LoginPage extends ActionHelper{

	

	public static boolean login(String userName, String password) {
		boolean res = false;
		try {
			type(LoginScreen.userId,userName);
			
			
			type(LoginScreen.password,password);
			
			click(LoginScreen.signInButton);
			Thread.sleep(6000);
			res = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public static boolean VerifiedLogin(String userName, String password) {
		boolean res = false;
		try {
			click(LoginScreen.userId);
			type(LoginScreen.userId,userName);
			click(LoginScreen.password);
			type(LoginScreen.password,password);
			click(LoginScreen.signInButton);
			String text = findByXapth(HomeScreen.title).getText();
			Assert.assertEquals(text, "DSD - Vendor Select");
			res = true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	public void doIt(FSM fsm, Input in) {
		// TODO Auto-generated method stub
		
	}
}
