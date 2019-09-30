package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.TestContext;
import cucumber.api.java.en.*;

public class uploadVideo
{
	private WebDriver driver;
    TestContext testContext;

    public uploadVideo(TestContext context)
    {
        testContext = context;
    }
    
    @Given("^Login using gmail account$")
    public void login_using_gmail_account() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	
    	testContext.getAuth().openbrowser();
        testContext.getAuth().opensite();
    }

    @When("^Go to upload video section$")
    public void go_to_upload_video_section() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @When("^Upload a video$")
    public void upload_a_video() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @Then("^Verify that video is uploaded$")
    public void verify_that_video_is_uploaded() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      
    }
    
    
}
