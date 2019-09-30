package pageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YouTubePage 
{
	private WebDriver webdriver;

    public YouTubePage(WebDriver driver)
    {
        this.webdriver= driver;
    }
    
    @FindBy(how = How.XPATH,using ="//ytd-topbar-menu-button-renderer[1]//div[1]//a[1]//yt-icon-button[1]//button[1]//yt-icon[1]")
    WebElement upload;

    
    @FindBy(how = How.XPATH,using = "//ytd-compact-link-renderer[1]//a[1]//paper-item[1]")
    WebElement uploadVideo;
    
    @FindBy(how = How.XPATH,using="//a[contains(text(),'new Studio uploader')]")
    WebElement NewStudioSelector;
    
    @FindBy(how = How.XPATH,using ="//div[contains(text(),'Select file')]")
    WebElement selectFile;
    
    @FindBy(how=How.XPATH,using="//span[contains(text(),'Publish')]")
    WebElement uploadButton;
    
    
    @FindBy(how=How.XPATH,using="//div[@class='upload-state-bar']//div[@class='progress-bar-processing']//div[@class='progress-bar-progress']")
    WebElement prgoressBar;
    
    
    public void clickOnCreate()
    {
    	upload.click();
    }
      
    
    public void clickOnUpload()
    {
      Actions act = new Actions(webdriver);
	  act.moveToElement(uploadVideo).click().perform();
    }
    
    
	
}
