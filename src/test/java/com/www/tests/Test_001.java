package com.www.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.www.browser.Browser;
import com.www.pages.SignUpPage;



public class Test_001 {

	SignUpPage sp ;
	@BeforeMethod
	public void initiateApplication() {
		Browser.initialize();
	}
	@AfterMethod
	public void wrapUp() {
		Browser.driver.close();
	}
	
	@Test
	public void test() {
		sp = new SignUpPage();
		sp.login();
	}
}
