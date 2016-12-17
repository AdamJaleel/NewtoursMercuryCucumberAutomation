package com.newtours.step_defenitions;

import com.newtours.pages.HomePage;
import com.newtours.utilities.Base;
import com.newtours.utilities.Browser;
import com.newtours.utilities.TestInputs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NegativeLogin extends Base {
	
	HomePage hp = new HomePage();

	@Given("^I am on Mercury home page$")
	public void i_am_on_Mercury_home_page() throws Throwable {
		driver.get(TestInputs.BASE_URL);
	}

	@When("^I enter invalid \"([^\"]*)\" and invalid \"([^\"]*)\"$")
	public void i_enter_invalid_and_invalid(String uname, String pass) throws Throwable {
		hp.userName.sendKeys(uname);
		hp.passWord.sendKeys(pass);
		hp.loginButton.click();
	}

	@Then("^I should be able to see \"([^\"]*)\" message$")
	public void i_should_be_able_to_see_message(String arg1) throws Throwable {
		Browser.verifyText("//font[@face='Arial, Helvetica, sans-serif']/b");
	}
}
