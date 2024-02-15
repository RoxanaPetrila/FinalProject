package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ProductPage extends BasePage {
    public WebDriver driver;

    public ProductPage(WebDriver driver) {
        super(driver);
    }
    //pagina in care vezi elementele de pe produs
    //titlulProdusului
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

    //mesajul de adaugat corect
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

    public void getProductTitle(){
        productTitle.getText();
    }
    public void interactColorField(){
        elementMethods.clickElement(colorField);
    }
    public void chooseColor(){
        elementMethods.clickElement(colorValue);
    }
    public void interactSizeField(){
        elementMethods.clickElement(sizeField);
    }
    public void chooseSize(Integer index){
        elementMethods.clickElementInList(sizeValue,index);
    }
    public void interactQuantityPicker(){
        elementMethods.clickElement(quantityPicker);
    }
    public void addItemToCart(){
        elementMethods.clickElement(addToCartButton);
    }

    public void validateAddedToCart(String expectedMessage){
        elementMethods.validateElementContainsMessage(successMessage, expectedMessage);

    }
    public void validateOkMessage(){
        elementMethods.validateElementVisible(successMessage);
    }

    public void interactViewCartButton(){
        elementMethods.clickElement(viewCartButton);
    }








}
