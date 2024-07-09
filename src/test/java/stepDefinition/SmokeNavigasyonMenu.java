package stepDefinition;

import baseClass.BaseClass;

import com.github.dockerjava.api.model.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pageObjekts.TS2_GL.GeC_Bewerber;
import propertyReader.PropertyReaders;

public class SmokeNavigasyonMenu  extends BaseClass {

    GeC_Bewerber bewerber = new GeC_Bewerber();


    @When("Ich sehe auf der GeC_Besetzungskarte Seite Einstellungen")
    public void ichSeheAufDerGeC_BesetzungskarteSeiteEinstellungen() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(bewerber.lEinstellungen));
        click(bewerber.fußLeisteButtons("Schließen"));

    }



    @And("Ich klicke auf der Zurücknavigation Button")
    public void ichKlickeAufDerZurücknavigationButton() {
        sleep(1000);
        click(bewerber.lBezirkbesetzungzuruckbutton);
    }
    @And("Ich klicke auf der Dokumente Zurücknavigation Button")
    public void ichKlickeAufDerDokumenteZurücknavigationButton() {
        sleep(2000);
        click(bewerber.lDokumentezuruckbuton);
    }

    @And("Ich klicke Bezirkbesetzung zurück Button")
    public void ichKlickeBezirkbesetzungZurückButton() {
        sleep(2000);
        click(bewerber.lZurückbezirkbesetzung);
    }

    @Then("Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske MeP")
    public void ichSeheAufDerLinkenSeiteDieDropdownMenüsUnterDerMaskeMeP() {
        wait.until(ExpectedConditions.elementToBeClickable(bewerber.navigationSubMenus("Mitarbeiter")));
    }

    @Then("Ich sehe auf der Seite Mitarbeiter")
    public void ichSeheAufDerSeiteMitarbeiter() {
        sleep(1000);
        Assert.assertTrue(driver.getPageSource().contains("Mitarbeiter"));

    }

    @Then("Ich sehe auf der Seite News")
    public void ichSeheAufDerSeiteNews() {
        sleep(1000);
        Assert.assertTrue(driver.getPageSource().contains("News"));
    }

    @And("Ich klicke Bezirke zurück Button")
    public void ichKlickeBezirkeZurückButton() {
     sleep(1000);
     click(bewerber.lZiPBezirkezuruckbutton);

    }

    @Then("Ich sehe auf der Seite Bezirke")
    public void ichSeheAufDerSeiteBezirke() {
        sleep(1000);
        Assert.assertTrue(driver.getPageSource().contains("Bezirke"));

    }

    @When("Ich sehe auf der ZiP_Interakive Karte Seite Bestätigen")
    public void ichSeheAufDerZiP_InterakiveKarteSeiteBestätigen() {
       sleep(1000);
        click(bewerber.fußLeisteButtons("Bestätigen"));



    }


    @Then("Ich sehe auf der Seite System")
    public void ichSeheAufDerSeiteSystem() {
        sleep(1000);
        Assert.assertTrue(driver.getPageSource().contains("System"));
    }
}
