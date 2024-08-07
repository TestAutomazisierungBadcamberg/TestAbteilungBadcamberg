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

public class ZiPNachricten extends BaseClass {
    GeC_Bewerber bewerber = new GeC_Bewerber();
    String betriff;
    String nachricht;

    @And("Ich fülle alle Felder für den Zusteller aus, um eine Nachricht zu erstellen")
    public void ichFülleAlleFelderAusUmEineNachrichtZuErstellen() {

        List<WebElement> elements = driver.findElements(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NachrichtenCheckBoxes")));
        for (WebElement element : elements) {
            click(element);
            sleep(200);
        }

        betriff = generateRandomString("Nahricht",6);
        sendKeys(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NachrichtenInputBetreff")),betriff);
        nachricht = generateRandomString("Nahricht",8);
        sendKeys(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NachrichtInputText")),nachricht);
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NachrichtButtonEmpfeunger")));
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NachrichtButtonEmpfeungerZusteller")));
        sleep(200);
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NachrichtButtonEmpfeungerZustellerWeuhlen")));
        sendKeys(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NachrichtButtonEmpfeungerZustellerSuchfeld")),"alioglu, umit");
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NachrichtSuchbutton")));
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NachrichtButtonEmpfeungerAusgeweuhlteZusteller")));
        click(bewerber.fußLeisteButtons("Auswählen"));
        click(bewerber.fußLeisteButtons("Nachricht senden"));
        System.setProperty("betriff",betriff);

    }

    @When("Ich schreibe in das Suchfeld den von GL ausgegebenen Betreff")
    public void ichSchreibeInDasSuchfeldDenVonGLAusgegebenenBetreff() {
        String nachricht = System.getProperty("betriff");
        sendKeys(bewerber.lBewerberMaskeSuchbuttonTextFeld, nachricht);
        click(bewerber.fußLeisteButtons("Ok"));
        sleep(300);
        String text = driver.findElement(bewerber.fußLeisteButtons(nachricht)).getText();
        Assert.assertEquals(nachricht,text);
        sleep(800);
    }

    @And("Ich fülle alle Felder für alle Gesellschaften aus, um eine Nachricht zu erstellen")
    public void ichFülleAlleFelderFürAlleGesellschaftenAusUmEineNachrichtZuErstellen() {
        List<WebElement> elements = driver.findElements(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NachrichtenCheckBoxes")));
        for (WebElement element : elements) {
            click(element);
            sleep(200);
        }

        betriff = generateRandomString("Nahricht",6);
        sendKeys(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NachrichtenInputBetreff")),betriff);
        nachricht = generateRandomString("Nahricht",8);
        sendKeys(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NachrichtInputText")),nachricht);
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NachrichtButtonEmpfeunger")));
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NachrichtButtonEmpfeungerGesellschaft")));
        sleep(200);
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("NachrichtButtonEmpfeungerZustellerWeuhlen")));
        click(By.xpath(PropertyReaders.read("Zip_Alle_Maske").get("GesellschaftAlle")));
        click(bewerber.fußLeisteButtons("Auswählen"));
        click(bewerber.fußLeisteButtons("Nachricht senden"));
        System.setProperty("betriff",betriff);
    }

    @Then("Ich sehe auf der ZiP Seite {string}")
    public void ichSeheAufDerZiPSeite(String text) {
        waitForVisibilty(By.xpath(PropertyReaders.read("ZiP_Alle_Maske").get(text)));
    }

    @When("Ich klicke auf der ZiP Seite {string}")
    public void ichKlickeAufDerZiPSeite(String text) {
        click(By.xpath(PropertyReaders.read("ZiP_Alle_Maske").get(text)));
    }
}
