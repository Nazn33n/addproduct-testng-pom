package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class LoginPage extends BasePage {

    By loginEmail;
    By loginPassword;
    By loginSubmitButton;

    public LoginPage(WebDriver driver) throws IOException {
        super(driver);
        loginEmail = By.xpath("//*[@id=\"email\"]");
        loginPassword = By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/div[2]/form/fieldset/div[3]/div/input");
        loginSubmitButton = By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/div[2]/form/fieldset/div[4]/div[1]/button");

    }

    public WebElement getLoginEmail() {
        return elementWithWait(loginEmail, "presence");
    }

    public WebElement getLoginPassword() {
        return elementWithWait(loginPassword, "presence");
    }

    public WebElement getLoginSubmitButton() {
        return elementWithWait(loginSubmitButton, "clickable");
    }
}
