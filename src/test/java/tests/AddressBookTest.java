package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddressBookPage;
import pages.MyAccountPage;
import pages.Page;

import static utils.Constant.*;

public class AddressBookTest extends BaseTest {
    WebDriver driver;
    Page page;
    public AddressBookTest(String url){
        super(url);
    }
    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page = BaseTest.page;
    }
    @Test
    public void fillAddressBook() throws InterruptedException {
        page.getInstance(AddressBookPage.class).getEditAddress().click();
        page.getInstance(AddressBookPage.class).getPhoneNumber().sendKeys(phone_number);
        page.getInstance(AddressBookPage.class).getAddressOne().sendKeys(address_one);
        page.getInstance(AddressBookPage.class).getAddressTwo().sendKeys(address_two);
        page.getInstance(AddressBookPage.class).getAddressThree().sendKeys(address_three);
        page.getInstance(AddressBookPage.class).getCityName().sendKeys(city_name);
        page.getInstance(AddressBookPage.class).getStateDropdown();
        page.getInstance(AddressBookPage.class).getZipCode().sendKeys(zip_code);
        page.getInstance(AddressBookPage.class).getCountryDropdown();
        Thread.sleep(3000);
        page.getInstance(AddressBookPage.class).getSaveAddressButton().click();

    }

}
