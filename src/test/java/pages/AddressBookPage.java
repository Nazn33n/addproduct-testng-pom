package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

public class AddressBookPage extends BasePage {
    By editAddress;
    By phoneNumber;
    By addressOne;
    By addressTwo;
    By addressThree;
    By cityName;
    By stateDropdown;
    By zipCode;
    By countryDropdown;
    By saveAddressButton;


    public AddressBookPage(WebDriver driver) throws IOException {
        super(driver);


        editAddress = By.xpath("/html/body/div[2]/main/div[2]/div[1]/div[5]/div[2]/div[1]/div[2]/a");
        phoneNumber = By.xpath("//*[@id=\"telephone\"]");
        addressOne = By.xpath("//*[@id=\"street_1\"]");
        addressTwo = By.xpath("//*[@id=\"street_2\"]");
        addressThree = By.xpath("//*[@id=\"street_3\"]");
        cityName = By.xpath("//*[@id=\"city\"]");
        stateDropdown = By.xpath("/html/body/div[2]/main/div[2]/div[1]/form/fieldset[2]/div[3]/div/select");
        zipCode = By.xpath("//*[@id=\"zip\"]");
        countryDropdown = By.xpath("/html/body/div[2]/main/div[2]/div[1]/form/fieldset[2]/div[5]/div/select");
        saveAddressButton = By.xpath("/html/body/div[2]/main/div[2]/div[1]/form/div/div[1]/button");


    }

    public WebElement getEditAddress() {
        return elementWithWait(editAddress, "clickable");
    }

    public WebElement getPhoneNumber() {
        return elementWithWait(phoneNumber, "presence");
    }

    public WebElement getAddressOne() {
        return elementWithWait(addressOne, "presence");
    }

    public WebElement getAddressTwo() {
        return elementWithWait(addressTwo, "presence");
    }

    public WebElement getAddressThree() {
        return elementWithWait(addressThree, "presence");
    }

    public WebElement getCityName() {
        System.out.println("City name");
        return elementWithWait(cityName, "presence");
    }

    public WebElement getStateDropdownElement() {
        return elementWithWait(stateDropdown, "visibility");
    }

    public void getStateDropdown() {
        WebElement z = getStateDropdownElement();
        Select select = new Select(z);
        System.out.println("selecting Alaska");

        select.selectByVisibleText("Alaska");
//        return elementWithWait(stateDropdown, "clickable");
    }

    public WebElement getZipCode() {
        return elementWithWait(zipCode, "presence");
    }

    public WebElement getCountryDropdownElement() {
        return elementWithWait(countryDropdown, "presence");
    }

    public void getCountryDropdown() {
        WebElement z1 = getCountryDropdownElement();
        Select select1 = new Select(z1);
        System.out.println("selecting DZ");

        select1.selectByValue("DZ");


    }

    public WebElement getSaveAddressButton() {
        return elementWithWait(saveAddressButton, "clickable");
    }
}
