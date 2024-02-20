package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//td[@class='product-name']")
    private WebElement productInCart;

    //proceed to checkout button
    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward']")
    private WebElement checkoutButton;

    public void proceedToCheckout(){
        elementMethods.scrollByPixels(0,580);
        elementMethods.clickElement(checkoutButton);
        LoggerUtility.info("User clicks on Proceed to checkout button");
    }
}
//    public void getProductName(){
//        productInCart.getText();
//    }
//    public void validateNameOfProduct(String productName){
//       String nameInCart = productInCart.getText();
//        Assert.assertTrue(nameInCart.contains(productName));
//    }