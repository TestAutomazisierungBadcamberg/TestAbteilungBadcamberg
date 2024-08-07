package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

    private static ThreadLocal<WebDriver> drivers= new ThreadLocal<>();
    private static ThreadLocal<WebDriverWait> waits = new ThreadLocal<>();
    private static ThreadLocal<Browser> browsers= new ThreadLocal<>();

    public static WebDriver getDriver(){
        if (browsers.get()==null)
            browsers.set(Browser.FIREFOX);

        return getDriver(browsers.get());
    }

    public static WebDriver getDriver(Browser browser){
        browsers.set(browser);

        if (drivers.get()==null){
            switch (browser){
                case EDGE:
                    drivers.set(new EdgeDriver());
                    break;
                case FIREFOX:
                    FirefoxOptions optionFirefox = getFirefoxOptions();
                    drivers.set(new FirefoxDriver(optionFirefox));
                    break;
                case CHROME:
                    ChromeOptions options = getChromeOptions();
                    drivers.set(new ChromeDriver(options));
                    break;
            }
        }
        waits.set(new WebDriverWait(drivers.get(), Duration.ofSeconds(20),Duration.ofMillis(100)));
        return drivers.get();
    }


    private static ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");

        if (DriverConfig.startMaximized)
            options.addArguments("--start-maximized");
        if (DriverConfig.headles)
            options.addArguments("--headless");
        return options;
    }
    private static FirefoxOptions getFirefoxOptions() {
        FirefoxOptions options = new FirefoxOptions();
        options.addPreference("dom.webnotifications.enabled", false);

        options.addArguments("--width=1920");
        options.addArguments("--height=1080");

        return options;
    }

    public static WebDriverWait getWait(){
        return waits.get();
    }

    public static void closeDriver(){
        if (drivers.get() !=null){
            drivers.get().quit();
            drivers.set(null);
            waits.set(null);
        }
    }






}
