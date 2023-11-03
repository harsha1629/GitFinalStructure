package com.parabank;

import org.openqa.selenium.support.PageFactory;

public class LoginAction {
	LoginLocators objloginLoc;
	
	public LoginAction() {
		objloginLoc = new LoginLocators();
		PageFactory.initElements(HelperClassPB.getdriver(), objloginLoc);
	}
	
	public void setUsername(String logUsername) {
		objloginLoc.loginUsername.sendKeys(logUsername);
			
	}
	
	public void setPwd(String logpwd) {
		objloginLoc.loginPwd.sendKeys(logpwd);
	}
	
	public void clickLoginBtn() {
		objloginLoc.loginbtn.click();
	}
	
	public void loginDetails(String logUsername,String logpwd) {
		setUsername(logUsername);
		setPwd(logpwd);
	}

}
