package stepDefinition;

import driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.*;

public class Hooks {

    @Before
    public void setup() {
        Driver.getDriver();
        Driver.getWait();
    }

    @After(order = 0)
    public void after() {
        Driver.closeDriver();
    }

    @After(order = 1)
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshoot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshoot, "image/png", scenario.getName());
        }
    }
}
