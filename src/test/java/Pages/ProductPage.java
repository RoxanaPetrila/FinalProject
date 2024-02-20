package Pages;

import Logger.LoggerUtility;
import ObjectData.AddItemToCartObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;
import java.util.Locale;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    //Elements found on product page -  after user opens product card

    @FindBy(xpath = "//h1[@class='product_title entry-title']")
    private WebElement productTitle;
    //color picker
    @FindBy(id="pa_color")
    private WebElement colorField;
    @FindBy(xpath = "//select[@id='pa_color']/option[@class='attached enabled']")
    private WebElement colorValue;
    //size Picker
    @FindBy(id="pa_size")
    private WebElement sizeField;

    @FindBy(xpath = "//select[@id='pa_size']/option[@class='attached enabled']")
    private List<WebElement> sizeValue;

    //quantity picker
    @FindBy(xpath = "//button[@class='qty-increase']")
    private WebElement quantityPicker;

    //add to cart button

    @FindBy(xpath = "//button[@type='submit'][@class='single_add_to_cart_button button alt']")
    private WebElement addToCartButton;

    @FindBy(xpath = "//div[@class='wc-block-components-notice-banner is-success']")
    private WebElement successMessage;

    @FindBy(xpath = "//a[@class='button wc-forward']")
    private WebElement viewCartButton;

    public void addProductToCart(){
        interactColorField();
        chooseColor();
        interactSizeField();
        chooseSize(2);
        interactQuantityPicker();
        addItemToCart();

    }
   public void validateSuccessMessage(AddItemToCartObject addItemToCartObject){
        validateOkMessage();
        validateNameInCart();
        validateAddedToCart(addItemToCartObject);
   }
    public void interactColorField(){
        elementMethods.clickElement(colorField);
        LoggerUtility.info("User clicks on color field");
    }
    public void chooseColor(){
        elementMethods.clickElement(colorValue);
        LoggerUtility.info("User chooses color value");
    }
    public void interactSizeField(){
        elementMethods.clickElement(sizeField);
        LoggerUtility.info("User clicks on size field");
    }
    public void chooseSize(Integer index){
        elementMethods.clickElementInList(sizeValue,index);
        LoggerUtility.info("User chooses size value");
    }
    public void interactQuantityPicker(){
        elementMethods.clickElement(quantityPicker);
        LoggerUtility.info("User chooses quantity value");
    }
    public void addItemToCart(){
        elementMethods.clickElement(addToCartButton);
        LoggerUtility.info("User clicks on add item to cart button");
    }

    public void validateAddedToCart(AddItemToCartObject addItemToCartObject){
        elementMethods.validateElementContainsMessage(successMessage, addItemToCartObject.getExpectedMessage());
        LoggerUtility.info("Validating that displayed message contains: " + addItemToCartObject.getExpectedMessage());

    }
    public void validateOkMessage(){
        elementMethods.validateElementVisible(successMessage);
        LoggerUtility.info("Validating that success message is visible");
    }
    public void validateNameInCart(){
        String productName = productTitle.getText().toLowerCase();
        String actualMessage = successMessage.getText().toLowerCase();
        Assert.assertTrue(actualMessage.contains(productName));
        LoggerUtility.info("Validating that item name in message is the same as product title: "+ productName);
    }


    public void interactViewCartButton(){
        elementMethods.clickElement(viewCartButton);
        LoggerUtility.info("User clicks on view cart button");
    }








}
