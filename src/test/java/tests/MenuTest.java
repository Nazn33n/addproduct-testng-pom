package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.MenuPage;
import pages.Page;

public class MenuTest extends BaseTest{
    WebDriver driver;
    Page page;

    public MenuTest(String url) {
        super(url);
    }

    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page = BaseTest.page;
    }

    @Test
    public void getHoverToMenu() throws InterruptedException {
        page.getInstance(MenuPage.class).getHoverToMenu().click();
        page.getInstance(MenuPage.class).getHoverToSubMenu().click();
//        page.getInstance(MenuPage.class).getAddCartButton().click();
        Thread.sleep(3000);
    }
}
