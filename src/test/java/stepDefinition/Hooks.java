package stepDefinition;



import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	  TestContext testContext;

	    public Hooks(TestContext context)
	    {
	        testContext=context;
	    }

	    @Before
	    public void beforeScenario()
	    {
	          testContext.getAuth().openbrowser();
	          testContext.getAuth().opensite();
	    }

	    @After
	    public void afterScenario()
	    {
	       testContext.getAuth().closebrowser();
	    }

}
