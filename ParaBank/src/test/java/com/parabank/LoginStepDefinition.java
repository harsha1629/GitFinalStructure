package com.parabank;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	HelperClassPB helper = new HelperClassPB();
	LoginAction logaction = new LoginAction();

	@Given("User in the Para Bank HomePage")
	public void user_in_the_para_bank_home_page(String url) {
		System.out.println("Open website");
		helper.openPage(url);
	}

	@When("User enters the username {string}")
	public void user_enters_the_username(String username) {
		System.out.println("Username");
		logaction.setUsername(username);
	}

	@When("USer enters the password {string}")
	public void u_ser_enters_the_password(String password) {
		System.out.println("Password");
		logaction.setPwd(password);
	}

	@When("User clicks the Log in button")
	public void user_clicks_the_log_in_button() {
		logaction.clickLoginBtn();
	}

	@Then("User able to see Accounts Overview")
	public void user_able_to_see_accounts_overview() {
		
	}

	@Then("User able to see Error Message")
	public void user_able_to_see_error_message() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
