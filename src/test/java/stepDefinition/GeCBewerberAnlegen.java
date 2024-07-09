package stepDefinition;

import baseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pageObjekts.TS2_GL.GeC_Bewerber;
import propertyReader.PropertyReaders;

import java.util.Set;

public class GeCBewerberAnlegen extends BaseClass {

    GeC_Bewerber bewerber = new GeC_Bewerber();


    @Given("Ich melde mich als GL {string}")
    public void ichMeldeMichAlsGL(String testSystem) {
        driver.get(PropertyReaders.read().get(testSystem));
        sleep(2000);
        if (!driver.findElements(bewerber.lAnmeldenButtonAnmeldungsSeite).isEmpty())
            click(bewerber.lAnmeldenButtonAnmeldungsSeite);
        click(bewerber.lAkzeptieren);
        if (!driver.findElements(bewerber.lAnmeldenButtonAnmeldungsSeite).isEmpty())
            click(bewerber.lAnmeldenButtonAnmeldungsSeite);
        wait.until(ExpectedConditions.elementToBeClickable(bewerber.lBenutzername));
        sendKeys(bewerber.lBenutzername, PropertyReaders.read().get("userName_TS2_GL"));
        if (testSystem.equals("url_TS1_GL"))
            sendKeys(bewerber.lPasswort, PropertyReaders.read().get("passwort_TS1_GL"));
        else
            sendKeys(bewerber.lPasswort, PropertyReaders.read().get("passwort_TS2_GL"));
        click(bewerber.lLogin);
        sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(bewerber.lDashboardKachels));
    }


    @Then("Ich sehe auf der Seite Dashboard")
    public void ichSeheAufDerSeiteDashboard() {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan((bewerber.lDashboardKachels), 10));
    }

    @And("Ich klicke auf der linken Seite der MasterPage auf der Button {string}")
    public void ichKlickeAufDerLinkenSeiteDerMasterPageAufDerButton(String maskeName) {
        click(bewerber.navigationMenus(maskeName));
    }

    @Then("Ich sehe auf der linken Seite die Dropdown-Menüs unter der Maske GeC")
    public void ichSeheAufDerLinkenSeiteDieDropdownMenüsUnterDerMaskeGeC() {
        wait.until(ExpectedConditions.elementToBeClickable(bewerber.navigationSubMenus("Bewerber")));

    }

    @And("Ich klicke auf die Drop-Down-Menüs der Schaltfläche {string}")
    public void ichKlickeAufDieDropDownMenüsDerSchaltfläche(String menu) {

        click(bewerber.navigationSubMenus(menu));
        takeScreenShot("1");

        }

    @Then("Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche {string}")
    public void ichSeheUntenAufDerSeiteInDerFußzeileDieSchaltfläche(String title) {
        wait.until(ExpectedConditions.elementToBeClickable(bewerber.bewerberFußLeisteButton(title)));
    }

    @And("Ich klicke die Schaltfläche {string}")
    public void ichKlickeDieSchaltfläche(String title) {
        click(bewerber.bewerberFußLeisteButton(title));


    }

    @And("Ich klicke auf die geöffnete Button Bewerber")
    public void ichKlickeAufDieGeöffneteButtonBewerber() {
        click(bewerber.lNeueBewerberAnlegenFensterBewerber);
    }


    @And("Ich fülle den Reiter Person aus")
    public void ichFülleDenReiterPersonAus() {
        bewerber.neueBewerberAnlegen();
    }

    @Then("Ich sehe die von mir angelegte Bewerber")
    public void ichSeheDieVonMirAngelegteBewerber() {
        sleep(2000);
        Assert.assertTrue(driver.getPageSource().contains("Müller"));
    }

    @And("Ich klicke auf die geöffnete Button Mitarbeiter")
    public void ichKlickeAufDieGeöffneteButtonMitarbeiter() {
        click(bewerber.lNeueBewerberAnlegenFensterMitarbeiter);
    }

    @And("Ich fülle den Reiter Person für Mitarbeiter aus")
    public void ichFülleDenReiterPersonFürMitarbeiterAus() {
        bewerber.neueMitarbeiterAnlegen();
    }



}
