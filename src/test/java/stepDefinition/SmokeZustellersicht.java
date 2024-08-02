package stepDefinition;

import baseClass.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageObjekts.TS2_GL.GeC_Bewerber;
import propertyReader.PropertyReaders;

import java.util.List;
import java.util.Map;

public class SmokeZustellersicht extends BaseClass {
    GeC_Bewerber bewerber = new GeC_Bewerber();

    @Given("Ich melde mich als Zusteller {string}")
    public void ichMeldeMichAlsZusteller(String url) {
        driver.get(PropertyReaders.read().get(url));
        sleep(2000);
        click(bewerber.lAkzeptieren);
        wait.until(ExpectedConditions.elementToBeClickable(bewerber.fußLeisteButtons("Login")));
        click((bewerber.fußLeisteButtons("Login")));
        if (url.equals("url_TS2_Dortmund_Zusteller")) {
            sendKeys(bewerber.lBenutzername, PropertyReaders.read().get("userName_TS2_Dortmund_Zusteller"));
            sendKeys(bewerber.lPasswort, PropertyReaders.read().get("passwort_TS2_Zusteller"));
        } else if (url.equals("url_TS1_Schwabo_Zusteller")) {
            sendKeys(bewerber.lBenutzername, PropertyReaders.read().get("userName_TS1_Schwabo_Zusteller"));
            sendKeys(bewerber.lPasswort, PropertyReaders.read().get("passwort_TS2_Zusteller"));
        } else if (url.equals("url_TS1_Esslingen_Zusteller")) {
            sendKeys(bewerber.lBenutzername, PropertyReaders.read().get("userName_TS1_Esslingen_Zusteller"));
            sendKeys(bewerber.lPasswort, PropertyReaders.read().get("passwort_TS2_Zusteller"));
        } else if (url.equals("url_TS1_Studgart_Zusteller")) {
            sendKeys(bewerber.lBenutzername, PropertyReaders.read().get("userName_TS1_Studgart_Zusteller"));
            sendKeys(bewerber.lPasswort, PropertyReaders.read().get("passwort_TS2_Zusteller"));
            click(bewerber.lLogin);
        } else {
            sendKeys(bewerber.lBenutzername, PropertyReaders.read().get("userName_TS1_Munchen_Zusteller"));
            sendKeys(bewerber.lPasswort, PropertyReaders.read().get("passwort_TS2_Zusteller"));
        }
        click(bewerber.lLogin);
        sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PropertyReaders.read("SmokeZusteller").get("NaviMenus"))));
    }

    public By naviMenus(String text) {
        return By.xpath("//div[@class='sapMSLITitleOnly' and text()='" + text + "']");
    }


    @When("Ich klicke auf jede der Buttons im Navigationsmenü")
    public void ichKlickeAufJedeDerButtonsImNavigationsmenü(DataTable table) {
        List<Map<String, String>> maps = table.asMaps();
        for (Map<String, String> map : maps) {
            if (map.get("Neues Fenster").equals("nein")) {
                click(naviMenus(map.get("Button")));
                waitForVisibilty(bewerber.fußLeisteButtons(map.get("Button")));
                List<WebElement> elements = driver.findElements(By.xpath(PropertyReaders.read("SmokeZusteller").get(map.get("Verifizierung"))));
                if (!elements.isEmpty()) {
                    waitForVisibilty(elements.get(0));
                } else {
                    click(naviMenus(map.get("Button")));
                    waitForVisibilty(bewerber.fußLeisteButtons(map.get("Verifizierung")));
                        click(By.xpath(map.get("Verifizierung")));
                }
            }
        }
    }
}
