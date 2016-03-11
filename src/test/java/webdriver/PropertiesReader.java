package webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Ivan on 10.03.2016.
 */
public class PropertiesReader {
    private static String BROWSER_TYPE;
    private static String URL;



    public String readBrowserType() throws IOException
    {
        Properties props = new Properties();

        try{
            props.load(new FileInputStream(new File("src\\test\\resources\\selenium.properties").getAbsolutePath()));

            BROWSER_TYPE = props.getProperty("browser");
            System.out.println(BROWSER_TYPE);


        }
        catch(IOException e) {
            System.out.println("IO EXC");
        }
        return BROWSER_TYPE;
    }

    public String readUrl() throws IOException {
        Properties props = new Properties();
        try{
            props.load(new FileInputStream(new File("src\\test\\resources\\selenium.properties").getAbsolutePath()));

            URL = props.getProperty("urlMainPage");

        }
        catch (IOException e){
            System.out.println("IO EXC");
        }

        return URL;
    }

    public static void main(String[] args) throws IOException {
        PropertiesReader p = new PropertiesReader();
        System.out.println(p.readBrowserType());
    }
}
