package webdriver.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import webdriver.Browser;


/**
 * Created by Ivan on 10.03.2016.
 */
public abstract class BaseElement {
    protected By locator;
    protected String name;
    protected WebElement element;
    protected Browser browser;

    /**
     * The main constructor
     * @param loc By Locator
     * @param nameOf Output in logs
     */
    protected BaseElement(final By loc, final String nameOf) {
        locator = loc;
        name = nameOf;
        if(isPresent(locator)){
            element = browser.getDriver().findElement(loc);
            System.out.println(String.format("WebElement %s is present", nameOf));
        }
        else

            Assert.assertTrue(false,String.format(" %s is not present by this locator " +loc, nameOf));
        }

    /**
     * Send keys.
     */
    public void sendKeys(Keys key) {
       element.sendKeys(key);
       System.out.println("Send keys to "+name);
    }

    /**
     * Click on the item.
     */
    public void click() {
       element.click();
       System.out.println("Clicking "+name);

    }

    /**
     * Get the item text (inner text).
     * @return Text of element
     */
    public String getText() {
        //waitForIsElementPresent();
        return element.getText();
    }

    /**
     * Clear Textbox
     */
    public void clearTextbox() {
        //waitForIsElementPresent();
        element.clear();
    }

    public boolean isPresent(By locator ){
       return browser.getDriver().findElements(locator).size()!=0;

    }



}
