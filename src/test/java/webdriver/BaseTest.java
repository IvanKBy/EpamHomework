package webdriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import java.io.IOException;

/**
 * Created by Ivan on 10.03.2016.
 */
public abstract class BaseTest {
    protected static PropertiesReader p = new PropertiesReader();
    protected static Browser browser ;


    @BeforeClass
    public void before() throws IOException {
        browser =  Browser.getBrowserInstance();
        browser.maximizeWindow();
        Browser.navigateTo(p.readUrl());

    }

    @AfterClass
    public void after()  {
        browser.closeBrowser();


    }


        /**
         * To override.
         */
        public abstract void runTest();



    }

