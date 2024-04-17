package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;


public class MyAccountPage extends HomePage {

    By changePassword;


    public MyAccountPage(WebDriver driver) throws IOException {
        super(driver);
        changePassword = By.linkText("Change Password");

    }

    public WebElement getChangePassword() {
        return elementWithWait(changePassword, "clickable");
    }


}
