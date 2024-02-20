package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }


    //This is the page where you land after log in
    //On this page will appear all elements specific to dashboard /homepage

    //Add MyWishlist button
    @FindBy(xpath = "//a[@class='add_to_wishlist single_add_to_wishlist']")
    private List<WebElement> addToWishListButton;
    @FindBy(id = "yith-wcwl-message")
    private WebElement successMessageWishlist;

    @FindBy(xpath = "//a[text()='My Wishlist']")
    private WebElement myWishlistButton;

    //MyAccount button
    @FindBy(xpath = "//a[text()='My Account']")
    private WebElement myAccountButton;

    //Products cards
    @FindBy(xpath = "//div[contains(@class,'noo-shortcode-product-wrap')]/div[contains(@class,'noo-sh-product-grid woocommerce')]" +
            "/div[contains(@class,'noo-sh-product-html columns_3 no_masonry three row is-flex')]" +
            "//div[contains(@class, 'noo-product-item noo-product-sm-4 not_featured')]")
    private List<WebElement> itemCard;

    //Methods used on Dashboard elements
    public void clickMyAccountButton() {
        elementMethods.clickElement(myAccountButton);
        LoggerUtility.info("The user clicks on MyAccount button");
    }

    public void clickProduct(Integer index) {
        elementMethods.clickElementInList(itemCard, index);
        LoggerUtility.info("The user clicks on a product card at index " + index);
    }

    //Add an item to wishlist method

    public void clickAddToWishlistButton(Integer index) {
        for (Integer itemPosition = 0; itemPosition <= addToWishListButton.size(); itemPosition++) {
            if (itemPosition.equals(index)) {
                elementMethods.clickElementInList(addToWishListButton, index);
                elementMethods.waitVisibleElement(successMessageWishlist);
            }
        }
        LoggerUtility.info("The user adds item at index " + index + " to wishlist");
    }
    public void clickMyWishlistButton(){
        elementMethods.clickElement(myWishlistButton);
        LoggerUtility.info("The user clicks on MyWishlist button");
    }
}
