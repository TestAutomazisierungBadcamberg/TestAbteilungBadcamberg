package stepDefinition;

import baseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pageObjekts.TS2_GL.GeC_Bewerber;
import propertyReader.PropertyReaders;

import java.util.List;

public class GeCBewerberÄndern extends BaseClass {

    GeC_Bewerber bewerber = new GeC_Bewerber();

    @And("Ich schreibe in das Suchfeld den gewünschten Bewerber, den ich ändern möchte")
    public void ichSchreibeInDasSuchfeldDenGewünschtenBewerberDenIchÄndernMöchte() {
        sendKeys(bewerber.lBewerberMaskeSuchbuttonTextFeld, System.getProperty("name"));
    }

    @And("Ich klicke auf der Button OK, nachdem ich in das Feld Suche die gewünschten Bewerber eingegeben habe")
    public void ichKlickeAufDerButtonOKNachdemIchInDasFeldSucheDieGewünschtenBewerberEingegebenHabe() {
        click(bewerber.fußLeisteButtons("Ok"));
    }

    @And("Ich klicke auf den Bewerber")
    public void ichKlickeAufDenBewerber() {
        click(bewerber.lBewerberMaskeAllBewerberListe);
    }

    @Then("Ich sehe auf der Seite unter der Button {string}")
    public void ichSeheAufDerSeiteUnterDerButton(String text) {
        waitForVisibilty(bewerber.fußLeisteButtons(text));
    }

    @And("Ich klicke auf der Seite der Button {string}")
    public void ichKlickeAufDerSeiteUnterDerButton(String text) {
        sleep(1000);
        click(bewerber.fußLeisteButtons(text));
        sleep(500);
    }

    @Then("Ich sehe die von mir geänderte Bewerber")
    public void ichSeheDieVonMirGeänderteBewerber() {
        sleep(1000);
        click(bewerber.bewerberFußLeisteButton("Suchen"));
        click(bewerber.lSuchFeldZürecksetzenButton);
        click(bewerber.lBewerberMaskeSuchfeldOkButton);
        Assert.assertTrue(driver.getPageSource().contains(System.getProperty("name")));
        sleep(1000);
    }

    @And("Ich ändere die Daten der angelegten Bewerber")
    public void ichÄndereDieDatenDerAngelegtenBewerber() {
        bewerber.angelegteBewerberÄndern();
    }



    @When("Ich wahle Zusage von Ergebnis Menu")
    public void ichWahleZusageVonErgebnisMenu() {

        click(bewerber.lErgebnisDropDown);
        wait.until(ExpectedConditions.elementToBeClickable(bewerber.ErgebnisDropDown("5")));
        waitForVisibilty(bewerber.lStatusErledigt);
        click(bewerber.lErgebnisZusage);
        sleep(3000);
        Assert.assertTrue(driver.getPageSource().contains("Zusage"));
    }

    @When("Ich wahle warteliste von Ergebnis Menu")
    public void ichWartelisteVonErgebnisMenu() {
        click(bewerber.lErgebnisDropDown);
        wait.until(ExpectedConditions.elementToBeClickable(bewerber.ErgebnisDropDown("3")));
        waitForVisibilty(bewerber.lStatusInBearbeitung);
        click(bewerber.lErgebnisWarteliste);
        sleep(2000);
        Assert.assertTrue(driver.getPageSource().contains("In Bearbeitung"));
    }


    @And("Ich klicke auf der Zurück-navigieren Button")
    public void ichKlickeAufDerZurückNavigierenButton() {
        click(bewerber.lZurücknavigieren);
    }

    @And("Ich klicke auf der Button Doughnuts dropdown Button")
    public void ichKlickeAufDerButtonDoughnutsDropdownButton() {
        click(bewerber.fußLeisteButtons("Doughnuts"));
        click(bewerber.lDoughnutsWarteliste);
        sleep(1000);
        click(bewerber.fußLeisteButtons("Doughnuts"));
        click(bewerber.lDoughnutsHerkunft);
        sleep(1000);
        Assert.assertTrue(driver.getPageSource().contains("Bewerber Statistik"));

    }

    @Then("Ich sehe auf der Bewerbermaske den Reiter {string}")
    public void ichSeheAufDerBewerbermaskeDenReiter(String text) {
        waitForVisibilty(bewerber.navigationGeCSubmenuReiter(text));
    }

    @When("Ich klicke auf der Bewerbermaske den Reiter {string}")
    public void ichKlickeAufDerBewerbermaskeDenReiter(String text) {
        click(bewerber.navigationGeCSubmenuReiter(text));
    }

    @And("Ich wahle auf der Liste Tageszeitung")
    public void ichWahleAufDerListeTageszeitung() {
        List<WebElement> elements = driver.findElements(By.xpath(PropertyReaders.read("GeC_Bewerber").get("VerfugbarFurLieferundeAllList")));
        click(elements.get(0));
    }

    @When("Ich wahle ein Projekt aus")
    public void ichWahleEinProjektAus() {
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("BezirkszuweisungProjekt")));
    }


    @And("Ich klicke Bezirksbesetzung zurück Button")
    public void ichKlickeBezirksbesetzungZurückButton() {
        click(bewerber.lZurückbezirkbesetzung);
    }
}







