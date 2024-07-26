package stepDefinition;

import baseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjekts.TS2_GL.GeC_Bewerber;

public class GeC_BewerberVorlagen extends BaseClass {

    GeC_Bewerber bewerber = new GeC_Bewerber();


    @When("Ich suche den Empfeanger durch Dropdownmenu aus")
    public void ichSucheDenEmpfeangerDurchDropdownmenuAus() {
        bewerber.vorlagenEmpfeangerDropdownMenuAussuchen();
    }

    @And("Ich suche den Empfeanger durch freie Eingabe aus")
    public void ichSucheDenEmpfeangerDurchFreieEingabeAus() {
        bewerber.vorlagenEmpfeangerFreieEingabeAussuchen();
    }


}
