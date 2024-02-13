package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="billing_first_name")
    public WebElement firstNameField;
    @FindBy(id="billing_last_name")
    public WebElement lastNameField;
    @FindBy(id="select2-billing_country-container")
    public WebElement countryField;
    @FindBy(css = ".select2-search__field")
    public WebElement countryInputField;
    @FindBy(id="billing_address_1")
    public WebElement addressField;
    @FindBy(id="billing_address_2")
    public WebElement addressField2;
    @FindBy(id="billing_city")
    public WebElement townField;
    @FindBy(id="select2-billing_state-container")
    public WebElement stateField;
    @FindBy(css = ".select2-search__field")
    public WebElement stateInputField;
    @FindBy(id="billing_postcode")
    public WebElement postalCodeField;
    @FindBy(id="billing_phone")
    public WebElement phoneField;
    @FindBy(id="billing_email")
    public WebElement emailField;
    @FindBy(id="createaccount") //asa e scris in site, nu modifica
    public WebElement createAccountCheckbox;
    @FindBy(xpath = "//div[@class='create-account']/p/span/input[@name='account_username']")
    public WebElement usernameField;
    @FindBy(id="account_password")
    public WebElement passwordField;
    @FindBy(css=".validate-required .checkbox ")
    public WebElement agreeTermsCheckbox;
    @FindBy(id="place_order")
    public WebElement placeOrderButton;
    @FindBy(css=".woocommerce-error")
    public WebElement orderStatusMessage;

    public void fillCheckoutForm(String firstNameValue, String lastNameValue, String countryValue, String addressValue,
                            String addressValue2, String townValue, String stateValue, String postalCodeValue, String phoneValue,
                                 String emailValue){
        fillFirstName(firstNameValue);
        fillLastName(lastNameValue);
        selectCountryField();
        selectCountry(countryValue);
        fillAddress1(addressValue);
        fillAddress2(addressValue2);
        selectStateField();
        selectState(stateValue);
        fillTown(townValue);
        fillPostalCode(postalCodeValue);
        fillPhone(phoneValue);
        fillEmail(emailValue);
    }
    public void createNewAccount(String usernameValue, String passwordValue){
        interactCreateAccount();
        fillUsername(usernameValue);
        fillPassword(passwordValue);
    }


    public void fillFirstName(String firstNameValue){
       elementMethods.fillElement(firstNameField,firstNameValue);
    }
    public void fillLastName(String lastNameValue){
        elementMethods.fillElement(lastNameField, lastNameValue);
    }
    public void selectCountryField(){
        elementMethods.clickElement(countryField);
    }
    public void selectCountry(String countryValue){
        elementMethods.fillElement(countryInputField, countryValue, Keys.ENTER);
    }
    public void fillAddress1(String addressValue){
    elementMethods.fillElement(addressField, addressValue);
    }

    public void fillAddress2(String addressValue2){
    elementMethods.fillElement(addressField2, addressValue2);
    }

    public void fillTown(String townValue){
    elementMethods.fillElement(townField, townValue);
    }
    public void selectStateField(){
        elementMethods.clickElement(stateField);
    }
    public void selectState(String stateValue){
        elementMethods.fillElement(stateInputField, stateValue, Keys.ENTER);
    }

    public void fillPostalCode(String postalCodeValue){
        elementMethods.fillElement(postalCodeField, postalCodeValue);
    }

    public void fillPhone(String phoneValue){
        elementMethods.fillElement(phoneField, phoneValue);
    }
    public void fillEmail(String emailValue){
        elementMethods.fillElement(emailField, emailValue);
    }
    public void interactCreateAccount(){
        elementMethods.clickElement(createAccountCheckbox);
    }

    public void fillUsername(String usernameValue){
        elementMethods.fillElement(usernameField, usernameValue);
    }
    public void fillPassword(String passwordValue){
        elementMethods.fillElement(passwordField, passwordValue);
    }
    public void checkAgreeTerms(){
        elementMethods.scrollByPixels(0,-400);
        elementMethods.clickElement(agreeTermsCheckbox);
    }
    public void placeOrder(){
        elementMethods.clickElement(placeOrderButton);
    }
    public void validateMessage(String expectedMessage){
        elementMethods.validateElementContainsMessage(orderStatusMessage,expectedMessage);
    }






}
