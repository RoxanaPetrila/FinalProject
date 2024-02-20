package Pages;

import Logger.LoggerUtility;
import ObjectData.LogInObject;
import ObjectData.RegisterInvalidUsernameObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyAccountPage extends BasePage{

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    //page elements
    @FindBy(id="username")
    private WebElement usernameField;
    @FindBy(id="password")
    private WebElement passwordField;
    @FindBy(id="rememberme")
    private WebElement rememberCheckbox;
    @FindBy(xpath = "//button[@name='login']")
    private WebElement loginButton;
    @FindBy(xpath = "//div[@class='woocommerce-MyAccount-content']")
    private WebElement loginMessage;

    @FindBy(id="reg_username")
    private WebElement registerUsername;
    @FindBy(id="reg_email")
    private WebElement registerEmail;
    @FindBy(id="reg_password")
    private WebElement registerPassword;
    @FindBy(xpath = "//button[@class='woocommerce-Button woocommerce-button button woocommerce-form-register__submit']")
    private WebElement registerButton;
    @FindBy(xpath = "//div[@class='wc-block-components-notice-banner__content']")
    private WebElement registerMessage;


    //LogIn methods

    public void fillLogInForm(LogInObject logInObject){
        fillInUsername(logInObject.getUsernameValue());
        fillInPassword(logInObject.getPasswordValue());
    }
    public void fillInUsername(String usernameValue){
        elementMethods.fillElement(usernameField, usernameValue);
        LoggerUtility.info("The user fills in the username value: " + usernameValue );

    }
    public void fillInPassword(String passwordValue){
        elementMethods.fillElement(passwordField, passwordValue);
        LoggerUtility.info("The user fills in the password value: " + passwordValue);
    }
    public void clickRememberMe(){
        elementMethods.clickElement(rememberCheckbox);
        LoggerUtility.info("The user clicks on Remember me button");
    }
    public void clickLoginButton(){
        elementMethods.clickElement(loginButton);
        LoggerUtility.info("The user clicks on LogIn button");
    }

    public void validateLoginMessage(String expectedLoginMessage, String usernameValue){
        elementMethods.validateElementContainsMessage(loginMessage, expectedLoginMessage);
        elementMethods.validateElementContainsMessage(loginMessage, usernameValue);
        LoggerUtility.info("Validating that log in message contains Hello + the value of the username: " + usernameValue);
    }

    //Register methods

    public void fillRegisterForm(RegisterInvalidUsernameObject registerInvalidUsernameObject){
        fillRegUsername(registerInvalidUsernameObject.getRegUsernameValue());
        fillRegEmail(registerInvalidUsernameObject.getRegEmailValue());
        fillRegPassword(registerInvalidUsernameObject.getRegPasswordValue());
    }

    public void fillRegUsername(String regUsernameValue){
        elementMethods.fillElement(registerUsername, regUsernameValue);
        LoggerUtility.info("The user fills in the username value: " + regUsernameValue );
    }
    public void fillRegPassword(String regPasswordValue){
        elementMethods.fillElement(registerPassword, regPasswordValue);
        LoggerUtility.info("The user fills in the password value: " + regPasswordValue );
    }
    public void fillRegEmail(String regEmailValue){
        elementMethods.fillElement(registerEmail, regEmailValue);
        LoggerUtility.info("The user fills in the email address value: " + regEmailValue );
    }
    public void clickRegister(){
        elementMethods.clickElement(registerButton);
        LoggerUtility.info("The user clicks on Register button");
    }
    public void validateInvalidUsernameMessage(String invalidUsernameError){
        elementMethods.validateElementVisible(registerMessage);
        LoggerUtility.info("Register message is visible");
        elementMethods.validateElementMessage(registerMessage, invalidUsernameError);
        LoggerUtility.info("Error message is expected message: " + invalidUsernameError);
    }














}
