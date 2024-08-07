package stepDefinition;

import baseClass.BaseClass;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjekts.TS2_GL.GeC_Bewerber;
import propertyReader.PropertyReaders;

import java.util.List;

public class ZiPNachrichten extends BaseClass {
    GeC_Bewerber bewerber = new GeC_Bewerber();

    @When("Ich scrolle nach unten und nach oben")
    public void ichScrolleNachUntenUndNachOben() {
        List<WebElement> elements = driver.findElements(By.xpath(PropertyReaders.read("ZiP_Alle_Maske").get("NachrichtenPosteingangAlleEintrage")));
        int size = elements.size();
        scrollElement(elements.get(size-5));
        sleep(1000);
        elements = driver.findElements(By.xpath(PropertyReaders.read("ZiP_Alle_Maske").get("NachrichtenPosteingangAlleEintrage")));
        scrollElement(elements.get(0));
        sleep(1000);
    }
}
