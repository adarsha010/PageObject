package com.www.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.www.browser.Browser;
import com.www.utils.SeleniumUtils;
import com.www.utils.WaitUtils;

public class GooglePage {

	@FindBy(css="input[name='q']")
	public WebElement searchField;
	
	@FindBy(xpath="(//input[@name='btnK'])[2]")
	public WebElement googleSearchBTN;
	
	
	
	public GooglePage() {
		PageFactory.initElements(Browser.driver,this);
	}
	
	public void login() {
		WaitUtils.waitTillElementVisible(searchField);
		SeleniumUtils.enterTextinField(searchField,"India");
		
	}
	
}
