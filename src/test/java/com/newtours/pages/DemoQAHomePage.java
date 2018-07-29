package com.newtours.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtours.utilities.Base;

public class DemoQAHomePage extends Base {
	
	public DemoQAHomePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Registration")
	public WebElement registrationLink;
//	
//	@FindBy(name = "password")
//	public WebElement passWord;
//	
//	@FindBy(name = "login")
//	public WebElement loginButton;

}
