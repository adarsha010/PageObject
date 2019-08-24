package com.www.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.www.browser.Browser;
import com.www.utils.PropertyUtil;
import com.www.utils.WaitUtils;

public class SignUpPage {

	@FindBy(id="email")
	public WebElement userName;
	
	@FindBy(id="pass")
	public WebElement passwordField;
	
	@FindBy(css="input[value='Log In']")
	public WebElement subMit_BTN;
	
	
	public SignUpPage() {
		PageFactory.initElements(Browser.driver,this);
	}
	
	public void login() {
		String un = PropertyUtil.getProperty("username");
		String pwd = PropertyUtil.getProperty("password");
		WaitUtils.waitTillElementVisible(userName);
		userName.sendKeys(un);
		passwordField.sendKeys(pwd);
		WaitUtils.waitTillElementClickable(subMit_BTN);
		subMit_BTN.click();
		
	}
	
}
