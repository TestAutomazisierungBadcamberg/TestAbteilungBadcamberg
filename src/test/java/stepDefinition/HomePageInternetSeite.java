package stepDefinition;

import baseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import propertyReader.PropertyReaders;

import java.util.List;

public class HomePageInternetSeite extends BaseClass {

    pageObjekts.HomePage hp = new pageObjekts.HomePage();

    @Given("Ich gehe zur die Startseite")
    public void ichGeheZurDieStartseite() {
        driver.get(PropertyReaders.read().get("url"));
    }

    @Then("Ich sehe auf der Seite die Headermenus")
    public void ichSeheAufDerSeiteDieHeadermenus() {
       waitForVisibilty(hp.lHeadMenus);
    }

    @Then("Ich sehe auf der Seite Title {string}")
    public void ichSeheAufDerSeiteTitle(String text) {
        wait.until(ExpectedConditions.titleIs(text));
    }

    @When("Ich gehe darüber Headermenu")
    public void ichGeheDarüberHeadermenu() {
        hoverOverByAction(hp.lHeadMenus);
    }

    @When("Dann fahre ich alle Menu mit dem Maus")
    public void dannFahreIchAlleMenuMitDemMaus() {
        List<WebElement> headerMenuElements = driver.findElements(hp.lHeadMenus);
        for (WebElement headerMenuElement : headerMenuElements) {
            hoverOverByAction(headerMenuElement);
            List<WebElement> subMenuElements = driver.findElements(hp.lSubHeadMenus);
            if (subMenuElements.size() > 0) {
                for (WebElement subMenuElement : subMenuElements) {
                    waitForVisibilty(subMenuElement);
                    hoverOverByAction(subMenuElement);
                }
            }
        }
    }


    @When("Ich klicke auf dem Cookiesbutton")
    public void ichKlickeAufDemCookiesbutton() {
        click(hp.lButtonAllesKlar);
    }
}
