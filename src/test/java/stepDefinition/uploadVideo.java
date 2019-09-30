package stepDefinition;

import cucumber.TestContext;
import cucumber.api.java.en.*;
import util.SeleniumUtil;

public class uploadVideo
{
	//private WebDriver driver;
    TestContext testContext;

    public uploadVideo(TestContext context)
    {
        testContext = context;
    }
    
    @Given("^Login using gmail account$")
    public void login_using_gmail_account() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	SeleniumUtil.loginInToGmail(testContext);
    }

    @When("^Go to upload video section$")
    public void go_to_upload_video_section() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	testContext.getAuth().implictWait();
    	testContext.getAuth().getYouTubePage().clickOnCreate();
    	testContext.getAuth().getYouTubePage().clickOnUploadVideo();
        
    }

    @When("^Upload a video$")
    public void upload_a_video() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	testContext.getAuth().implictWait();
    	testContext.getAuth().getYouTubePage().clickOnUploadFile();
        
    }

    @Then("^Verify that video is uploaded$")
    public void verify_that_video_is_uploaded() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      
    }
    
    
}
