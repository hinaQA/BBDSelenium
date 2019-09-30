package cucumber;


import pageModel.GmailLoginPage;
import util.Auth;

public class TestContext {

	private ScenarioContext scenarioContext;
	private Auth auth;

    public TestContext()
    {
        scenarioContext = new ScenarioContext();
        auth = new Auth();

    }

    public ScenarioContext getScenarioContext()
    {
        return scenarioContext;
    }
    
    public Auth getAuth()
    {
    	return auth;
    }
}
