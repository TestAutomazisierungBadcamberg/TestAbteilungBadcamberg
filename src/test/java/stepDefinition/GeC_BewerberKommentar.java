package stepDefinition;

import baseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjekts.TS2_GL.GeC_Bewerber;
import propertyReader.PropertyReaders;

import java.util.List;

public class GeC_BewerberKommentar extends BaseClass {

    GeC_Bewerber bewerber = new GeC_Bewerber();
    @When("Ich lösche einen Kommentar")
    public void ichLöscheEinenKommentar() {
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("ReiterKommentarInDemStehtKommentare")));
        click(bewerber.fußLeisteButtons("Löschen"));
        sleep(1000);
        List<WebElement> löschen =driver.findElements(bewerber.fußLeisteButtons("Löschen"));
        click(löschen.get(1));
    }

    @When("Ich schreibe einen Kommentar")
    public void ichSchreibeEinenKommentar() {
        sendKeys(By.xpath(PropertyReaders.read("GeC_Bewerber").get("KommentarTextArea")),"engin Sabris ag");
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("KommentarAbschickenButton")));
    }

    @When("Ich klicke auf den Reiter {string}")
    public void ichKlickeAufDenReiter(String text) {
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get(text)));

    }

    @When("Ich ändere einen Kommentar")
    public void ichÄndereEinenKommentar() {
        List<WebElement> elements = driver.findElements(By.xpath(PropertyReaders.read("GeC_Bewerber").get("ReiterKommentarInDemStehtKommentare")));
        waitForVisibilty(elements.get(0));
        click(elements.get(0));
        sendKeys(By.xpath(PropertyReaders.read("GeC_Bewerber").get("KommentarTextAreaAndern")),"Ich ändere die Kommentar");
        click(bewerber.fußLeisteButtons("Speichern"));
        sleep(1000);

    }


}

