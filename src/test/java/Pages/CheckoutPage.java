package Pages;

import ObjectData.ErrorProcessingOrderObject;
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
    private WebElement firstNameField;
    @FindBy(id="billing_last_name")
    private WebElement lastNameField;
    @FindBy(id="select2-billing_country-container")
    private WebElement countryField;
    @FindBy(css = ".select2-search__field")
    private WebElement countryInputField;
    @FindBy(id="billing_address_1")
    private WebElement addressField;
    @FindBy(id="billing_address_2")
    private WebElement addressField2;
    @FindBy(id="billing_city")
    private WebElement townField;
    @FindBy(id="select2-billing_state-container")
    private WebElement stateField;
    @FindBy(css = ".select2-search__field")
    private WebElement stateInputField;
    @FindBy(id="billing_postcode")
    private WebElement postalCodeField;
    @FindBy(id="billing_phone")
    private WebElement phoneField;
    @FindBy(id="billing_email")
    private WebElement emailField;
    @FindBy(id="createaccount") //asa e scris in site, nu modifica
    private WebElement createAccountCheckbox;
    @FindBy(xpath = "//div[@class='create-account']/p/span/input[@name='account_username']")
    private WebElement usernameField;
    @FindBy(id="account_password")
    private WebElement passwordField;
    @FindBy(css=".validate-required .checkbox ")
    private WebElement agreeTermsCheckbox;
    @FindBy(id="place_order")
    private WebElement placeOrderButton;
    @FindBy(css=".woocommerce-error")
    private WebElement orderStatusMessage;

    public void fillCheckoutForm(ErrorProcessingOrderObject errorProcessingOrderObject){
        fillFirstName(errorProcessingOrderObject.getFirstNameValue());
        fillLastName(errorProcessingOrderObject.getLastNameValue());
        selectCountryField();
        selectCountry(errorProcessingOrderObject.getCountryValue());
        fillAddress1(errorProcessingOrderObject.getAddressValue());
        fillAddress2(errorProcessingOrderObject.getAddressValue2());
        selectStateField();
        selectState(errorProcessingOrderObject.getStateValue());
        fillTown(errorProcessingOrderObject.getTownValue());
        fillPostalCode(errorProcessingOrderObject.getPostalCodeValue());
        fillPhone(errorProcessingOrderObject.getPhoneValue());
        fillEmail(errorProcessingOrderObject.getEmailValue() + System.currentTimeMillis() + "@test.ro");
    }
    public void createNewAccount(ErrorProcessingOrderObject errorProcessingOrderObject){
        interactCreateAccount();
        fillUsername(errorProcessingOrderObject.getUsernameValue() +System.currentTimeMillis());
        fillPassword(errorProcessingOrderObject.getPasswordValue());
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
