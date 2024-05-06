package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Page;
import pages.PasswordDetailPage;

import static utils.Constant.*;

public class PasswordDetailTest extends BaseTest {

    WebDriver driver;
    Page page;

    public PasswordDetailTest(String url) {
        super(url);
    }

    @BeforeClass
    public void beforeClass() {
        driver = BaseTest.driver;
        page = BaseTest.page;
    }

    @Test
    public void changePasswordDetailTest() throws InterruptedException {
        page.getInstance(PasswordDetailPage.class).getCurrentPassword().sendKeys(current_password);
        page.getInstance(PasswordDetailPage.class).getNewPassword().sendKeys(new_password);
        page.getInstance(PasswordDetailPage.class).getNewPasswordConfirmation().sendKeys(new_password_confirmation);
        page.getInstance(PasswordDetailPage.class).getSaveButton().click();

    }
}
