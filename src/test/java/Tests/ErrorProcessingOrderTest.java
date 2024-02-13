package Tests;

import HelpMethods.ElementMethods;
import Pages.CartPage;
import Pages.CheckoutPage;
import Pages.DashboardPage;
import Pages.ProductPage;
import SharedData.SharedData;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ErrorProcessingOrderTest extends SharedData {

    @Test

    public void TestMethod(){

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickProduct(2);

        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart();
        productPage.interactViewCartButton();

        CartPage cartPage = new CartPage(driver);
        cartPage.proceedToCheckout();

        String firstNameValue = "Roxana";
        String lastNameValue = "Petrila";
        String countryValue = "Romania";
        String addressValue = "Strada Test, nr.5";
        String addressValue2 = "Bl.1, ap.2, et. 3";
        String townValue = "Timisoara";
        String stateValue = "Timis";
        String postalCodeValue = "300100";
        String phoneValue = "0799999999";
        String emailValue = "testemail" + System.currentTimeMillis() +"@test.ro";
        String usernameValue="Test" + System.currentTimeMillis();
        String passwordValue = "TestPassword1234!@";
        String expectedMessage = "Error processing checkout. Please try again.";


        CheckoutPage checkoutPage= new CheckoutPage(driver);
        checkoutPage.fillCheckoutForm(firstNameValue, lastNameValue, countryValue, addressValue, addressValue2,
                                        townValue, stateValue, postalCodeValue, phoneValue, emailValue);
        checkoutPage.createNewAccount(usernameValue, passwordValue);
        checkoutPage.checkAgreeTerms();
        checkoutPage.placeOrder();
        checkoutPage.validateMessage(expectedMessage);




//        //Fill in the form
//
//        WebElement firstNameField = driver.findElement(By.id("billing_first_name"));
//        String firstNameValue = "Roxana";
//        firstNameField.sendKeys(firstNameValue);
//
//        WebElement lastNameField = driver.findElement(By.id("billing_last_name"));
//        String lastNameValue = "Petrila";
//        lastNameField.sendKeys(lastNameValue);
//
//        WebElement countryField = driver.findElement(By.id("select2-billing_country-container"));
//        countryField.click();
//        WebElement countryInputField = driver.findElement(By.cssSelector(".select2-search__field"));
//        String countryValue = "Romania";
//        countryInputField.sendKeys(countryValue);
//        countryInputField.sendKeys(Keys.ENTER);
//
//        WebElement addressField = driver.findElement(By.id("billing_address_1"));
//        String addressValue = "Strada Test, nr.5";
//        addressField.sendKeys(addressValue);
//
//        WebElement addressField2 = driver.findElement(By.id("billing_address_2"));
//        String addressValue2 = "Bl.1, ap.2, et. 3";
//        addressField2.sendKeys(addressValue2);
//
//        WebElement townField = driver.findElement(By.id("billing_city"));
//        String townValue = "Timisoara";
//        townField.sendKeys(townValue);
//
//        WebElement countyField = driver.findElement(By.id("select2-billing_state-container"));
//        countyField.click();
//        WebElement countyInputField = driver.findElement(By.cssSelector(".select2-search__field"));
//        String countyValue = "Timis";
//        countyInputField.sendKeys(countyValue);
//        countyInputField.sendKeys(Keys.ENTER);
//
//        WebElement postalCodeField = driver.findElement(By.id("billing_postcode"));
//        String postalCodeValue = "300100";
//        postalCodeField.sendKeys(postalCodeValue);
//
//        WebElement phoneField = driver.findElement(By.id("billing_phone"));
//        String phoneValue = "0799999999";
//        phoneField.sendKeys(phoneValue);
//
//        WebElement emailField = driver.findElement(By.id("billing_email"));
//        String emailValue = "testemail" + System.currentTimeMillis() +"@test.ro";
//        emailField.sendKeys(emailValue);
//
//        WebElement createAccountCheckbox = driver.findElement(By.id("createaccount"));
//        createAccountCheckbox.click();
//
//        elementMethods.scrollByPixels(0,200);
//
//
//        WebElement usernameField = driver.findElement(By.xpath("//div[@class='create-account']/p/span/input[@name='account_username']"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOf(usernameField));
//        String usernameValue = "Test" + System.currentTimeMillis();
//        usernameField.sendKeys(usernameValue);
//
//        WebElement passwordField = driver.findElement(By.id("account_password"));
//        String passwordValue= "TestPassword1234!@";
//        p
//
//        WebElement agreeTermsCheckbox = driver. findElement(By.cssSelector(".validate-required .checkbox "));
//        agreeTermsCheckbox.click();
//
//        WebElement placeOrderButton = driver.findElement(By.id("place_order"));
//        placeOrderButton.click();
//
//        WebElement orderStatus = driver.findElement(By.cssSelector(".woocommerce-error"));
//        wait.until(ExpectedConditions.visibilityOf(orderStatus));
//        String statusMessage = orderStatus.getText();
////        System.out.println(statusMessage);
//
//        String expectedMessage = "Error processing checkout. Please try again.";
//
//        Assert.assertTrue(statusMessage.contains(expectedMessage));

    }


}
