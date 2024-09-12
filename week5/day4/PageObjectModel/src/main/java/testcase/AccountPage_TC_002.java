package testcase;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class AccountPage_TC_002 extends ProjectSpecificMethod {
	
	@Test
	public void login() {
		
		//create object for LoginPage
		
		LoginPage lp=new LoginPage(driver);
		System.out.println(driver);
		//method level chaining
		lp.enterUserName()
		.enterPassWord()
		.clickOnLoginButton()
		.clickOnCrmsfa()
		.clickOnAccounts();
		
	}

}
