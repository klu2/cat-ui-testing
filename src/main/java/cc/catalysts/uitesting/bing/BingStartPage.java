package cc.catalysts.uitesting.bing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author Klaus Lehner
 */
public class BingStartPage {

    private final WebDriver webDriver;

    public BingStartPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriver.get("http://www.bing.at");
    }

    public String getTitle() {
        return webDriver.getTitle();
    }

    public BingResultPage searchFor(String searchTerm) {
        WebElement inputElement = webDriver.findElement(By.id("sb_form_q"));
        inputElement.sendKeys(searchTerm);
        inputElement.submit();
        return new BingResultPage(webDriver);
    }
}
