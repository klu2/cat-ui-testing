package cc.catalysts.uitesting.bing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Klaus Lehner
 */
public class BingResultPage {
    private final WebDriver webDriver;

    /**
     * The result page can only be created via the {@link cc.catalysts.uitesting.bing.BingStartPage}
     *
     * @param webDriver the webDriver in use
     */
    BingResultPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    /**
     * @return the term that we searched for
     */
    public String getSearchTerm() {
        return webDriver.findElement(By.id("sb_form_q")).getAttribute("value");
    }

    public long getNumberOfResults() {
        String sb_count = webDriver.findElement(By.className("sb_count")).getText();
        // TODO localization here, only extract numbers
        String count = sb_count.replace(" ", "").replace("RESULTS", "").trim();
        return Long.parseLong(count);
    }
}
