package com.newtours.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.newtours.utilities.Base;

public class RegistrationPage extends Base {
	
	public RegistrationPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "name_3_firstname")
	public static WebElement firstName;
	
	@FindBy(id = "name_3_lastname")
	public static WebElement lastName;
	
	@FindBy(id = "dropdown_7")
	public static WebElement country;
	
	
	
	

}
