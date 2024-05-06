package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class PasswordDetailPage extends BasePage {

    private By currentPassword = By.id("current-password");
    private By newPassword = By.id("password");
    private By newPasswordConfirmation = By.id("password-confirmation");
    private By saveButton = By.cssSelector("button[title='Save'] span");

    public PasswordDetailPage(WebDriver driver) throws IOException {
        super(driver);
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
