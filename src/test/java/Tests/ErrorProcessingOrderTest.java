package Tests;

import HelpMethods.ElementMethods;
import ObjectData.ErrorProcessingOrderObject;
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
import SharedData.Hooks;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ErrorProcessingOrderTest extends Hooks {

    @Test

    public void TestMethod(){

        ErrorProcessingOrderObject errorProcessingOrderObject = new ErrorProcessingOrderObject(testData);

        DashboardPage dashboardPage = new DashboardPage(getDriver());
        dashboardPage.clickProduct(2);

        ProductPage productPage = new ProductPage(getDriver());
        productPage.addProductToCart();
        productPage.interactViewCartButton();

        CartPage cartPage = new CartPage(getDriver());
        cartPage.proceedToCheckout();

        CheckoutPage checkoutPage= new CheckoutPage(getDriver());
        checkoutPage.fillCheckoutForm(errorProcessingOrderObject);
        checkoutPage.createNewAccount(errorProcessingOrderObject);
        checkoutPage.checkAgreeTerms();
        checkoutPage.placeOrder();
        checkoutPage.validateMessage(errorProcessingOrderObject.getExpectedMessage());
    }
}
