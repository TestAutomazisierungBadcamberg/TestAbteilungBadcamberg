package stepDefinition;

import baseClass.BaseClass;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pageObjekts.TS2_GL.GeC_Bewerber;
import propertyReader.PropertyReaders;

import java.util.List;

public class GeCBewerberSortierung extends BaseClass {

    GeC_Bewerber bewerber = new GeC_Bewerber();
    List<WebElement> elements;

    /**
     * Ich habe ein Problem mit dieser Methode. Der Locator verursacht einen Fehler beim zweiten Durchlauf der for loob.
     * Ich habe den Debugger benutzt und festgestellt, dass der Locator sichtbar ist, aber ich konnte ihn nicht anklicken.
     * Im Moment habe ich eine statische Methode geschrieben, aber in Zukunft soll ich daraus eine dynamische Methode machen.
     */
    @When("Ich sortiere je nach Spalte")
    public void ichSortiereJeNachSpalte() {
        driver.getPageSource();
        elements = driver.findElements(By.cssSelector(PropertyReaders.read("GeC_Bewerber").get("SortierungsFensterAllOptions")));
        waitForVisibilty(elements.get(1));
        sleep(1000);
        String text = driver.findElements(By.xpath(PropertyReaders.read("GeC_Bewerber").get("BewerberListeNamenAllListe"))).get(3).getText();
        click(elements.get(3));
        click(bewerber.fußLeisteButtons("Ok"));
        sleep(1000);
        String text2 = driver.findElements(By.xpath(PropertyReaders.read("GeC_Bewerber").get("BewerberListeNamenAllListe"))).get(3).getText();
        Assert.assertNotEquals(text, text2);

    }


}

