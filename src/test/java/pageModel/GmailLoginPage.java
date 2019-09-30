package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GmailLoginPage {
	
	private WebDriver webdriver;

    public GmailLoginPage(WebDriver driver)
    {
        this.webdriver= driver;
    }
    
	@FindBy(how= How.XPATH,using="//ytd-button-renderer[@class='style-scope ytd-masthead style-suggestive size-small']//yt-icon[@class='style-scope ytd-button-renderer']")
	WebElement signIN;

	@FindBy(how=How.XPATH,using="//input[@id='identifierId']")
	WebElement emailID;
	
	@FindBy(how=How.XPATH,using="//span[@class='RveJvd snByac']")
	WebElement  emailNext;
	
	@FindBy(how=How.XPATH,using ="//input[@name='password']")
	WebElement pasword;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Next')]")
	WebElement nextButton;
	
	
	public void clickOnSignINButton()
	{
		signIN.click();
	}
	
	public void giveEmailID(String id)
	{
	   emailID.clear();	
		emailID.sendKeys(id);
	}
	
	public void clickONNext()
	{
		emailNext.click();
	}
	
	public void givePassword(String password)
	{
		pasword.clear();
		pasword.sendKeys(password);
	}
	
	public void clickONLogin()
	{
		 boolean staleElement = true; 
		  while(staleElement){
		    try{
		    	nextButton.click();
		       staleElement = false;

		    } catch(StaleElementReferenceException e){
		      staleElement = true;
		    }
		  }
	}
	
	
}
