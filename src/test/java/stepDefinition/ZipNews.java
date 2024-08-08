package stepDefinition;

import baseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjekts.TS2_GL.GeC_Bewerber;
import propertyReader.PropertyReaders;

import java.util.List;

public class ZipNews extends BaseClass {

   GeC_Bewerber bewerber = new GeC_Bewerber();

    @And("Ich klicke auf der ZiP-maske Aktuell")
    public void ichKlickeAufDerZiPMaskeAktuell() {
        waitForVisibilty(bewerber.lAktuellTab);
        click(bewerber.lAktuellTab);

    }

    @And("Ich klicke auf der ZiP-maske Archiv")
    public void ichKlickeAufDerZiPMaskeArchiv() {
        click(bewerber.lArchivTab);
        waitForVisibilty(bewerber. lArchivTab);
    }

    @When("Ich wähle einen Eintrag aus")
    public void ichWähleEinenEintragAus() {
        click(bewerber.lSelectnewsloschen);
        waitForVisibilty(bewerber.lSelectnewsloschen);
    }

    @And("Ich klicke auf der News-dropdown menu")
    public void ichKlickeAufDerNewsDropdownMenu() {
        click(bewerber.lNewsdropdown);
        click(bewerber.lNewsdropdownwahlen);
        click(bewerber.lNewsdropdown);
        click(bewerber.lNewsdropdownwahlen);
    }

    @And("Ich klicke  auf der Gesellschaftenoption Button")
    public void ichKlickeAufDerGesellschaftenoptionButton() {
        click(bewerber.lGesellschaftoption);
        waitForVisibilty(bewerber.lGesellschaftoption);
    }

    @And("Ich klicke auf die Geselschaften auswahlen Button")
    public void ichKlickeAufDieGeselschaftenAuswahlenButton() {
        List<WebElement> elements = driver.findElements(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NewsGeselschaftAllListe")));
        for (WebElement element : elements) {
            click(element);
            sleep(300);
        }
    }

    @When("Ich fülle das Titelfeld aus")
    public void ichFülleDasTitelfeldAus() {
        click(bewerber.lTitel);
        sendKeys(bewerber.lTitel,"text1234");
    }
}
