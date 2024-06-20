package stepDefinition;

import baseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjekts.TS2_GL.GeC_Bewerber;
import propertyReader.PropertyReaders;

import java.util.List;

public class GeCBewerberFiltern extends BaseClass {

    GeC_Bewerber bewerber = new GeC_Bewerber();
    List<WebElement> vorBewerberListe;

    @Then("Ich sehe auf der GeC_Bewerber Seite {string}")
    public void ichSeheAufDerSeite(String text) {
        sleep(1000);
        waitForVisibilty(By.xpath(PropertyReaders.read("GeC_Bewerber").get("BewerberMaskeAllBewerberListe")));
        vorBewerberListe = driver.findElements(By.xpath(PropertyReaders.read("GeC_Bewerber").get("BewerberMaskeAllBewerberListe")));
        WebElement element = driver.findElement(By.xpath(PropertyReaders.read("GeC_Bewerber").get(text)));
        waitForVisibilty(element);
    }

    @When("Ich klicke auf der Seite GeC_Bewerber auf den Button {string}")
    public void ichKlickeAufDerSeiteGeC_BewerberAufDenButton(String text) {
        WebElement element = driver.findElement(By.xpath(PropertyReaders.read("GeC_Bewerber").get(text)));
        click(element);
    }

    @And("Ich klicke auf das Checkbox TZU")
    public void ichKlickeAufDasCheckboxTZ() {
        List<WebElement> elements = driver.findElements(By.xpath(PropertyReaders.read("GeC_Bewerber").get("FilternCheckBoxAllListe")));
        waitForVisibilty(elements.get(1));
        click(elements.get(2));
        sleep(1000);
        click(bewerber.fußLeisteButtons("Ok"));
    }

    @Then("Ich überprüfe ob sich in der Bewerberliste etwas ändert")
    public void ichÜberprüfeObSichInDerBewerberlisteEtwasÄndert() {
        sleep(1000);
        List<WebElement> nachBewerberliste = driver.findElements(By.xpath(PropertyReaders.read("GeC_Bewerber").get("BewerberMaskeAllBewerberListe")));
        Assert.assertNotEquals(vorBewerberListe,nachBewerberliste);
    }

    @And("Ich klicke auf das Checkbox LWP Münsterland GmbH")
    public void ichKlickeAufDasCheckboxLWPMünsterlandGmbH() {
        List<WebElement> elements = driver.findElements(By.xpath(PropertyReaders.read("GeC_Bewerber").get("FilternCheckBoxAllListe")));
        waitForVisibilty(elements.get(1));
        hoverOverByAction(elements.get(24));
        click(elements.get(24));
        sleep(1000);
        click(bewerber.fußLeisteButtons("Ok"));
    }
}
