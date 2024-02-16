package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage extends BasePage  {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }


    //This is the page where you land after log in
    //On this page will appear all elements specific to dashboard /homepage

    //MyWishlist button

    //MyAccount button
    @FindBy(xpath = "//a[text()='My Account']")
    private WebElement myAccountButton;

    //Products cards
    @FindBy(xpath= "//div[contains(@class,'noo-shortcode-product-wrap')]/div[contains(@class,'noo-sh-product-grid woocommerce')]" +
            "/div[contains(@class,'noo-sh-product-html columns_3 no_masonry three row is-flex')]" +
            "//div[contains(@class, 'noo-product-item noo-product-sm-4 not_featured')]")
    private List<WebElement> itemCard;

    //Checkout button
    //Products cards
    //Add to favorites button
    //Cart Icon

    //dupa ce se definesc elementele cu @FindBy aduse din test -> se creeaza metodele pe care se folosesc aceste elemente
    //de ex. metoda ce face click pe MyWishlist button
    //metoda ce face click pe myaccount button, click pe cardul produsului etc.

    public void clickMyAccountButton(){
        elementMethods.clickElement(myAccountButton);
        LoggerUtility.info("The user clicks on MyAccount button");
    }

    public void clickProduct(Integer index){
        elementMethods.clickElementInList(itemCard, index);
        LoggerUtility.info("The user clicks on a product card");
    }


}
