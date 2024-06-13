package pageObjekts.TS2_GL;

import baseClass.BaseClass;
import org.openqa.selenium.By;

public class GeC_Bewerber extends BaseClass {

    public By lBenutzername = By.xpath("//input[@placeholder='Benutzername']");
    public By lPasswort = By.xpath("//input[@placeholder='Passwort']");
    public By lAkzeptieren = By.xpath("//span/bdi[text()='Akzeptieren']");
    public By lLogin = By.xpath("//span/bdi[text()='Login']");
    public By lDashboardKachels = By.xpath("//div[@class='sapMGTContent']");
    public By lAnmeldenButtonAnmeldungsZeite = By.xpath("//bdi[text()='Anmelden']");
    public By lGeC_Bewerber_Anlegen_Bewerber = By.xpath("//div[text()='0']");
    public By lReiterPersonAnrede = By.xpath("//span[@id='__select4-arrow']");
    public By lReiterPersonAnredeHerr = By.xpath("//li[@id='__item50-__select4-0']");
    public By lReiterPersonName = By.xpath("//input[@id='__input4-inner']");
    public By lReiterPersonVorname = By.xpath("//input[@id='__input5-inner']");
    public By lReiterPersonGeburtsdatum = By.xpath("//input[@id='MitarbeiterDetailViewId--GeburtsdatumFeld-inner']");
    public By lReiterPersonStraße = By.xpath("//input[@id='__input8-inner']");
    public By lReiterPersonHausnummer = By.xpath("//input[@id='__input9-inner']");
    public By lReiterPersonEMail = By.xpath("//input[@id='__input16-inner']");
    public By lReiterPersonSpeichern = By.xpath("//span[@id='__button75-inner']");
    public By lNachDemErstellungsOkButton = By.xpath("//bdi[text()='OK']");
    public By lBewerberMaskeAllBewerberListe = By.xpath("//tbody[@class='sapMListItems sapMTableTBody']/tr");






    public By navigationMenus(String title){
        return By.xpath("//div[@title='"+title+"']//span[@role='presentation']");
    }

    public By navigationSubMenus(String title){
        return By.xpath("//ul[@role='group']/li[@title='"+title+"']");
    }

    public By bewerberFußListeButton(String title){
        return By.xpath("//button[@title='"+title+"']/span/span");
    }
    public void neueBewerberAnlegen(){
        click(lReiterPersonAnrede);
        click(lReiterPersonAnredeHerr);
        sendKeys(lReiterPersonName,"Hereser");
        sendKeys(lReiterPersonVorname,"Engin");
        click(lReiterPersonGeburtsdatum);
        sendKeys(lReiterPersonGeburtsdatum,"17.12.1985");
        sendKeys(lReiterPersonStraße,"Gerhart Hauptmann Str");
        sendKeys(lReiterPersonHausnummer,"21");
        sendKeys(lReiterPersonEMail,"engin@gmail.com");
        click(lReiterPersonSpeichern);
        click(lNachDemErstellungsOkButton);
    }








}
