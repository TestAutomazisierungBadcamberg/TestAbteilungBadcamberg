package pageObjekts;

import org.openqa.selenium.By;

public class HomePage {
    public By lHeadMenus = By.xpath("//div[@class='linkHolder']/div");
    public By lSubHeadMenus = By.xpath("//div[@class='menMore' and @style='opacity: 1; display: block;']//a");

    public By lButtonAllesKlar = By.xpath("//button[text()='ALLES KLAR!']");
}
