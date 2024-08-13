package pageObjekts.TS2_GL;

import baseClass.BaseClass;
import org.openqa.selenium.By;
import propertyReader.PropertyReaders;


public class GeC_Bewerber extends BaseClass {

    public By lBenutzername = By.xpath("//input[@placeholder='Benutzername']");
    public By lPasswort = By.xpath("//input[@placeholder='Passwort']");
    public By lAkzeptieren = By.xpath("//span/bdi[text()='Akzeptieren']");
    public By lLogin = By.xpath("//span/bdi[text()='Login']");
    public By lDashboardKachels = By.xpath("//div[@class='sapMGTContent']");
    public By lAnmeldenButtonAnmeldungsSeite = By.xpath("//bdi[text()='Anmelden']");
    public By lNeueBewerberAnlegenFensterBewerber = By.xpath("//div[text()='0']");
    public By lNeueBewerberAnlegenFensterMitarbeiter = By.xpath("//div[text()='1']");
    public By lReiterPersonAnrede = By.xpath("(//span[contains(@class,'sapMSltArrow')])[1]");
    public By lReiterPersonAnredeMitarbeiter = By.xpath("//span[@id='__select4-arrow']");
    public By lReiterPersonAnredeHerr = By.xpath("//li[@id='__item50-__select4-0']");
    public By lReiterPersonAnredeFrau = By.xpath("//li[@id='__item50-__select4-1']");
    public By lReiterPersonName = By.xpath("//input[@id='__input4-inner']");
    public By lReiterPersonVorname = By.xpath("//input[@id='__input5-inner']");
    public By lReiterPersonGeburtsdatum = By.xpath("//input[@id='MitarbeiterDetailViewId--GeburtsdatumFeld-inner']");
    public By lReiterPersonStraße = By.xpath("//input[@id='__input8-inner']");
    public By lReiterPersonHausnummer = By.xpath("//input[@id='__input9-inner']");
    public By lReiterPersonEMail = By.xpath("//input[@id='__input16-inner']");
    public By lBewerberMaskeAllBewerberListe = By.xpath("//tbody[@class='sapMListItems sapMTableTBody']/tr");
    public By lBewerberMaskeSuchbuttonTextFeld = By.xpath("//input[@type='search']");
    public By lBewerberMaskeSuchbuttonTextFeldUnten = By.xpath("(//input[@type='search'])[1]");
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
    public By lVorlagenDropDownMenu = By.xpath("//input[@class='sapUiPseudoInvisibleText']");
    public By lVorlagenDropDownSubMenu = By.xpath("//ul[@id='__list34']/li[@aria-posinset='4']");
    public By lZurücknavigieren = By.xpath("//span[@id='__button80-img']");
    public By lDoughnutsHerkunft = By.xpath("//li[@id='menuDoughnuts_1-unifiedmenu']");
    public By lDoughnutsWarteliste = By.xpath("//div[@id='menuDoughnuts_3-unifiedmenu-txt']");
    public By lEinstellungen = By.xpath("//span[text()='Einstellungen']");
    public By lBezirkbesetzungzuruckbutton = By.xpath("//span[@id ='__button82-inner']");
    public By lDokumentezuruckbuton = By.xpath("//button[@id ='__button94']");
    public By lZurückbezirkbesetzung = By.xpath("//button[@id='GeC_master_Bezirksbesetzung_PageId-navButton']");
    public By lZiPBezirkezuruckbutton = By.xpath("//button[@id='GeC_master_ZiP_Bezirke_PageId-navButton']");
    public By lLandDropdownbutton = By.xpath("//span[@id='__select7-arrow']");
    public By lLandwählenDropdownbutton = By.xpath("(//li[text()='Belgien']) [1]");
    public By lProjektDropdownbutton = By.xpath("//span[@id='MitarbeiterBezirkzuweisungViewId--projektselect-arrow']");
    public By lProjektauswahlen1 = By.xpath("//li[@id='__item134-MitarbeiterBezirkzuweisungViewId--projektselect-0']");
    public By lGesellschaftDropdown = By.xpath("//span[@id='__box26-arrow']");
    public By lGesellschaftExternwahlen = By.xpath("//div[@id='__item480-selectMulti']");
    public By lBezirkeauswählen = By.xpath("//span[@id='MitarbeiterBezirkzuweisungViewId--bzcombobox-vhi']");
    public By lBezirkeauswählen1 = By.xpath("//button[@id='__button89-internalBtn']");
    public By lBezirkealleswählen = By.xpath("//div[@id='__dialog9-scrollCont']");
    public By lDownloadDropdown = By.xpath("//span[@id='ZiP_Downloads_ViewId--verlagId-arrow']");
    public By lKundenAkte = By.xpath("//div[@id='ZiP_Downloads_ViewId--sTreeId-ZiP_Downloads_ViewId--treeId-14-selectSingle']");
    public By lAktuellTab = By.xpath("//span[text()='Aktuell']");
    public By lArchivTab = By.xpath("//span[@id='GeC_ZiP_News_ViewId--archivNewsId-icon']");
    public By lNewsdropdown = By.xpath("//span[@id='__box51-arrow']");
    public By lNewsdropdownwahlen = By.xpath("//div[text()='Rumble Dortmund']");
    public By lGesellschaftoption = By.xpath("//span[@id='__input59-vhi']");
    public By lTitel = By.xpath("//input[@id='__input60-inner']");
    public By lSelectnewsloschen = By.xpath("//div[@id='__item294-GeC_ZiP_News_ViewId--tabelleNewsId-0-selectMulti-CbBg']");
    public By lBearbeitenSelect = By.xpath("//div[@id='__item294-GeC_ZiP_News_ViewId--tabelleNewsId-0-selectMulti-CbBg']");
    public By lVerlagselectbuttonmehr=By.xpath("//div[@id='__item294-GeC_ZiP_News_ViewId--tabelleNewsId-1-selectMulti-CbBg']");


    String name;
    String vorname;
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
        name =generateRandomName(1,false,true);
        vorname = generateRandomName(1,true,false);
        sleep(500);
        hoverOverByAction(lReiterPersonAnrede);
        click(lReiterPersonAnrede);
        click(lReiterPersonAnredeHerr);
        sendKeys(lReiterPersonName, name);
        sendKeys(lReiterPersonVorname, vorname);
        click(lReiterPersonGeburtsdatum);
        sendKeys(lReiterPersonGeburtsdatum, "17.12.1985");
        sendKeys(lReiterPersonStraße, "Gerhart Hauptmann Str");
        sendKeys(lReiterPersonHausnummer, "21");
        sendKeys(lReiterPersonEMail, vorname+"@gmail.com");
        click(fußLeisteButtons("Speichern"));
        click(fußLeisteButtons("OK"));
        System.setProperty("name",name);
        System.setProperty("vorname",vorname);
    }

    public void neueMitarbeiterAnlegen() {
        sleep(500);
        hoverOverByAction(lReiterPersonAnredeMitarbeiter);
        click(lReiterPersonAnredeMitarbeiter);
        click(lReiterPersonAnredeHerr);
        sendKeys(lReiterPersonName, System.getProperty("name"));
        sendKeys(lReiterPersonVorname, "Ralf_Badcamber");
        click(lReiterPersonGeburtsdatum);
        sendKeys(lReiterPersonGeburtsdatum, "17.12.1985");
        sendKeys(lReiterPersonStraße, "Bahnhof Str");
        sendKeys(lReiterPersonHausnummer, "20");
        click(fußLeisteButtons("Speichern"));
        click(fußLeisteButtons("OK"));
    }


    public void angelegteBewerberÄndern() {
        vorname = generateRandomName(1,true,false);
        click(lReiterPersonAnrede);
        click(lReiterPersonAnredeFrau);
        sendKeys(lReiterPersonVorname, vorname);
        click(lReiterPersonGeburtsdatum);
        sendKeys(lReiterPersonGeburtsdatum, "01.01.1986");
        sendKeys(lReiterPersonStraße, "Müllstraße");
        sendKeys(lReiterPersonHausnummer, "50");
        sendKeys(lReiterPersonEMail, "sophia@gmail.com");
        click(fußLeisteButtons("Speichern"));
        click(lÄnderungDerBewerberOkButton);
        System.setProperty("vorname",vorname);
    }

    public By fußLeisteButtons(String title) {
        return By.xpath("//bdi[text()='" + title + "']");
    }

    public By footerSeiteAlleButton(String buttonName) {
        return By.xpath("//div[@id='__shell0']//span[text()='" + buttonName + "']");
    }

    public void vorlagenEmpfeangerDropdownMenuAussuchen() {
        click(lVorlagenDropDownMenu);
        click(lVorlagenDropDownSubMenu);
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("VorlagenEmpfeangerDropdownButton")));
        click(By.xpath(PropertyReaders.read("GeC_Bewerber").get("VorlagenEmpfeangerDropdownAussuchendePerson")));
        sleep(3000);
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
