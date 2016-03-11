package webdriver.elements;

import org.openqa.selenium.By;


/**
 * Class, Describing element button
 */
    public class Checkbox extends BaseElement {

    /**
     * @param locator
     * @param name
     */
    public Checkbox(final By locator, final String name) {
        super(locator, name);
        System.out.println(name);
    }


    }


