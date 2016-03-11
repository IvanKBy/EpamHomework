package webdriver.elements;

import org.openqa.selenium.By;

/**
 * Created by Ivan on 19.12.2015.
 */
public class RadioButton extends  BaseElement {

    /**
     * @param locator
     * @param name
     */
    public RadioButton(final By locator, final String name) {
        super(locator, name);
        System.out.println(name);
    }

}
