package baseClass;

import driver.Driver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BaseClass {


    public WebDriver driver;
    public WebDriverWait wait;


    public BaseClass() {
        driver = Driver.getDriver();
        wait = Driver.getWait();
    }


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
        fileName = "_"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-MM.ss"));
        String path= "test-output/screenshot/"+fileName+"png";
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
        fileName= "_"+ LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd-MM.ss"));
        String path= "test-output/screenshot/"+fileName+"png";
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
    public void scrollElement(WebElement element){
        ((JavascriptExecutor)driver).executeAsyncScript("arguments[0].scrollIntoView()",element);
    }
    public void scrollElement(By locator){
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        scrollElement(element);
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


}
