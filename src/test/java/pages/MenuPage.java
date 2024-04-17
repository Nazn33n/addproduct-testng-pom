package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.io.IOException;

public class MenuPage extends BasePage {

    By mainMenu;
    By subMenu;
//    By addCart;

    public MenuPage(WebDriver driver) throws IOException {
        super(driver);
        mainMenu = By.xpath("//span[normalize-space()='Women']");
        subMenu = By.xpath("/html/body/div[2]/main/div[4]/div[2]/div[1]/div[2]/dl/dd/ol/li[1]/a");
//        addCart = By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[4]/ol/li[1]/div/div/div[4]/div/div[1]/form/button");
    }

    public WebElement getHoverToMenu() {
        return elementWithWait(mainMenu, "presence");

    }

    public void moveToMenu() {
        WebElement hoverMenu = getHoverToMenu();
        Actions m = new Actions((WebDriver) hoverMenu);
        m.moveToElement(hoverMenu);
        m.build().perform();

    }

    public WebElement getHoverToSubMenu() {
        return elementWithWait(subMenu, "presence");

    }

    public void moveToSubMenu() {
        WebElement hoverSubMenu = getHoverToSubMenu();
        Actions m1 = new Actions((WebDriver) hoverSubMenu);
        m1.moveToElement(hoverSubMenu);
        m1.build().perform();

    }
//    public WebElement getAddCartButton() {
//        return elementWithWait(addCart, "clickable");
//
//    }
}
