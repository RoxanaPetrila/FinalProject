package Pages;

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
    public WebElement usernameField;
    @FindBy(id="password")
    public WebElement passwordField;
    @FindBy(id="rememberme")
    public WebElement rememberCheckbox;
    @FindBy(xpath = "//button[@name='login']")
    public WebElement loginButton;
    @FindBy(xpath = "//div[@class='woocommerce-MyAccount-content']")
    public WebElement loginMessage;


    // elemente de register

    //Metode de login

    public void fillLogInForm(String usernameValue, String passwordValue){
        fillInUsername(usernameValue);
        fillInPassword(passwordValue);
    }
    public void fillInUsername(String usernameValue){
        elementMethods.fillElement(usernameField, usernameValue);

    }
    public void fillInPassword(String passwordValue){
        elementMethods.fillElement(passwordField, passwordValue);
    }
    public void clickRememberMe(){
        elementMethods.clickElement(rememberCheckbox);
    }
    public void clickLoginButton(){
        elementMethods.clickElement(loginButton);
    }

    public void validateLoginMessage(String expectedLoginMessage, String usernameValue){
        elementMethods.validateElementContainsMessage(loginMessage, expectedLoginMessage);
        elementMethods.validateElementContainsMessage(loginMessage, usernameValue);

    }












}
