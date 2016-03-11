package webdriver.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


/**
 * Class, Describing element DropDawn
 */
public class DropDown extends BaseElement {
    /**
     *
     * @param locator
     * @param name
     */
    public DropDown(final By locator, final String name) {
        super(locator, name);
        System.out.println(name);
    }

    public void chooseDropDownValue(final String value) {
        //waitForIsElementPresent();
        //info("Drop Dawn item choosing");
        //WebElement dropDownElement = this.getElement();
        //Select selectObject = new Select(dropDownElement);
        //selectObject.selectByVisibleText(value);
    }

}
