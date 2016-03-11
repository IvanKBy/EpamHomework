package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


/**
 * Created by Ivan on 10.03.2016.
 */
public class Browser {
    private static PropertiesReader p = new PropertiesReader();
    private static RemoteWebDriver driver;




    public static Browser getBrowserInstance()  {

            driver = new FirefoxDriver();
            System.out.println("Firefox is opened");

        Browser browser = new Browser();
        return  browser;
    }

    public static void  navigateTo(String url){
        driver.navigate().to(url);
        System.out.println("Navigate to: "+url);
    }

    public static void maximizeWindow(){
        driver.manage().window().maximize();
    }

    public static RemoteWebDriver getDriver(){
        return driver;
    }

    public static void closeBrowser(){
        driver.close();
        System.out.println("Browser is closed");
    }
}

