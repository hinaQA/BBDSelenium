package LearnSelenium.LearnSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class YoutTune {
  @Test
  public void testYouTube() throws AWTException {
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.youtube.com");
	  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead style-suggestive size-small']//yt-icon[@class='style-scope ytd-button-renderer']"))
	  .click();
	  driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("tt444661@gmail.com");
	  driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	  //driver.findElement(By.xpath("//span[@class='wRNPwe pVlEsd']//*[@class='stUf5b']")).click();
	  
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("MCKensy&4321");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  boolean staleElement = true; 
	  while(staleElement){
	    try{
	    	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	       staleElement = false;

	    } catch(StaleElementReferenceException e){
	      staleElement = true;
	    }
	  }
	  
	  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//ytd-topbar-menu-button-renderer[1]//div[1]//a[1]//yt-icon-button[1]//button[1]//yt-icon[1]")).click();
	  Actions act = new Actions(driver);
	  WebElement w = driver.findElement(By.xpath("//yt-formatted-string[contains(text(),'Upload video')]"));
	  act.moveToElement(w).click().perform();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//a[contains(text(),'new Studio uploader')]")).click();
	  driver.findElement(By.xpath("//div[contains(text(),'Select file')]")).click();
	  //.sendKeys("\"/Users/hina/Documents/api/LearnSelenium/20190928_182226.mp4\"");
	  
	  
	  
	  File file = new File("\\Users\\hina\\Documents\\api\\LearnSelenium\\20190928_182226.mp4");
      StringSelection stringSelection= new StringSelection(file.getAbsolutePath());
     // Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
      Robot r = new Robot();
      r.keyPress(KeyEvent.VK_META);
      
      r.keyPress(KeyEvent.VK_TAB);
       
      r.keyRelease(KeyEvent.VK_META);
       
      r.keyRelease(KeyEvent.VK_TAB);
       
      r.delay(500);
      
      
      
      
      
      r.keyPress(KeyEvent.VK_SLASH); 
      r.keyRelease(KeyEvent.VK_SLASH);
      r.keyPress(KeyEvent.VK_SHIFT);
      r.keyPress(KeyEvent.VK_U);
      r.keyRelease(KeyEvent.VK_SHIFT);
      r.keyRelease(KeyEvent.VK_U);
      r.keyPress(KeyEvent.VK_S);
      r.keyRelease(KeyEvent.VK_S);
      r.keyPress(KeyEvent.VK_E);
      r.keyRelease(KeyEvent.VK_E);
      r.keyPress(KeyEvent.VK_R);
      r.keyRelease(KeyEvent.VK_R);
      r.keyPress(KeyEvent.VK_S);
      r.keyRelease(KeyEvent.VK_S);
      r.keyPress(KeyEvent.VK_SLASH);
      r.keyRelease(KeyEvent.VK_SLASH);
      r.keyPress(KeyEvent.VK_A);
      r.keyRelease(KeyEvent.VK_A);
      r.keyRelease(KeyEvent.VK_A);
      r.keyRelease(KeyEvent.VK_A);
      r.keyPress(KeyEvent.VK_H);
      r.keyRelease(KeyEvent.VK_H);
      r.keyPress(KeyEvent.VK_I);
      r.keyRelease(KeyEvent.VK_I);
      r.keyPress(KeyEvent.VK_N);
      r.keyRelease(KeyEvent.VK_N);
      r.keyPress(KeyEvent.VK_A);
      r.keyRelease(KeyEvent.VK_A);
      r.keyPress(KeyEvent.VK_SLASH);
      r.keyRelease(KeyEvent.VK_SLASH);
      r.keyPress(KeyEvent.VK_A);
      r.keyRelease(KeyEvent.VK_A);
      r.keyPress(KeyEvent.VK_D);
      r.keyRelease(KeyEvent.VK_A);
      r.keyRelease(KeyEvent.VK_A);
      r.keyRelease(KeyEvent.VK_D);
      r.keyPress(KeyEvent.VK_O);
      r.keyRelease(KeyEvent.VK_O);
      r.keyPress(KeyEvent.VK_C);
      r.keyRelease(KeyEvent.VK_C);
      r.keyPress(KeyEvent.VK_U);
      r.keyRelease(KeyEvent.VK_U);
      r.keyPress(KeyEvent.VK_M);
      r.keyRelease(KeyEvent.VK_M);
      r.keyPress(KeyEvent.VK_E);
      r.keyRelease(KeyEvent.VK_E);
      r.keyPress(KeyEvent.VK_N);
      r.keyRelease(KeyEvent.VK_N);
      r.keyPress(KeyEvent.VK_T);
      r.keyRelease(KeyEvent.VK_T);
      r.keyPress(KeyEvent.VK_S);
      r.keyRelease(KeyEvent.VK_S);
      
      
      
      
	 /* 
	 WebElement w1= driver.findElement(By.xpath("//div[@class ='start-upload-button uploader-overlay-visible']"));
	 WebElement w3=  driver.findElement(By.xpath("//div[@id='upload-prompt-box']//div//input"));
	 act.moveToElement(w1).sendKeys(w1,"/Users/hina/Documents/api/LearnSelenium/20190928_182226.mp4").build()
	 .perform();
	

	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	// w1.sendKeys("/Users/hina/Documents/api/LearnSelenium/20190928_182226.mp4");
	 // JavaScriptExecutor js = (JavaScriptExecutor)driver;
	 
	// driver.findElement(By.xpath("//div[@id='upload-prompt-box']//div//input")).click();
	  // js.executeScript("arguments[0].click();", w3);
	  //sdriver.quit();
	//Robot r = new Robot();
	//r.keyPress(KeyEvent.VK_ctl);
	 /*r.mouseMove(630, 420); // move mouse point to specific location	
     r.delay(1500);
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_RIGHT);
	 r.keyPress(KeyEvent.VK_DOWN);
	 r.keyPress(KeyEvent.VK_RIGHT);
	 r.keyPress(KeyEvent.KEY_LAST);
	 r.keyPress(KeyEvent.KEY_LAST);
	 */
	// driver.findElement(By.xpath("//span[contains(text(),'Publish')]")).click();
	// String t = driver.findElement(By.xpath(xpathExpression))
  }
}
