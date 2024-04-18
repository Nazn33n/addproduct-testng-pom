package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddProductPage;
import pages.MenuPage;
import pages.Page;

public class AddProductTest extends BaseTest{
    WebDriver driver;
    Page page;

    public AddProductTest(String url) {
        super(url);
    }

    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page = BaseTest.page;
    }

    @Test
    public void getAddProduct() throws InterruptedException {

        page.getInstance(AddProductPage.class).getAddToCart().click();
        page.getInstance(AddProductPage.class).getSelectSize().click();
        page.getInstance(AddProductPage.class).getSelectColor().click();
        page.getInstance(AddProductPage.class).getAddToCartButton().click();
        page.getInstance(AddProductPage.class).getClickCart().click();
        page.getInstance(AddProductPage.class).getViewCartDetail().click();
        page.getInstance(AddProductPage.class).getCheckoutButton().click();
        Thread.sleep(3000);
    }
}
