package com.www.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.www.browser.Browser;

public class SeleniumUtils {

	static JavascriptExecutor js =((JavascriptExecutor)Browser.driver);
	public static void clickOnElemnet(WebElement ele) {
		WaitUtils.waitTillElementClickable(ele);
		ele.click();
	}
		
	public static void enterTextinField(WebElement ele,String value) {
		ele.sendKeys(value);
	}
	
	public static void jsClick(WebElement ele) {
		//js.executeAsyncScript("arguments[0].click();",ele);		
		
	}
	
	public static void enterValue(String id, String value) {
		js.executeScript("document.getElementById('"+id+"').value='"+value+"';");

	}
	
}
