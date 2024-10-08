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

        List<WebElement> elements = driver.findElements(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtenCheckBoxes")));
        for (WebElement element : elements) {
            click(element);
            sleep(200);
        }

        betriff = generateRandomString("Nahricht",6);
        sendKeys(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtenInputBetreff")),betriff);
        nachricht = generateRandomString("Nahricht",8);
        sendKeys(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtInputText")),nachricht);
        click(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtButtonEmpfeunger")));
        click(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtButtonEmpfeungerZusteller")));
        sleep(200);
        click(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtButtonEmpfeungerZustellerWeuhlen")));
        sendKeys(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtButtonEmpfeungerZustellerSuchfeld")),"alioglu, umit");
        click(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtSuchbutton")));
        click(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtButtonEmpfeungerAusgeweuhlteZusteller")));
        click(bewerber.fußLeisteButtons("Auswählen"));
        System.setProperty("betriff",betriff);
    }

    @When("Ich schreibe in das Suchfeld den von GL ausgegebenen Betreff")
    public void ichSchreibeInDasSuchfeldDenVonGLAusgegebenenBetreff() {
        String nachricht = System.getProperty("betriff");
        sendKeys(bewerber.lBewerberMaskeSuchbuttonTextFeld, nachricht);
        sleep(300);
    }

    @And("Ich fülle alle Felder für alle Gesellschaften aus, um eine Nachricht zu erstellen")
    public void ichFülleAlleFelderFürAlleGesellschaftenAusUmEineNachrichtZuErstellen() {
        List<WebElement> elements = driver.findElements(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtenCheckBoxes")));
        for (WebElement element : elements) {
            sleep(300);
            click(element);
        }

        betriff = generateRandomString("Nahricht",6);
        sendKeys(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtenInputBetreff")),betriff);
        nachricht = generateRandomString("Nahricht",8);
        sendKeys(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtInputText")),nachricht);
        click(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtButtonEmpfeunger")));
        click(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtButtonEmpfeungerGesellschaft")));
        sleep(200);
        click(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtButtonEmpfeungerZustellerWeuhlen")));
        click(By.xpath(PropertyReaders.read(ZiP_Alle_Maske).get("GesellschaftAlle")));
        click(bewerber.fußLeisteButtons("Auswählen"));
        System.setProperty("betriff",betriff);

    }

    @Then("Ich sehe auf der ZiP Seite {string}")
    public void ichSeheAufDerZiPSeite(String text) {
        waitForVisibilty(By.xpath(PropertyReaders.read(ZiP_Alle_Maske).get(text)));
    }

    @When("Ich klicke auf der ZiP Seite {string}")
    public void ichKlickeAufDerZiPSeite(String text) {
        sleep(1000);
        click(By.xpath(PropertyReaders.read(ZiP_Alle_Maske).get(text)));
    }

    @When("Ich scrolle nach unten und nach oben")
    public void ichScrolleNachUntenUndNachOben() {
        List<WebElement> elements = driver.findElements(By.xpath(PropertyReaders.read(ZiP_Alle_Maske).get("NachrichtenPosteingangAlleEintrage")));
        if (!elements.isEmpty()) {
            scrollElement(elements.get(elements.size() - 1));
            sleep(1000);
            elements = driver.findElements(By.xpath(PropertyReaders.read(ZiP_Alle_Maske).get("NachrichtenPosteingangAlleEintrage")));

            scrollElement(elements.get(0));
            sleep(1000);
        } else {
            System.out.println("keinen Element gefunden");
        }
    }

    @And("Ich sende eine Nachricht")
    public void ichSendeEineNachricht() {
        click(bewerber.fußLeisteButtons("Nachricht senden"));
    }

    @Then("Ich prüfe, ob die Nachricht angezeigt wird")
    public void ichPrüfeObDieNachrichtAngezeigtWird() {
        String text = driver.findElements(bewerber.fußLeisteButtons(System.getProperty("betriff"))).get(0).getText();
        Assert.assertEquals(System.getProperty("betriff"),text);
        sleep(800);
    }

    @When("Ich klicke auf die Checkbox auf der ZiP-Seite")
    public void ichKlickeAufDieCheckboxAufDerZiPSeite() {
        click(By.xpath(PropertyReaders.read(ZiP_Alle_Maske).get("NachrichtenCheckbox")));
    }

    @When("Ich klicke auf die Nachrichten")
    public void ichKlickeAufDieNachrichten() {
        click(bewerber.fußLeisteButtons(System.getProperty("betriff")));
    }

    @And("Ich fülle alle Felder für  einen der ausgewählten Gebietsleiter aus, um eine Nachricht zu erstellen")
    public void ichFülleAlleFelderFürEinenDerAusgewähltenGebietsleiterAusUmEineNachrichtZuErstellen() {
        List<WebElement> elements = driver.findElements(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtenCheckBoxes")));
        for (WebElement element : elements) {
            click(element);
            sleep(200);
        }

        betriff = generateRandomString("Nahricht",6);
        sendKeys(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtenInputBetreff")),betriff);
        nachricht = generateRandomString("Nahricht",8);
        sendKeys(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtInputText")),nachricht);
        click(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtButtonEmpfeunger")));
        click(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtButtonEmpfeungerGebietsleiter")));
        sleep(200);
        click(By.xpath(PropertyReaders.read(GeC_Bewerber).get("ZustellersichtNachrichtButtonEmpfeungerZustellerWeuhlen")));
        sendKeys(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtButtonEmpfeungerZustellerSuchfeld")),"Hereser, Engin");
        click(By.xpath(PropertyReaders.read(GeC_Bewerber).get("NachrichtSuchbutton")));
        click(By.xpath(PropertyReaders.read(GeC_Bewerber).get("ZustellerNachrichtButtonEmpfeungerAusgeweuhlteZusteller")));
        click(bewerber.fußLeisteButtons("Auswählen"));
        System.setProperty("betriff",betriff);
    }

    @When("Ich schreibe in das Suchfeld den von Zusteller ausgegebenen Betreff")
    public void ichSchreibeInDasSuchfeldDenVonZustellerAusgegebenenBetreff() {
        String nachricht = System.getProperty("betriff");
        sendKeys(bewerber.lBewerberMaskeSuchbuttonTextFeldUnten, nachricht);
        sleep(300);
    }
}
