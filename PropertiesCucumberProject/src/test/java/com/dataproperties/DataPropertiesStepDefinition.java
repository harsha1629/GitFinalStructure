package com.dataproperties;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataPropertiesStepDefinition extends BaseclassForDataProperties{
	
	BaseclassForDataProperties baseclass = new BaseclassForDataProperties();
	LoginActionsDataProperties loginAction = new LoginActionsDataProperties();
	UtilityProperties utilproperties = new UtilityProperties();
	HomePageAction homeaction = new HomePageAction();
	
	@Given("User providing url and launching webpage")
	public void user_providing_url_and_launching_webpage() {
		baseclass.openingPage(utilproperties.url);
		System.out.println("Login URL");
	}

	@When("User providing valid username and valid password")
	public void user_providing_valid_username_and_valid_password() {
		loginAction.loginDetails(utilproperties.username, utilproperties.password);
		System.out.println("Entering username and Password");
	}

	@When("User clicking the login button and successfully logging")
	public void user_clicking_the_login_button_and_successfully_logging() {
		loginAction.clickLoginButton();
		System.out.println("Clicking login button");
	}

	@Then("User get into home page")
	public void user_get_into_home_page() {
	    Assert.assertTrue(homeaction.getVerifyText().contains("Dashboard"));
	    System.out.println("Dashboard home page is opened");
	}



}
