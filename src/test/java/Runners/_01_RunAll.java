package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = "src/test/java/FeatureFiles/_01_ValidateSummary.feature",
        glue = "StepDefinations",
        plugin= {"pretty","html:target/cucumber-report/_01_RunAllReports.html","json:target/cucumber/cucumber.json"}

)
public class _01_RunAll extends AbstractTestNGCucumberTests {
}
