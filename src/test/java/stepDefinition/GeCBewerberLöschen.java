package stepDefinition;

import baseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjekts.TS2_GL.GeC_Bewerber;
import propertyReader.PropertyReaders;

import java.util.List;


public class GeCBewerberLöschen extends BaseClass {

    GeC_Bewerber bewerber = new GeC_Bewerber();

    @And("Ich klicke das Häkchen neben dem Bewerber an, um ihn auszuwählen")
    public void ichKlickeDasHäkchenNebenDemBewerberAnUmIhnAuszuwählen() {
        sleep(400);
        click(bewerber.lCheckboxButtonFürBewerberAuswählen);
    }

    @Then("Ich sehe auf der Seite eine Minute die Meldung, dass die Löschung erfolgreich war")
    public void ichSeheAufDerSeiteEineMinuteDieMeldungDassDieLöschungErfolgreichWar() {
        waitForVisibilty(bewerber.lMessageFensterNachdemLöschen);
    }


    @When("Ich lösche die von mir angelegte Mitarbeiter")
    public void ichLöscheDieVonMirAngelegteMitarbeiter() {
        sleep(1000);
        List<WebElement> elements = driver.findElements(By.xpath(PropertyReaders.read("GeC_Bewerber").get("BewerberMaskeAllBewerberCheckbox")));
        click(elements.get(0));

    }
}
