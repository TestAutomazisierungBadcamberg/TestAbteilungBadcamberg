package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {
                "src/test/resources/features/GL Sicht/SmokeTest/SmokeTestNavigationsMenu.feature",
                "src/test/resources/features/GL Sicht/SmokeTest/SmokeZustellersicht.feature"
        },
        glue = {"stepDefinition"},
        plugin = {
                "json:test-output/cucumber-reports/cucumber.json",
                "html:S:\\\\sabris_intern\\\\TestAutomatisierung\\\\cucumberreport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class RunnerSmoke extends AbstractTestNGCucumberTests {
}
