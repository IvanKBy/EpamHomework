package github.ui.forms;

import org.openqa.selenium.By;
import webdriver.BaseForm;

/**
 * Created by Ivan on 10.03.2016.
 */
public class GitHubMainForm extends BaseForm{

    public GitHubMainForm() {
        super(By.xpath("//input[@placeholder='Sarch GitHub']"), "GitHub main form");
    }
}
