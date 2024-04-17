package tests;

import org.openqa.selenium.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.NewAccountPage;
import pages.Page;

import static utils.Constant.first_name;

public class HomeTest extends BaseTest{
    WebDriver driver;
    Page page;

    public HomeTest(String url) {
        super(url);
    }

    @BeforeClass
    public void beforeClass(){
        driver = BaseTest.driver;
        page = BaseTest.page;

    }

    @Test
    public void locatorTest() throws Exception {
        SoftAssert softAssert = new SoftAssert();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        System.out.println("Test Start .......");

//        popupHandle();

        String pageTitle = driver.getTitle();     //Get the page title
        System.out.println("Page title is: "+pageTitle);

        //Get the current URL
        String current_url = driver.getCurrentUrl();
        System.out.println("Current url is: "+current_url);
        softAssert.assertEquals(current_url,"luma_url");

//        page.getInstance(HomePage.class).getEmailField().sendKeys(user_email);
//        page.getInstance(HomePage.class).getPasswordField().sendKeys(password);
//        page.getInstance(HomePage.class).getCompany().sendKeys(company_name);
//        page.getInstance(HomePage.class).getMobile_number().sendKeys(Mobile_number);
//        page.getInstance(HomePage.class).getSubmit_btn().click();
        page.getInstance(HomePage.class).getClickNewAccountCreateLink().click();

//        //LinkText & PartialLinkText
//        WebElement checkoutButton = page.getInstance(HomePage.class).getCheckoutBtn();
//        checkoutButton.click();
//        page.getInstance(HomePage.class).getJoinTrainingLink().click();   //linkText
//
//        Thread.sleep(5000);
//
//        //Window handles
//        Set w = driver.getWindowHandles();
//        Iterator t = w.iterator();
//        String parent = (String) t.next();
//        String child = (String) t.next();
//        driver.switchTo().window(child);
//        driver.close();
//
//        driver.switchTo().window(parent);
//
//        Thread.sleep(2000);
//
//        driver.navigate().refresh();  //Refresh the current page
//        page.getInstance(HomePage.class).getCheckoutBtn().click();
//        page.getInstance(HomePage.class).getTryTestCaseStudioLink().click();   //PartialLinkText
//        driver.switchTo().window(parent);
//
//        //Select element for dropdown
//        WebElement chooseCarDropdown = page.getInstance(HomePage.class).getCarDD();
//        Select select = new Select(chooseCarDropdown);
//        List<WebElement> carTypes = select.getOptions();
//        carTypes.get(1).click();
//
//        //Scroll down
//        js.executeScript("window.scrollBy(200,0)", "");
//
//        //Find the date time picker control
//        WebElement datePicker = page.getInstance(HomePage.class).getDatePicker();
////        datePicker.click();
//        datePicker.sendKeys("03282024");   //Fill date as mm/dd/yyyy as 03/28/2024
//        datePicker.sendKeys(Keys.TAB);
//        takeScreenshot(driver, "./resources/"+"Screenshots\\datepicker.png");
//
//
//        //Scroll down
//        js.executeScript("window.scrollBy(700,0)", "");
//
//        //Checkbox Select
//        page.getInstance(HomePage.class).getFirstCheckbox().click();
//        page.getInstance(HomePage.class).getSecondCheckbox().click();
//        page.getInstance(HomePage.class).getThirdCheckbox().click();
//
//        //Finding number of Rows
//        List<WebElement> rowsNumber = page.getInstance(HomePage.class).getRow();
//        int rowCount = rowsNumber.size();
//        System.out.println("No of rows in this table : " + rowCount);
//
//        //Finding number of Columns
//        List<WebElement> columnsNumber = page.getInstance(HomePage.class).getColumn();
//        int columnCount = columnsNumber.size();
//        System.out.println("No of columns in this table : " + columnCount);
//
//        //Finding cell value at 6th row and 2rd column
//        WebElement cellAddress = page.getInstance(HomePage.class).getCellValue();
//        String value = cellAddress.getText();
//        System.out.println("The Cell Value is : " +value);
//
//        //Call the screenshot function
//        takeScreenshot(driver, "./resources/"+"Screenshots\\test.png");
//
//
//
//        //Scroll down
//        js.executeScript("window.scrollBy(600,0)", "");
//        js.executeScript("window.scrollBy(800,0)", "");
//
//
//
//        //Upload file from choose file
//        String filePath = System.getProperty("user.dir") + "\\resources\\Image.png";
//        page.getInstance(HomePage.class).getChooseFile().sendKeys(filePath);
//
//
//        //Handling Window Alerts
//        page.getInstance(HomePage.class).getAlertBtn().click();
//
//        Alert alert;
//        alert = driver.switchTo().alert();
//        System.out.println("Alert text is: "+alert.getText());
//        alert.accept();
//
//
//
//        page.getInstance(HomePage.class).getPromptAlertBtn().click();
//        alert = driver.switchTo().alert();
//
//        driver.switchTo().alert().sendKeys("Test.......Test........");
//        alert.dismiss();
//
//        //Capture the contents of a page
//        String pageContent = js.executeScript("return document.documentElement.outerHTML;").toString();
//        System.out.println("Page Content is: "+pageContent);

    }
}
