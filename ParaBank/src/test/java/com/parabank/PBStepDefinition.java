package com.parabank;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PBStepDefinition {
	HelperClassPB helper = new HelperClassPB();
	RegisterActions regAction = new RegisterActions();
	DataProvidersPB dp = new DataProvidersPB();
	
	@Given("User in the ParaBank Register Page by launching url")
	public void user_in_the_para_bank_register_page_by_launching_url(String url) {
		helper.openPage(url);
	}

	@When("User clicks Register link")
	public void user_clicks_register_link(String registerLink) {
		regAction.clickRegister(registerLink);
	}

	@When("User enters firstname,lastname,address,city,state,zipcode,Phone,ssn")
	public void user_enters_firstname_lastname_address_city_state_zipcode_phone_ssn() {
		regAction.registerDetails(dp.firstName, dp.lastName, dp.address, dp.city, dp.state, dp.zipcode, dp.phoneNumber, dp.ssn, dp.username, dp.password, dp.repeatedPassword);
	}

	@When("User enters Username,password and Confirm-Password")
	public void user_enters_username_password_and_confirm_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Register button")
	public void user_clicks_register_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User able to see logged in page and logout an account")
	public void user_able_to_see_logged_in_page_and_logout_an_account() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
