package com.newtours.step_defenitions;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.newtours.pages.DemoQAHomePage;
import com.newtours.pages.RegistrationPage;
import com.newtours.utilities.Base;
import com.newtours.utilities.TestInputs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jdk.jfr.internal.LogLevel;

public class Registration extends Base {

	DemoQAHomePage demoHomePage = new DemoQAHomePage();
	RegistrationPage regPage = new RegistrationPage();

	@Given("^I am on demoqa home page$")
	public void i_am_on_demoqa_home_page() throws Throwable {
		driver.get(TestInputs.BASE_URL);
	}

	@When("^I click on registration$")
	public void i_click_on_registration() throws Throwable {
		demoHomePage.registrationLink.click();
	}

	@Then("^I should be on registration page$")
	public void i_should_be_on_registration_page() throws Throwable {
		boolean registar = driver.getPageSource().contains("First Name");

		if (registar == true) {
			System.out.print("PASS");
		} else {
			System.out.println("FAIL");
		}

		Thread.sleep(4000);

	}

	@Then("^I register user with fname as \"([^\"]*)\" lname as \"([^\"]*)\" country as \"([^\"]*)\"$")
	public void i_register_user_with_fname_as_lname_as_country_as(String arg1, String arg2, String arg3) throws Throwable {
		RegistrationPage.firstName.sendKeys(arg1);
		RegistrationPage.lastName.sendKeys(arg2);

		Select option = new Select(RegistrationPage.country);
		
		option.selectByValue(arg3);
		
		Thread.sleep(14000);
	}
}
