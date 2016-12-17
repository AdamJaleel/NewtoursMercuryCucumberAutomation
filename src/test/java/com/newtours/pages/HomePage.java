package com.newtours.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtours.utilities.Base;

public class HomePage extends Base {
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "userName")
	public WebElement userName;
	
	@FindBy(name = "password")
	public WebElement passWord;
	
	@FindBy(name = "login")
	public WebElement loginButton;

}
