package webdriver;

import org.openqa.selenium.By;
import webdriver.elements.Label;
import webdriver.elements.BaseElement;

import java.util.Date;

/**
 * Created by Ivan on 10.03.2016.
 */
public class BaseForm {
    protected BaseForm(final By locator, final String formTitle) {
        Label label = new Label(locator, formTitle);
        System.out.println(String.format("%s form is loaded", formTitle));
    }



}
