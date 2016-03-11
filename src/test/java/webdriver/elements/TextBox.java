package webdriver.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


/**
 * The class that describes an input field
 */
public class TextBox extends BaseElement {

	/**
	 * Constructor
	 * @param locator locator
	 * @param name name
	 */
	public TextBox(final By locator, final String name) {
		super(locator, name);
		System.out.println(name);
	}

	/**
	 * Enter the text in the box
	 * @param value text
	 *
	public void type(final String value) {
		waitForIsElementPresent();
		info(String.format(getLoc("loc.text.typing") + " '%1$s'", value));
		if (browser.getDriver() instanceof JavascriptExecutor) {
	        ((JavascriptExecutor)browser.getDriver()).executeScript("arguments[0].style.border='3px solid red'", element);
	    }
		element.sendKeys(value);*/
	}
	




	

	

