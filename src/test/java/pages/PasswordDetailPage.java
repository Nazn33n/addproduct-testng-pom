package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class PasswordDetailPage extends BasePage {

    By currentPassword;
    By newPassword;
    By newPasswordConfirmation;
    By saveButton;

    public PasswordDetailPage(WebDriver driver) throws IOException {
        super(driver);
        currentPassword = By.xpath("//*[@id=\"current-password\"]");
        newPassword = By.xpath("//*[@id=\"password\"]");
        newPasswordConfirmation = By.xpath("//*[@id=\"password-confirmation\"]");
        saveButton = By.xpath("/html/body/div[2]/main/div[2]/div[1]/form/div/div[1]/button");
    }

    public WebElement getCurrentPassword() {
        return elementWithWait(currentPassword, "presence");
    }

    public WebElement getNewPassword() {
        return elementWithWait(newPassword, "presence");
    }

    public WebElement getNewPasswordConfirmation() {
        return elementWithWait(newPasswordConfirmation, "presence");
    }

    public WebElement getSaveButton() {
        return elementWithWait(saveButton, "clickable");
    }
}
