package util;

import cucumber.TestContext;
import dataProvider.ConfigFileReader;

public class SeleniumUtil 
{
    public static ConfigFileReader configFileReader = new ConfigFileReader(); 
	
	public static void loginInToGmail(TestContext testContext)
    { 
       testContext.getAuth().getGmailLoginPage().clickOnSignINButton();
       testContext.getAuth().getGmailLoginPage().giveEmailID(configFileReader.getProps("emailID"));
       testContext.getAuth().getGmailLoginPage().clickONNext();
       testContext.getAuth().getGmailLoginPage().givePassword(configFileReader.getProps("password"));
       testContext.getAuth().getGmailLoginPage().clickONLogin();
    }
	
	
}
