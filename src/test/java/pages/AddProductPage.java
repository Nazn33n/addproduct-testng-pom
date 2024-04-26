package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class AddProductPage extends BasePage {
    By addCart;
    By selectSize;
    By selectColor;
    By addToCartButton;
    By clickCart;
    By viewCart;
    By clickCheckoutButton;

    public AddProductPage(WebDriver driver) throws IOException, InterruptedException {
        super(driver);
        addCart = By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[4]/ol/li[1]/div/div/div[4]/div[1]/div[1]/form/button");
        Thread.sleep(3000);
        selectSize = By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[1]/div/div/div[1]/div/div[3]");
        selectColor = By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[1]/div/div/div[2]/div/div[1]");
        addToCartButton = By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/form/div[2]/div/div/div[2]/button");
        clickCart = By.xpath("/html/body/div[2]/header/div[2]/div[1]/a");
        viewCart = By.xpath("/html/body/div[2]/header/div[2]/div[1]/div/div/div/div[2]/div[5]/div/a/span");
        clickCheckoutButton = By.xpath("/html/body/div[2]/main/div[3]/div/div[3]/div[1]/ul/li[1]/button/span");
    }

    public WebElement getAddToCart() {
        return elementWithWait(addCart, "clickable");
    }

    public WebElement getSelectSize() {
        return elementWithWait(selectSize, "clickable");
    }

    public WebElement getSelectColor() {
        return elementWithWait(selectColor, "clickable");
    }

    public WebElement getAddToCartButton() {
        return elementWithWait(addToCartButton, "Clickable");
    }

    public WebElement getClickCart() {
        return elementWithWait(clickCart, "clickable");
    }

    public WebElement getViewCartDetail() {
        return elementWithWait(viewCart, "clickable");

    }

    public WebElement getCheckoutButton() {
        return elementWithWait(clickCheckoutButton, "clickable");

    }
}
