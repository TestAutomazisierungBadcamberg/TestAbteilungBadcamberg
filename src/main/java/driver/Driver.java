package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

    private static ThreadLocal<WebDriver> drivers= new ThreadLocal<>();
    private static ThreadLocal<WebDriverWait> waits = new ThreadLocal<>();
    private static ThreadLocal<Browser> browsers= new ThreadLocal<>();

    public static WebDriver getDriver(){
        if (browsers.get()==null)
            browsers.set(Browser.CHROME);
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
                    drivers.set(new FirefoxDriver());
                    break;
                default:
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    if (DriverConfig.startMaximized)
                        options.addArguments("--start-maximized");
                    if (DriverConfig.headles)
                        options.addArguments("--headless");

                    drivers.set(new ChromeDriver(options));

                    break;
            }
        }
        waits.set(new WebDriverWait(drivers.get(), Duration.ofSeconds(20),Duration.ofMillis(100)));
        return drivers.get();
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
