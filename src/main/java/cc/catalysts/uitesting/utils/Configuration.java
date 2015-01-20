package cc.catalysts.uitesting.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Klaus Lehner, Catalysts GmbH
 */
public class Configuration {


    /**
     * You could use system properties here to determine which driver to be used; the Firefox driver is the default one
     *
     * @return the driver to be used in test cases
     */
    public static WebDriver getDriver() {
        return new FirefoxDriver();
    }
}