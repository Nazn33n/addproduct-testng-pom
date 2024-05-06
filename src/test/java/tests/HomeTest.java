package tests;

import org.openqa.selenium.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.Page;
import java.util.Iterator;
import java.util.Set;
import static utils.Constant.*;


public class HomeTest extends BaseTest {
    WebDriver driver;
    Page page;
    JavascriptExecutor js;

    public HomeTest(String url) {
        super(url);
    }

    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page = BaseTest.page;

    }

    @Test
    public void locatorTest() throws Exception {
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Test Start .......");
        String pageTitle = driver.getTitle();     //Get the page title
        System.out.println("Page title is: " + pageTitle);

        //Get the current URL
        String current_url = driver.getCurrentUrl();
        System.out.println("Current url is: " + current_url);
        softAssert.assertEquals(current_url, "luma_url");
        page.getInstance(HomePage.class).getClickNewAccountCreateLink().click();
    }

}
