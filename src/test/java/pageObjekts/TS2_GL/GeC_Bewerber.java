package pageObjekts.TS2_GL;

import baseClass.BaseClass;
import org.openqa.selenium.By;

public class GeC_Bewerber extends BaseClass {

    /*
     ** Hier werden den Selektoren definiert
     */
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
    public By lNachDemErstellungsOkButton = By.xpath("//bdi[text()='OK']");
    public By lBewerberMaskeAllBewerberListe = By.xpath("//tbody[@class='sapMListItems sapMTableTBody']/tr");
    public By lBewerberMaskeSuchbuttonTextFeld = By.xpath("//input[@type='search']");
    public By lBewerberMaskeSuchfeldOkButton = By.xpath("//span[@id='__button948-content']");
    public By lÄnderungDerBewerberOkButton = By.xpath("//bdi[contains(@id,'__mbox-btn')]");
    public By lSuchFeldZürecksetzenButton = By.xpath("//div[contains(@title,'Zurücksetzen')]");
    public By lCheckboxButtonFürBewerberAuswählen = By.xpath(" //div[contains(@id,'item')]/div");
    public By lMessageFensterNachdemLöschen = By.xpath("//div[text()='Es wurde 1 Bewerber gelöscht.']");
    public By NeuBewerberOrganisatorisches = By.xpath("//div[@id='MitarbeiterDetailViewId--tabFilterOrganisatorisches-text']");
    public By navigationMenus(String title){return By.xpath("//div[@title='"+title+"']//span[@role='presentation']");}
    public By navigationSubMenus(String title){return By.xpath("//ul[@role='group']/li[@title='"+title+"']");}
    public By bewerberFußLeisteButton(String title){return By.xpath("//button[@title='"+title+"']/span/span");}
    public By fußLeisteButtons(String title){return By.xpath("//bdi[text()='"+title+"']");}


      /*
      ** Dieses Method ermoeglicht ein neue Bewerber Formular auszufuellen bzw. erstellen
      */
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

    /*
     ** Dieses Method ermoeglicht das Datei eines erstellten Bewerber zu andern
     */
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

}
