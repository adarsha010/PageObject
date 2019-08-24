package com.www.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.www.browser.Browser;
import com.www.pages.FlightHomePage;

public class FlightApplictaion {

	FlightHomePage fhomePage ;
	@BeforeMethod
	public void initiateApplication() {
		Browser.initialize();
	}
	@AfterMethod
	public void wrapUp() {
		Browser.driver.quit();
	}
	
	@Test
	public void test() {
		fhomePage = new FlightHomePage();
		fhomePage.goToFlightSections();
		fhomePage.choosegoToPlace();
	}
}
