package baseClass;

import driver.Browser;
import driver.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import propertyReader.Property;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class BaseClass {


    public WebDriver driver;
    public WebDriverWait wait;


    public BaseClass() {
        driver = Driver.getDriver(Browser.FIREFOX);
        wait = Driver.getWait();
    }

        Property GeC = Property.GeC_Bewerber;
        Property Smoke = Property.SmokeGL;
        Property SmokeZustel = Property.SmokeZusteller;
        Property ZiP_Alle = Property.ZiP_Alle_Maske;

        public String GeC_Bewerber = GeC.name();
        public String SmokeGL = Smoke.name();
        public String SmokeZusteller = SmokeZustel.name();
        public String ZiP_Alle_Maske = ZiP_Alle.name();


    public void click(WebElement element) {
        wait.until(driver -> {
                    try {
                        element.click();
                        return true;
                    } catch (Exception e) {
                        try {
                            new Actions(driver).moveToElement(element).click().perform();
                            return true;
                        } catch (Exception e1) {
                            try {
                                ((JavascriptExecutor) driver).executeAsyncScript("arguments[0].click", element);
                                return true;
                            } catch (Exception e2) {
                                return false;
                            }
                        }
                    }
                }
        );

    }

    public void click(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        click(element);
    }

    public void sendKeys(WebElement element, String text) {
        wait.until(driver -> {
                    try {
                        element.clear();
                        element.sendKeys(text);
                        return true;
                    } catch (Exception e) {
                        try {
                            element.clear();
                            new Actions(driver).moveToElement(element).sendKeys(text).perform();
                            return true;
                        } catch (Exception e1) {
                            try {
                                element.clear();
                                ((JavascriptExecutor) driver).executeAsyncScript("arguments[0].value='" + text + "'", element);
                                return true;
                            } catch (Exception e2) {
                                return false;
                            }
                        }
                    }
                }
        );
    }

    public void sendKeys(By locator, String text){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        sendKeys(element,text);
    }


    public static void takeScreenShot(String fileName){
        String name = fileName+"_"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-MM.ss"));
        String path= "test-output/screenshot/"+name+".png";
        File sourch = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.FILE);
        File target = new File(path);
        try {
            FileUtils.copyFile(sourch,target);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void takeScreenShot(){
        takeScreenShot("screenshot");
    }

    public static void takeScreenShotElemet(WebElement element, String fileName){
        String name= fileName+"_"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-MM.ss"));
        String path= "test-output/screenshot/"+name+".png";
        File sourch = element.getScreenshotAs(OutputType.FILE);
        File target = new File(path);
        try {
            FileUtils.copyFile(sourch,target);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sleep(long milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void hoverOverByAction(WebElement element){
        new Actions(driver)
                .moveToElement(element)
                .pause(500)
                .build()
                .perform();
    }
    public void hoverOverByAction(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        hoverOverByAction(element);
    }

    public void hoverOverSendkeys(String text){
        new Actions(driver)
                .sendKeys(text)
                .pause(500)
                .build()
                .perform();
    }

    public void scrollElement(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    public void scrollElement(By locator){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        scrollElement(element);
    }
    public void scrollBy(int pixels) {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0," + pixels + ");");
    }
    public void scrollTo(int x, int y){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(" + x + ", " + y + ")");
    }
    public void scrollToBottom() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    public void waitForVisibilty(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForVisibilty(By locator){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        waitForVisibilty(element);
    }

    public void actionsClassTab(){
         new Actions(driver)
                .sendKeys(Keys.TAB)
                .build()
                .perform();
    }
    public String generateRandomString(String prefix, int maxWords) {
        // Maksimum String
        if (maxWords < 1 || maxWords > 10) {
            throw new IllegalArgumentException("Bitte wählen Sie 1 bis 10 Wörter aus..");
        }

        String[] words = {"alpha", "engin","bravo", "charlie", "delta","test", "echo", "foxtrot", "golf", "hotel", "india", "juliett"};

        Random random = new Random();
        StringBuilder randomString = new StringBuilder(prefix);

        for (int i = 0; i < maxWords; i++) {
            randomString.append(words[random.nextInt(words.length)]);
            if (i < maxWords - 1) {
                randomString.append(" ");
            }
        }

        return randomString.toString();
    }

}
