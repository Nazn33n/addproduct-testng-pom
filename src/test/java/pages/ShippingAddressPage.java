package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class ShippingAddressPage extends BasePage {
    private By usersEmailAddress = By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[1]/fieldset/div/div/input");
    private By usersFirstName = By.name("firstname");
    private By usersLastName = By.name("lastname");
    private By usersCompany = By.name("company");
    private By usersAddress = By.name("street[0]");
    private By usersCity = By.name("city");
    private By usersState = By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[5]/div/select");
    private By usersPostalCode = By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[7]/div/input");
    private By usersPhoneNumber = By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[1]/div[2]/form[2]/div/div[9]/div/input");
    private By usersMethod = By.xpath("/html/body/div[2]/main/div[2]/div/div[3]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/input");

    private By nextButton = By.cssSelector("\"span[data-bind=\"i18n: 'Next'\"]\"");
    private By placeButton = By.cssSelector("\"span[data-bind=\"i18n: 'Place Order'\"]\"");
    private By successfulTxt = By.xpath("\"//span[@class='base']\"");
    public ShippingAddressPage(WebDriver driver) throws IOException {
        super(driver);

    }

    public WebElement getUsersEmailAddress() {
        return elementWithWait(usersEmailAddress, "presence");
    }

    public WebElement getUsersFirstName() {
        return elementWithWait(usersFirstName, "presence");
    }

    public WebElement getUsersLastName() {
        return elementWithWait(usersLastName, "presence");
    }

    public WebElement getUsersCompany() {
        return elementWithWait(usersCompany, "presence");
    }

    public WebElement getUsersAddress() {
        return elementWithWait(usersAddress, "presence");
    }

    public WebElement getUsersCity() {
        return elementWithWait(usersCity, "presence");
    }


//    public WebElement getUsersStateDropdown() {
//        return elementWithWait(usersState, "visibility");
//    }

    public void getStateDropdown(WebElement drop) {
        Select select = new Select(drop);
        List<WebElement> Types = select.getOptions();
        int size = Types.size();
        Random random = new Random();
        int randomIndex = random.nextInt(size);
        Types.get(randomIndex).click();
    }

    public WebElement getUsersPostalCode() {
        return elementWithWait(usersPostalCode, "presence");
    }


    public WebElement getUsersPhoneNumber() {
        return elementWithWait(usersPhoneNumber, "presence");
    }

    public WebElement getUsersMethod() {
        return elementWithWait(usersMethod, "presence");
    }



    public WebElement getClickNextButton() {
        return elementWithWait(nextButton, "clickable");
    }

    public WebElement getPlaceOrderButton() {
        return elementWithWait(placeButton, "clickable");
    }
    public WebElement getOrderPurchasedSuccessfulText() {
        return elementWithWait(successfulTxt, "visibility");
    }
}
