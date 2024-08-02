package pageObjekts.TS2_GL;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import propertyReader.PropertyReaders;

import java.util.Properties;

public class GeC_Bewerber extends BaseClass {

    public By lBenutzername = By.xpath("//input[@placeholder='Benutzername']");
    public By lPasswort = By.xpath("//input[@placeholder='Passwort']");
    public By lAkzeptieren = By.xpath("//span/bdi[text()='Akzeptieren']");
    public By lLogin = By.xpath("//span/bdi[text()='Login']");
    public By lDashboardKachels = By.xpath("//div[@class='sapMGTContent']");
    public By lAnmeldenButtonAnmeldungsSeite = By.xpath("//bdi[text()='Anmelden']");
    public By lNeueBewerberAnlegenFensterBewerber = By.xpath("//div[text()='0']");
    public By lNeueBewerberAnlegenFensterMitarbeiter = By.xpath("//div[text()='1']");
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
    public By lMessageFensterNachdemLöschen = By.xpath("//div[contains(text(),'gelöscht')]");
    public By lErgebnisDropDown = By.xpath("//span[@id='__select19-arrow']");
    public By lStatusErledigt = By.xpath("//span[@id='__select21-label']");
    public By lErgebnisZusage = By.xpath("//li[@id='__item120-__select19-5']");
    public By lStatusInBearbeitung = By.xpath("//div[@id='__select21']");
    public By lErgebnisWarteliste = By.xpath("//li[@id='__item120-__select19-3']");
    public By lPersonreiter = By.xpath("//span[text()='Person']");
    public By lVorlagenDropDownMenu = By.xpath("//input[@class='sapUiPseudoInvisibleText']");
    public By lVorlagenDropDownSubMenu = By.xpath("//ul[@id='__list34']/li[@aria-posinset='4']");
    public By lVorlagenEmpfaengerFeld = By.xpath("//input[contains(@placeholder,'Empfänger')]");
    public By lZurücknavigieren = By.xpath("//span[@id='__button80-img']");
    public By lZurücknavigierenBezirk = By.xpath("//span[@id='__button82-inner']");
    public By lDoughnutsdropdown = By.xpath("//span[@id='menuButtonDoughnuts-internalBtn-inner']");
    public By lDoughnutsHerkunft = By.xpath("//li[@id='menuDoughnuts_1-unifiedmenu']");
    public By lDoughnutsWarteliste = By.xpath("//div[@id='menuDoughnuts_3-unifiedmenu-txt']");
    public By lEinstellungen = By.xpath("//span[text()='Einstellungen']");
    public By lTextSchließen = By.xpath("//bdi[text()='Schließen']");
    public By lBezirkbesetzung = By.xpath("//div[@id='GeC_master_Bezirksbesetzung_PageId-title']");
    public By lBezirkbesetzungzuruckbutton = By.xpath("//span[@id ='__button82-inner']");
    public By lDokumentezuruckbuton = By.xpath("//button[@id ='__button94']");
    public By lZurückbezirkbesetzung = By.xpath("//button[@id='GeC_master_Bezirksbesetzung_PageId-navButton']");
    public By lZiPBezirkezuruckbutton = By.xpath("//button[@id='GeC_master_ZiP_Bezirke_PageId-navButton']");
    public By lLandDropdownbutton=By.xpath("//span[@id='__select7-arrow']");
    public By lLandwählenDropdownbutton= By.xpath("(//li[text()='Belgien']) [1]");
    public By lProjektDropdownbutton=By.xpath("//span[@id='MitarbeiterBezirkzuweisungViewId--projektselect-arrow']");
    public By lProjektauswahlen1 =By.xpath("//li[@id='__item134-MitarbeiterBezirkzuweisungViewId--projektselect-0']");
    public By lGesellschaftDropdown=By.xpath("//span[@id='__box26-arrow']");
    public By lGesellschaftExternwahlen =By.xpath("//div[@id='__item480-selectMulti']");
   public  By lBezirkeauswählen= By.xpath("//span[@id='MitarbeiterBezirkzuweisungViewId--bzcombobox-vhi']");
   public  By lBezirkeauswählen1=By.xpath("//button[@id='__button89-internalBtn']");
    public By lBezirkealleswählen=By.xpath("//div[@id='__dialog9-scrollCont']");




    Properties properties = new Properties();


    public By navigationMenus(String title) {
        return By.xpath("//div[@title='" + title + "']//span[@role='presentation']");
    }

    public By ErgebnisDropDown(String str) {
        return By.xpath("//li[@id='__item120-__select19-" + str + "']");

    }



    public By navigationSubMenus(String title) {
        return By.xpath("//ul[@role='group']/li[@title='" + title + "']");
    }

    public By bewerberFußLeisteButton(String title) {
        return By.xpath("//button[@title='" + title + "']/span/span");
    }

    public By navigationGeCSubmenuReiter(String title) {
        return By.xpath("//span[contains(.,'" + title + "')]");
    }

    public void neueBewerberAnlegen() {
        click(lReiterPersonAnrede);
        click(lReiterPersonAnredeHerr);
        sendKeys(lReiterPersonName, "Müller");
        sendKeys(lReiterPersonVorname, "Maximillian_Automation");
        click(lReiterPersonGeburtsdatum);
        sendKeys(lReiterPersonGeburtsdatum, "17.12.1985");
        sendKeys(lReiterPersonStraße, "Gerhart Hauptmann Str");
        sendKeys(lReiterPersonHausnummer, "21");
        sendKeys(lReiterPersonEMail, "engin@gmail.com");
        click(lReiterPersonSpeichern);
        click(fußLeisteButtons("OK"));
    }

    public void neueMitarbeiterAnlegen() {
        click(lReiterPersonAnrede);
        click(lReiterPersonAnredeHerr);
        sendKeys(lReiterPersonName, "Müller");
        sendKeys(lReiterPersonVorname, "Ralf_Badcamber");
        click(lReiterPersonGeburtsdatum);
        sendKeys(lReiterPersonGeburtsdatum, "17.12.1985");
        sendKeys(lReiterPersonStraße, "Bahnhof Str");
        sendKeys(lReiterPersonHausnummer, "20");
        click(lReiterPersonSpeichern);
        click(fußLeisteButtons("OK"));
    }


    public void angelegteBewerberÄndern() {
        click(lReiterPersonAnrede);
        click(lReiterPersonAnredeFrau);
        sendKeys(lReiterPersonVorname, "Sophia_Automation");
        click(lReiterPersonGeburtsdatum);
        sendKeys(lReiterPersonGeburtsdatum, "01.01.1986");
        sendKeys(lReiterPersonStraße, "Müllstraße");
        sendKeys(lReiterPersonHausnummer, "50");
        sendKeys(lReiterPersonEMail, "sophia@gmail.com");
        click(fußLeisteButtons("Speichern"));
        click(lÄnderungDerBewerberOkButton);

    }

    public void angelegteMitarbeiterÄndern() {
        click(lReiterPersonAnrede);
        click(lReiterPersonAnredeFrau);
        sendKeys(lReiterPersonVorname, "Maria_Automation");
        click(lReiterPersonGeburtsdatum);
        sendKeys(lReiterPersonGeburtsdatum, "01.01.1987");
        sendKeys(lReiterPersonStraße, "Müllstraße");
        sendKeys(lReiterPersonHausnummer, "50");
        sendKeys(lReiterPersonEMail, "maria@gmail.com");
        click(fußLeisteButtons("Speichern"));
        click(lÄnderungDerBewerberOkButton);

    }

    public By fußLeisteButtons(String title) {
        return By.xpath("//bdi[text()='" + title + "']");
    }


    public void vorlagenEmpfeangerDropdownMenuAussuchen() {
        click(lVorlagenDropDownMenu);
        click(lVorlagenDropDownSubMenu);
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("VorlagenEmpfeangerDropdownButton")));
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("VorlagenEmpfeangerDropdownAussuchendePerson")));
        sleep(2000);
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("VorlagenEmpfeangerXiconFurPersonEntfern")));

    }

    public void vorlagenEmpfeangerFreieEingabeAussuchen() {
        hoverOverSendkeys("Müller");
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("VorlagenEmpfeangerDropdownAussuchendePerson")));
        sleep(1000);

        // properties.setProperty("GeC","Müller-"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss")));
    }

    public By buttonZurück(String text) {
        return By.xpath("//button[@title='Zurück' and contains(@id,'" + text + "')]");
    }


}
