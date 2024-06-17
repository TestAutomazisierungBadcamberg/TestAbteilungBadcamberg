package stepDefinition;

import baseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjekts.TS2_GL.GeC_Bewerber;


public class GeCBewerberLöschen extends BaseClass {

    GeC_Bewerber bewerber = new GeC_Bewerber();

    @And("Ich klicke das Häkchen neben dem Bewerber an, um ihn auszuwählen")
    public void ichKlickeDasHäkchenNebenDemBewerberAnUmIhnAuszuwählen() {
        click(bewerber.lCheckboxButtonFürBewerberAuswählen);
    }

    @Then("Ich sehe auf der Seite eine Minute die Meldung, dass die Löschung erfolgreich war")
    public void ichSeheAufDerSeiteEineMinuteDieMeldungDassDieLöschungErfolgreichWar() {
        waitForVisibilty(bewerber.lMessageFensterNachdemLöschen);
    }


}
