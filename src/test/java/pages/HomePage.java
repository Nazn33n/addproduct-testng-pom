package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.IOException;


public class HomePage extends BasePage {
    public HomePage(WebDriver driver) throws IOException {
        super(driver);
    }
    private By clickNewAccountCreateLink = By.linkText("Create an Account");
    public WebElement getClickNewAccountCreateLink() {
        return elementWithWait(clickNewAccountCreateLink, "clickable");
    }

}
