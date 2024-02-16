package Pages;

import Logger.LoggerUtility;
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
        LoggerUtility.info("User fills in first name value");
    }
    public void fillLastName(String lastNameValue){
        elementMethods.fillElement(lastNameField, lastNameValue);
        LoggerUtility.info("User fills in last name value");
    }
    public void selectCountryField(){
        elementMethods.clickElement(countryField);
        LoggerUtility.info("User clicks on country field");
    }
    public void selectCountry(String countryValue){
        elementMethods.fillElement(countryInputField, countryValue, Keys.ENTER);
        LoggerUtility.info("User searches for country value and presses ENTER");
    }
    public void fillAddress1(String addressValue){
    elementMethods.fillElement(addressField, addressValue);
        LoggerUtility.info("User fills in first address field");
    }

    public void fillAddress2(String addressValue2){
    elementMethods.fillElement(addressField2, addressValue2);
        LoggerUtility.info("User fills in second address field");
    }

    public void fillTown(String townValue){
    elementMethods.fillElement(townField, townValue);
        LoggerUtility.info("User fills in town value");
    }
    public void selectStateField(){
        elementMethods.clickElement(stateField);
        LoggerUtility.info("User clicks on state field");
    }
    public void selectState(String stateValue){
        elementMethods.fillElement(stateInputField, stateValue, Keys.ENTER);
        LoggerUtility.info("User fills in state value and presses ENTER");
    }

    public void fillPostalCode(String postalCodeValue){
        elementMethods.fillElement(postalCodeField, postalCodeValue);
        LoggerUtility.info("User fills in postal code value value");
    }

    public void fillPhone(String phoneValue){
        elementMethods.fillElement(phoneField, phoneValue);
        LoggerUtility.info("User fills in phone value");
    }
    public void fillEmail(String emailValue){
        elementMethods.fillElement(emailField, emailValue);
        LoggerUtility.info("User fills in email value");
    }
    public void interactCreateAccount(){
        elementMethods.clickElement(createAccountCheckbox);
        LoggerUtility.info("User checks create account option");
    }

    public void fillUsername(String usernameValue){
        elementMethods.fillElement(usernameField, usernameValue);
        LoggerUtility.info("User fills in username value");
    }
    public void fillPassword(String passwordValue){
        elementMethods.fillElement(passwordField, passwordValue);
        LoggerUtility.info("User fills in password value");
    }
    public void checkAgreeTerms(){
        elementMethods.scrollByPixels(0,-400);
        elementMethods.clickElement(agreeTermsCheckbox);
        LoggerUtility.info("User checks the agree terms checkbox");
    }
    public void placeOrder(){
        elementMethods.clickElement(placeOrderButton);
        LoggerUtility.info("User clicks on place order button");
    }
    public void validateMessage(String expectedMessage){
        elementMethods.validateElementContainsMessage(orderStatusMessage,expectedMessage);
        LoggerUtility.info("Validating invalid order status message");
    }






}
