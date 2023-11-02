package com.dataproperties;

import org.openqa.selenium.support.PageFactory;

public class LoginActionsDataProperties {
	LoginDataPropertiesLocators objloginlocators;
	
	
	LoginActionsDataProperties(){
		this.objloginlocators = new LoginDataPropertiesLocators();
		
		PageFactory.initElements(BaseclassForDataProperties.getdriver(), objloginlocators);
	}
	
	public void setuserName(String strUsername) {
		objloginlocators.username.sendKeys(strUsername);
	}
	
	public void setUserPassword(String strUserPassword) {
		objloginlocators.password.sendKeys(strUserPassword);
	}
	
	public void clickLoginButton() {
		objloginlocators.login.click();
	}
	
	public void loginDetails(String strUsername,String strUserPassword) {
		this.setuserName(strUsername);
		this.setUserPassword(strUserPassword);
	}
	
	
}
