package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"stepDefinition"},
        tags = "@klickTest",
        plugin = {
                "json:test-output/cucumber-reports/cucumber.json",
                "html:S:\\\\sabris_Dokumentationen\\\\TestAutomatisierung\\\\cucumberreport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class Runner extends AbstractTestNGCucumberTests {
}
