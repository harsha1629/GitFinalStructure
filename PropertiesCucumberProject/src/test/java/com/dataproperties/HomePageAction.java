package com.dataproperties;

import org.openqa.selenium.support.PageFactory;

public class HomePageAction {
	HomPageLocators homepagelocators;
	
	public HomePageAction() {
		homepagelocators = new HomPageLocators();
		PageFactory.initElements(BaseclassForDataProperties.getdriver(), homepagelocators);
	}
	
	public String getVerifyText() {
		return homepagelocators.verifyHomeText.getText();
		
	}
	
	
}
