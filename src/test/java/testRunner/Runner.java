package testRunner;

import org.junit.runner.RunWith;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@ExtendedCucumberOptions(   jsonReport = "target/81/cucumber.json",
jsonUsageReport = "target/81/cucumber-usage.json",
usageReport = true,
detailedReport = true,
detailedAggregatedReport = true,
overviewReport = true,
overviewChartsReport = true,
pdfPageSize = "A4 Landscape",
toPDF = true,
outputFolder = "target/81",
retryCount = 3)
@RunWith(Cucumber.class)
@CucumberOptions(
                    monochrome = true,
                    plugin = {
                           "pretty",
                           "html:target/cucumber",
                           "json:target/cucumber/cucumber.json"
                             },
                     features = "src/test/resources/features/",
                     glue ="stepDefinition"
                )
public class Runner {
}

