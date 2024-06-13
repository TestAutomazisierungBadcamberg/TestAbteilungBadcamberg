package pageObjekts.TS2_GL;

import org.openqa.selenium.By;

public class GeC_Bewerber {

    public By lBenutzername = By.xpath("//input[@placeholder='Benutzername']");
    public By lPasswort = By.xpath("//input[@placeholder='Passwort']");
    public By lAkzeptieren = By.xpath("//span/bdi[text()='Akzeptieren']");
    public By lLogin = By.xpath("//span/bdi[text()='Login']");
    public By lDashboardKachels = By.xpath("//div[@class='sapMGTContent']");
    public By lAnmeldenButtonAnmeldungsZeite = By.xpath("//bdi[text()='Anmelden']");
    public By lGeC_Bewerber_Anlegen_Bewerber = By.xpath("//div[text()='0']");
    public By lReiterPersonAnrede = By.xpath("//span[@id='__select4-arrow']");
    public By lReiterPersonAnredeHerr = By.xpath("//li[text()='Herrn']");

    public By lReiterPersonName = By.xpath("//input[@id='__select4-arrow']");
    public By lReiterPersonAlleButtons  = By.xpath("//div[contains(@class,'sapUiRespGridSpanXL9')]/div");









    public By navigationMenus(String title){
        return By.xpath("//div[@title='"+title+"']//span[@role='presentation']");
    }

    public By navigationSubMenus(String title){
        return By.xpath("//ul[@role='group']/li[@title='"+title+"']");
    }

    public By bewerberFußListeButton(String title){
        return By.xpath("//button[@title='"+title+"']/span/span");
    }








}
