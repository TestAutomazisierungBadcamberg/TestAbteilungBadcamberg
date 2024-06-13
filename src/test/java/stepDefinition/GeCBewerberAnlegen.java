package stepDefinition;

import baseClass.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjekts.TS2_GL.GeC_Bewerber;
import propertyReader.PropertyReaders;

import java.util.List;
import java.util.Map;

public class GeCBewerberAnlegen extends BaseClass {

    GeC_Bewerber bewerber = new GeC_Bewerber();


    @Given("Ich melde mich als GL {string}")
    public void ichMeldeMichAlsGL(String testSystem) {
        driver.get(PropertyReaders.read().get(testSystem));
        driver.navigate().refresh();
        sleep(1000);
        if (!driver.findElements(bewerber.lAnmeldenButtonAnmeldungsZeite).isEmpty())
            click(bewerber.lAnmeldenButtonAnmeldungsZeite);
        click(bewerber.lAkzeptieren);
        if (!driver.findElements(bewerber.lAnmeldenButtonAnmeldungsZeite).isEmpty())
            click(bewerber.lAnmeldenButtonAnmeldungsZeite);
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
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan((bewerber.lDashboardKachels),15));
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
    }

    @Then("Ich sehe unten auf der Seite in der Fußzeile die Schaltfläche {string}")
    public void ichSeheUntenAufDerSeiteInDerFußzeileDieSchaltfläche(String title) {
        wait.until(ExpectedConditions.elementToBeClickable(bewerber.bewerberFußListeButton(title)));
    }

    @And("Ich klicke die Schaltfläche {string}")
    public void ichKlickeDieSchaltfläche(String title) {
        click(bewerber.bewerberFußListeButton(title));
    }

    @And("Ich klicke auf die geöffnete Button Bewerber")
    public void ichKlickeAufDieGeöffneteButtonBewerber() {
        click(bewerber.lGeC_Bewerber_Anlegen_Bewerber);
    }


    @And("Ich fülle den Reiter Person aus")
    public void ichFülleDenReiterPersonAus(DataTable table) {

        List<Map<String, String>> maps = table.asMaps(String.class, String.class);
        List<WebElement> elements = driver.findElements(bewerber.lReiterPersonAlleButtons);
        click(bewerber.lReiterPersonAnrede);
        click(bewerber.lReiterPersonAnredeHerr);
        for (Map<String, String> map : maps) {
            for (int i = 1; i < 14; i++) {
                String feld = map.get("Felder");
                String status = map.get("Status");

                if ("true".equals(status)) {
                    waitForVisibilty(bewerber.lReiterPersonName);
                    elements.get(i).click();
                    elements.get(i).clear();
                    elements.get(i).sendKeys(map.get("Felder"), Keys.TAB);
                    sleep(300);

                } else if ("false".equals(status)) {
                    actionsClassTab();
                    sleep(300);
                }
            }
        }
    }
}
