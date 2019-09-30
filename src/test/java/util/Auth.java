package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigFileReader;
import pageModel.YouTubePage;
import pageModel.gmailLoginPage;

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

    public  WebDriver getWebDriver()
    {
        return driver;
    }

    public gmailLoginPage getgmailLoginPage()
    {
        return PageFactory.initElements(driver,gmailLoginPage.class);
    }

    public YouTubePage getYouTubePage()
    {
        return PageFactory.initElements(driver,YouTubePage.class);
    }

  



}
