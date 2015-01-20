package cc.catalysts.uitesting.bing;

import cc.catalysts.uitesting.utils.Configuration;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * @author Klaus Lehner
 */
public class BingStartPageTest {

    private static WebDriver driver;

    @BeforeClass
    public static void createDriver() {
        driver = Configuration.getDriver();
    }

    @AfterClass
    public static void closeDriver() {
        driver.close();
    }

    @Test
    public void gotoStartPage() {
        BingStartPage page = new BingStartPage(driver);
        Assert.assertNotNull(page);
        Assert.assertEquals("Bing", page.getTitle());
    }

    @Test
    public void searchForCatalysts() {
        BingStartPage page = new BingStartPage(driver);
        BingResultPage bingResultPage = page.searchFor("Catalysts");
        Assert.assertNotNull(bingResultPage);
        Assert.assertEquals("Catalysts", bingResultPage.getSearchTerm());
        Assert.assertTrue(1000 < bingResultPage.getNumberOfResults());
    }
}
