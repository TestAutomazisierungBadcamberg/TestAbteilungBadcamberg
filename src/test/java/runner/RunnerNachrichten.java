package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {
                "src/test/resources/features/GL Sicht/ZiP/Nachrichten/GL_NachrichtSenden.feature",
                "src/test/resources/features/GL Sicht/ZiP/Nachrichten/GL_NachrichtLöschen.feature",
                "src/test/resources/features/GL Sicht/ZiP/Nachrichten/GL_Scrollen.feature",
                "src/test/resources/features/GL Sicht/ZiP/Nachrichten/NachrichtSendenAnZustellerUndPrüfen.feature",
                "src/test/resources/features/GL Sicht/ZiP/Nachrichten/GL_NachrichtSuchen.feature",
                "src/test/resources/features/GL Sicht/ZiP/Nachrichten/GL_ButtonEmpfangsUndLesebesteutigung.feature",
                "src/test/resources/features/GL Sicht/ZiP/Nachrichten/Zustellersicht_NachrichtSenden.feature",
                "src/test/resources/features/GL Sicht/ZiP/Nachrichten/Zustellersicht_ButtonEmpfangsUndLesebesteutigung.feature",
                "src/test/resources/features/GL Sicht/ZiP/Nachrichten/Zustellersicht_NachrichtLöschen.feature",

        },
        glue = {"stepDefinition"},
        plugin = {
                "json:test-output/cucumber-reports/cucumber.json",
                "html:S:\\\\sabris_intern\\\\TestAutomatisierung\\\\cucumberreport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class RunnerNachrichten extends AbstractTestNGCucumberTests {

}
