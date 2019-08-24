package com.www.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.www.browser.Browser;

public class WaitUtils {

	public static WebDriverWait wait = new WebDriverWait(Browser.driver,2000);
	
	public static void waitTillElementClickable(WebElement ele) {
		
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	
	public static void waitTillElementVisible(WebElement ele) {
		
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void waitTillElementGetsInvisible(WebElement ele) {
		
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
}
