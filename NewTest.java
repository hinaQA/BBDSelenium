package LearnSelenium.LearnSelenium;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.apache.commons.logging.impl.Log4JLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.internal.annotations.IListeners;
import org.testng.log4testng.Logger;


public class NewTest {
  @Test
  public void f() {
	 
	 
	  //ChromeDriverManager.getInstance().setup();
	  System.setProperty("webdriver.chrome.driver", "chromedriver");
	  WebDriver driver = new ChromeDriver();
	 System.out.print("");
	  driver.get("https://www.google.com/");
	  driver.findElement(By.className(""));
	  driver.getWindowHandle();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//Implict wait
	  driver.switchTo().frame(1);
	  Wait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.alertIsPresent());
	  
	 // driver.switchTo().window(nameOrHandle)
	  Wait w = new FluentWait(driver).withTimeout(null).pollingEvery(null).ignoring(Exception.class);
	 
	 /* WebElement foo=w.until(new Function<WebDriver, WebElement>() {
		  public WebElement applyy(WebDriver driver) {
		  return driver.findElement(By.id("foo"));
		  }
		  });
		  */
	  
	// ITestListener
	 // ISuiteListener
	 // IRetryAnalyzer
	  
	  
	  /*
	   * 
	   * connect jdbc 
	   * DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver())
	   *  Connection con = DriverManager.getConnection(url,user,password)

String url = “ jdbc:oracle:thin:@localhost:1521:xe”

Statement st = con.createStatement();
String sql = "insert into student1 values('"+name+"',"+roll+",'"+cls+"')";
	   */
	  driver.manage().window().maximize();
	 //driver.switchTo()
	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  Actions a = new Actions(driver);
	  a.clickAndHold().perform();
	 // Select sl = new Select();
	  SoftAssert s = new SoftAssert();
	  Select sl  = new Select(null);
	  s.assertEquals("", "");
	  Assert.assertEquals("", "");
	 // Select s = new Select(driver.findElement(By.className("")));
	  Logger l = Logger.getLogger(getClass());
	  Reporter.log("");
	  //IListeners
	  EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
	 // DriverManager driverManager = DriverManager.registerDriver(driver);
	//  driverManager.get
	  
	 
	  
  }
}
