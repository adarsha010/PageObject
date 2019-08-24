package com.www.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.www.browser.Browser;
import com.www.pages.GooglePage;

public class GoogleTest {

	@BeforeMethod
	public void initiateApplication() {
		Browser.initialize();
	}
	@AfterMethod
	public void wrapUp() {
		Browser.driver.quit();
	}
	
	@Test
	public void launchGoogleandSearch() {
		GooglePage gp = new GooglePage();
		gp.login();
	}
}
