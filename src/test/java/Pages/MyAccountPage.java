package Pages;

import Logger.LoggerUtility;
import ObjectData.LogInObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyAccountPage extends BasePage{
    public WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    //elemente de Log in
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


    // elemente de register

    //Metode de login

    public void fillLogInForm(LogInObject logInObject){
        fillInUsername(logInObject.getUsernameValue());
        fillInPassword(logInObject.getPasswordValue());
    }
    public void fillInUsername(String usernameValue){
        elementMethods.fillElement(usernameField, usernameValue);
        LoggerUtility.info("The user fills in the username value");

    }
    public void fillInPassword(String passwordValue){
        elementMethods.fillElement(passwordField, passwordValue);
        LoggerUtility.info("The user fills in the password value");
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
        LoggerUtility.info("Validating that log in message contains Hello + the value of the username");

    }












}
