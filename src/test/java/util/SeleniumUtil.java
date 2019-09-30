package util;

import cucumber.TestContext;

public class SeleniumUtil 
{

	
	public static void loginInToGmail(TestContext testContext,String username,String password)
    {
       testContext.getAuth().opensite();
       /*
        testContext.getAuth().getHomePage().clickOnSign();
        testContext.getAuth().getLoginPage().sendUserName(username);
        testContext.getAuth().getLoginPage().clickonContinueButton();
        testContext.getAuth().getLoginPage().sendPassword(password);
        testContext.getAuth().getLoginPage().clickOnSingIn();
        */
    }
}
