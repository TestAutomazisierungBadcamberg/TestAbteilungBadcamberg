package stepDefinition;

import baseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjekts.TS2_GL.GeC_Bewerber;

public class SmokeNavigasyonMenu  extends BaseClass {

    GeC_Bewerber bewerber = new GeC_Bewerber();


    @When("Ich sehe auf der GeC_Besetzungskarte Seite Einstellungen")
    public void ichSeheAufDerGeC_BesetzungskarteSeiteEinstellungen() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(bewerber.lEinstellungen));


    }
}
