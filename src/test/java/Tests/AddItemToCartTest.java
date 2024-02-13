package Tests;

import HelpMethods.ElementMethods;
import Pages.CartPage;
import Pages.DashboardPage;
import Pages.ProductPage;
import SharedData.SharedData;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddItemToCartTest extends SharedData {

    @Test
    public void test_method(){

        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickProduct(2);

       String expectedMessage="added to your cart.";

        ProductPage productPage = new ProductPage(driver);
        productPage.addProductToCart();
        productPage.validateOkMessage();
        productPage.validateAddedToCart(expectedMessage);
//        productPage.getProductTitle();
//        productPage.interactViewCartButton();
        //????????????????????============================???????????
        //CUM POT FACE VALIDAREA DINTRE NUMELE UNUI ELEMENT DINTR-O PAGINA IN ALTA?
        //DE EXEMPLU VREAU SA PREIAU TITLUL PRODUSULUI DIN PAGINA DE PRODUS (UNDE IL ADAUG IN COS)
        //SI VREAU SA COMPAR TITLUL ASTA CU TITLUL DIN COS CartPAGE ??

    }


}
