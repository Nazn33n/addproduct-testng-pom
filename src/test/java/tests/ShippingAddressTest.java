package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddProductPage;
import pages.Page;
import pages.ShippingAddressPage;

import static utils.Constant.*;

public class ShippingAddressTest extends BaseTest{
    WebDriver driver;
    Page page;

    public ShippingAddressTest(String url) {
        super(url);
    }

    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page = BaseTest.page;
    }

    @Test
    public void getAddShippingInformation() throws InterruptedException {

//        page.getInstance(ShippingAddressPage.class).getUsersEmailAddress().sendKeys(users_Email_Address);
        page.getInstance(ShippingAddressPage.class).getUsersFirstName().sendKeys(users_FirstName);
        page.getInstance(ShippingAddressPage.class).getUsersLastName().sendKeys(users_LastName);
        page.getInstance(ShippingAddressPage.class).getUsersCompany().sendKeys(users_Company);
        page.getInstance(ShippingAddressPage.class).getUsersAddress().sendKeys(users_Address);
        page.getInstance(ShippingAddressPage.class).getUsersCity().sendKeys(users_City);
        page.getInstance(ShippingAddressPage.class).getUsersPhoneNumber().sendKeys(users_Phone_Number);
//        page.getInstance(ShippingAddressPage.class).getStateDropdown().click();
        page.getInstance(ShippingAddressPage.class).getUsersPostalCode().sendKeys(users_Postal_Code);
        page.getInstance(ShippingAddressPage.class).getUsersMethod().click();
        page.getInstance(ShippingAddressPage.class).getClickNextButton().click();

        Thread.sleep(9000);


    }
}
