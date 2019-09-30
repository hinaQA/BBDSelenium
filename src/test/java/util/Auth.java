package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigFileReader;
import pageModel.GmailLoginPage;
import pageModel.YouTubePage;

public class Auth {
	public static WebDriver driver = null;
    ConfigFileReader configFileReader;
    public Auth()

    {
        configFileReader = new ConfigFileReader();

    }

    public  void openbrowser()
    {
    	System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

    }
    public void opensite()
    {
        driver.get(configFileReader.getUrl());
    }

    public void closebrowser()
    {
        driver.quit();
    }
    
    public void implictWait()
    {
    	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    }

    public  WebDriver getWebDriver()
    {
        return driver;
    }

    public GmailLoginPage getGmailLoginPage()
    {
        return PageFactory.initElements(driver,GmailLoginPage.class);
    }

    public YouTubePage getYouTubePage()
    {
        return PageFactory.initElements(driver,YouTubePage.class);
    }
    
    
    

  



}
