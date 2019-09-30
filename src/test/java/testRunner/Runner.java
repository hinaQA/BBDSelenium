package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
                    monochrome = true,
                    plugin = {
                           "pretty",
                           "html:target/cucumber",
                           "json:target/cucumber/cucumber.json"
                             },
                     features = "src/test/resources/features/",
                     glue ="StepDefinition"
                )
public class Runner {
}

