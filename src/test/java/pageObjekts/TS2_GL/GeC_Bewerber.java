package pageObjekts.TS2_GL;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class GeC_Bewerber extends BaseClass {

    public By lBenutzername = By.xpath("//input[@placeholder='Benutzername']");
    public By lPasswort = By.xpath("//input[@placeholder='Passwort']");
    public By lAkzeptieren = By.xpath("//span/bdi[text()='Akzeptieren']");
    public By lLogin = By.xpath("//span/bdi[text()='Login']");
    public By lDashboardKachels = By.xpath("//div[@class='sapMGTContent']");
    public By lAnmeldenButtonAnmeldungsSeite = By.xpath("//bdi[text()='Anmelden']");
    public By lNeueBewerberAnlegenFensterBewerber = By.xpath("//div[text()='0']");
    public By lReiterPersonAnrede = By.xpath("//span[@id='__select4-arrow']");
    public By lReiterPersonAnredeHerr = By.xpath("//li[@id='__item50-__select4-0']");
    public By lReiterPersonAnredeFrau = By.xpath("//li[@id='__item50-__select4-1']");
    public By lReiterPersonName = By.xpath("//input[@id='__input4-inner']");
    public By lReiterPersonVorname = By.xpath("//input[@id='__input5-inner']");
    public By lReiterPersonGeburtsdatum = By.xpath("//input[@id='MitarbeiterDetailViewId--GeburtsdatumFeld-inner']");
    public By lReiterPersonStraße = By.xpath("//input[@id='__input8-inner']");
    public By lReiterPersonHausnummer = By.xpath("//input[@id='__input9-inner']");
    public By lReiterPersonEMail = By.xpath("//input[@id='__input16-inner']");
    public By lReiterPersonSpeichern = By.xpath("//span[@id='__button75-inner']");
    public By lBewerberMaskeAllBewerberListe = By.xpath("//tbody[@class='sapMListItems sapMTableTBody']/tr");
    public By lBewerberMaskeSuchbuttonTextFeld = By.xpath("//input[@type='search']");
    public By lBewerberMaskeSuchfeldOkButton = By.xpath("//span[@id='__button951-content']");
    public By lÄnderungDerBewerberOkButton = By.xpath("//bdi[contains(@id,'__mbox-btn')]");
    public By lSuchFeldZürecksetzenButton = By.xpath("//div[contains(@title,'Zurücksetzen')]");
    public By lCheckboxButtonFürBewerberAuswählen = By.xpath(" //div[contains(@id,'item')]/div");
    public By lMessageFensterNachdemLöschen = By.xpath("//div[text()='Es wurde 1 Bewerber gelöscht.']");
    public By lErgebnisDropDown = By.xpath("//span[@id='__select19-arrow']");
    public By lStatusErledigt =By.xpath("//span[@id='__select21-label']");
    public By lErgebnisZusage=By.xpath("//li[@id='__item120-__select19-5']");
    public By lStatusInBearbeitung=By.xpath("//div[@id='__select21']");
    public By lErgebnisWarteliste=By.xpath("//li[@id='__item120-__select19-3']");
    public By lPersonreiter= By.xpath("//span[text()='Person']");
    public  By lVorlagenDropDownMenu = By.xpath("//input[@class='sapUiPseudoInvisibleText']");
    public By lVorlagenDropDownSubMenu = By.xpath("//ul[@id='__list34']/li[@aria-posinset='4']");
    public  By lVorlagenEmpfaengerFeld = By.xpath("//input[contains(@placeholder,'Empfänger')]");




    public By navigationMenus(String title){
        return By.xpath("//div[@title='"+title+"']//span[@role='presentation']");
    }

    public By ErgebnisDropDown(String str){
        return By.xpath("//li[@id='__item120-__select19-"+str+"']");
    }

    public By navigationSubMenus(String title){
        return By.xpath("//ul[@role='group']/li[@title='"+title+"']");
    }

    public By bewerberFußLeisteButton(String title){
        return By.xpath("//button[@title='"+title+"']/span/span");
    }
    public void neueBewerberAnlegen(){
        click(lReiterPersonAnrede);
        click(lReiterPersonAnredeHerr);
        sendKeys(lReiterPersonName,"Müller");
        sendKeys(lReiterPersonVorname,"Maximillian_Automation");
        click(lReiterPersonGeburtsdatum);
        sendKeys(lReiterPersonGeburtsdatum,"17.12.1985");
        sendKeys(lReiterPersonStraße,"Gerhart Hauptmann Str");
        sendKeys(lReiterPersonHausnummer,"21");
        sendKeys(lReiterPersonEMail,"engin@gmail.com");
        click(lReiterPersonSpeichern);
        click(fußLeisteButtons("OK"));
    }

    public void angelegteBewerberÄndern(){
        click(lReiterPersonAnrede);
        click(lReiterPersonAnredeFrau);
        sendKeys(lReiterPersonVorname,"Sophia_Automation");
        click(lReiterPersonGeburtsdatum);
        sendKeys(lReiterPersonGeburtsdatum,"01.01.1986");
        sendKeys(lReiterPersonStraße,"Müllstraße");
        sendKeys(lReiterPersonHausnummer,"50");
        sendKeys(lReiterPersonEMail,"ummuhann@gmail.com");
        click(fußLeisteButtons("Speichern"));
        click(lÄnderungDerBewerberOkButton);
    }

    public By fußLeisteButtons(String title){
        return By.xpath("//bdi[text()='"+title+"']");
    }

    public By footerSeiteAlleButton(String buttonName){
        return By.xpath("//div[@id='__shell0']//span[text()='"+buttonName+"']");
    }

    public void vorlagenEmailTemplateAbsageAuswählen(){
        click(lVorlagenDropDownMenu);
        click(lVorlagenDropDownSubMenu);
        sleep(1000);
        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("dass wir Ihnen die gewünschte Position nicht anbieten können"));
    }


}
