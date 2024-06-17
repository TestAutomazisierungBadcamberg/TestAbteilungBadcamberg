package pageObjekts.TS2_GL;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ClickElementSteps {


    private static WebDriver driver;

    // Initialize the WebDriver
    public ClickElementSteps(WebDriver driver) {
        this.driver = driver;
    }


    public static void ClickAllElements(String element) {
        By locator;
        if (element.startsWith("id=")) {
            locator = By.id(element.substring(3));
        } else if (element.startsWith("css=")) {
            locator = By.cssSelector(element.substring(4));
        } else if (element.startsWith("xpath=")) {
            locator = By.xpath(element.substring(6));
        } else if (element.startsWith("name=")) {
            locator = By.name(element.substring(5));
        } else {
            // Default strategy, modify as needed
            locator = By.id(element);
        }

        // Create WebDriverWait dynamically
        WebDriverWait wait = new WebDriverWait(driver, 10);

        // Wait for the elements to be present and clickable
        List<WebElement> webElements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

        // Click all elements
        for (WebElement webElement : webElements) {
            wait.until(ExpectedConditions.elementToBeClickable(webElement)).click();
        }
    }
}
